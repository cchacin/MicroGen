package org.openapitools.server.model;

/** This is a base card object which uses a &#39;cardType&#39; discriminator. */
@org.immutables.value.Value.Immutable
@javax.json.bind.annotation.JsonbPropertyOrder({BaseCard.JSONB_PROPERTY_CARD_TYPE})
@javax.json.bind.annotation.JsonbTypeSerializer(BaseCardSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(BaseCardSerializer.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class BaseCard implements OpenAPIModel {

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

    public static class Builder extends ImmutableBaseCard.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
