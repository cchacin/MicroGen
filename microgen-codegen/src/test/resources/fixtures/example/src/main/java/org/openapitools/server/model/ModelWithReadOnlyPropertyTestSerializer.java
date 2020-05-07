package org.openapitools.server.model;

public static class ModelWithReadOnlyPropertyTestSerializer
        implements javax.json.bind.serializer.JsonbSerializer<ModelWithReadOnlyPropertyTest>,
        javax.json.bind.serializer.JsonbDeserializer<ModelWithReadOnlyPropertyTest> {

    @Override
    public void serialize(
            ModelWithReadOnlyPropertyTest obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize(
                "stringPropWithImplicitReadOnlyFalse",
                obj.getStringPropWithImplicitReadOnlyFalse(),
                generator);
        ctx.serialize(
                "stringPropWithExplicitReadOnlyFalse",
                obj.getStringPropWithExplicitReadOnlyFalse(),
                generator);
        ctx.serialize("stringPropWithReadOnlyTrue", obj.getStringPropWithReadOnlyTrue(), generator);
        generator.writeEnd();
    }

    @Override
    public ModelWithReadOnlyPropertyTest deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return ModelWithReadOnlyPropertyTest.builder()
                .stringPropWithImplicitReadOnlyFalse(
                        jsonObject.getString("stringPropWithImplicitReadOnlyFalse"))
                .stringPropWithExplicitReadOnlyFalse(
                        jsonObject.getString("stringPropWithExplicitReadOnlyFalse"))
                .stringPropWithReadOnlyTrue(jsonObject.getString("stringPropWithReadOnlyTrue"))
                .build();
    }
}
