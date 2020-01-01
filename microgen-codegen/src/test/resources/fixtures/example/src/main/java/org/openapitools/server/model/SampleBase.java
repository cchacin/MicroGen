package org.openapitools.server.model;

/** This is an base class object from which other classes will derive. */
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
                                                       SampleBase.JSONB_PROPERTY_BASE_CLASS_STRING_PROP,
                                                       SampleBase.JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP
                                               })
@javax.json.bind.annotation.JsonbTypeAdapter(SampleBase.SampleBaseJsonbTypeAdapter.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class SampleBase {

    public static final String JSONB_PROPERTY_BASE_CLASS_STRING_PROP = "baseClassStringProp";
    public static final String JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP = "baseClassIntegerProp";

    @javax.json.bind.annotation.JsonbCreator
    public SampleBase() {}

    /**
     * Get baseClassStringProp
     *
     * @return baseClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_BASE_CLASS_STRING_PROP)
    public abstract java.util.Optional<String> getBaseClassStringProp();

    /**
     * Get baseClassIntegerProp
     *
     * @return baseClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP)
    public abstract java.util.OptionalInt getBaseClassIntegerProp();

    @javax.ws.rs.ext.Provider
    public static class SampleBaseJsonbTypeAdapter
            implements javax.json.bind.adapter.JsonbAdapter<
            SampleBase, SampleBaseInternalBuilder.ImmutableSampleBase> {

        @Override
        public SampleBaseInternalBuilder.ImmutableSampleBase adaptToJson(SampleBase obj)
                throws Exception {
            return SampleBaseInternalBuilder.ImmutableSampleBase.copyOf(obj);
        }

        @Override
        public SampleBase adaptFromJson(SampleBaseInternalBuilder.ImmutableSampleBase obj)
                throws Exception {
            return obj;
        }
    }

    public static class Builder extends SampleBaseInternalBuilder {}

    public static Builder builder() {
        return new Builder();
    }
}
