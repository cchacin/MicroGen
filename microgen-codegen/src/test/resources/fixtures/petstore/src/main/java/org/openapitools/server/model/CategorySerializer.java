package org.openapitools.server.model;

public static class CategorySerializer
        implements javax.json.bind.serializer.JsonbSerializer<Category>,
        javax.json.bind.serializer.JsonbDeserializer<Category> {

    @Override
    public void serialize(
            Category obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("id", obj.getId(), generator);
        ctx.serialize("name", obj.getName(), generator);
        generator.writeEnd();
    }

    @Override
    public Category deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJson(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static Category fromJsonObject(final javax.json.JsonObject jsonObject) {
        return Category.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .name(jsonObject.getString("name"))
                .build();
    }

    public static java.util.List<Category> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
