package io.swagger.server.model;

/** Pet */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class Pet {

    private final Long id;

    @javax.validation.Valid private final Category category;

    @javax.validation.constraints.NotNull private final String name;

    @javax.validation.constraints.NotNull private final java.util.List<String> photoUrls;

    @javax.validation.Valid private final java.util.List<Tag> tags;

    /** pet status in the store */
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
        public static StatusEnum fromValue(final String text) {
            return java.util.Arrays.stream(StatusEnum.values())
                    .filter(b -> java.util.Objects.equals(String.valueOf(b.value), text))
                    .findFirst()
                    .orElse(null);
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

    private final StatusEnum status;

    @javax.json.bind.annotation.JsonbCreator
    public Pet(
            @javax.json.bind.annotation.JsonbProperty("id") final Long id,
            @javax.json.bind.annotation.JsonbProperty("category") final Category category,
            @javax.json.bind.annotation.JsonbProperty("name") final String name,
            @javax.json.bind.annotation.JsonbProperty("photoUrls") final java.util.List<String> photoUrls,
            @javax.json.bind.annotation.JsonbProperty("tags") final java.util.List<Tag> tags,
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
    @javax.json.bind.annotation.JsonbProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * Get category
     *
     * @return category
     */
    @javax.json.bind.annotation.JsonbProperty("category")
    public Category getCategory() {
        return category;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.json.bind.annotation.JsonbProperty("name")
    public String getName() {
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
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * pet status in the store
     *
     * @return status
     */
    @javax.json.bind.annotation.JsonbProperty("status")
    public StatusEnum getStatus() {
        return status;
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
}
