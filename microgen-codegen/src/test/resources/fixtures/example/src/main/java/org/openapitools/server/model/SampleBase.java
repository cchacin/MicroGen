package org.openapitools.server.model;

/** This is an base class object from which other classes will derive. */
@javax.json.bind.annotation.JsonbPropertyOrder({
        SampleBase.JSONB_PROPERTY_BASE_CLASS_STRING_PROP,
        SampleBase.JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class SampleBase implements OpenAPIModel {

    public static final String JSONB_PROPERTY_BASE_CLASS_STRING_PROP = "baseClassStringProp";
    public static final String JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP = "baseClassIntegerProp";

    private java.util.Optional<String> baseClassStringProp = java.util.Optional.empty();

    private java.util.Optional<Integer> baseClassIntegerProp = java.util.Optional.empty();

    public SampleBase() {}

    public SampleBase(
            final java.util.Optional<String> baseClassStringProp,
            final java.util.Optional<Integer> baseClassIntegerProp) {
        this.baseClassStringProp = baseClassStringProp;
        this.baseClassIntegerProp = baseClassIntegerProp;
    }

    /**
     * Get baseClassStringProp
     *
     * @return baseClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_BASE_CLASS_STRING_PROP)
    public java.util.Optional<String> getBaseClassStringProp() {
        return baseClassStringProp;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_BASE_CLASS_STRING_PROP)
    public void setBaseClassStringProp(java.util.Optional<String> baseClassStringProp) {
        this.baseClassStringProp = baseClassStringProp;
    }

    /**
     * Get baseClassIntegerProp
     *
     * @return baseClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP)
    public java.util.Optional<Integer> getBaseClassIntegerProp() {
        return baseClassIntegerProp;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP)
    public void setBaseClassIntegerProp(java.util.Optional<Integer> baseClassIntegerProp) {
        this.baseClassIntegerProp = baseClassIntegerProp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleBase sampleBase = (SampleBase) o;
        return java.util.Objects.equals(this.baseClassStringProp, sampleBase.baseClassStringProp)
                && java.util.Objects.equals(this.baseClassIntegerProp, sampleBase.baseClassIntegerProp);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(baseClassStringProp, baseClassIntegerProp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleBase {\n");

        sb.append("    " + JSONB_PROPERTY_BASE_CLASS_STRING_PROP + ": ")
                .append(toIndentedString(baseClassStringProp))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP + ": ")
                .append(toIndentedString(baseClassIntegerProp))
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
        private java.util.Optional<String> baseClassStringProp;
        private java.util.Optional<Integer> baseClassIntegerProp;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder baseClassStringProp(final java.util.Optional<String> baseClassStringProp) {
            this.baseClassStringProp = baseClassStringProp;
            return this;
        }

        public Builder baseClassStringProp(final String baseClassStringProp) {
            this.baseClassStringProp = java.util.Optional.ofNullable(baseClassStringProp);
            return this;
        }

        public Builder baseClassIntegerProp(final java.util.Optional<Integer> baseClassIntegerProp) {
            this.baseClassIntegerProp = baseClassIntegerProp;
            return this;
        }

        public Builder baseClassIntegerProp(final Integer baseClassIntegerProp) {
            this.baseClassIntegerProp = java.util.Optional.ofNullable(baseClassIntegerProp);
            return this;
        }

        public SampleBase build() {
            return new SampleBase(this.baseClassStringProp, this.baseClassIntegerProp);
        }
    }
}
