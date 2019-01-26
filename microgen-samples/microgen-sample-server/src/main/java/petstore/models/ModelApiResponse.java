package petstore.models;


/**
 * ModelApiResponse
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
public abstract class ModelApiResponse {

    /**
     * Get code
     *
     * @return code
     */
    
    @javax.json.bind.annotation.JsonbProperty("code")
    public abstract java.util.Optional<Integer> getCode();

    /**
     * Get type
     *
     * @return type
     */
    
    @javax.json.bind.annotation.JsonbProperty("type")
    public abstract java.util.Optional<String> getType();

    /**
     * Get message
     *
     * @return message
     */
    
    @javax.json.bind.annotation.JsonbProperty("message")
    public abstract java.util.Optional<String> getMessage();


    public static class Builder extends ModelApiResponseInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}

