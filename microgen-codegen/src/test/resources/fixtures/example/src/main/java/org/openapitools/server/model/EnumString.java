package org.openapitools.server.model;

/** This is an string enumeration. */
@io.quarkus.runtime.annotations.RegisterForReflection
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@javax.json.bind.annotation.JsonbTypeSerializer(EnumString.EnumStringSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(EnumString.EnumStringDeserializer.class)
public enum EnumString {
    ENUMSTRINGVALUE1("EnumStringValue1"),

    ENUMSTRINGVALUE2("EnumStringValue2"),

    ENUMSTRINGVALUE3("EnumStringValue3");

    private final String value;

    EnumString(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @javax.json.bind.annotation.JsonbCreator
    public static EnumString fromValue(final String value) {
        return java.util.Arrays.stream(EnumString.values())
                .filter(b -> b.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }

    public static class EnumStringSerializer
            implements javax.json.bind.serializer.JsonbSerializer<EnumString> {

        public EnumStringSerializer() {}

        @Override
        public void serialize(
                EnumString aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class EnumStringDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<EnumString> {

        public EnumStringDeserializer() {}

        @Override
        public EnumString deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return EnumString.fromValue(jsonParser.getString());
        }
    }
}
