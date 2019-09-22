package org.openapitools.server.model;

/**
 * Pet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class Pet {

    private final java.util.OptionalLong id;

    @javax.validation.Valid private final java.util.Optional<Category> category;

    @javax.validation.constraints.NotNull private final String name;

    @javax.validation.constraints.NotNull private final java.util.List<String> photoUrls;

    @javax.validation.Valid private final java.util.Optional<java.util.List<Tag>> tags;


    /**
     * pet status in the store
     */
    @javax.json.bind.annotation.JsonbTypeSerializer(Pet.StatusEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(Pet.StatusEnumDeserializer.class)
    public static enum StatusEnum {
        AVAILABLE("available"),

        PENDING("pending"),

        SOLD("sold");

        private final String value;

        StatusEnum(final String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        @Override public String toString() {
            return String.valueOf(this.value);
        }

        @javax.json.bind.annotation.JsonbCreator
        public static StatusEnum fromValue(final String text) {
            return java.util.Arrays.stream(StatusEnum.values())
                .filter(b -> java.util.Objects.equals(String.valueOf(b.value), text)).findFirst()
                .orElse(null);
        }
    }


    public static class StatusEnumSerializer
        implements javax.json.bind.serializer.JsonbSerializer<StatusEnum> {

        public StatusEnumSerializer() {}

        @Override
        public void serialize(StatusEnum aEnum, javax.json.stream.JsonGenerator jsonGenerator,
            javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }


    public static class StatusEnumDeserializer
        implements javax.json.bind.serializer.JsonbDeserializer<StatusEnum> {

        public StatusEnumDeserializer() {}

        @Override public StatusEnum deserialize(javax.json.stream.JsonParser jsonParser,
            javax.json.bind.serializer.DeserializationContext deserializationContext,
            java.lang.reflect.Type type) {
            return StatusEnum.fromValue(jsonParser.getString());
        }
    }


    private final StatusEnum status;

    @javax.json.bind.annotation.JsonbCreator
    public Pet(@javax.json.bind.annotation.JsonbProperty("id") final java.util.OptionalLong id,
        @javax.json.bind.annotation.JsonbProperty("category")
        final java.util.Optional<Category> category,
        @javax.json.bind.annotation.JsonbProperty("name") final String name,
        @javax.json.bind.annotation.JsonbProperty("photoUrls")
        final java.util.List<String> photoUrls, @javax.json.bind.annotation.JsonbProperty("tags")
    final java.util.Optional<java.util.List<Tag>> tags,
        @javax.json.bind.annotation.JsonbProperty("status") final StatusEnum status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty("id") public java.util.OptionalLong getId() {
        return id;
    }

    /**
     * Get category
     *
     * @return category
     */
    @javax.json.bind.annotation.JsonbProperty("category")
    public java.util.Optional<Category> getCategory() {
        return category;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.json.bind.annotation.JsonbProperty("name") public String getName() {
        return name;
    }

    /**
     * Get photoUrls
     *
     * @return photoUrls
     */
    @javax.json.bind.annotation.JsonbProperty("photoUrls")
    public java.util.List<String> getPhotoUrls() {
        return photoUrls;
    }

    /**
     * Get tags
     *
     * @return tags
     */
    @javax.json.bind.annotation.JsonbProperty("tags")
    public java.util.Optional<java.util.List<Tag>> getTags() {
        return tags;
    }

    /**
     * pet status in the store
     *
     * @return status
     */
    @javax.json.bind.annotation.JsonbProperty("status") public StatusEnum getStatus() {
        return status;
    }

    @Override public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return java.util.Objects.equals(this.id, pet.id) && java.util.Objects
            .equals(this.category, pet.category) && java.util.Objects.equals(this.name, pet.name)
            && java.util.Objects.equals(this.photoUrls, pet.photoUrls) && java.util.Objects
            .equals(this.tags, pet.tags) && java.util.Objects.equals(this.status, pet.status);
    }

    @Override public int hashCode() {
        return java.util.Objects.hash(id, category, name, photoUrls, tags, status);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pet {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        private java.util.OptionalLong id;
        private java.util.Optional<Category> category;
        private String name;
        private java.util.List<String> photoUrls;
        private java.util.Optional<java.util.List<Tag>> tags;
        private StatusEnum status;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder setId(final java.util.OptionalLong id) {
            this.id = id;
            return this;
        }

        public Builder setCategory(final java.util.Optional<Category> category) {
            this.category = category;
            return this;
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setPhotoUrls(final java.util.List<String> photoUrls) {
            this.photoUrls = photoUrls;
            return this;
        }

        public Builder setTags(final java.util.Optional<java.util.List<Tag>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setStatus(final StatusEnum status) {
            this.status = status;
            return this;
        }

        public Pet build() {
            return new Pet(this.id, this.category, this.name, this.photoUrls, this.tags,
                this.status);
        }
    }
}
