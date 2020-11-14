package org.openapitools.server.model;

/** This is a model object that contains a property with readOnly&#x3D;true. */
@javax.json.bind.annotation.JsonbPropertyOrder({
        ModelWithReadOnlyPropertyTest.JSONB_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE,
        ModelWithReadOnlyPropertyTest.JSONB_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE,
        ModelWithReadOnlyPropertyTest.JSONB_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class ModelWithReadOnlyPropertyTest implements OpenAPIModel {

    public static final String JSONB_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE =
            "stringPropWithImplicitReadOnlyFalse";
    public static final String JSONB_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE =
            "stringPropWithExplicitReadOnlyFalse";
    public static final String JSONB_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE =
            "stringPropWithReadOnlyTrue";

    private java.util.Optional<String> stringPropWithImplicitReadOnlyFalse =
            java.util.Optional.empty();

    private java.util.Optional<String> stringPropWithExplicitReadOnlyFalse =
            java.util.Optional.empty();

    private java.util.Optional<String> stringPropWithReadOnlyTrue = java.util.Optional.empty();

    public ModelWithReadOnlyPropertyTest() {}

    public ModelWithReadOnlyPropertyTest(
            final java.util.Optional<String> stringPropWithImplicitReadOnlyFalse,
            final java.util.Optional<String> stringPropWithExplicitReadOnlyFalse,
            final java.util.Optional<String> stringPropWithReadOnlyTrue) {
        this.stringPropWithImplicitReadOnlyFalse = stringPropWithImplicitReadOnlyFalse;
        this.stringPropWithExplicitReadOnlyFalse = stringPropWithExplicitReadOnlyFalse;
        this.stringPropWithReadOnlyTrue = stringPropWithReadOnlyTrue;
    }

    /**
     * This is a property without a readOnly attribute, meaning that it takes on the default value of
     * readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithImplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty(
            JSONB_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE)
    public java.util.Optional<String> getStringPropWithImplicitReadOnlyFalse() {
        return stringPropWithImplicitReadOnlyFalse;
    }

    @javax.json.bind.annotation.JsonbProperty(
            JSONB_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE)
    public void setStringPropWithImplicitReadOnlyFalse(
            java.util.Optional<String> stringPropWithImplicitReadOnlyFalse) {
        this.stringPropWithImplicitReadOnlyFalse = stringPropWithImplicitReadOnlyFalse;
    }

    /**
     * This is a property with readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithExplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty(
            JSONB_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE)
    public java.util.Optional<String> getStringPropWithExplicitReadOnlyFalse() {
        return stringPropWithExplicitReadOnlyFalse;
    }

    @javax.json.bind.annotation.JsonbProperty(
            JSONB_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE)
    public void setStringPropWithExplicitReadOnlyFalse(
            java.util.Optional<String> stringPropWithExplicitReadOnlyFalse) {
        this.stringPropWithExplicitReadOnlyFalse = stringPropWithExplicitReadOnlyFalse;
    }

    /**
     * This is a property with readOnly=true, meaning that it should be included in the response, but
     * not the request.
     *
     * @return stringPropWithReadOnlyTrue
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE)
    public java.util.Optional<String> getStringPropWithReadOnlyTrue() {
        return stringPropWithReadOnlyTrue;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE)
    public void setStringPropWithReadOnlyTrue(java.util.Optional<String> stringPropWithReadOnlyTrue) {
        this.stringPropWithReadOnlyTrue = stringPropWithReadOnlyTrue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelWithReadOnlyPropertyTest modelWithReadOnlyPropertyTest = (ModelWithReadOnlyPropertyTest) o;
        return java.util.Objects.equals(
                this.stringPropWithImplicitReadOnlyFalse,
                modelWithReadOnlyPropertyTest.stringPropWithImplicitReadOnlyFalse)
                && java.util.Objects.equals(
                this.stringPropWithExplicitReadOnlyFalse,
                modelWithReadOnlyPropertyTest.stringPropWithExplicitReadOnlyFalse)
                && java.util.Objects.equals(
                this.stringPropWithReadOnlyTrue,
                modelWithReadOnlyPropertyTest.stringPropWithReadOnlyTrue);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
                stringPropWithImplicitReadOnlyFalse,
                stringPropWithExplicitReadOnlyFalse,
                stringPropWithReadOnlyTrue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithReadOnlyPropertyTest {\n");

        sb.append("    " + JSONB_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE + ": ")
                .append(toIndentedString(stringPropWithImplicitReadOnlyFalse))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE + ": ")
                .append(toIndentedString(stringPropWithExplicitReadOnlyFalse))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE + ": ")
                .append(toIndentedString(stringPropWithReadOnlyTrue))
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
        private java.util.Optional<String> stringPropWithImplicitReadOnlyFalse;
        private java.util.Optional<String> stringPropWithExplicitReadOnlyFalse;
        private java.util.Optional<String> stringPropWithReadOnlyTrue;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder stringPropWithImplicitReadOnlyFalse(
                final java.util.Optional<String> stringPropWithImplicitReadOnlyFalse) {
            this.stringPropWithImplicitReadOnlyFalse = stringPropWithImplicitReadOnlyFalse;
            return this;
        }

        public Builder stringPropWithImplicitReadOnlyFalse(
                final String stringPropWithImplicitReadOnlyFalse) {
            this.stringPropWithImplicitReadOnlyFalse =
                    java.util.Optional.ofNullable(stringPropWithImplicitReadOnlyFalse);
            return this;
        }

        public Builder stringPropWithExplicitReadOnlyFalse(
                final java.util.Optional<String> stringPropWithExplicitReadOnlyFalse) {
            this.stringPropWithExplicitReadOnlyFalse = stringPropWithExplicitReadOnlyFalse;
            return this;
        }

        public Builder stringPropWithExplicitReadOnlyFalse(
                final String stringPropWithExplicitReadOnlyFalse) {
            this.stringPropWithExplicitReadOnlyFalse =
                    java.util.Optional.ofNullable(stringPropWithExplicitReadOnlyFalse);
            return this;
        }

        public Builder stringPropWithReadOnlyTrue(
                final java.util.Optional<String> stringPropWithReadOnlyTrue) {
            this.stringPropWithReadOnlyTrue = stringPropWithReadOnlyTrue;
            return this;
        }

        public Builder stringPropWithReadOnlyTrue(final String stringPropWithReadOnlyTrue) {
            this.stringPropWithReadOnlyTrue = java.util.Optional.ofNullable(stringPropWithReadOnlyTrue);
            return this;
        }

        public ModelWithReadOnlyPropertyTest build() {
            return new ModelWithReadOnlyPropertyTest(
                    this.stringPropWithImplicitReadOnlyFalse,
                    this.stringPropWithExplicitReadOnlyFalse,
                    this.stringPropWithReadOnlyTrue);
        }
    }
}
