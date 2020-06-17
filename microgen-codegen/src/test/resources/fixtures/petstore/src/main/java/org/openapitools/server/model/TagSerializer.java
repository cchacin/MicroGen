package org.openapitools.server.model;

public class TagSerializer
        implements javax.json.bind.serializer.JsonbSerializer<Tag>,
        javax.json.bind.serializer.JsonbDeserializer<Tag> {

    @Override
    public void serialize(
            Tag obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("id", obj.getId(), generator);
        ctx.serialize("name", obj.getName(), generator);
        generator.writeEnd();
    }

    @Override
    public Tag deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static Tag fromJsonObject(final javax.json.JsonObject jsonObject) {
        return Tag.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .name(jsonObject.getString("name"))
                .build();
    }

    public static java.util.List<Tag> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
