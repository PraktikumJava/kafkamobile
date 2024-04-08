package ru.practicum.lada.devices;

import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.practicum.avro_example.CheckOkEventAvro;
import ru.practicum.avro_example.ECUCheckEventAvro;
import ru.practicum.avro_example.LightsEventAvro;
import ru.practicum.lada.LadaClient;
import ru.practicum.lada.LadaTopics;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class Lights extends AbstractDevice {

    private final LadaClient client;
    private final Map<Integer, Boolean> lights = new ConcurrentHashMap<>();
    private boolean checked = false;

    public Lights(LadaClient client) {
        super(client);
        this.client = client;
        client.getConsumer().subscribe(Arrays.asList(LadaTopics.ECU_CHECK_REQUESTS_TOPIC, LadaTopics.LIGHTS_EVENTS_TOPIC));
    }

    @Override
    @Scheduled(fixedDelay = 100)
    public void poll() {
        super.poll();
    }

    @Override
    public void handle(ConsumerRecord<String, SpecificRecordBase> record) {
        if (record.value() instanceof ECUCheckEventAvro) {
            checkOk();
        } else if (record.value() instanceof LightsEventAvro) {
            if (((LightsEventAvro) record.value()).getEnable()) {
                lightsOn(((LightsEventAvro) record.value()).getDistance());
            } else {
                lightsOff(((LightsEventAvro) record.value()).getDistance());
            }
        }
    }

    private void lightsOff(int distance) {
        lights.put(distance, false);
    }

    private void lightsOn(int distance) {
        lights.put(distance, true);
    }

    private void checkOk() {
        if (checked) {
            return;
        }
        client.getProducer().send(new ProducerRecord<>(LadaTopics.ECU_CHECK_RESPONSES_TOPIC, new CheckOkEventAvro("lights", "0,1,2")));
        checked = true;
    }
}
