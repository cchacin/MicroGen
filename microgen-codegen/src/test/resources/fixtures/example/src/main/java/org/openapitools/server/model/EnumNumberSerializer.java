package org.openapitools.server.model;

public class EnumNumberSerializer
        implements javax.json.bind.serializer.JsonbSerializer<EnumNumber>,
        javax.json.bind.serializer.JsonbDeserializer<EnumNumber> {

    @Override
    public void serialize(
            EnumNumber obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        generator.writeEnd();
    }

    @Override
    public EnumNumber deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static EnumNumber fromJsonObject(final javax.json.JsonObject jsonObject) {
        return EnumNumber.builder().build();
    }

    public static java.util.List<EnumNumber> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
