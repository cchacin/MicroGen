package org.openapitools.server.model;

public static class PetSerializer
        implements javax.json.bind.serializer.JsonbSerializer<Pet>,
        javax.json.bind.serializer.JsonbDeserializer<Pet> {

    @Override
    public void serialize(Pet obj, JsonGenerator generator, SerializationContext ctx) {
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
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return Pet.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .category(jsonObject.getJsonObject("category"))
                .name(jsonObject.getString("name"))
                .photoUrls(
                        addAllPhotoUrls(
                                jsonObject.getJsonArray("photoUrls").getValuesAs(JsonString::getString)))
                .tags(jsonObject.getJsonObject("tags"))
                .status(jsonObject.getString("status"))
                .build();
    }
}
