package org.openapitools.server.model;

/** This is an string enumeration. */
@javax.json.bind.annotation.JsonbTypeSerializer(EnumStringSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(EnumStringSerializer.class)
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
    public static EnumString fromValue(final String text) {
        return java.util.Arrays.stream(EnumString.values())
                .filter(b -> b.value.equals(text))
                .findFirst()
                .orElse(null);
    }
}
