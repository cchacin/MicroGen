package org.openapitools.server.model;

public static class ModelWithReadOnlyPropertyTestSerializer
        implements javax.json.bind.serializer.JsonbSerializer<ModelWithReadOnlyPropertyTest>,
        javax.json.bind.serializer.JsonbDeserializer<ModelWithReadOnlyPropertyTest> {

    @Override
    public void serialize(
            ModelWithReadOnlyPropertyTest obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
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
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJson(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static ModelWithReadOnlyPropertyTest fromJsonObject(
            final javax.json.JsonObject jsonObject) {
        return ModelWithReadOnlyPropertyTest.builder()
                .stringPropWithImplicitReadOnlyFalse(
                        jsonObject.getString("stringPropWithImplicitReadOnlyFalse"))
                .stringPropWithExplicitReadOnlyFalse(
                        jsonObject.getString("stringPropWithExplicitReadOnlyFalse"))
                .stringPropWithReadOnlyTrue(jsonObject.getString("stringPropWithReadOnlyTrue"))
                .build();
    }

    public static java.util.List<ModelWithReadOnlyPropertyTest> fromJsonArray(
            final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
