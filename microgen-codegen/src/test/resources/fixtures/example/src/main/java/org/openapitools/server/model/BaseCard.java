package org.openapitools.server.model;

/** This is a base card object which uses a &#39;cardType&#39; discriminator. */
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
@javax.json.bind.annotation.JsonbPropertyOrder({BaseCard.JSONB_PROPERTY_CARD_TYPE})
@javax.json.bind.annotation.JsonbTypeAdapter(BaseCard.BaseCardJsonbTypeAdapter.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class BaseCard {

    public static final String JSONB_PROPERTY_CARD_TYPE = "cardType";

    @javax.json.bind.annotation.JsonbCreator
    public BaseCard() {}

    /**
     * Get cardType
     *
     * @return cardType
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_CARD_TYPE)
    public abstract String getCardType();

    @javax.ws.rs.ext.Provider
    public static class BaseCardJsonbTypeAdapter
            implements javax.json.bind.adapter.JsonbAdapter<
            BaseCard, BaseCardInternalBuilder.ImmutableBaseCard> {

        @Override
        public BaseCardInternalBuilder.ImmutableBaseCard adaptToJson(BaseCard obj) throws Exception {
            return BaseCardInternalBuilder.ImmutableBaseCard.copyOf(obj);
        }

        @Override
        public BaseCard adaptFromJson(BaseCardInternalBuilder.ImmutableBaseCard obj) throws Exception {
            return obj;
        }
    }

    public static class Builder extends BaseCardInternalBuilder {}

    public static Builder builder() {
        return new Builder();
    }
}
