package org.openapitools.server.model;

/** Order */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        implementationNestedInBuilder = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbAnnotation.class,
                javax.json.bind.annotation.JsonbCreator.class,
                javax.json.bind.annotation.JsonbDateFormat.class,
                javax.json.bind.annotation.JsonbNillable.class,
                javax.json.bind.annotation.JsonbNumberFormat.class,
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbPropertyOrder.class,
                javax.json.bind.annotation.JsonbTransient.class,
                javax.json.bind.annotation.JsonbTypeAdapter.class,
                javax.json.bind.annotation.JsonbTypeSerializer.class,
                javax.json.bind.annotation.JsonbTypeDeserializer.class,
                javax.json.bind.annotation.JsonbVisibility.class
        },
        jdkOnly = true)
@javax.json.bind.annotation.JsonbPropertyOrder({
                                                       Order.JSONB_PROPERTY_ID,
                                                       Order.JSONB_PROPERTY_PET_ID,
                                                       Order.JSONB_PROPERTY_QUANTITY,
                                                       Order.JSONB_PROPERTY_SHIP_DATE,
                                                       Order.JSONB_PROPERTY_STATUS,
                                                       Order.JSONB_PROPERTY_COMPLETE
                                               })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class Order {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_PET_ID = "petId";
    public static final String JSONB_PROPERTY_QUANTITY = "quantity";
    public static final String JSONB_PROPERTY_SHIP_DATE = "shipDate";
    public static final String JSONB_PROPERTY_STATUS = "status";
    public static final String JSONB_PROPERTY_COMPLETE = "complete";

    @javax.json.bind.annotation.JsonbCreator
    public Order() {}

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public abstract java.util.OptionalLong getId();

    /**
     * Get petId
     *
     * @return petId
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PET_ID)
    public abstract java.util.OptionalLong getPetId();

    /**
     * Get quantity
     *
     * @return quantity
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_QUANTITY)
    public abstract java.util.OptionalInt getQuantity();

    /**
     * Get shipDate
     *
     * @return shipDate
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SHIP_DATE)
    public abstract java.util.Optional<java.time.OffsetDateTime> shipmentDate();

    /** Order Status */
    @javax.json.bind.annotation.JsonbTypeSerializer(Order.StatusEnumSerializer.class)
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

    public static class StatusEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<StatusEnum> {

        public StatusEnumSerializer() {}

        @Override
        public void serialize(
                StatusEnum aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
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
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STATUS)
    public abstract StatusEnum getStatus();

    /**
     * Get complete
     *
     * @return complete
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_COMPLETE)
    public abstract java.util.Optional<Boolean> getComplete();

    public static class Builder extends OrderInternalBuilder {}

    public static Builder builder() {
        return new Builder();
    }
}
