package petstore.models;


/**
 * Order
 */

@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {javax.json.bind.annotation.JsonbProperty.class, javax.json.bind.annotation.JsonbCreator.class},
        jdkOnly = true
)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class Order {

    @javax.json.bind.annotation.JsonbCreator
    public Order() {
    }

    /**
     * Get id
     *
     * @return id
     */

    @javax.json.bind.annotation.JsonbProperty("id")
    public abstract java.util.Optional<Long> getId();

    /**
     * Get petId
     *
     * @return petId
     */

    @javax.json.bind.annotation.JsonbProperty("petId")
    public abstract java.util.Optional<Long> getPetId();

    /**
     * Get quantity
     *
     * @return quantity
     */

    @javax.json.bind.annotation.JsonbProperty("quantity")
    public abstract java.util.Optional<Integer> getQuantity();

    /**
     * Get shipDate
     *
     * @return shipDate
     */
    @javax.validation.Valid

    @javax.json.bind.annotation.JsonbProperty("shipDate")
    public abstract java.util.Optional<java.time.OffsetDateTime> getShipDate();

    /**
     * Order Status
     */
    public enum StatusEnum {
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

    /**
     * Order Status
     *
     * @return status
     */

    @javax.json.bind.annotation.JsonbProperty("status")
    public abstract java.util.Optional<StatusEnum> getStatus();

    /**
     * Get complete
     *
     * @return complete
     */

    @javax.json.bind.annotation.JsonbProperty("complete")
    public abstract java.util.Optional<Boolean> isComplete();

}

