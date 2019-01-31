package petstore.models;


/**
 * Order
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class Order {

    private final Long id;


    private final Long petId;


    private final Integer quantity;

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

        public StatusEnumDeserializer() {
        }

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
            @javax.json.bind.annotation.JsonbProperty("id") final Long id,
            @javax.json.bind.annotation.JsonbProperty("petId") final Long petId,
            @javax.json.bind.annotation.JsonbProperty("quantity") final Integer quantity,
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
    public Long getId() {
        return id;
    }


    /**
     * Get petId
     *
     * @return petId
     */
    @javax.json.bind.annotation.JsonbProperty("petId")
    public Long getPetId() {
        return petId;
    }


    /**
     * Get quantity
     *
     * @return quantity
     */
    @javax.json.bind.annotation.JsonbProperty("quantity")
    public Integer getQuantity() {
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
    public Boolean isisComplete() {
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
}
