package org.openapitools.server.model;

/** This is a model object that has properties and additionalProperties. */
@javax.json.bind.annotation.JsonbPropertyOrder({
        ModelWithPropertiesAndAdditionalProperties.JSONB_PROPERTY_INTEGER_PROP,
        ModelWithPropertiesAndAdditionalProperties.JSONB_PROPERTY_STRING_PROP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class ModelWithPropertiesAndAdditionalProperties extends java.util.Map<String, String>
        implements OpenAPIModel {

    public static final String JSONB_PROPERTY_INTEGER_PROP = "integerProp";
    public static final String JSONB_PROPERTY_STRING_PROP = "stringProp";

    private java.util.Optional<Integer> integerProp = java.util.Optional.empty();

    private java.util.Optional<String> stringProp = java.util.Optional.empty();

    public ModelWithPropertiesAndAdditionalProperties() {
        super();
    }

    public ModelWithPropertiesAndAdditionalProperties(
            final java.util.Optional<Integer> integerProp, final java.util.Optional<String> stringProp) {
        super();
        this.integerProp = integerProp;
        this.stringProp = stringProp;
    }

    /**
     * Get integerProp
     *
     * @return integerProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_INTEGER_PROP)
    public java.util.Optional<Integer> getIntegerProp() {
        return integerProp;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_INTEGER_PROP)
    public void setIntegerProp(java.util.Optional<Integer> integerProp) {
        this.integerProp = integerProp;
    }

    /**
     * Get stringProp
     *
     * @return stringProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_PROP)
    public java.util.Optional<String> getStringProp() {
        return stringProp;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_PROP)
    public void setStringProp(java.util.Optional<String> stringProp) {
        this.stringProp = stringProp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelWithPropertiesAndAdditionalProperties modelWithPropertiesAndAdditionalProperties =
                (ModelWithPropertiesAndAdditionalProperties) o;
        return java.util.Objects.equals(
                this.integerProp, modelWithPropertiesAndAdditionalProperties.integerProp)
                && java.util.Objects.equals(
                this.stringProp, modelWithPropertiesAndAdditionalProperties.stringProp)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(integerProp, stringProp, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithPropertiesAndAdditionalProperties {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    " + JSONB_PROPERTY_INTEGER_PROP + ": ")
                .append(toIndentedString(integerProp))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_STRING_PROP + ": ")
                .append(toIndentedString(stringProp))
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
        private java.util.Optional<Integer> integerProp;
        private java.util.Optional<String> stringProp;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder integerProp(final java.util.Optional<Integer> integerProp) {
            this.integerProp = integerProp;
            return this;
        }

        public Builder integerProp(final Integer integerProp) {
            this.integerProp = java.util.Optional.ofNullable(integerProp);
            return this;
        }

        public Builder stringProp(final java.util.Optional<String> stringProp) {
            this.stringProp = stringProp;
            return this;
        }

        public Builder stringProp(final String stringProp) {
            this.stringProp = java.util.Optional.ofNullable(stringProp);
            return this;
        }

        public ModelWithPropertiesAndAdditionalProperties build() {
            return new ModelWithPropertiesAndAdditionalProperties(this.integerProp, this.stringProp);
        }
    }
}
