package org.openapitools.server.model;

/**
 * This is an subclass defived from the SampleBase class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class SampleSubClass {

    private final java.util.Optional<String> baseClassStringProp;

    private final java.util.OptionalInt baseClassIntegerProp;

    private final java.util.Optional<String> subClassStringProp;

    private final java.util.OptionalInt subClassIntegerProp;

    @javax.json.bind.annotation.JsonbCreator public SampleSubClass(
        @javax.json.bind.annotation.JsonbProperty("baseClassStringProp")
        final java.util.Optional<String> baseClassStringProp,
        @javax.json.bind.annotation.JsonbProperty("baseClassIntegerProp")
        final java.util.OptionalInt baseClassIntegerProp,
        @javax.json.bind.annotation.JsonbProperty("subClassStringProp")
        final java.util.Optional<String> subClassStringProp,
        @javax.json.bind.annotation.JsonbProperty("subClassIntegerProp")
        final java.util.OptionalInt subClassIntegerProp) {
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
    @javax.json.bind.annotation.JsonbProperty("baseClassStringProp")
    public java.util.Optional<String> getBaseClassStringProp() {
        return baseClassStringProp;
    }

    /**
     * Get baseClassIntegerProp
     *
     * @return baseClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty("baseClassIntegerProp")
    public java.util.OptionalInt getBaseClassIntegerProp() {
        return baseClassIntegerProp;
    }

    /**
     * Get subClassStringProp
     *
     * @return subClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty("subClassStringProp")
    public java.util.Optional<String> getSubClassStringProp() {
        return subClassStringProp;
    }

    /**
     * Get subClassIntegerProp
     *
     * @return subClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty("subClassIntegerProp")
    public java.util.OptionalInt getSubClassIntegerProp() {
        return subClassIntegerProp;
    }

    @Override public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleSubClass sampleSubClass = (SampleSubClass) o;
        return
            java.util.Objects.equals(this.baseClassStringProp, sampleSubClass.baseClassStringProp)
                && java.util.Objects
                .equals(this.baseClassIntegerProp, sampleSubClass.baseClassIntegerProp)
                && java.util.Objects
                .equals(this.subClassStringProp, sampleSubClass.subClassStringProp)
                && java.util.Objects
                .equals(this.subClassIntegerProp, sampleSubClass.subClassIntegerProp);
    }

    @Override public int hashCode() {
        return java.util.Objects.hash(baseClassStringProp, baseClassIntegerProp, subClassStringProp,
            subClassIntegerProp);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleSubClass {\n");

        sb.append("    baseClassStringProp: ").append(toIndentedString(baseClassStringProp))
            .append("\n");
        sb.append("    baseClassIntegerProp: ").append(toIndentedString(baseClassIntegerProp))
            .append("\n");
        sb.append("    subClassStringProp: ").append(toIndentedString(subClassStringProp))
            .append("\n");
        sb.append("    subClassIntegerProp: ").append(toIndentedString(subClassIntegerProp))
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
        private java.util.OptionalInt baseClassIntegerProp;
        private java.util.Optional<String> subClassStringProp;
        private java.util.OptionalInt subClassIntegerProp;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder setBaseClassStringProp(
            final java.util.Optional<String> baseClassStringProp) {
            this.baseClassStringProp = baseClassStringProp;
            return this;
        }

        public Builder setBaseClassIntegerProp(final java.util.OptionalInt baseClassIntegerProp) {
            this.baseClassIntegerProp = baseClassIntegerProp;
            return this;
        }

        public Builder setSubClassStringProp(final java.util.Optional<String> subClassStringProp) {
            this.subClassStringProp = subClassStringProp;
            return this;
        }

        public Builder setSubClassIntegerProp(final java.util.OptionalInt subClassIntegerProp) {
            this.subClassIntegerProp = subClassIntegerProp;
            return this;
        }

        public SampleSubClass build() {
            return new SampleSubClass(this.baseClassStringProp, this.baseClassIntegerProp,
                this.subClassStringProp, this.subClassIntegerProp);
        }
    }
}
