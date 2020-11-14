package org.openapitools.server.model;

/** This is an integer enumeration. */
@io.quarkus.runtime.annotations.RegisterForReflection
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@javax.json.bind.annotation.JsonbTypeSerializer(EnumInteger.EnumIntegerSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(EnumInteger.EnumIntegerDeserializer.class)
public enum EnumInteger {
    NUMBER_1(1),

    NUMBER_2(2),

    NUMBER_3(3),

    NUMBER_5(5),

    NUMBER_7(7),

    NUMBER_11(11),

    NUMBER_13(13),

    NUMBER_17(17),

    NUMBER_19(19);

    private final Integer value;

    EnumInteger(final Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @javax.json.bind.annotation.JsonbCreator
    public static EnumInteger fromValue(final Integer value) {
        return java.util.Arrays.stream(EnumInteger.values())
                .filter(b -> b.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }

    public static class EnumIntegerSerializer
            implements javax.json.bind.serializer.JsonbSerializer<EnumInteger> {

        public EnumIntegerSerializer() {}

        @Override
        public void serialize(
                EnumInteger aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class EnumIntegerDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<EnumInteger> {

        public EnumIntegerDeserializer() {}

        @Override
        public EnumInteger deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return EnumInteger.fromValue(jsonParser.getString());
        }
    }
}
