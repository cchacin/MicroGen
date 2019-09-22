package org.openapitools.server.model;

/**
 * This is an base class object from which other classes will derive.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class SampleBase {

    private final java.util.Optional<String> baseClassStringProp;

    private final java.util.OptionalInt baseClassIntegerProp;

    @javax.json.bind.annotation.JsonbCreator public SampleBase(
        @javax.json.bind.annotation.JsonbProperty("baseClassStringProp")
        final java.util.Optional<String> baseClassStringProp,
        @javax.json.bind.annotation.JsonbProperty("baseClassIntegerProp")
        final java.util.OptionalInt baseClassIntegerProp) {
        this.baseClassStringProp = baseClassStringProp;
        this.baseClassIntegerProp = baseClassIntegerProp;
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

    @Override public boolean equals(java.lang.Object o) {
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

    @Override public int hashCode() {
        return java.util.Objects.hash(baseClassStringProp, baseClassIntegerProp);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleBase {\n");

        sb.append("    baseClassStringProp: ").append(toIndentedString(baseClassStringProp))
            .append("\n");
        sb.append("    baseClassIntegerProp: ").append(toIndentedString(baseClassIntegerProp))
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

    public static final class Builder {
        private java.util.Optional<String> baseClassStringProp;
        private java.util.OptionalInt baseClassIntegerProp;

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

        public SampleBase build() {
            return new SampleBase(this.baseClassStringProp, this.baseClassIntegerProp);
        }
    }
}
