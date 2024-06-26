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
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class CheckOkEventAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CheckOkEventAvro\",\"namespace\":\"ru.practicum.avro_example\",\"fields\":[{\"name\":\"class\",\"type\":\"string\"},{\"name\":\"item\",\"type\":\"string\"}]}");
    private static final long serialVersionUID = -6286638044480895231L;
    private static final SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<CheckOkEventAvro> ENCODER =
            new BinaryMessageEncoder<>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<CheckOkEventAvro> DECODER =
            new BinaryMessageDecoder<>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<CheckOkEventAvro>
            WRITER$ = (org.apache.avro.io.DatumWriter<CheckOkEventAvro>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<CheckOkEventAvro>
            READER$ = (org.apache.avro.io.DatumReader<CheckOkEventAvro>) MODEL$.createDatumReader(SCHEMA$);
    private java.lang.CharSequence class$;
    private java.lang.CharSequence item;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public CheckOkEventAvro() {
    }

    /**
     * All-args constructor.
     *
     * @param class$ The new value for class
     * @param item   The new value for item
     */
    public CheckOkEventAvro(java.lang.CharSequence class$, java.lang.CharSequence item) {
        this.class$ = class$;
        this.item = item;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     *
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<CheckOkEventAvro> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     *
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<CheckOkEventAvro> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     *
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<CheckOkEventAvro> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Deserializes a CheckOkEventAvro from a ByteBuffer.
     *
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a CheckOkEventAvro instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static CheckOkEventAvro fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new CheckOkEventAvro RecordBuilder.
     *
     * @return A new CheckOkEventAvro RecordBuilder
     */
    public static ru.practicum.avro_example.CheckOkEventAvro.Builder newBuilder() {
        return new ru.practicum.avro_example.CheckOkEventAvro.Builder();
    }

    /**
     * Creates a new CheckOkEventAvro RecordBuilder by copying an existing Builder.
     *
     * @param other The existing builder to copy.
     * @return A new CheckOkEventAvro RecordBuilder
     */
    public static ru.practicum.avro_example.CheckOkEventAvro.Builder newBuilder(ru.practicum.avro_example.CheckOkEventAvro.Builder other) {
        if (other == null) {
            return new ru.practicum.avro_example.CheckOkEventAvro.Builder();
        } else {
            return new ru.practicum.avro_example.CheckOkEventAvro.Builder(other);
        }
    }

    /**
     * Creates a new CheckOkEventAvro RecordBuilder by copying an existing CheckOkEventAvro instance.
     *
     * @param other The existing instance to copy.
     * @return A new CheckOkEventAvro RecordBuilder
     */
    public static ru.practicum.avro_example.CheckOkEventAvro.Builder newBuilder(ru.practicum.avro_example.CheckOkEventAvro other) {
        if (other == null) {
            return new ru.practicum.avro_example.CheckOkEventAvro.Builder();
        } else {
            return new ru.practicum.avro_example.CheckOkEventAvro.Builder(other);
        }
    }

    /**
     * Serializes this CheckOkEventAvro to a ByteBuffer.
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
                return class$;
            case 1:
                return item;
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
                class$ = (java.lang.CharSequence) value$;
                break;
            case 1:
                item = (java.lang.CharSequence) value$;
                break;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'class$' field.
     *
     * @return The value of the 'class$' field.
     */
    public java.lang.CharSequence getClass$() {
        return class$;
    }

    /**
     * Sets the value of the 'class$' field.
     *
     * @param value the value to set.
     */
    public void setClass$(java.lang.CharSequence value) {
        this.class$ = value;
    }

    /**
     * Gets the value of the 'item' field.
     *
     * @return The value of the 'item' field.
     */
    public java.lang.CharSequence getItem() {
        return item;
    }

    /**
     * Sets the value of the 'item' field.
     *
     * @param value the value to set.
     */
    public void setItem(java.lang.CharSequence value) {
        this.item = value;
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
        out.writeString(this.class$);

        out.writeString(this.item);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.class$ = in.readString(this.class$ instanceof Utf8 ? (Utf8) this.class$ : null);

            this.item = in.readString(this.item instanceof Utf8 ? (Utf8) this.item : null);

        } else {
            for (int i = 0; i < 2; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.class$ = in.readString(this.class$ instanceof Utf8 ? (Utf8) this.class$ : null);
                        break;

                    case 1:
                        this.item = in.readString(this.item instanceof Utf8 ? (Utf8) this.item : null);
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }

    /**
     * RecordBuilder for CheckOkEventAvro instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CheckOkEventAvro>
            implements org.apache.avro.data.RecordBuilder<CheckOkEventAvro> {

        private java.lang.CharSequence class$;
        private java.lang.CharSequence item;

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
        private Builder(ru.practicum.avro_example.CheckOkEventAvro.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.class$)) {
                this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.item)) {
                this.item = data().deepCopy(fields()[1].schema(), other.item);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
        }

        /**
         * Creates a Builder by copying an existing CheckOkEventAvro instance
         *
         * @param other The existing instance to copy.
         */
        private Builder(ru.practicum.avro_example.CheckOkEventAvro other) {
            super(SCHEMA$, MODEL$);
            if (isValidValue(fields()[0], other.class$)) {
                this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.item)) {
                this.item = data().deepCopy(fields()[1].schema(), other.item);
                fieldSetFlags()[1] = true;
            }
        }

        /**
         * Gets the value of the 'class$' field.
         *
         * @return The value.
         */
        public java.lang.CharSequence getClass$() {
            return class$;
        }


        /**
         * Sets the value of the 'class$' field.
         *
         * @param value The value of 'class$'.
         * @return This builder.
         */
        public ru.practicum.avro_example.CheckOkEventAvro.Builder setClass$(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.class$ = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'class$' field has been set.
         *
         * @return True if the 'class$' field has been set, false otherwise.
         */
        public boolean hasClass$() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'class$' field.
         *
         * @return This builder.
         */
        public ru.practicum.avro_example.CheckOkEventAvro.Builder clearClass$() {
            class$ = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'item' field.
         *
         * @return The value.
         */
        public java.lang.CharSequence getItem() {
            return item;
        }


        /**
         * Sets the value of the 'item' field.
         *
         * @param value The value of 'item'.
         * @return This builder.
         */
        public ru.practicum.avro_example.CheckOkEventAvro.Builder setItem(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.item = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'item' field has been set.
         *
         * @return True if the 'item' field has been set, false otherwise.
         */
        public boolean hasItem() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'item' field.
         *
         * @return This builder.
         */
        public ru.practicum.avro_example.CheckOkEventAvro.Builder clearItem() {
            item = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public CheckOkEventAvro build() {
            try {
                CheckOkEventAvro record = new CheckOkEventAvro();
                record.class$ = fieldSetFlags()[0] ? this.class$ : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.item = fieldSetFlags()[1] ? this.item : (java.lang.CharSequence) defaultValue(fields()[1]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }
}










