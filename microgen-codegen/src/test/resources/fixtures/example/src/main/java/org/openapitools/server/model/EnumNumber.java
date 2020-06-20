package org.openapitools.server.model;

/** This is an number enumeration. */
@javax.json.bind.annotation.JsonbTypeSerializer(EnumNumberSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(EnumNumberSerializer.class)
public enum EnumNumber {
    NUMBER_1_DOT_1(new BigDecimal("1.1")),

    NUMBER_2_DOT_2(new BigDecimal("2.2")),

    NUMBER_3_DOT_3(new BigDecimal("3.3")),

    NUMBER_4_DOT_4(new BigDecimal("4.4")),

    NUMBER_5_DOT_5(new BigDecimal("5.5")),

    NUMBER_6_DOT_6(new BigDecimal("6.6")),

    NUMBER_7_DOT_7(new BigDecimal("7.7")),

    NUMBER_8_DOT_8(new BigDecimal("8.8")),

    NUMBER_9_DOT_9(new BigDecimal("9.9"));

    private final BigDecimal value;

    EnumNumber(final BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @javax.json.bind.annotation.JsonbCreator
    public static EnumNumber fromValue(final BigDecimal value) {
        return java.util.Arrays.stream(EnumNumber.values())
                .filter(b -> b.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }
}
