package ru.practicum.lada.devices;

import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import ru.practicum.lada.LadaClient;

import java.time.Duration;

public abstract class AbstractDevice {

    private final LadaClient client;

    public AbstractDevice(LadaClient client) {
        this.client = client;
    }


    public void stop() {
        client.stop();
    }

    public void poll() {
        ConsumerRecords<String, SpecificRecordBase> records = client.getConsumer().poll(Duration.ofMillis(100));
        for (ConsumerRecord<String, SpecificRecordBase> record : records) {
            handle(record);
        }
    }

    public abstract void handle(ConsumerRecord<String, SpecificRecordBase> record);
}
