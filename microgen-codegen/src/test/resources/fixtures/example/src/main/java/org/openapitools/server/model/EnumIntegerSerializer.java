package org.openapitools.server.model;

public class EnumIntegerSerializer
        implements javax.json.bind.serializer.JsonbSerializer<EnumInteger>,
        javax.json.bind.serializer.JsonbDeserializer<EnumInteger> {

    @Override
    public void serialize(
            EnumInteger obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        generator.writeEnd();
    }

    @Override
    public EnumInteger deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static EnumInteger fromJsonObject(final javax.json.JsonObject jsonObject) {
        return EnumInteger.builder().build();
    }

    public static java.util.List<EnumInteger> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
