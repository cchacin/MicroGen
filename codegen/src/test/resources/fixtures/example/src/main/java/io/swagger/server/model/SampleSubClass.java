package io.swagger.server.model;

/** This is an subclass defived from the SampleBase class. */
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
public abstract class SampleSubClass extends SampleBase {

    /**
     * Get subClassStringProp
     *
     * @return subClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty("subClassStringProp")
    public abstract java.util.Optional<String> getSubClassStringProp();

    /**
     * Get subClassIntegerProp
     *
     * @return subClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty("subClassIntegerProp")
    public abstract java.util.Optional<Integer> getSubClassIntegerProp();

    public static class Builder extends SampleSubClassInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}
