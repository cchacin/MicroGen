package org.openapitools.server.model;

/**
 * This is a model object that has map properties of type&#x3D;integer, type&#x3D;string, and
 * type&#x3D;&lt;model&gt;.
 */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
    defaultAsDefault = true,
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
                                                   ModelWithMapProperties.JSONB_PROPERTY_STRING_MAP,
                                                   ModelWithMapProperties.JSONB_PROPERTY_INTEGER_MAP,
                                                   ModelWithMapProperties.JSONB_PROPERTY_ERROR_INFO_MAP,
                                                   ModelWithMapProperties.JSONB_PROPERTY_ERROR_INFO_ARRAY_MAP
                                               })
@javax.json.bind.annotation.JsonbTypeAdapter(ModelWithMapPropertiesTypeAdapter.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class ModelWithMapProperties implements OpenAPIModel {

    public static final String JSONB_PROPERTY_STRING_MAP = "stringMap";
    public static final String JSONB_PROPERTY_INTEGER_MAP = "integerMap";
    public static final String JSONB_PROPERTY_ERROR_INFO_MAP = "errorInfoMap";
    public static final String JSONB_PROPERTY_ERROR_INFO_ARRAY_MAP = "errorInfoArrayMap";

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithMapProperties() {}

    /**
     * Get stringMap
     *
     * @return stringMap
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_MAP)
    public abstract java.util.Optional<java.util.Map<String, String>> getStringMap();

    /**
     * Get integerMap
     *
     * @return integerMap
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_INTEGER_MAP)
    public abstract java.util.Optional<java.util.Map<String, Integer>> getIntegerMap();

    /**
     * Get errorInfoMap
     *
     * @return errorInfoMap
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ERROR_INFO_MAP)
    public abstract java.util.Optional<java.util.Map<String, ErrorInfo>> getErrorInfoMap();

    /**
     * Get errorInfoArrayMap
     *
     * @return errorInfoArrayMap
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ERROR_INFO_ARRAY_MAP)
    public abstract java.util.Optional<java.util.Map<String, java.util.ArrayList<ErrorInfo>>>
    getErrorInfoArrayMap();

    public static class Builder extends ImmutableModelWithMapProperties.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
