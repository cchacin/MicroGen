package org.openapitools.server.model;

/** This is a base card object which uses a &#39;cardType&#39; discriminator. */
@javax.json.bind.annotation.JsonbPropertyOrder({BaseCard.JSONB_PROPERTY_CARD_TYPE})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class BaseCard implements OpenAPIModel {

    public static final String JSONB_PROPERTY_CARD_TYPE = "cardType";
    @javax.validation.constraints.NotNull private String cardType;

    public BaseCard() {}

    public BaseCard(final String cardType) {
        this.cardType = cardType;
    }

    /**
     * Get cardType
     *
     * @return cardType
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_CARD_TYPE)
    public String getCardType() {
        return cardType;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_CARD_TYPE)
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseCard baseCard = (BaseCard) o;
        return java.util.Objects.equals(this.cardType, baseCard.cardType);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(cardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseCard {\n");

        sb.append("    " + JSONB_PROPERTY_CARD_TYPE + ": ")
                .append(toIndentedString(cardType))
                .append("\n");
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

        public Builder cardType(final String cardType) {
            this.cardType = cardType;
            return this;
        }

        public BaseCard build() {
            return new BaseCard(this.cardType);
        }
    }
}
