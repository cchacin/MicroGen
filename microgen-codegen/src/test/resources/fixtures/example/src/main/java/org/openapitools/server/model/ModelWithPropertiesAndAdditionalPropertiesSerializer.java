package org.openapitools.server.model;

public class ModelWithPropertiesAndAdditionalPropertiesSerializer
        implements javax.json.bind.serializer.JsonbSerializer<
        ModelWithPropertiesAndAdditionalProperties>,
        javax.json.bind.serializer.JsonbDeserializer<ModelWithPropertiesAndAdditionalProperties> {

    @Override
    public void serialize(
            ModelWithPropertiesAndAdditionalProperties obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {

        generator.writeStartObject();
        ctx.serialize("integerProp", obj.getIntegerProp(), generator);
        ctx.serialize("stringProp", obj.getStringProp(), generator);
        generator.writeEnd();
    }

    @Override
    public ModelWithPropertiesAndAdditionalProperties deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {

        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static ModelWithPropertiesAndAdditionalProperties fromJsonObject(
            final javax.json.JsonObject jsonObject) {
        return ModelWithPropertiesAndAdditionalProperties.builder()
                .integerProp(jsonObject.getJsonNumber("integerProp").intValue())
                .stringProp(jsonObject.getString("stringProp"))
                .build();
    }

    public static java.util.List<ModelWithPropertiesAndAdditionalProperties> fromJsonArray(
            final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
