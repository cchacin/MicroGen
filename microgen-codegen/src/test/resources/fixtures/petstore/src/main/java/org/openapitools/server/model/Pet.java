package org.openapitools.server.model;

/** Pet */
@javax.json.bind.annotation.JsonbPropertyOrder({
        Pet.JSONB_PROPERTY_ID,
        Pet.JSONB_PROPERTY_CATEGORY,
        Pet.JSONB_PROPERTY_NAME,
        Pet.JSONB_PROPERTY_PHOTO_URLS,
        Pet.JSONB_PROPERTY_TAGS,
        Pet.JSONB_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Pet implements OpenAPIModel {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_CATEGORY = "category";
    public static final String JSONB_PROPERTY_NAME = "name";
    public static final String JSONB_PROPERTY_PHOTO_URLS = "photoUrls";
    public static final String JSONB_PROPERTY_TAGS = "tags";
    public static final String JSONB_PROPERTY_STATUS = "status";

    private java.util.Optional<Long> id = java.util.Optional.empty();

    @javax.validation.Valid
    private java.util.Optional<Category> category = java.util.Optional.empty();

    @javax.validation.constraints.NotNull private String name;

    @javax.validation.constraints.NotNull private java.util.List<String> photoUrls;

    @javax.validation.Valid
    private java.util.Optional<java.util.List<Tag>> tags =
            java.util.Optional.of(new java.util.ArrayList<Tag>());

    /** pet status in the store */
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

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        @javax.json.bind.annotation.JsonbCreator
        public static StatusEnum fromValue(final String value) {
            return java.util.Arrays.stream(StatusEnum.values())
                    .filter(b -> b.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class StatusEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<StatusEnum> {

        public StatusEnumSerializer() {}

        @Override
        public void serialize(
                StatusEnum aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class StatusEnumDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<StatusEnum> {

        public StatusEnumDeserializer() {}

        @Override
        public StatusEnum deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return StatusEnum.fromValue(jsonParser.getString());
        }
    }

    private java.util.Optional<StatusEnum> status = java.util.Optional.empty();

    public Pet() {}

    public Pet(
            final java.util.Optional<Long> id,
            final java.util.Optional<Category> category,
            final String name,
            final java.util.List<String> photoUrls,
            final java.util.Optional<java.util.List<Tag>> tags,
            final java.util.Optional<StatusEnum> status) {
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
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public java.util.Optional<Long> getId() {
        return id;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public void setId(java.util.Optional<Long> id) {
        this.id = id;
    }

    /**
     * Get category
     *
     * @return category
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_CATEGORY)
    public java.util.Optional<Category> getCategory() {
        return category;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_CATEGORY)
    public void setCategory(java.util.Optional<Category> category) {
        this.category = category;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_NAME)
    public String getName() {
        return name;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_NAME)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get photoUrls
     *
     * @return photoUrls
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PHOTO_URLS)
    public java.util.List<String> getPhotoUrls() {
        return photoUrls;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PHOTO_URLS)
    public void setPhotoUrls(java.util.List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    /**
     * Get tags
     *
     * @return tags
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_TAGS)
    public java.util.Optional<java.util.List<Tag>> getTags() {
        return tags;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_TAGS)
    public void setTags(java.util.Optional<java.util.List<Tag>> tags) {
        this.tags = tags;
    }

    /**
     * pet status in the store
     *
     * @return status
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STATUS)
    public java.util.Optional<StatusEnum> getStatus() {
        return status;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STATUS)
    public void setStatus(java.util.Optional<StatusEnum> status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return java.util.Objects.equals(this.id, pet.id)
                && java.util.Objects.equals(this.category, pet.category)
                && java.util.Objects.equals(this.name, pet.name)
                && java.util.Objects.equals(this.photoUrls, pet.photoUrls)
                && java.util.Objects.equals(this.tags, pet.tags)
                && java.util.Objects.equals(this.status, pet.status);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, category, name, photoUrls, tags, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pet {\n");

        sb.append("    " + JSONB_PROPERTY_ID + ": ").append(toIndentedString(id)).append("\n");
        sb.append("    " + JSONB_PROPERTY_CATEGORY + ": ")
                .append(toIndentedString(category))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_NAME + ": ").append(toIndentedString(name)).append("\n");
        sb.append("    " + JSONB_PROPERTY_PHOTO_URLS + ": ")
                .append(toIndentedString(photoUrls))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_TAGS + ": ").append(toIndentedString(tags)).append("\n");
        sb.append("    " + JSONB_PROPERTY_STATUS + ": ").append(toIndentedString(status)).append("\n");
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
        private java.util.Optional<Category> category;
        private String name;
        private java.util.List<String> photoUrls;
        private java.util.Optional<java.util.List<Tag>> tags;
        private java.util.Optional<StatusEnum> status;

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

        public Builder category(final java.util.Optional<Category> category) {
            this.category = category;
            return this;
        }

        public Builder category(final Category category) {
            this.category = java.util.Optional.ofNullable(category);
            return this;
        }

        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Builder photoUrls(final java.util.List<String> photoUrls) {
            this.photoUrls = photoUrls;
            return this;
        }

        public Builder addPhotoUrlsItem(String photoUrlsItem) {
            if (this.photoUrls == null) {
                this.photoUrls = new java.util.ArrayList<String>();
            }
            this.photoUrls.add(photoUrlsItem);
            return this;
        }

        public Builder tags(final java.util.Optional<java.util.List<Tag>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(final java.util.List<Tag> tags) {
            this.tags = java.util.Optional.ofNullable(tags);
            return this;
        }

        public Builder addTagsItem(Tag tagsItem) {
            if (this.tags == null || !this.tags.isPresent()) {
                this.tags = java.util.Optional.ofNullable(new java.util.ArrayList<Tag>());
            }
            this.tags.get().add(tagsItem);
            return this;
        }

        public Builder status(final java.util.Optional<StatusEnum> status) {
            this.status = status;
            return this;
        }

        public Builder status(final String status) {
            this.status = java.util.Optional.ofNullable(status);
            return this;
        }

        public Pet build() {
            return new Pet(this.id, this.category, this.name, this.photoUrls, this.tags, this.status);
        }
    }
}
