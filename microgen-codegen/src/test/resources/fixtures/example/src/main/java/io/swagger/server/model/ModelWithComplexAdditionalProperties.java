package io.swagger.server.model;

/** This is a model object that has additionalProperties with type&#x3D;object. */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbCreator.class
        },
        jdkOnly = true)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class ModelWithComplexAdditionalProperties
        extends java.util.HashMap<String, ErrorInfo> {

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithComplexAdditionalProperties() {}
}
