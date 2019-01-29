package io.swagger.server.model;

/** Order */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbCreator.class
        },
        jdkOnly = true)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class Order {

    @javax.json.bind.annotation.JsonbCreator
    public Order() {}

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty("id")
    public abstract Long getId();

    /**
     * Get petId
     *
     * @return petId
     */
    @javax.json.bind.annotation.JsonbProperty("petId")
    public abstract Long getPetId();

    /**
     * Get quantity
     *
     * @return quantity
     */
    @javax.json.bind.annotation.JsonbProperty("quantity")
    public abstract Integer getQuantity();

    /**
     * Get shipDate
     *
     * @return shipDate
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty("shipDate")
    public abstract java.time.OffsetDateTime shipmentDate();

    /** Order Status */
    @javax.json.bind.annotation.JsonbTypeDeserializer(Order.StatusEnumDeserializer.class)
    public static enum StatusEnum {
        PLACED("placed"),

        APPROVED("approved"),

        DELIVERED("delivered");

        private final String value;

        StatusEnum(final String value) {
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
        public static StatusEnum fromValue(final String text) {
            return java.util.Arrays.stream(StatusEnum.values())
                    .filter(b -> java.util.Objects.equals(String.valueOf(b.value), text))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class StatusEnumDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<StatusEnum> {

        public StatusEnumDeserializer() {}

        @Override
        public StatusEnum deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return StatusEnum.fromValue(jsonParser.getString());
        }
    }

    /**
     * Order Status
     *
     * @return status
     */
    @javax.json.bind.annotation.JsonbProperty("status")
    public abstract StatusEnum getStatus();

    /**
     * Get complete
     *
     * @return complete
     */
    @javax.json.bind.annotation.JsonbProperty("complete")
    public abstract Boolean isComplete();
}
