package org.openapitools.server.model;

public static class BaseCardSerializer
        implements javax.json.bind.serializer.JsonbSerializer<BaseCard>,
        javax.json.bind.serializer.JsonbDeserializer<BaseCard> {

    @Override
    public void serialize(BaseCard obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("cardType", obj.getCardType(), generator);
        generator.writeEnd();
    }

    @Override
    public BaseCard deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return BaseCard.builder().cardType(jsonObject.getString("cardType")).build();
    }
}
