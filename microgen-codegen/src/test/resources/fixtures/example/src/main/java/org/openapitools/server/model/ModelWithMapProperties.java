package org.openapitools.server.model;

/**
 * This is a model object that has map properties of type&#x3D;integer, type&#x3D;string, and
 * type&#x3D;&lt;model&gt;.
 */
@javax.json.bind.annotation.JsonbPropertyOrder({
        ModelWithMapProperties.JSONB_PROPERTY_STRING_MAP,
        ModelWithMapProperties.JSONB_PROPERTY_INTEGER_MAP,
        ModelWithMapProperties.JSONB_PROPERTY_ERROR_INFO_MAP,
        ModelWithMapProperties.JSONB_PROPERTY_ERROR_INFO_ARRAY_MAP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class ModelWithMapProperties implements OpenAPIModel {

    public static final String JSONB_PROPERTY_STRING_MAP = "stringMap";
    public static final String JSONB_PROPERTY_INTEGER_MAP = "integerMap";
    public static final String JSONB_PROPERTY_ERROR_INFO_MAP = "errorInfoMap";
    public static final String JSONB_PROPERTY_ERROR_INFO_ARRAY_MAP = "errorInfoArrayMap";

    private java.util.Optional<java.util.Map<String, String>> stringMap =
            java.util.Optional.of(new java.util.HashMap<String, String>());

    private java.util.Optional<java.util.Map<String, Integer>> integerMap =
            java.util.Optional.of(new java.util.HashMap<String, Integer>());

    @javax.validation.Valid
    private java.util.Optional<java.util.Map<String, ErrorInfo>> errorInfoMap =
            java.util.Optional.of(new java.util.HashMap<String, ErrorInfo>());

    @javax.validation.Valid
    private java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>> errorInfoArrayMap =
            java.util.Optional.of(new java.util.HashMap<String, java.util.List<ErrorInfo>>());

    public ModelWithMapProperties() {}

    public ModelWithMapProperties(
            final java.util.Optional<java.util.Map<String, String>> stringMap,
            final java.util.Optional<java.util.Map<String, Integer>> integerMap,
            final java.util.Optional<java.util.Map<String, ErrorInfo>> errorInfoMap,
            final java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>>
                    errorInfoArrayMap) {
        this.stringMap = stringMap;
        this.integerMap = integerMap;
        this.errorInfoMap = errorInfoMap;
        this.errorInfoArrayMap = errorInfoArrayMap;
    }

    /**
     * Get stringMap
     *
     * @return stringMap
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_MAP)
    public java.util.Optional<java.util.Map<String, String>> getStringMap() {
        return stringMap;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_MAP)
    public void setStringMap(java.util.Optional<java.util.Map<String, String>> stringMap) {
        this.stringMap = stringMap;
    }

    /**
     * Get integerMap
     *
     * @return integerMap
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_INTEGER_MAP)
    public java.util.Optional<java.util.Map<String, Integer>> getIntegerMap() {
        return integerMap;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_INTEGER_MAP)
    public void setIntegerMap(java.util.Optional<java.util.Map<String, Integer>> integerMap) {
        this.integerMap = integerMap;
    }

    /**
     * Get errorInfoMap
     *
     * @return errorInfoMap
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ERROR_INFO_MAP)
    public java.util.Optional<java.util.Map<String, ErrorInfo>> getErrorInfoMap() {
        return errorInfoMap;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ERROR_INFO_MAP)
    public void setErrorInfoMap(java.util.Optional<java.util.Map<String, ErrorInfo>> errorInfoMap) {
        this.errorInfoMap = errorInfoMap;
    }

    /**
     * Get errorInfoArrayMap
     *
     * @return errorInfoArrayMap
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ERROR_INFO_ARRAY_MAP)
    public java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>>
    getErrorInfoArrayMap() {
        return errorInfoArrayMap;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ERROR_INFO_ARRAY_MAP)
    public void setErrorInfoArrayMap(
            java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>> errorInfoArrayMap) {
        this.errorInfoArrayMap = errorInfoArrayMap;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelWithMapProperties modelWithMapProperties = (ModelWithMapProperties) o;
        return java.util.Objects.equals(this.stringMap, modelWithMapProperties.stringMap)
                && java.util.Objects.equals(this.integerMap, modelWithMapProperties.integerMap)
                && java.util.Objects.equals(this.errorInfoMap, modelWithMapProperties.errorInfoMap)
                && java.util.Objects.equals(
                this.errorInfoArrayMap, modelWithMapProperties.errorInfoArrayMap);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(stringMap, integerMap, errorInfoMap, errorInfoArrayMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithMapProperties {\n");

        sb.append("    " + JSONB_PROPERTY_STRING_MAP + ": ")
                .append(toIndentedString(stringMap))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_INTEGER_MAP + ": ")
                .append(toIndentedString(integerMap))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_ERROR_INFO_MAP + ": ")
                .append(toIndentedString(errorInfoMap))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_ERROR_INFO_ARRAY_MAP + ": ")
                .append(toIndentedString(errorInfoArrayMap))
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
        private java.util.Optional<java.util.Map<String, String>> stringMap;
        private java.util.Optional<java.util.Map<String, Integer>> integerMap;
        private java.util.Optional<java.util.Map<String, ErrorInfo>> errorInfoMap;
        private java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>> errorInfoArrayMap;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder stringMap(final java.util.Optional<java.util.Map<String, String>> stringMap) {
            this.stringMap = stringMap;
            return this;
        }

        public Builder stringMap(final java.util.Map<String, String> stringMap) {
            this.stringMap = java.util.Optional.ofNullable(stringMap);
            return this;
        }

        public Builder integerMap(final java.util.Optional<java.util.Map<String, Integer>> integerMap) {
            this.integerMap = integerMap;
            return this;
        }

        public Builder integerMap(final java.util.Map<String, Integer> integerMap) {
            this.integerMap = java.util.Optional.ofNullable(integerMap);
            return this;
        }

        public Builder errorInfoMap(
                final java.util.Optional<java.util.Map<String, ErrorInfo>> errorInfoMap) {
            this.errorInfoMap = errorInfoMap;
            return this;
        }

        public Builder errorInfoMap(final java.util.Map<String, ErrorInfo> errorInfoMap) {
            this.errorInfoMap = java.util.Optional.ofNullable(errorInfoMap);
            return this;
        }

        public Builder errorInfoArrayMap(
                final java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>>
                        errorInfoArrayMap) {
            this.errorInfoArrayMap = errorInfoArrayMap;
            return this;
        }

        public Builder errorInfoArrayMap(
                final java.util.Map<String, java.util.List<ErrorInfo>> errorInfoArrayMap) {
            this.errorInfoArrayMap = java.util.Optional.ofNullable(errorInfoArrayMap);
            return this;
        }

        public ModelWithMapProperties build() {
            return new ModelWithMapProperties(
                    this.stringMap, this.integerMap, this.errorInfoMap, this.errorInfoArrayMap);
        }
    }
}
