package org.openapitools.server.model;

public static class ModelWithMapPropertiesSerializer
        implements javax.json.bind.serializer.JsonbSerializer<ModelWithMapProperties>,
        javax.json.bind.serializer.JsonbDeserializer<ModelWithMapProperties> {

    @Override
    public void serialize(
            ModelWithMapProperties obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("stringMap", obj.getStringMap(), generator);
        ctx.serialize("integerMap", obj.getIntegerMap(), generator);
        ctx.serialize("errorInfoMap", obj.getErrorInfoMap(), generator);
        ctx.serialize("errorInfoArrayMap", obj.getErrorInfoArrayMap(), generator);
        generator.writeEnd();
    }

    @Override
    public ModelWithMapProperties deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return ModelWithMapProperties.builder()
                .stringMap(jsonObject.getJsonObject("stringMap"))
                .integerMap(jsonObject.getJsonObject("integerMap"))
                .errorInfoMap(jsonObject.getJsonObject("errorInfoMap"))
                .errorInfoArrayMap(jsonObject.getJsonObject("errorInfoArrayMap"))
                .build();
    }
}
