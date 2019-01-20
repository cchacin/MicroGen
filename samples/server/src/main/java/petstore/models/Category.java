package petstore.models;


/**
 * Category
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
public abstract class Category {

    /**
     * Get id
     *
     * @return id
     */
    
    @javax.json.bind.annotation.JsonbProperty("id")
    public abstract java.util.Optional<Long> getId();

    /**
     * Get name
     *
     * @return name
     */
    
    @javax.json.bind.annotation.JsonbProperty("name")
    public abstract java.util.Optional<String> getName();


    public static class Builder extends CategoryInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}

