package org.openapitools.server.model;

public class EnumStringSerializer
        implements javax.json.bind.serializer.JsonbSerializer<EnumString>,
        javax.json.bind.serializer.JsonbDeserializer<EnumString> {

    @Override
    public void serialize(
            EnumString obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.write(obj.getValue());
    }

    @Override
    public EnumString deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return EnumString.fromValue(parser.getString());
    }
}
