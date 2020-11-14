package org.openapitools.server.model;

/** This is an subclass defived from the SampleBase class. */
@javax.json.bind.annotation.JsonbPropertyOrder({
        SampleSubClass.JSONB_PROPERTY_BASE_CLASS_STRING_PROP,
        SampleSubClass.JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP,
        SampleSubClass.JSONB_PROPERTY_SUB_CLASS_STRING_PROP,
        SampleSubClass.JSONB_PROPERTY_SUB_CLASS_INTEGER_PROP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class SampleSubClass implements OpenAPIModel {

    public static final String JSONB_PROPERTY_BASE_CLASS_STRING_PROP = "baseClassStringProp";
    public static final String JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP = "baseClassIntegerProp";
    public static final String JSONB_PROPERTY_SUB_CLASS_STRING_PROP = "subClassStringProp";
    public static final String JSONB_PROPERTY_SUB_CLASS_INTEGER_PROP = "subClassIntegerProp";

    private java.util.Optional<String> baseClassStringProp = java.util.Optional.empty();

    private java.util.Optional<Integer> baseClassIntegerProp = java.util.Optional.empty();

    private java.util.Optional<String> subClassStringProp = java.util.Optional.empty();

    private java.util.Optional<Integer> subClassIntegerProp = java.util.Optional.empty();

    public SampleSubClass() {}

    public SampleSubClass(
            final java.util.Optional<String> baseClassStringProp,
            final java.util.Optional<Integer> baseClassIntegerProp,
            final java.util.Optional<String> subClassStringProp,
            final java.util.Optional<Integer> subClassIntegerProp) {
        this.baseClassStringProp = baseClassStringProp;
        this.baseClassIntegerProp = baseClassIntegerProp;
        this.subClassStringProp = subClassStringProp;
        this.subClassIntegerProp = subClassIntegerProp;
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

    /**
     * Get subClassStringProp
     *
     * @return subClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SUB_CLASS_STRING_PROP)
    public java.util.Optional<String> getSubClassStringProp() {
        return subClassStringProp;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SUB_CLASS_STRING_PROP)
    public void setSubClassStringProp(java.util.Optional<String> subClassStringProp) {
        this.subClassStringProp = subClassStringProp;
    }

    /**
     * Get subClassIntegerProp
     *
     * @return subClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SUB_CLASS_INTEGER_PROP)
    public java.util.Optional<Integer> getSubClassIntegerProp() {
        return subClassIntegerProp;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SUB_CLASS_INTEGER_PROP)
    public void setSubClassIntegerProp(java.util.Optional<Integer> subClassIntegerProp) {
        this.subClassIntegerProp = subClassIntegerProp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleSubClass sampleSubClass = (SampleSubClass) o;
        return java.util.Objects.equals(this.baseClassStringProp, sampleSubClass.baseClassStringProp)
                && java.util.Objects.equals(this.baseClassIntegerProp, sampleSubClass.baseClassIntegerProp)
                && java.util.Objects.equals(this.subClassStringProp, sampleSubClass.subClassStringProp)
                && java.util.Objects.equals(this.subClassIntegerProp, sampleSubClass.subClassIntegerProp);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
                baseClassStringProp, baseClassIntegerProp, subClassStringProp, subClassIntegerProp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleSubClass {\n");

        sb.append("    " + JSONB_PROPERTY_BASE_CLASS_STRING_PROP + ": ")
                .append(toIndentedString(baseClassStringProp))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP + ": ")
                .append(toIndentedString(baseClassIntegerProp))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_SUB_CLASS_STRING_PROP + ": ")
                .append(toIndentedString(subClassStringProp))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_SUB_CLASS_INTEGER_PROP + ": ")
                .append(toIndentedString(subClassIntegerProp))
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
        private java.util.Optional<String> subClassStringProp;
        private java.util.Optional<Integer> subClassIntegerProp;

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

        public Builder subClassStringProp(final java.util.Optional<String> subClassStringProp) {
            this.subClassStringProp = subClassStringProp;
            return this;
        }

        public Builder subClassStringProp(final String subClassStringProp) {
            this.subClassStringProp = java.util.Optional.ofNullable(subClassStringProp);
            return this;
        }

        public Builder subClassIntegerProp(final java.util.Optional<Integer> subClassIntegerProp) {
            this.subClassIntegerProp = subClassIntegerProp;
            return this;
        }

        public Builder subClassIntegerProp(final Integer subClassIntegerProp) {
            this.subClassIntegerProp = java.util.Optional.ofNullable(subClassIntegerProp);
            return this;
        }

        public SampleSubClass build() {
            return new SampleSubClass(
                    this.baseClassStringProp,
                    this.baseClassIntegerProp,
                    this.subClassStringProp,
                    this.subClassIntegerProp);
        }
    }
}
