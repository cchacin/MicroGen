package io.swagger.server.model;

/** This is a model object that contains a property with readOnly&#x3D;true. */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true
)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class ModelWithReadOnlyPropertyTest {

    /**
     * This is a property without a readOnly attribute, meaning that it takes on the default value of
     * readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithImplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithImplicitReadOnlyFalse")
    public abstract java.util.Optional<String> getStringPropWithImplicitReadOnlyFalse();

    /**
     * This is a property with readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithExplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithExplicitReadOnlyFalse")
    public abstract java.util.Optional<String> getStringPropWithExplicitReadOnlyFalse();

    /**
     * This is a property with readOnly=true, meaning that it should be included in the response, but
     * not the request.
     *
     * @return stringPropWithReadOnlyTrue
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithReadOnlyTrue")
    public abstract java.util.Optional<String> getStringPropWithReadOnlyTrue();

    public static class Builder extends ModelWithReadOnlyPropertyTestInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}
