package petstore.models;


/**
 * Body
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
public abstract class Body {

    /**
     * Updated name of the pet
     *
     * @return name
     */
    
    @javax.json.bind.annotation.JsonbProperty("name")
    public abstract java.util.Optional<String> getName();

    /**
     * Updated status of the pet
     *
     * @return status
     */
    
    @javax.json.bind.annotation.JsonbProperty("status")
    public abstract java.util.Optional<String> getStatus();


    public static class Builder extends BodyInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}

