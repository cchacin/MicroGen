package petstore.models;


/**
 * ModelApiResponse
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
public abstract class ModelApiResponse {

    @javax.json.bind.annotation.JsonbCreator
    public ModelApiResponse() {
    }

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

}

