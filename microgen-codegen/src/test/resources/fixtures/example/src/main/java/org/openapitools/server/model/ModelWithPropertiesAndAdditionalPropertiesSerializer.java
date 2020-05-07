package org.openapitools.server.model;

public static class ModelWithPropertiesAndAdditionalPropertiesSerializer
        implements javax.json.bind.serializer.JsonbSerializer<
        ModelWithPropertiesAndAdditionalProperties>,
        javax.json.bind.serializer.JsonbDeserializer<ModelWithPropertiesAndAdditionalProperties> {

    @Override
    public void serialize(
            ModelWithPropertiesAndAdditionalProperties obj,
            JsonGenerator generator,
            SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("integerProp", obj.getIntegerProp(), generator);
        ctx.serialize("stringProp", obj.getStringProp(), generator);
        generator.writeEnd();
    }

    @Override
    public ModelWithPropertiesAndAdditionalProperties deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return ModelWithPropertiesAndAdditionalProperties.builder()
                .integerProp(jsonObject.getJsonNumber("integerProp").intValue())
                .stringProp(jsonObject.getString("stringProp"))
                .build();
    }
}
