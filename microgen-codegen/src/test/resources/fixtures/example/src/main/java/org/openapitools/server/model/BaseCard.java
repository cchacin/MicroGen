package org.openapitools.server.model;

/**
 * This is a base card object which uses a &#39;cardType&#39; discriminator.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
              include = JsonTypeInfo.As.PROPERTY,
              property = "cardType",
              visible = true) @JsonSubTypes({@JsonSubTypes.Type(value = PlaceCard.class,
                                                                name = "PlaceCard"),
                                                @JsonSubTypes.Type(value = PersonCard.class,
                                                                   name = "PersonCard"),})
@javax.json.bind.annotation.JsonbPropertyOrder({BaseCard.JSON_PROPERTY_CARD_TYPE})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class BaseCard {
    @javax.validation.constraints.NotNull private final String cardType;

    public static final String JSON_PROPERTY_CARD_TYPE = "cardType";

    @javax.json.bind.annotation.JsonbCreator
    public BaseCard(@javax.json.bind.annotation.JsonbProperty("cardType") final String cardType) {
        this.cardType = cardType;
    }

    /**
     * Get cardType
     *
     * @return cardType
     */
    @javax.json.bind.annotation.JsonbProperty("cardType") public String getCardType() {
        return cardType;
    }

    @Override public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseCard baseCard = (BaseCard) o;
        return java.util.Objects.equals(this.cardType, baseCard.cardType);
    }

    @Override public int hashCode() {
        return java.util.Objects.hash(cardType);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseCard {\n");

        sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static Builder builder() {
        return Builder.create();
    }

    public static final class Builder {
        private String cardType;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder setCardType(final String cardType) {
            this.cardType = cardType;
            return this;
        }

        public BaseCard build() {
            return new BaseCard(this.cardType);
        }
    }
}
