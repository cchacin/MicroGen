package org.openapitools.server.model;

public static class CategorySerializer
        implements javax.json.bind.serializer.JsonbSerializer<Category>,
        javax.json.bind.serializer.JsonbDeserializer<Category> {

    @Override
    public void serialize(Category obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("id", obj.getId(), generator);
        ctx.serialize("name", obj.getName(), generator);
        generator.writeEnd();
    }

    @Override
    public Category deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return Category.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .name(jsonObject.getString("name"))
                .build();
    }
}
