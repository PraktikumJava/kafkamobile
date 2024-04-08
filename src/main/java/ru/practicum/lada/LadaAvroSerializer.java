package ru.practicum.lada;

import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class LadaAvroSerializer implements Serializer<SpecificRecordBase> {

    private static byte[] toBytes(SpecificRecordBase event) throws IOException {
        var outputStream = new ByteArrayOutputStream();
        new BinaryMessageEncoder<>(event.getSpecificData(), event.getSchema()).encode(event, outputStream);
        return outputStream.toByteArray();
    }

    @Override
    public byte[] serialize(String topic, SpecificRecordBase event) {
        try {
            return toBytes(event);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
