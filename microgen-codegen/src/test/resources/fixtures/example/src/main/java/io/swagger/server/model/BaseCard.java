package io.swagger.server.model;

/** This is a base card object which uses a &#39;cardType&#39; discriminator. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "cardType",
        visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PlaceCard.class, name = "PlaceCard"),
        @JsonSubTypes.Type(value = PersonCard.class, name = "PersonCard"),
})
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
public abstract class BaseCard {

    @javax.json.bind.annotation.JsonbCreator
    public BaseCard() {}

    /**
     * Get cardType
     *
     * @return cardType
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty("cardType")
    public abstract String getCardType();
}
