package org.openapitools.server.model;

public static class SampleBaseSerializer
        implements javax.json.bind.serializer.JsonbSerializer<SampleBase>,
        javax.json.bind.serializer.JsonbDeserializer<SampleBase> {

    @Override
    public void serialize(SampleBase obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("baseClassStringProp", obj.getBaseClassStringProp(), generator);
        ctx.serialize("baseClassIntegerProp", obj.getBaseClassIntegerProp(), generator);
        generator.writeEnd();
    }

    @Override
    public SampleBase deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return SampleBase.builder()
                .baseClassStringProp(jsonObject.getString("baseClassStringProp"))
                .baseClassIntegerProp(jsonObject.getJsonNumber("baseClassIntegerProp").intValue())
                .build();
    }
}
