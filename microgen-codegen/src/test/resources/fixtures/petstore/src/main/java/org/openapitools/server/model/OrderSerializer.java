package org.openapitools.server.model;

public static class OrderSerializer
        implements javax.json.bind.serializer.JsonbSerializer<Order>,
        javax.json.bind.serializer.JsonbDeserializer<Order> {

    @Override
    public void serialize(Order obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("id", obj.getId(), generator);
        ctx.serialize("petId", obj.getPetId(), generator);
        ctx.serialize("quantity", obj.getQuantity(), generator);
        ctx.serialize("shipDate", obj.shipmentDate(), generator);
        ctx.serialize("status", obj.getStatus(), generator);
        ctx.serialize("complete", obj.getComplete(), generator);
        generator.writeEnd();
    }

    @Override
    public Order deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return Order.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .petId(jsonObject.getJsonNumber("petId").longValue())
                .quantity(jsonObject.getJsonNumber("quantity").intValue())
                .shipDate(jsonObject.getJsonObject("shipDate"))
                .status(jsonObject.getString("status"))
                .complete(jsonObject.getBoolean("complete"))
                .build();
    }
}
