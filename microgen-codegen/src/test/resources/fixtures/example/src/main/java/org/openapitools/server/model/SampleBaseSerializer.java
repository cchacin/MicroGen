package org.openapitools.server.model;

public class SampleBaseSerializer
        implements javax.json.bind.serializer.JsonbSerializer<SampleBase>,
        javax.json.bind.serializer.JsonbDeserializer<SampleBase> {

    @Override
    public void serialize(
            SampleBase obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("baseClassStringProp", obj.getBaseClassStringProp(), generator);
        ctx.serialize("baseClassIntegerProp", obj.getBaseClassIntegerProp(), generator);
        generator.writeEnd();
    }

    @Override
    public SampleBase deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static SampleBase fromJsonObject(final javax.json.JsonObject jsonObject) {
        return SampleBase.builder()
                .baseClassStringProp(jsonObject.getString("baseClassStringProp"))
                .baseClassIntegerProp(jsonObject.getJsonNumber("baseClassIntegerProp").intValue())
                .build();
    }

    public static java.util.List<SampleBase> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
