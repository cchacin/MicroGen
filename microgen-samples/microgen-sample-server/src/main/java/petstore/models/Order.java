package petstore.models;


/**
 * Order
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class Order {
    
    private final java.util.OptionalLong id;
    
    
    private final java.util.OptionalLong petId;
    
    
    private final java.util.OptionalInt quantity;
    
    @javax.validation.Valid

    private final java.time.OffsetDateTime shipDate;
    
                /**
     * Order Status
     */
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

    public static class StatusEnumDeserializer implements javax.json.bind.serializer.JsonbDeserializer<StatusEnum> {
    
        public StatusEnumDeserializer(){}

        @Override
        public StatusEnum deserialize(
            javax.json.stream.JsonParser jsonParser,
            javax.json.bind.serializer.DeserializationContext deserializationContext,
            java.lang.reflect.Type type) {
            return StatusEnum.fromValue(jsonParser.getString());
        }
    }

    
    private final StatusEnum status;
    
    
    private final Boolean complete;
    

    @javax.json.bind.annotation.JsonbCreator
    public Order(
        @javax.json.bind.annotation.JsonbProperty("id") final java.util.OptionalLong id,
        @javax.json.bind.annotation.JsonbProperty("petId") final java.util.OptionalLong petId,
        @javax.json.bind.annotation.JsonbProperty("quantity") final java.util.OptionalInt quantity,
        @javax.json.bind.annotation.JsonbProperty("shipDate") final java.time.OffsetDateTime shipDate,
        @javax.json.bind.annotation.JsonbProperty("status") final StatusEnum status,
        @javax.json.bind.annotation.JsonbProperty("complete") final Boolean complete
    ) {
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
    @javax.json.bind.annotation.JsonbProperty("id")
    public java.util.OptionalLong getId() {
        return id;
    }

    
    /**
 * Get petId
 *
 * @return petId
 */
    @javax.json.bind.annotation.JsonbProperty("petId")
    public java.util.OptionalLong getPetId() {
        return petId;
    }

    
    /**
 * Get quantity
 *
 * @return quantity
 */
    @javax.json.bind.annotation.JsonbProperty("quantity")
    public java.util.OptionalInt getQuantity() {
        return quantity;
    }

    
    /**
 * Get shipDate
 *
 * @return shipDate
 */
    @javax.json.bind.annotation.JsonbProperty("shipDate")
    public java.time.OffsetDateTime getShipDate() {
        return shipDate;
    }

    
    /**
 * Order Status
 *
 * @return status
 */
    @javax.json.bind.annotation.JsonbProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    
    /**
 * Get complete
 *
 * @return complete
 */
    @javax.json.bind.annotation.JsonbProperty("complete")
    public Boolean isgetComplete() {
        return complete;
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
        return java.util.Objects.equals(this.id, order.id) &&
    java.util.Objects.equals(this.petId, order.petId) &&
    java.util.Objects.equals(this.quantity, order.quantity) &&
    java.util.Objects.equals(this.shipDate, order.shipDate) &&
    java.util.Objects.equals(this.status, order.status) &&
    java.util.Objects.equals(this.complete, order.complete);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, petId, quantity, shipDate, status, complete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
        return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static final class Builder {
    private java.util.OptionalLong id;
    private java.util.OptionalLong petId;
    private java.util.OptionalInt quantity;
    private java.time.OffsetDateTime shipDate;
    private StatusEnum status;
    private Boolean complete;

    private Builder() {
    }

    public static Builder create() {
        return new Builder();
    }
    public Builder setId(final java.util.OptionalLong id) {
        this.id = id;
        return this;
    }
    public Builder setPetId(final java.util.OptionalLong petId) {
        this.petId = petId;
        return this;
    }
    public Builder setQuantity(final java.util.OptionalInt quantity) {
        this.quantity = quantity;
        return this;
    }
    public Builder setShipDate(final java.time.OffsetDateTime shipDate) {
        this.shipDate = shipDate;
        return this;
    }
    public Builder setStatus(final StatusEnum status) {
        this.status = status;
        return this;
    }
    public Builder setComplete(final Boolean complete) {
        this.complete = complete;
        return this;
    }
    
    public Order build() {
        return new Order(
            this.id,    
            this.petId,    
            this.quantity,    
            this.shipDate,    
            this.status,    
            this.complete    
        );        
    }
}
}
