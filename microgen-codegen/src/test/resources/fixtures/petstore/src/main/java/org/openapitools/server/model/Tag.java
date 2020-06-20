package org.openapitools.server.model;

/** Tag */
@org.immutables.value.Value.Immutable
@javax.json.bind.annotation.JsonbPropertyOrder({Tag.JSONB_PROPERTY_ID, Tag.JSONB_PROPERTY_NAME})
@javax.json.bind.annotation.JsonbTypeSerializer(TagSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(TagSerializer.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class Tag implements OpenAPIModel {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_NAME = "name";

    @javax.json.bind.annotation.JsonbCreator
    public Tag() {}

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public abstract java.util.Optional<Long> getId();

    /**
     * Get name
     *
     * @return name
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_NAME)
    public abstract java.util.Optional<String> getName();

    public static class Builder extends ImmutableTag.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
