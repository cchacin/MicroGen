package org.openapitools.server.model;

public static class TagSerializer
        implements javax.json.bind.serializer.JsonbSerializer<Tag>,
        javax.json.bind.serializer.JsonbDeserializer<Tag> {

    @Override
    public void serialize(Tag obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("id", obj.getId(), generator);
        ctx.serialize("name", obj.getName(), generator);
        generator.writeEnd();
    }

    @Override
    public Tag deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return Tag.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .name(jsonObject.getString("name"))
                .build();
    }
}
