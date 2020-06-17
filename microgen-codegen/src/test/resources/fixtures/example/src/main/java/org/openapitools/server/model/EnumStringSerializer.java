package org.openapitools.server.model;

public class EnumStringSerializer
        implements javax.json.bind.serializer.JsonbSerializer<EnumString>,
        javax.json.bind.serializer.JsonbDeserializer<EnumString> {

    @Override
    public void serialize(
            EnumString obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        generator.writeEnd();
    }

    @Override
    public EnumString deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static EnumString fromJsonObject(final javax.json.JsonObject jsonObject) {
        return EnumString.builder().build();
    }

    public static java.util.List<EnumString> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
