package org.openapitools.server.model;

/** Pet */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbAnnotation.class,
                javax.json.bind.annotation.JsonbCreator.class,
                javax.json.bind.annotation.JsonbDateFormat.class,
                javax.json.bind.annotation.JsonbNillable.class,
                javax.json.bind.annotation.JsonbNumberFormat.class,
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbPropertyOrder.class,
                javax.json.bind.annotation.JsonbTransient.class,
                javax.json.bind.annotation.JsonbTypeAdapter.class,
                javax.json.bind.annotation.JsonbTypeSerializer.class,
                javax.json.bind.annotation.JsonbTypeDeserializer.class,
                javax.json.bind.annotation.JsonbVisibility.class
        },
        jdkOnly = true)
@javax.json.bind.annotation.JsonbPropertyOrder({
                                                       Pet.JSONB_PROPERTY_ID,
                                                       Pet.JSONB_PROPERTY_CATEGORY,
                                                       Pet.JSONB_PROPERTY_NAME,
                                                       Pet.JSONB_PROPERTY_PHOTO_URLS,
                                                       Pet.JSONB_PROPERTY_TAGS,
                                                       Pet.JSONB_PROPERTY_STATUS
                                               })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class Pet implements OpenAPIModel {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_CATEGORY = "category";
    public static final String JSONB_PROPERTY_NAME = "name";
    public static final String JSONB_PROPERTY_PHOTO_URLS = "photoUrls";
    public static final String JSONB_PROPERTY_TAGS = "tags";
    public static final String JSONB_PROPERTY_STATUS = "status";

    @javax.json.bind.annotation.JsonbCreator
    public Pet() {}

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public abstract java.util.OptionalLong getId();

    /**
     * Get category
     *
     * @return category
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_CATEGORY)
    public abstract java.util.Optional<Category> getCategory();

    /**
     * Get name
     *
     * @return name
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_NAME)
    public abstract String getName();

    /**
     * Get photoUrls
     *
     * @return photoUrls
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PHOTO_URLS)
    public abstract java.util.ArrayList<String> getPhotoUrls();

    /**
     * Get tags
     *
     * @return tags
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_TAGS)
    public abstract java.util.ArrayList<Tag> getTags();

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
        public static StatusEnum fromValue(final String text) {
            return java.util.Arrays.stream(StatusEnum.values())
                                   .filter(b -> java.util.Objects.equals(String.valueOf(b.value), text))
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

    /**
     * pet status in the store
     *
     * @return status
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STATUS)
    public abstract StatusEnum getStatus();

    public static class Builder extends ImmutablePet.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
