package petstore.models;


/**
 * Pet
 */

@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.VALIDATION_API,
        jacksonIntegration = false,
        passAnnotations = { javax.json.bind.annotation.JsonbProperty.class},
        jdkOnly = true
)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class Pet {

    /**
     * Get id
     *
     * @return id
     */
    
    @javax.json.bind.annotation.JsonbProperty("id")
    public abstract java.util.Optional<Long> getId();

    /**
     * Get category
     *
     * @return category
     */
    @javax.validation.Valid

    @javax.json.bind.annotation.JsonbProperty("category")
    public abstract java.util.Optional<Category> getCategory();

    /**
     * Get name
     *
     * @return name
     */
    @javax.validation.constraints.NotNull

    @javax.json.bind.annotation.JsonbProperty("name")
    public abstract String getName();

    /**
     * Get photoUrls
     *
     * @return photoUrls
     */
    @javax.validation.constraints.NotNull

    @javax.json.bind.annotation.JsonbProperty("photoUrls")
    public abstract java.util.List<String> getPhotoUrls();

    /**
     * Get tags
     *
     * @return tags
     */
    @javax.validation.Valid

    @javax.json.bind.annotation.JsonbProperty("tags")
    public abstract java.util.Optional<java.util.List<Tag>> getTags();

    /**
     * pet status in the store
     */
    public enum StatusEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

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
     * pet status in the store
     *
     * @return status
     */
    
    @javax.json.bind.annotation.JsonbProperty("status")
    public abstract java.util.Optional<StatusEnum> getStatus();


    public static class Builder extends PetInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}

