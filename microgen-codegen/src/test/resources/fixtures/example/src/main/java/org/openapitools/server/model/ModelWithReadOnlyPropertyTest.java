package org.openapitools.server.model;

/** This is a model object that contains a property with readOnly&#x3D;true. */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        implementationNestedInBuilder = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbAnnotation.class,
                javax.json.bind.annotation.JsonbCreator.class,
                javax.json.bind.annotation.JsonbDateFormat.class,
                javax.json.bind.annotation.JsonbNillable.class,
                javax.json.bind.annotation.JsonbNumberFormat.class,
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbPropertyOrder.class,
                javax.json.bind.annotation.JsonbTransient.class,
                javax.json.bind.annotation.JsonbTypeAdapter.class,
                javax.json.bind.annotation.JsonbTypeSerializer.class,
                javax.json.bind.annotation.JsonbTypeDeserializer.class,
                javax.json.bind.annotation.JsonbVisibility.class
        },
        jdkOnly = true)
@javax.json.bind.annotation.JsonbPropertyOrder({
                                                       ModelWithReadOnlyPropertyTest.JSON_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE,
                                                       ModelWithReadOnlyPropertyTest.JSON_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE,
                                                       ModelWithReadOnlyPropertyTest.JSON_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE
                                               })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class ModelWithReadOnlyPropertyTest {

    public static final String JSON_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE =
            "stringPropWithImplicitReadOnlyFalse";
    public static final String JSON_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE =
            "stringPropWithExplicitReadOnlyFalse";
    public static final String JSON_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE =
            "stringPropWithReadOnlyTrue";

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithReadOnlyPropertyTest() {}

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
}
