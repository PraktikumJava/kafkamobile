/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package ru.practicum.avro_example;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class LightsEventAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LightsEventAvro\",\"namespace\":\"ru.practicum.avro_example\",\"fields\":[{\"name\":\"enable\",\"type\":\"boolean\"},{\"name\":\"distance\",\"type\":\"int\"}]}");
    private static final long serialVersionUID = 7383091237650967889L;
    private static final SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<LightsEventAvro> ENCODER =
            new BinaryMessageEncoder<>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<LightsEventAvro> DECODER =
            new BinaryMessageDecoder<>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<LightsEventAvro>
            WRITER$ = (org.apache.avro.io.DatumWriter<LightsEventAvro>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<LightsEventAvro>
            READER$ = (org.apache.avro.io.DatumReader<LightsEventAvro>) MODEL$.createDatumReader(SCHEMA$);
    private boolean enable;
    private int distance;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public LightsEventAvro() {
    }

    /**
     * All-args constructor.
     *
     * @param enable   The new value for enable
     * @param distance The new value for distance
     */
    public LightsEventAvro(java.lang.Boolean enable, java.lang.Integer distance) {
        this.enable = enable;
        this.distance = distance;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     *
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<LightsEventAvro> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     *
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<LightsEventAvro> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     *
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<LightsEventAvro> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Deserializes a LightsEventAvro from a ByteBuffer.
     *
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a LightsEventAvro instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static LightsEventAvro fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new LightsEventAvro RecordBuilder.
     *
     * @return A new LightsEventAvro RecordBuilder
     */
    public static ru.practicum.avro_example.LightsEventAvro.Builder newBuilder() {
        return new ru.practicum.avro_example.LightsEventAvro.Builder();
    }

    /**
     * Creates a new LightsEventAvro RecordBuilder by copying an existing Builder.
     *
     * @param other The existing builder to copy.
     * @return A new LightsEventAvro RecordBuilder
     */
    public static ru.practicum.avro_example.LightsEventAvro.Builder newBuilder(ru.practicum.avro_example.LightsEventAvro.Builder other) {
        if (other == null) {
            return new ru.practicum.avro_example.LightsEventAvro.Builder();
        } else {
            return new ru.practicum.avro_example.LightsEventAvro.Builder(other);
        }
    }

    /**
     * Creates a new LightsEventAvro RecordBuilder by copying an existing LightsEventAvro instance.
     *
     * @param other The existing instance to copy.
     * @return A new LightsEventAvro RecordBuilder
     */
    public static ru.practicum.avro_example.LightsEventAvro.Builder newBuilder(ru.practicum.avro_example.LightsEventAvro other) {
        if (other == null) {
            return new ru.practicum.avro_example.LightsEventAvro.Builder();
        } else {
            return new ru.practicum.avro_example.LightsEventAvro.Builder(other);
        }
    }

    /**
     * Serializes this LightsEventAvro to a ByteBuffer.
     *
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    @Override
    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    @Override
    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    @Override
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return enable;
            case 1:
                return distance;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    // Used by DatumReader.  Applications should not call.
    @Override
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                enable = (java.lang.Boolean) value$;
                break;
            case 1:
                distance = (java.lang.Integer) value$;
                break;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'enable' field.
     *
     * @return The value of the 'enable' field.
     */
    public boolean getEnable() {
        return enable;
    }

    /**
     * Sets the value of the 'enable' field.
     *
     * @param value the value to set.
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    /**
     * Gets the value of the 'distance' field.
     *
     * @return The value of the 'distance' field.
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Sets the value of the 'distance' field.
     *
     * @param value the value to set.
     */
    public void setDistance(int value) {
        this.distance = value;
    }

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeBoolean(this.enable);

        out.writeInt(this.distance);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.enable = in.readBoolean();

            this.distance = in.readInt();

        } else {
            for (int i = 0; i < 2; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.enable = in.readBoolean();
                        break;

                    case 1:
                        this.distance = in.readInt();
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }

    /**
     * RecordBuilder for LightsEventAvro instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LightsEventAvro>
            implements org.apache.avro.data.RecordBuilder<LightsEventAvro> {

        private boolean enable;
        private int distance;

        /**
         * Creates a new Builder
         */
        private Builder() {
            super(SCHEMA$, MODEL$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         *
         * @param other The existing Builder to copy.
         */
        private Builder(ru.practicum.avro_example.LightsEventAvro.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.enable)) {
                this.enable = data().deepCopy(fields()[0].schema(), other.enable);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.distance)) {
                this.distance = data().deepCopy(fields()[1].schema(), other.distance);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
        }

        /**
         * Creates a Builder by copying an existing LightsEventAvro instance
         *
         * @param other The existing instance to copy.
         */
        private Builder(ru.practicum.avro_example.LightsEventAvro other) {
            super(SCHEMA$, MODEL$);
            if (isValidValue(fields()[0], other.enable)) {
                this.enable = data().deepCopy(fields()[0].schema(), other.enable);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.distance)) {
                this.distance = data().deepCopy(fields()[1].schema(), other.distance);
                fieldSetFlags()[1] = true;
            }
        }

        /**
         * Gets the value of the 'enable' field.
         *
         * @return The value.
         */
        public boolean getEnable() {
            return enable;
        }


        /**
         * Sets the value of the 'enable' field.
         *
         * @param value The value of 'enable'.
         * @return This builder.
         */
        public ru.practicum.avro_example.LightsEventAvro.Builder setEnable(boolean value) {
            validate(fields()[0], value);
            this.enable = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'enable' field has been set.
         *
         * @return True if the 'enable' field has been set, false otherwise.
         */
        public boolean hasEnable() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'enable' field.
         *
         * @return This builder.
         */
        public ru.practicum.avro_example.LightsEventAvro.Builder clearEnable() {
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'distance' field.
         *
         * @return The value.
         */
        public int getDistance() {
            return distance;
        }


        /**
         * Sets the value of the 'distance' field.
         *
         * @param value The value of 'distance'.
         * @return This builder.
         */
        public ru.practicum.avro_example.LightsEventAvro.Builder setDistance(int value) {
            validate(fields()[1], value);
            this.distance = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'distance' field has been set.
         *
         * @return True if the 'distance' field has been set, false otherwise.
         */
        public boolean hasDistance() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'distance' field.
         *
         * @return This builder.
         */
        public ru.practicum.avro_example.LightsEventAvro.Builder clearDistance() {
            fieldSetFlags()[1] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public LightsEventAvro build() {
            try {
                LightsEventAvro record = new LightsEventAvro();
                record.enable = fieldSetFlags()[0] ? this.enable : (java.lang.Boolean) defaultValue(fields()[0]);
                record.distance = fieldSetFlags()[1] ? this.distance : (java.lang.Integer) defaultValue(fields()[1]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}









