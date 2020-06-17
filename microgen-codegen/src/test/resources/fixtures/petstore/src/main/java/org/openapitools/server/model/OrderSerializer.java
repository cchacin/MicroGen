package org.openapitools.server.model;

public class OrderSerializer
        implements javax.json.bind.serializer.JsonbSerializer<Order>,
        javax.json.bind.serializer.JsonbDeserializer<Order> {

    @Override
    public void serialize(
            Order obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
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
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static Order fromJsonObject(final javax.json.JsonObject jsonObject) {
        return Order.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .petId(jsonObject.getJsonNumber("petId").longValue())
                .quantity(jsonObject.getJsonNumber("quantity").intValue())
                .shipDate(jsonObject.getJsonObject("shipDate"))
                .status(jsonObject.getString("status"))
                .complete(jsonObject.getBoolean("complete"))
                .build();
    }

    public static java.util.List<Order> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
