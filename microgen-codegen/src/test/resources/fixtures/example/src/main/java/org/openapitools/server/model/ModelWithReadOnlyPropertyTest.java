package org.openapitools.server.model;

/**
 * This is a model object that contains a property with readOnly&#x3D;true.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class ModelWithReadOnlyPropertyTest {

    private final java.util.Optional<String> stringPropWithImplicitReadOnlyFalse;

    private final java.util.Optional<String> stringPropWithExplicitReadOnlyFalse;

    private final java.util.Optional<String> stringPropWithReadOnlyTrue;

    @javax.json.bind.annotation.JsonbCreator public ModelWithReadOnlyPropertyTest(
        @javax.json.bind.annotation.JsonbProperty("stringPropWithImplicitReadOnlyFalse")
        final java.util.Optional<String> stringPropWithImplicitReadOnlyFalse,
        @javax.json.bind.annotation.JsonbProperty("stringPropWithExplicitReadOnlyFalse")
        final java.util.Optional<String> stringPropWithExplicitReadOnlyFalse,
        @javax.json.bind.annotation.JsonbProperty("stringPropWithReadOnlyTrue")
        final java.util.Optional<String> stringPropWithReadOnlyTrue) {
        this.stringPropWithImplicitReadOnlyFalse = stringPropWithImplicitReadOnlyFalse;
        this.stringPropWithExplicitReadOnlyFalse = stringPropWithExplicitReadOnlyFalse;
        this.stringPropWithReadOnlyTrue = stringPropWithReadOnlyTrue;
    }

    /**
     * This is a property without a readOnly attribute, meaning that it takes on the default value
     * of readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithImplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithImplicitReadOnlyFalse")
    public java.util.Optional<String> getStringPropWithImplicitReadOnlyFalse() {
        return stringPropWithImplicitReadOnlyFalse;
    }

    /**
     * This is a property with readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithExplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithExplicitReadOnlyFalse")
    public java.util.Optional<String> getStringPropWithExplicitReadOnlyFalse() {
        return stringPropWithExplicitReadOnlyFalse;
    }

    /**
     * This is a property with readOnly=true, meaning that it should be included in the response,
     * but not the request.
     *
     * @return stringPropWithReadOnlyTrue
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithReadOnlyTrue")
    public java.util.Optional<String> getStringPropWithReadOnlyTrue() {
        return stringPropWithReadOnlyTrue;
    }

    @Override public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelWithReadOnlyPropertyTest modelWithReadOnlyPropertyTest =
            (ModelWithReadOnlyPropertyTest) o;
        return java.util.Objects.equals(this.stringPropWithImplicitReadOnlyFalse,
            modelWithReadOnlyPropertyTest.stringPropWithImplicitReadOnlyFalse) && java.util.Objects
            .equals(this.stringPropWithExplicitReadOnlyFalse,
                modelWithReadOnlyPropertyTest.stringPropWithExplicitReadOnlyFalse)
            && java.util.Objects.equals(this.stringPropWithReadOnlyTrue,
            modelWithReadOnlyPropertyTest.stringPropWithReadOnlyTrue);
    }

    @Override public int hashCode() {
        return java.util.Objects
            .hash(stringPropWithImplicitReadOnlyFalse, stringPropWithExplicitReadOnlyFalse,
                stringPropWithReadOnlyTrue);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithReadOnlyPropertyTest {\n");

        sb.append("    stringPropWithImplicitReadOnlyFalse: ")
            .append(toIndentedString(stringPropWithImplicitReadOnlyFalse)).append("\n");
        sb.append("    stringPropWithExplicitReadOnlyFalse: ")
            .append(toIndentedString(stringPropWithExplicitReadOnlyFalse)).append("\n");
        sb.append("    stringPropWithReadOnlyTrue: ")
            .append(toIndentedString(stringPropWithReadOnlyTrue)).append("\n");
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

        public Builder setStringPropWithImplicitReadOnlyFalse(
            final java.util.Optional<String> stringPropWithImplicitReadOnlyFalse) {
            this.stringPropWithImplicitReadOnlyFalse = stringPropWithImplicitReadOnlyFalse;
            return this;
        }

        public Builder setStringPropWithExplicitReadOnlyFalse(
            final java.util.Optional<String> stringPropWithExplicitReadOnlyFalse) {
            this.stringPropWithExplicitReadOnlyFalse = stringPropWithExplicitReadOnlyFalse;
            return this;
        }

        public Builder setStringPropWithReadOnlyTrue(
            final java.util.Optional<String> stringPropWithReadOnlyTrue) {
            this.stringPropWithReadOnlyTrue = stringPropWithReadOnlyTrue;
            return this;
        }

        public ModelWithReadOnlyPropertyTest build() {
            return new ModelWithReadOnlyPropertyTest(this.stringPropWithImplicitReadOnlyFalse,
                this.stringPropWithExplicitReadOnlyFalse, this.stringPropWithReadOnlyTrue);
        }
    }
}
