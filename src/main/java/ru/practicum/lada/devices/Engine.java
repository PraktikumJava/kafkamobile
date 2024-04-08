package ru.practicum.lada.devices;

import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.practicum.avro_example.CheckOkEventAvro;
import ru.practicum.avro_example.ECUCheckEventAvro;
import ru.practicum.lada.LadaClient;
import ru.practicum.lada.LadaTopics;

import java.util.List;

@Component
public class Engine extends AbstractDevice {

    private final LadaClient client;

    private boolean checked = false;

    public Engine(LadaClient client) {
        super(client);
        this.client = client;
        client.getConsumer().subscribe(List.of(LadaTopics.ECU_CHECK_REQUESTS_TOPIC));
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
        }
    }

    private void checkOk() {
        if (checked) {
            return;
        }
        client.getProducer().send(new ProducerRecord<>(LadaTopics.ECU_CHECK_RESPONSES_TOPIC, new CheckOkEventAvro("engine", "front-left")));
        client.getProducer().send(new ProducerRecord<>(LadaTopics.ECU_CHECK_RESPONSES_TOPIC, new CheckOkEventAvro("engine", "front-right")));
        client.getProducer().send(new ProducerRecord<>(LadaTopics.ECU_CHECK_RESPONSES_TOPIC, new CheckOkEventAvro("engine", "rear-left")));
        client.getProducer().send(new ProducerRecord<>(LadaTopics.ECU_CHECK_RESPONSES_TOPIC, new CheckOkEventAvro("engine", "rear-right")));
        checked = true;
    }
}
