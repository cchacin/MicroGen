package org.openapitools.server.model;

public class EnumIntegerSerializer
        implements javax.json.bind.serializer.JsonbSerializer<EnumInteger>,
        javax.json.bind.serializer.JsonbDeserializer<EnumInteger> {

    @Override
    public void serialize(
            EnumInteger obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.write(obj.getValue());
    }

    @Override
    public EnumInteger deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return EnumInteger.fromValue(parser.getString());
    }
}
