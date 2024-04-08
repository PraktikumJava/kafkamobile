package ru.practicum.lada.devices;

import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Slf4j
public class ECU extends AbstractDevice {

    private final LadaClient client;

    private final Map<String, String> devices = new ConcurrentHashMap<>();

    public ECU(LadaClient client) {
        super(client);
        this.client = client;
        client.getConsumer().subscribe(List.of(LadaTopics.ECU_CHECK_RESPONSES_TOPIC, LadaTopics.SENSORS_SPEED_EVENTS_TOPIC));
        log.info("ЭБУ запущен");
    }

    @PreDestroy
    public void stop() {
        client.stop();
    }

    @Scheduled(fixedDelay = 100L)
    @Override
    public void poll() {
        super.poll();
    }

    @Override
    public void handle(ConsumerRecord<String, SpecificRecordBase> record) {
        if (record.value() instanceof CheckOkEventAvro) {
            String deviceClass = ((CheckOkEventAvro) record.value()).getClass$().toString();
            String deviceInfo = ((CheckOkEventAvro) record.value()).getItem().toString();
            devices.computeIfAbsent(deviceClass, cls -> cls);
            devices.computeIfPresent(deviceClass, (cls, old) -> old + "$" + deviceInfo);
            log.info("device checked: {} {}", deviceClass, devices.get(deviceClass));
        }
    }

    public String check() {
        ECUCheckEventAvro message = new ECUCheckEventAvro();
        String topic = LadaTopics.ECU_CHECK_REQUESTS_TOPIC;
        ProducerRecord<String, SpecificRecordBase> record = new ProducerRecord<>(topic, message);
        client.getProducer().send(record);
        return "requested";
    }


    public String start() {
        List<String> requiredDevices = Arrays.asList("engine", "lights");
        List<String> notCheckedDevices = requiredDevices.stream().filter(cls -> !devices.containsKey(cls)).toList();
        if (notCheckedDevices.isEmpty()) {
            client.getProducer().send(new ProducerRecord<>(LadaTopics.LIGHTS_EVENTS_TOPIC, new LightsEventAvro(true, 0)));
            return "started";
        } else {
            return "check " + String.join(", ", notCheckedDevices);
        }
    }

}
