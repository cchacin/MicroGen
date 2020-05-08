package org.openapitools.server.model;

public static class PetSerializer
        implements javax.json.bind.serializer.JsonbSerializer<Pet>,
        javax.json.bind.serializer.JsonbDeserializer<Pet> {

    @Override
    public void serialize(
            Pet obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("id", obj.getId(), generator);
        ctx.serialize("category", obj.getCategory(), generator);
        ctx.serialize("name", obj.getName(), generator);
        ctx.serialize("photoUrls", obj.getPhotoUrls(), generator);
        ctx.serialize("tags", obj.getTags(), generator);
        ctx.serialize("status", obj.getStatus(), generator);
        generator.writeEnd();
    }

    @Override
    public Pet deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJson(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static Pet fromJsonObject(final javax.json.JsonObject jsonObject) {
        return Pet.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .category(CategorySerializer.fromJson(jsonObject))
                .name(jsonObject.getString("name"))
                .addAllPhotoUrls(jsonObject.getJsonArray("photoUrls").getValuesAs(JsonString::getString))
                .addAllTags(Tag.TagSerializer.fromJsonArray(jsonObject.getJsonArray("tags")))
                .status(jsonObject.getString("status"))
                .build();
    }

    public static java.util.List<Pet> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
