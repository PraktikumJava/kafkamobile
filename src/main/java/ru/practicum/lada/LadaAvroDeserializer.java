package ru.practicum.lada;

import lombok.SneakyThrows;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.serialization.Deserializer;
import ru.practicum.avro_example.CheckOkEventAvro;
import ru.practicum.avro_example.ECUCheckEventAvro;
import ru.practicum.avro_example.LightsEventAvro;

public class LadaAvroDeserializer implements Deserializer<SpecificRecordBase> {

    @SneakyThrows
    @Override
    public SpecificRecordBase deserialize(String topic, byte[] bytes) {
        SpecificRecordBase ret = null;
        switch (topic) {
            case LadaTopics.ECU_CHECK_REQUESTS_TOPIC:
                ret = ECUCheckEventAvro.getDecoder().decode(bytes);
                break;
            case LadaTopics.ECU_CHECK_RESPONSES_TOPIC:
                ret = CheckOkEventAvro.getDecoder().decode(bytes);
                break;
            case LadaTopics.LIGHTS_EVENTS_TOPIC:
                ret = LightsEventAvro.getDecoder().decode(bytes);
                break;
            default:
                throw new IllegalArgumentException("unknown generic topic " + topic);
        }

        return ret;
    }
}
