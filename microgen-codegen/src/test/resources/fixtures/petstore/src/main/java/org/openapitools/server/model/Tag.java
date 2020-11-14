package org.openapitools.server.model;

/** Tag */
@javax.json.bind.annotation.JsonbPropertyOrder({Tag.JSONB_PROPERTY_ID, Tag.JSONB_PROPERTY_NAME})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Tag implements OpenAPIModel {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_NAME = "name";

    private java.util.Optional<Long> id = java.util.Optional.empty();

    private java.util.Optional<String> name = java.util.Optional.empty();

    public Tag() {}

    public Tag(final java.util.Optional<Long> id, final java.util.Optional<String> name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public java.util.Optional<Long> getId() {
        return id;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public void setId(java.util.Optional<Long> id) {
        this.id = id;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_NAME)
    public java.util.Optional<String> getName() {
        return name;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_NAME)
    public void setName(java.util.Optional<String> name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tag tag = (Tag) o;
        return java.util.Objects.equals(this.id, tag.id)
                && java.util.Objects.equals(this.name, tag.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");

        sb.append("    " + JSONB_PROPERTY_ID + ": ").append(toIndentedString(id)).append("\n");
        sb.append("    " + JSONB_PROPERTY_NAME + ": ").append(toIndentedString(name)).append("\n");
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
        private java.util.Optional<Long> id;
        private java.util.Optional<String> name;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder id(final java.util.Optional<Long> id) {
            this.id = id;
            return this;
        }

        public Builder id(final Long id) {
            this.id = java.util.Optional.ofNullable(id);
            return this;
        }

        public Builder name(final java.util.Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(final String name) {
            this.name = java.util.Optional.ofNullable(name);
            return this;
        }

        public Tag build() {
            return new Tag(this.id, this.name);
        }
    }
}
