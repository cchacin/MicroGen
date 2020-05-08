package org.openapitools.server.model;

public static class BaseCardSerializer
        implements javax.json.bind.serializer.JsonbSerializer<BaseCard>,
        javax.json.bind.serializer.JsonbDeserializer<BaseCard> {

    @Override
    public void serialize(
            BaseCard obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("cardType", obj.getCardType(), generator);
        generator.writeEnd();
    }

    @Override
    public BaseCard deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJson(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static BaseCard fromJsonObject(final javax.json.JsonObject jsonObject) {
        return BaseCard.builder().cardType(jsonObject.getString("cardType")).build();
    }

    public static java.util.List<BaseCard> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
