package org.openapitools.server.model;

/** Order */
@javax.json.bind.annotation.JsonbPropertyOrder({
        Order.JSONB_PROPERTY_ID,
        Order.JSONB_PROPERTY_PET_ID,
        Order.JSONB_PROPERTY_QUANTITY,
        Order.JSONB_PROPERTY_SHIP_DATE,
        Order.JSONB_PROPERTY_STATUS,
        Order.JSONB_PROPERTY_COMPLETE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Order implements OpenAPIModel {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_PET_ID = "petId";
    public static final String JSONB_PROPERTY_QUANTITY = "quantity";
    public static final String JSONB_PROPERTY_SHIP_DATE = "shipDate";
    public static final String JSONB_PROPERTY_STATUS = "status";
    public static final String JSONB_PROPERTY_COMPLETE = "complete";

    private java.util.Optional<Long> id = java.util.Optional.empty();

    private java.util.Optional<Long> petId = java.util.Optional.empty();

    private java.util.Optional<Integer> quantity = java.util.Optional.empty();

    @javax.validation.Valid
    private java.util.Optional<java.time.OffsetDateTime> shipDate = java.util.Optional.empty();

    /** Order Status */
    @io.quarkus.runtime.annotations.RegisterForReflection
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
        public static StatusEnum fromValue(final String value) {
            return java.util.Arrays.stream(StatusEnum.values())
                    .filter(b -> b.getValue().equals(value))
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

    private java.util.Optional<StatusEnum> status = java.util.Optional.empty();

    private java.util.Optional<Boolean> complete = java.util.Optional.empty();

    public Order() {}

    public Order(
            final java.util.Optional<Long> id,
            final java.util.Optional<Long> petId,
            final java.util.Optional<Integer> quantity,
            final java.util.Optional<java.time.OffsetDateTime> shipDate,
            final java.util.Optional<StatusEnum> status,
            final java.util.Optional<Boolean> complete) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.complete = complete;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public java.util.Optional<Long> getId() {
        return id;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public void setId(java.util.Optional<Long> id) {
        this.id = id;
    }

    /**
     * Get petId
     *
     * @return petId
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PET_ID)
    public java.util.Optional<Long> getPetId() {
        return petId;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PET_ID)
    public void setPetId(java.util.Optional<Long> petId) {
        this.petId = petId;
    }

    /**
     * Get quantity
     *
     * @return quantity
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_QUANTITY)
    public java.util.Optional<Integer> getQuantity() {
        return quantity;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_QUANTITY)
    public void setQuantity(java.util.Optional<Integer> quantity) {
        this.quantity = quantity;
    }

    /**
     * Get shipDate
     *
     * @return shipDate
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SHIP_DATE)
    public java.util.Optional<java.time.OffsetDateTime> shipmentDate() {
        return shipDate;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SHIP_DATE)
    public void setShipDate(java.util.Optional<java.time.OffsetDateTime> shipDate) {
        this.shipDate = shipDate;
    }

    /**
     * Order Status
     *
     * @return status
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STATUS)
    public java.util.Optional<StatusEnum> getStatus() {
        return status;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STATUS)
    public void setStatus(java.util.Optional<StatusEnum> status) {
        this.status = status;
    }

    /**
     * Get complete
     *
     * @return complete
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_COMPLETE)
    public java.util.Optional<Boolean> isgetComplete() {
        return complete;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_COMPLETE)
    public void setComplete(java.util.Optional<Boolean> complete) {
        this.complete = complete;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return java.util.Objects.equals(this.id, order.id)
                && java.util.Objects.equals(this.petId, order.petId)
                && java.util.Objects.equals(this.quantity, order.quantity)
                && java.util.Objects.equals(this.shipDate, order.shipDate)
                && java.util.Objects.equals(this.status, order.status)
                && java.util.Objects.equals(this.complete, order.complete);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, petId, quantity, shipDate, status, complete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");

        sb.append("    " + JSONB_PROPERTY_ID + ": ").append(toIndentedString(id)).append("\n");
        sb.append("    " + JSONB_PROPERTY_PET_ID + ": ").append(toIndentedString(petId)).append("\n");
        sb.append("    " + JSONB_PROPERTY_QUANTITY + ": ")
                .append(toIndentedString(quantity))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_SHIP_DATE + ": ")
                .append(toIndentedString(shipDate))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_STATUS + ": ").append(toIndentedString(status)).append("\n");
        sb.append("    " + JSONB_PROPERTY_COMPLETE + ": ")
                .append(toIndentedString(complete))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static Builder builder() {
        return Builder.create();
    }

    public static final class Builder {
        private java.util.Optional<Long> id;
        private java.util.Optional<Long> petId;
        private java.util.Optional<Integer> quantity;
        private java.util.Optional<java.time.OffsetDateTime> shipDate;
        private java.util.Optional<StatusEnum> status;
        private java.util.Optional<Boolean> complete;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder id(final java.util.Optional<Long> id) {
            this.id = id;
            return this;
        }

        public Builder id(final Long id) {
            this.id = java.util.Optional.ofNullable(id);
            return this;
        }

        public Builder petId(final java.util.Optional<Long> petId) {
            this.petId = petId;
            return this;
        }

        public Builder petId(final Long petId) {
            this.petId = java.util.Optional.ofNullable(petId);
            return this;
        }

        public Builder quantity(final java.util.Optional<Integer> quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder quantity(final Integer quantity) {
            this.quantity = java.util.Optional.ofNullable(quantity);
            return this;
        }

        public Builder shipDate(final java.util.Optional<java.time.OffsetDateTime> shipDate) {
            this.shipDate = shipDate;
            return this;
        }

        public Builder shipDate(final java.time.OffsetDateTime shipDate) {
            this.shipDate = java.util.Optional.ofNullable(shipDate);
            return this;
        }

        public Builder status(final java.util.Optional<StatusEnum> status) {
            this.status = status;
            return this;
        }

        public Builder status(final String status) {
            this.status = java.util.Optional.ofNullable(status);
            return this;
        }

        public Builder complete(final java.util.Optional<Boolean> complete) {
            this.complete = complete;
            return this;
        }

        public Builder complete(final Boolean complete) {
            this.complete = java.util.Optional.ofNullable(complete);
            return this;
        }

        public Order build() {
            return new Order(
                    this.id, this.petId, this.quantity, this.shipDate, this.status, this.complete);
        }
    }
}
