package org.openapitools.server.model;

/**
 * Description: This model object contains one optional property and one required property for each
 * data type defined here:
 * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#dataTypeFormat.
 */
@javax.json.bind.annotation.JsonbPropertyOrder({
        AllPrimitives.JSONB_PROPERTY_MY_INT_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_INT_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_INT64_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_INT64_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_FLOAT_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_FLOAT_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_DOUBLE_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_DOUBLE_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_STRING_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_STRING_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_BYTES_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_BYTES_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_BINARY_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_BINARY_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_BOOLEAN_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_BOOLEAN_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_DATE_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_DATE_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_DATE_TIME_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_DATE_TIME_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_FILE_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_FILE_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_U_U_I_D_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_U_U_I_D_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_ENUM_STRING_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_ENUM_STRING_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_ENUM_INTEGER_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_ENUM_INTEGER_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_ENUM_NUMBER_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_ENUM_NUMBER_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_INLINE_ENUM_STRING_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_INLINE_ENUM_STRING_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_OPTIONAL,
        AllPrimitives.JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_REQUIRED,
        AllPrimitives.JSONB_PROPERTY_ALLOW_EMPTY_VALUE_TRUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class AllPrimitives implements OpenAPIModel {

    public static final String JSONB_PROPERTY_MY_INT_OPTIONAL = "myIntOptional";
    public static final String JSONB_PROPERTY_MY_INT_REQUIRED = "myIntRequired";
    public static final String JSONB_PROPERTY_MY_INT64_OPTIONAL = "myInt64Optional";
    public static final String JSONB_PROPERTY_MY_INT64_REQUIRED = "myInt64Required";
    public static final String JSONB_PROPERTY_MY_FLOAT_OPTIONAL = "myFloatOptional";
    public static final String JSONB_PROPERTY_MY_FLOAT_REQUIRED = "myFloatRequired";
    public static final String JSONB_PROPERTY_MY_DOUBLE_OPTIONAL = "myDoubleOptional";
    public static final String JSONB_PROPERTY_MY_DOUBLE_REQUIRED = "myDoubleRequired";
    public static final String JSONB_PROPERTY_MY_STRING_OPTIONAL = "myStringOptional";
    public static final String JSONB_PROPERTY_MY_STRING_REQUIRED = "myStringRequired";
    public static final String JSONB_PROPERTY_MY_BYTES_OPTIONAL = "myBytesOptional";
    public static final String JSONB_PROPERTY_MY_BYTES_REQUIRED = "myBytesRequired";
    public static final String JSONB_PROPERTY_MY_BINARY_OPTIONAL = "myBinaryOptional";
    public static final String JSONB_PROPERTY_MY_BINARY_REQUIRED = "myBinaryRequired";
    public static final String JSONB_PROPERTY_MY_BOOLEAN_OPTIONAL = "myBooleanOptional";
    public static final String JSONB_PROPERTY_MY_BOOLEAN_REQUIRED = "myBooleanRequired";
    public static final String JSONB_PROPERTY_MY_DATE_OPTIONAL = "myDateOptional";
    public static final String JSONB_PROPERTY_MY_DATE_REQUIRED = "myDateRequired";
    public static final String JSONB_PROPERTY_MY_DATE_TIME_OPTIONAL = "myDateTimeOptional";
    public static final String JSONB_PROPERTY_MY_DATE_TIME_REQUIRED = "myDateTimeRequired";
    public static final String JSONB_PROPERTY_MY_FILE_OPTIONAL = "myFileOptional";
    public static final String JSONB_PROPERTY_MY_FILE_REQUIRED = "myFileRequired";
    public static final String JSONB_PROPERTY_MY_U_U_I_D_OPTIONAL = "myUUIDOptional";
    public static final String JSONB_PROPERTY_MY_U_U_I_D_REQUIRED = "myUUIDRequired";
    public static final String JSONB_PROPERTY_MY_ENUM_STRING_OPTIONAL = "myEnumStringOptional";
    public static final String JSONB_PROPERTY_MY_ENUM_STRING_REQUIRED = "myEnumStringRequired";
    public static final String JSONB_PROPERTY_MY_ENUM_INTEGER_OPTIONAL = "myEnumIntegerOptional";
    public static final String JSONB_PROPERTY_MY_ENUM_INTEGER_REQUIRED = "myEnumIntegerRequired";
    public static final String JSONB_PROPERTY_MY_ENUM_NUMBER_OPTIONAL = "myEnumNumberOptional";
    public static final String JSONB_PROPERTY_MY_ENUM_NUMBER_REQUIRED = "myEnumNumberRequired";
    public static final String JSONB_PROPERTY_MY_INLINE_ENUM_STRING_OPTIONAL =
            "myInlineEnumStringOptional";
    public static final String JSONB_PROPERTY_MY_INLINE_ENUM_STRING_REQUIRED =
            "myInlineEnumStringRequired";
    public static final String JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_OPTIONAL =
            "myInlineEnumIntegerOptional";
    public static final String JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_REQUIRED =
            "myInlineEnumIntegerRequired";
    public static final String JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_OPTIONAL =
            "myInlineEnumNumberOptional";
    public static final String JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_REQUIRED =
            "myInlineEnumNumberRequired";
    public static final String JSONB_PROPERTY_ALLOW_EMPTY_VALUE_TRUE = "allowEmptyValueTrue";

    private java.util.Optional<Integer> myIntOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull private Integer myIntRequired;

    private java.util.Optional<Long> myInt64Optional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull private Long myInt64Required;

    private java.util.Optional<Float> myFloatOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull private Float myFloatRequired;

    private java.util.Optional<Double> myDoubleOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull private Double myDoubleRequired;

    private java.util.Optional<String> myStringOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull private String myStringRequired;

    private java.util.Optional<byte[]> myBytesOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull private byte[] myBytesRequired;

    @javax.validation.Valid
    private java.util.Optional<java.io.File> myBinaryOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull @javax.validation.Valid
    private java.io.File myBinaryRequired;

    private java.util.Optional<Boolean> myBooleanOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull private Boolean myBooleanRequired;

    @javax.validation.Valid
    private java.util.Optional<java.time.LocalDate> myDateOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull @javax.validation.Valid
    private java.time.LocalDate myDateRequired;

    @javax.validation.Valid
    private java.util.Optional<java.time.OffsetDateTime> myDateTimeOptional =
            java.util.Optional.empty();

    @javax.validation.constraints.NotNull @javax.validation.Valid
    private java.time.OffsetDateTime myDateTimeRequired;

    @javax.validation.Valid
    private java.util.Optional<java.io.File> myFileOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull @javax.validation.Valid private java.io.File myFileRequired;

    @javax.validation.Valid
    private java.util.Optional<java.util.UUID> myUUIDOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull @javax.validation.Valid
    private java.util.UUID myUUIDRequired;

    @javax.validation.Valid
    private java.util.Optional<EnumString> myEnumStringOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull @javax.validation.Valid
    private EnumString myEnumStringRequired;

    @javax.validation.Valid
    private java.util.Optional<EnumInteger> myEnumIntegerOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull @javax.validation.Valid
    private EnumInteger myEnumIntegerRequired;

    @javax.validation.Valid
    private java.util.Optional<EnumNumber> myEnumNumberOptional = java.util.Optional.empty();

    @javax.validation.constraints.NotNull @javax.validation.Valid
    private EnumNumber myEnumNumberRequired;

    /**
     * This is an optional enum property with type&#x3D;string and three enumerated string values.
     * This enum is defined inline.
     */
    @io.quarkus.runtime.annotations.RegisterForReflection
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumStringOptionalEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumStringOptionalEnumDeserializer.class)
    public static enum MyInlineEnumStringOptionalEnum {
        ENUMSTRINGVALUE1("EnumStringValue1"),

        ENUMSTRINGVALUE2("EnumStringValue2"),

        ENUMSTRINGVALUE3("EnumStringValue3");

        private final String value;

        MyInlineEnumStringOptionalEnum(final String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        @javax.json.bind.annotation.JsonbCreator
        public static MyInlineEnumStringOptionalEnum fromValue(final String value) {
            return java.util.Arrays.stream(MyInlineEnumStringOptionalEnum.values())
                    .filter(b -> b.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumStringOptionalEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumStringOptionalEnum> {

        public MyInlineEnumStringOptionalEnumSerializer() {}

        @Override
        public void serialize(
                MyInlineEnumStringOptionalEnum aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class MyInlineEnumStringOptionalEnumDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumStringOptionalEnum> {

        public MyInlineEnumStringOptionalEnumDeserializer() {}

        @Override
        public MyInlineEnumStringOptionalEnum deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumStringOptionalEnum.fromValue(jsonParser.getString());
        }
    }

    private java.util.Optional<MyInlineEnumStringOptionalEnum> myInlineEnumStringOptional =
            java.util.Optional.empty();

    /**
     * This is a required enum property with type&#x3D;string and three enumerated string values. This
     * enum is defined inline.
     */
    @io.quarkus.runtime.annotations.RegisterForReflection
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumStringRequiredEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumStringRequiredEnumDeserializer.class)
    public static enum MyInlineEnumStringRequiredEnum {
        ENUMSTRINGVALUE1("EnumStringValue1"),

        ENUMSTRINGVALUE2("EnumStringValue2"),

        ENUMSTRINGVALUE3("EnumStringValue3");

        private final String value;

        MyInlineEnumStringRequiredEnum(final String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        @javax.json.bind.annotation.JsonbCreator
        public static MyInlineEnumStringRequiredEnum fromValue(final String value) {
            return java.util.Arrays.stream(MyInlineEnumStringRequiredEnum.values())
                    .filter(b -> b.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumStringRequiredEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumStringRequiredEnum> {

        public MyInlineEnumStringRequiredEnumSerializer() {}

        @Override
        public void serialize(
                MyInlineEnumStringRequiredEnum aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class MyInlineEnumStringRequiredEnumDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumStringRequiredEnum> {

        public MyInlineEnumStringRequiredEnumDeserializer() {}

        @Override
        public MyInlineEnumStringRequiredEnum deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumStringRequiredEnum.fromValue(jsonParser.getString());
        }
    }

    @javax.validation.constraints.NotNull
    private MyInlineEnumStringRequiredEnum myInlineEnumStringRequired;

    /**
     * This is an optional enum property with type&#x3D;integer. It has three legal values: 12, 34,
     * and 56. This enum is defined inline.
     */
    @io.quarkus.runtime.annotations.RegisterForReflection
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumIntegerOptionalEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumIntegerOptionalEnumDeserializer.class)
    public static enum MyInlineEnumIntegerOptionalEnum {
        NUMBER_12(12),

        NUMBER_34(34),

        NUMBER_56(56);

        private final Integer value;

        MyInlineEnumIntegerOptionalEnum(final Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        @javax.json.bind.annotation.JsonbCreator
        public static MyInlineEnumIntegerOptionalEnum fromValue(final Integer value) {
            return java.util.Arrays.stream(MyInlineEnumIntegerOptionalEnum.values())
                    .filter(b -> b.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumIntegerOptionalEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumIntegerOptionalEnum> {

        public MyInlineEnumIntegerOptionalEnumSerializer() {}

        @Override
        public void serialize(
                MyInlineEnumIntegerOptionalEnum aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class MyInlineEnumIntegerOptionalEnumDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumIntegerOptionalEnum> {

        public MyInlineEnumIntegerOptionalEnumDeserializer() {}

        @Override
        public MyInlineEnumIntegerOptionalEnum deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumIntegerOptionalEnum.fromValue(jsonParser.getString());
        }
    }

    private java.util.Optional<MyInlineEnumIntegerOptionalEnum> myInlineEnumIntegerOptional =
            java.util.Optional.empty();

    /**
     * This is a required enum property with type&#x3D;integer. It has three legal values: 12, 34, and
     * 56. This enum is defined inline.
     */
    @io.quarkus.runtime.annotations.RegisterForReflection
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumIntegerRequiredEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumIntegerRequiredEnumDeserializer.class)
    public static enum MyInlineEnumIntegerRequiredEnum {
        NUMBER_12(12),

        NUMBER_34(34),

        NUMBER_56(56);

        private final Integer value;

        MyInlineEnumIntegerRequiredEnum(final Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        @javax.json.bind.annotation.JsonbCreator
        public static MyInlineEnumIntegerRequiredEnum fromValue(final Integer value) {
            return java.util.Arrays.stream(MyInlineEnumIntegerRequiredEnum.values())
                    .filter(b -> b.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumIntegerRequiredEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumIntegerRequiredEnum> {

        public MyInlineEnumIntegerRequiredEnumSerializer() {}

        @Override
        public void serialize(
                MyInlineEnumIntegerRequiredEnum aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class MyInlineEnumIntegerRequiredEnumDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumIntegerRequiredEnum> {

        public MyInlineEnumIntegerRequiredEnumDeserializer() {}

        @Override
        public MyInlineEnumIntegerRequiredEnum deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumIntegerRequiredEnum.fromValue(jsonParser.getString());
        }
    }

    @javax.validation.constraints.NotNull
    private MyInlineEnumIntegerRequiredEnum myInlineEnumIntegerRequired;

    /**
     * This is an optional enum property with type&#x3D;number. It has three legal values: 1.2, 3.4,
     * and 5.6. This enum is defined inline.
     */
    @io.quarkus.runtime.annotations.RegisterForReflection
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumNumberOptionalEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumNumberOptionalEnumDeserializer.class)
    public static enum MyInlineEnumNumberOptionalEnum {
        NUMBER_1_DOT_2(1.2f),

        NUMBER_3_DOT_4(3.4f),

        NUMBER_5_DOT_6(5.6f);

        private final Float value;

        MyInlineEnumNumberOptionalEnum(final Float value) {
            this.value = value;
        }

        public Float getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        @javax.json.bind.annotation.JsonbCreator
        public static MyInlineEnumNumberOptionalEnum fromValue(final Float value) {
            return java.util.Arrays.stream(MyInlineEnumNumberOptionalEnum.values())
                    .filter(b -> b.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumNumberOptionalEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumNumberOptionalEnum> {

        public MyInlineEnumNumberOptionalEnumSerializer() {}

        @Override
        public void serialize(
                MyInlineEnumNumberOptionalEnum aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class MyInlineEnumNumberOptionalEnumDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumNumberOptionalEnum> {

        public MyInlineEnumNumberOptionalEnumDeserializer() {}

        @Override
        public MyInlineEnumNumberOptionalEnum deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumNumberOptionalEnum.fromValue(jsonParser.getString());
        }
    }

    private java.util.Optional<MyInlineEnumNumberOptionalEnum> myInlineEnumNumberOptional =
            java.util.Optional.empty();

    /**
     * This is a required enum property with type&#x3D;number. It has three legal values: 1.2, 3.4,
     * and 5.6. This enum is defined inline.
     */
    @io.quarkus.runtime.annotations.RegisterForReflection
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumNumberRequiredEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumNumberRequiredEnumDeserializer.class)
    public static enum MyInlineEnumNumberRequiredEnum {
        NUMBER_1_DOT_2(1.2f),

        NUMBER_3_DOT_4(3.4f),

        NUMBER_5_DOT_6(5.6f);

        private final Float value;

        MyInlineEnumNumberRequiredEnum(final Float value) {
            this.value = value;
        }

        public Float getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        @javax.json.bind.annotation.JsonbCreator
        public static MyInlineEnumNumberRequiredEnum fromValue(final Float value) {
            return java.util.Arrays.stream(MyInlineEnumNumberRequiredEnum.values())
                    .filter(b -> b.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumNumberRequiredEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumNumberRequiredEnum> {

        public MyInlineEnumNumberRequiredEnumSerializer() {}

        @Override
        public void serialize(
                MyInlineEnumNumberRequiredEnum aEnum,
                javax.json.stream.JsonGenerator jsonGenerator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            jsonGenerator.write(aEnum.value);
        }
    }

    public static class MyInlineEnumNumberRequiredEnumDeserializer
            implements javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumNumberRequiredEnum> {

        public MyInlineEnumNumberRequiredEnumDeserializer() {}

        @Override
        public MyInlineEnumNumberRequiredEnum deserialize(
                javax.json.stream.JsonParser jsonParser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumNumberRequiredEnum.fromValue(jsonParser.getString());
        }
    }

    @javax.validation.constraints.NotNull
    private MyInlineEnumNumberRequiredEnum myInlineEnumNumberRequired;

    private java.util.Optional<String> allowEmptyValueTrue = java.util.Optional.empty();

    public AllPrimitives() {}

    public AllPrimitives(
            final java.util.Optional<Integer> myIntOptional,
            final Integer myIntRequired,
            final java.util.Optional<Long> myInt64Optional,
            final Long myInt64Required,
            final java.util.Optional<Float> myFloatOptional,
            final Float myFloatRequired,
            final java.util.Optional<Double> myDoubleOptional,
            final Double myDoubleRequired,
            final java.util.Optional<String> myStringOptional,
            final String myStringRequired,
            final java.util.Optional<byte[]> myBytesOptional,
            final byte[] myBytesRequired,
            final java.util.Optional<java.io.File> myBinaryOptional,
            final java.io.File myBinaryRequired,
            final java.util.Optional<Boolean> myBooleanOptional,
            final Boolean myBooleanRequired,
            final java.util.Optional<java.time.LocalDate> myDateOptional,
            final java.time.LocalDate myDateRequired,
            final java.util.Optional<java.time.OffsetDateTime> myDateTimeOptional,
            final java.time.OffsetDateTime myDateTimeRequired,
            final java.util.Optional<java.io.File> myFileOptional,
            final java.io.File myFileRequired,
            final java.util.Optional<java.util.UUID> myUUIDOptional,
            final java.util.UUID myUUIDRequired,
            final java.util.Optional<EnumString> myEnumStringOptional,
            final EnumString myEnumStringRequired,
            final java.util.Optional<EnumInteger> myEnumIntegerOptional,
            final EnumInteger myEnumIntegerRequired,
            final java.util.Optional<EnumNumber> myEnumNumberOptional,
            final EnumNumber myEnumNumberRequired,
            final java.util.Optional<MyInlineEnumStringOptionalEnum> myInlineEnumStringOptional,
            final MyInlineEnumStringRequiredEnum myInlineEnumStringRequired,
            final java.util.Optional<MyInlineEnumIntegerOptionalEnum> myInlineEnumIntegerOptional,
            final MyInlineEnumIntegerRequiredEnum myInlineEnumIntegerRequired,
            final java.util.Optional<MyInlineEnumNumberOptionalEnum> myInlineEnumNumberOptional,
            final MyInlineEnumNumberRequiredEnum myInlineEnumNumberRequired,
            final java.util.Optional<String> allowEmptyValueTrue) {
        this.myIntOptional = myIntOptional;
        this.myIntRequired = myIntRequired;
        this.myInt64Optional = myInt64Optional;
        this.myInt64Required = myInt64Required;
        this.myFloatOptional = myFloatOptional;
        this.myFloatRequired = myFloatRequired;
        this.myDoubleOptional = myDoubleOptional;
        this.myDoubleRequired = myDoubleRequired;
        this.myStringOptional = myStringOptional;
        this.myStringRequired = myStringRequired;
        this.myBytesOptional = myBytesOptional;
        this.myBytesRequired = myBytesRequired;
        this.myBinaryOptional = myBinaryOptional;
        this.myBinaryRequired = myBinaryRequired;
        this.myBooleanOptional = myBooleanOptional;
        this.myBooleanRequired = myBooleanRequired;
        this.myDateOptional = myDateOptional;
        this.myDateRequired = myDateRequired;
        this.myDateTimeOptional = myDateTimeOptional;
        this.myDateTimeRequired = myDateTimeRequired;
        this.myFileOptional = myFileOptional;
        this.myFileRequired = myFileRequired;
        this.myUUIDOptional = myUUIDOptional;
        this.myUUIDRequired = myUUIDRequired;
        this.myEnumStringOptional = myEnumStringOptional;
        this.myEnumStringRequired = myEnumStringRequired;
        this.myEnumIntegerOptional = myEnumIntegerOptional;
        this.myEnumIntegerRequired = myEnumIntegerRequired;
        this.myEnumNumberOptional = myEnumNumberOptional;
        this.myEnumNumberRequired = myEnumNumberRequired;
        this.myInlineEnumStringOptional = myInlineEnumStringOptional;
        this.myInlineEnumStringRequired = myInlineEnumStringRequired;
        this.myInlineEnumIntegerOptional = myInlineEnumIntegerOptional;
        this.myInlineEnumIntegerRequired = myInlineEnumIntegerRequired;
        this.myInlineEnumNumberOptional = myInlineEnumNumberOptional;
        this.myInlineEnumNumberRequired = myInlineEnumNumberRequired;
        this.allowEmptyValueTrue = allowEmptyValueTrue;
    }

    /**
     * This is an optional property with type=integer and format=int32. It has a default value of 123.
     *
     * @return myIntOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT_OPTIONAL)
    public java.util.Optional<Integer> getMyIntOptional() {
        return myIntOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT_OPTIONAL)
    public void setMyIntOptional(java.util.Optional<Integer> myIntOptional) {
        this.myIntOptional = myIntOptional;
    }

    /**
     * This is a required property with type=integer and format=int32.
     *
     * @return myIntRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT_REQUIRED)
    public Integer getMyIntRequired() {
        return myIntRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT_REQUIRED)
    public void setMyIntRequired(Integer myIntRequired) {
        this.myIntRequired = myIntRequired;
    }

    /**
     * This is an optional property with type=integer and format=int64.
     *
     * @return myInt64Optional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT64_OPTIONAL)
    public java.util.Optional<Long> getMyInt64Optional() {
        return myInt64Optional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT64_OPTIONAL)
    public void setMyInt64Optional(java.util.Optional<Long> myInt64Optional) {
        this.myInt64Optional = myInt64Optional;
    }

    /**
     * This is a required property with type=integer and format=int64.
     *
     * @return myInt64Required
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT64_REQUIRED)
    public Long getMyInt64Required() {
        return myInt64Required;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT64_REQUIRED)
    public void setMyInt64Required(Long myInt64Required) {
        this.myInt64Required = myInt64Required;
    }

    /**
     * This is an optional property with type=number and format=float.
     *
     * @return myFloatOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FLOAT_OPTIONAL)
    public java.util.Optional<Float> getMyFloatOptional() {
        return myFloatOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FLOAT_OPTIONAL)
    public void setMyFloatOptional(java.util.Optional<Float> myFloatOptional) {
        this.myFloatOptional = myFloatOptional;
    }

    /**
     * This is a required property with type=integer and format=float.
     *
     * @return myFloatRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FLOAT_REQUIRED)
    public Float getMyFloatRequired() {
        return myFloatRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FLOAT_REQUIRED)
    public void setMyFloatRequired(Float myFloatRequired) {
        this.myFloatRequired = myFloatRequired;
    }

    /**
     * This is an optional property with type=number and format=double.
     *
     * @return myDoubleOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DOUBLE_OPTIONAL)
    public java.util.Optional<Double> getMyDoubleOptional() {
        return myDoubleOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DOUBLE_OPTIONAL)
    public void setMyDoubleOptional(java.util.Optional<Double> myDoubleOptional) {
        this.myDoubleOptional = myDoubleOptional;
    }

    /**
     * This is a required property with type=integer and format=double.
     *
     * @return myDoubleRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DOUBLE_REQUIRED)
    public Double getMyDoubleRequired() {
        return myDoubleRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DOUBLE_REQUIRED)
    public void setMyDoubleRequired(Double myDoubleRequired) {
        this.myDoubleRequired = myDoubleRequired;
    }

    /**
     * This is an optional property with type=string and no format specifier. It has a default value
     * of myStringOptionalDefaultValue.
     *
     * @return myStringOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_STRING_OPTIONAL)
    public java.util.Optional<String> getMyStringOptional() {
        return myStringOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_STRING_OPTIONAL)
    public void setMyStringOptional(java.util.Optional<String> myStringOptional) {
        this.myStringOptional = myStringOptional;
    }

    /**
     * This is a required property with type=string and no format specifier.
     *
     * @return myStringRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_STRING_REQUIRED)
    public String getMyStringRequired() {
        return myStringRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_STRING_REQUIRED)
    public void setMyStringRequired(String myStringRequired) {
        this.myStringRequired = myStringRequired;
    }

    /**
     * This is an optional property with type=string and format=byte.
     *
     * @return myBytesOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BYTES_OPTIONAL)
    public java.util.Optional<byte[]> getMyBytesOptional() {
        return myBytesOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BYTES_OPTIONAL)
    public void setMyBytesOptional(java.util.Optional<byte[]> myBytesOptional) {
        this.myBytesOptional = myBytesOptional;
    }

    /**
     * This is a required property with type=string and format=byte.
     *
     * @return myBytesRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BYTES_REQUIRED)
    public byte[] getMyBytesRequired() {
        return myBytesRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BYTES_REQUIRED)
    public void setMyBytesRequired(byte[] myBytesRequired) {
        this.myBytesRequired = myBytesRequired;
    }

    /**
     * This is an optional property with type=string and format=binary.
     *
     * @return myBinaryOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BINARY_OPTIONAL)
    public java.util.Optional<java.io.File> getMyBinaryOptional() {
        return myBinaryOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BINARY_OPTIONAL)
    public void setMyBinaryOptional(java.util.Optional<java.io.File> myBinaryOptional) {
        this.myBinaryOptional = myBinaryOptional;
    }

    /**
     * This is a required property with type=string and format=binary.
     *
     * @return myBinaryRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BINARY_REQUIRED)
    public java.io.File getMyBinaryRequired() {
        return myBinaryRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BINARY_REQUIRED)
    public void setMyBinaryRequired(java.io.File myBinaryRequired) {
        this.myBinaryRequired = myBinaryRequired;
    }

    /**
     * This is an optional property with type=boolean and no format specifier.
     *
     * @return myBooleanOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BOOLEAN_OPTIONAL)
    public java.util.Optional<Boolean> isgetMyBooleanOptional() {
        return myBooleanOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BOOLEAN_OPTIONAL)
    public void setMyBooleanOptional(java.util.Optional<Boolean> myBooleanOptional) {
        this.myBooleanOptional = myBooleanOptional;
    }

    /**
     * This is a required property with type=boolean and no format specifier.
     *
     * @return myBooleanRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BOOLEAN_REQUIRED)
    public Boolean isgetMyBooleanRequired() {
        return myBooleanRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BOOLEAN_REQUIRED)
    public void setMyBooleanRequired(Boolean myBooleanRequired) {
        this.myBooleanRequired = myBooleanRequired;
    }

    /**
     * This is an optional property with type=string and format=date.
     *
     * @return myDateOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_OPTIONAL)
    public java.util.Optional<java.time.LocalDate> getMyDateOptional() {
        return myDateOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_OPTIONAL)
    public void setMyDateOptional(java.util.Optional<java.time.LocalDate> myDateOptional) {
        this.myDateOptional = myDateOptional;
    }

    /**
     * This is a required property with type=string and format=date.
     *
     * @return myDateRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_REQUIRED)
    public java.time.LocalDate getMyDateRequired() {
        return myDateRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_REQUIRED)
    public void setMyDateRequired(java.time.LocalDate myDateRequired) {
        this.myDateRequired = myDateRequired;
    }

    /**
     * This is an optional property with type=string and format=date-time.
     *
     * @return myDateTimeOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_TIME_OPTIONAL)
    public java.util.Optional<java.time.OffsetDateTime> getMyDateTimeOptional() {
        return myDateTimeOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_TIME_OPTIONAL)
    public void setMyDateTimeOptional(
            java.util.Optional<java.time.OffsetDateTime> myDateTimeOptional) {
        this.myDateTimeOptional = myDateTimeOptional;
    }

    /**
     * This is a required property with type=string and format=date-time.
     *
     * @return myDateTimeRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_TIME_REQUIRED)
    public java.time.OffsetDateTime getMyDateTimeRequired() {
        return myDateTimeRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_TIME_REQUIRED)
    public void setMyDateTimeRequired(java.time.OffsetDateTime myDateTimeRequired) {
        this.myDateTimeRequired = myDateTimeRequired;
    }

    /**
     * This is an optional property with type=file and no format specifier.
     *
     * @return myFileOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FILE_OPTIONAL)
    public java.util.Optional<java.io.File> getMyFileOptional() {
        return myFileOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FILE_OPTIONAL)
    public void setMyFileOptional(java.util.Optional<java.io.File> myFileOptional) {
        this.myFileOptional = myFileOptional;
    }

    /**
     * This is a required property with type=file and no format specifier.
     *
     * @return myFileRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FILE_REQUIRED)
    public java.io.File getMyFileRequired() {
        return myFileRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FILE_REQUIRED)
    public void setMyFileRequired(java.io.File myFileRequired) {
        this.myFileRequired = myFileRequired;
    }

    /**
     * This is an optional property with type=string and format=uuid.
     *
     * @return myUUIDOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_U_U_I_D_OPTIONAL)
    public java.util.Optional<java.util.UUID> getMyUUIDOptional() {
        return myUUIDOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_U_U_I_D_OPTIONAL)
    public void setMyUUIDOptional(java.util.Optional<java.util.UUID> myUUIDOptional) {
        this.myUUIDOptional = myUUIDOptional;
    }

    /**
     * This is a required property with type=string and format=uuid.
     *
     * @return myUUIDRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_U_U_I_D_REQUIRED)
    public java.util.UUID getMyUUIDRequired() {
        return myUUIDRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_U_U_I_D_REQUIRED)
    public void setMyUUIDRequired(java.util.UUID myUUIDRequired) {
        this.myUUIDRequired = myUUIDRequired;
    }

    /**
     * Get myEnumStringOptional
     *
     * @return myEnumStringOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_STRING_OPTIONAL)
    public java.util.Optional<EnumString> getMyEnumStringOptional() {
        return myEnumStringOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_STRING_OPTIONAL)
    public void setMyEnumStringOptional(java.util.Optional<EnumString> myEnumStringOptional) {
        this.myEnumStringOptional = myEnumStringOptional;
    }

    /**
     * Get myEnumStringRequired
     *
     * @return myEnumStringRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_STRING_REQUIRED)
    public EnumString getMyEnumStringRequired() {
        return myEnumStringRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_STRING_REQUIRED)
    public void setMyEnumStringRequired(EnumString myEnumStringRequired) {
        this.myEnumStringRequired = myEnumStringRequired;
    }

    /**
     * Get myEnumIntegerOptional
     *
     * @return myEnumIntegerOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_INTEGER_OPTIONAL)
    public java.util.Optional<EnumInteger> getMyEnumIntegerOptional() {
        return myEnumIntegerOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_INTEGER_OPTIONAL)
    public void setMyEnumIntegerOptional(java.util.Optional<EnumInteger> myEnumIntegerOptional) {
        this.myEnumIntegerOptional = myEnumIntegerOptional;
    }

    /**
     * Get myEnumIntegerRequired
     *
     * @return myEnumIntegerRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_INTEGER_REQUIRED)
    public EnumInteger getMyEnumIntegerRequired() {
        return myEnumIntegerRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_INTEGER_REQUIRED)
    public void setMyEnumIntegerRequired(EnumInteger myEnumIntegerRequired) {
        this.myEnumIntegerRequired = myEnumIntegerRequired;
    }

    /**
     * Get myEnumNumberOptional
     *
     * @return myEnumNumberOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_NUMBER_OPTIONAL)
    public java.util.Optional<EnumNumber> getMyEnumNumberOptional() {
        return myEnumNumberOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_NUMBER_OPTIONAL)
    public void setMyEnumNumberOptional(java.util.Optional<EnumNumber> myEnumNumberOptional) {
        this.myEnumNumberOptional = myEnumNumberOptional;
    }

    /**
     * Get myEnumNumberRequired
     *
     * @return myEnumNumberRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_NUMBER_REQUIRED)
    public EnumNumber getMyEnumNumberRequired() {
        return myEnumNumberRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_NUMBER_REQUIRED)
    public void setMyEnumNumberRequired(EnumNumber myEnumNumberRequired) {
        this.myEnumNumberRequired = myEnumNumberRequired;
    }

    /**
     * This is an optional enum property with type=string and three enumerated string values. This
     * enum is defined inline.
     *
     * @return myInlineEnumStringOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_STRING_OPTIONAL)
    public java.util.Optional<MyInlineEnumStringOptionalEnum> getMyInlineEnumStringOptional() {
        return myInlineEnumStringOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_STRING_OPTIONAL)
    public void setMyInlineEnumStringOptional(
            java.util.Optional<MyInlineEnumStringOptionalEnum> myInlineEnumStringOptional) {
        this.myInlineEnumStringOptional = myInlineEnumStringOptional;
    }

    /**
     * This is a required enum property with type=string and three enumerated string values. This enum
     * is defined inline.
     *
     * @return myInlineEnumStringRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_STRING_REQUIRED)
    public MyInlineEnumStringRequiredEnum getMyInlineEnumStringRequired() {
        return myInlineEnumStringRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_STRING_REQUIRED)
    public void setMyInlineEnumStringRequired(
            MyInlineEnumStringRequiredEnum myInlineEnumStringRequired) {
        this.myInlineEnumStringRequired = myInlineEnumStringRequired;
    }

    /**
     * This is an optional enum property with type=integer. It has three legal values: 12, 34, and 56.
     * This enum is defined inline.
     *
     * @return myInlineEnumIntegerOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_OPTIONAL)
    public java.util.Optional<MyInlineEnumIntegerOptionalEnum> getMyInlineEnumIntegerOptional() {
        return myInlineEnumIntegerOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_OPTIONAL)
    public void setMyInlineEnumIntegerOptional(
            java.util.Optional<MyInlineEnumIntegerOptionalEnum> myInlineEnumIntegerOptional) {
        this.myInlineEnumIntegerOptional = myInlineEnumIntegerOptional;
    }

    /**
     * This is a required enum property with type=integer. It has three legal values: 12, 34, and 56.
     * This enum is defined inline.
     *
     * @return myInlineEnumIntegerRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_REQUIRED)
    public MyInlineEnumIntegerRequiredEnum getMyInlineEnumIntegerRequired() {
        return myInlineEnumIntegerRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_REQUIRED)
    public void setMyInlineEnumIntegerRequired(
            MyInlineEnumIntegerRequiredEnum myInlineEnumIntegerRequired) {
        this.myInlineEnumIntegerRequired = myInlineEnumIntegerRequired;
    }

    /**
     * This is an optional enum property with type=number. It has three legal values: 1.2, 3.4, and
     * 5.6. This enum is defined inline.
     *
     * @return myInlineEnumNumberOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_OPTIONAL)
    public java.util.Optional<MyInlineEnumNumberOptionalEnum> getMyInlineEnumNumberOptional() {
        return myInlineEnumNumberOptional;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_OPTIONAL)
    public void setMyInlineEnumNumberOptional(
            java.util.Optional<MyInlineEnumNumberOptionalEnum> myInlineEnumNumberOptional) {
        this.myInlineEnumNumberOptional = myInlineEnumNumberOptional;
    }

    /**
     * This is a required enum property with type=number. It has three legal values: 1.2, 3.4, and
     * 5.6. This enum is defined inline.
     *
     * @return myInlineEnumNumberRequired
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_REQUIRED)
    public MyInlineEnumNumberRequiredEnum getMyInlineEnumNumberRequired() {
        return myInlineEnumNumberRequired;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_REQUIRED)
    public void setMyInlineEnumNumberRequired(
            MyInlineEnumNumberRequiredEnum myInlineEnumNumberRequired) {
        this.myInlineEnumNumberRequired = myInlineEnumNumberRequired;
    }

    /**
     * This is an optional property with type=string and no format specifier. It has
     * allowEmptyValue=true.
     *
     * @return allowEmptyValueTrue
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ALLOW_EMPTY_VALUE_TRUE)
    public java.util.Optional<String> getAllowEmptyValueTrue() {
        return allowEmptyValueTrue;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ALLOW_EMPTY_VALUE_TRUE)
    public void setAllowEmptyValueTrue(java.util.Optional<String> allowEmptyValueTrue) {
        this.allowEmptyValueTrue = allowEmptyValueTrue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllPrimitives allPrimitives = (AllPrimitives) o;
        return java.util.Objects.equals(this.myIntOptional, allPrimitives.myIntOptional)
                && java.util.Objects.equals(this.myIntRequired, allPrimitives.myIntRequired)
                && java.util.Objects.equals(this.myInt64Optional, allPrimitives.myInt64Optional)
                && java.util.Objects.equals(this.myInt64Required, allPrimitives.myInt64Required)
                && java.util.Objects.equals(this.myFloatOptional, allPrimitives.myFloatOptional)
                && java.util.Objects.equals(this.myFloatRequired, allPrimitives.myFloatRequired)
                && java.util.Objects.equals(this.myDoubleOptional, allPrimitives.myDoubleOptional)
                && java.util.Objects.equals(this.myDoubleRequired, allPrimitives.myDoubleRequired)
                && java.util.Objects.equals(this.myStringOptional, allPrimitives.myStringOptional)
                && java.util.Objects.equals(this.myStringRequired, allPrimitives.myStringRequired)
                && java.util.Arrays.equals(this.myBytesOptional, allPrimitives.myBytesOptional)
                && java.util.Arrays.equals(this.myBytesRequired, allPrimitives.myBytesRequired)
                && java.util.Objects.equals(this.myBinaryOptional, allPrimitives.myBinaryOptional)
                && java.util.Objects.equals(this.myBinaryRequired, allPrimitives.myBinaryRequired)
                && java.util.Objects.equals(this.myBooleanOptional, allPrimitives.myBooleanOptional)
                && java.util.Objects.equals(this.myBooleanRequired, allPrimitives.myBooleanRequired)
                && java.util.Objects.equals(this.myDateOptional, allPrimitives.myDateOptional)
                && java.util.Objects.equals(this.myDateRequired, allPrimitives.myDateRequired)
                && java.util.Objects.equals(this.myDateTimeOptional, allPrimitives.myDateTimeOptional)
                && java.util.Objects.equals(this.myDateTimeRequired, allPrimitives.myDateTimeRequired)
                && java.util.Objects.equals(this.myFileOptional, allPrimitives.myFileOptional)
                && java.util.Objects.equals(this.myFileRequired, allPrimitives.myFileRequired)
                && java.util.Objects.equals(this.myUUIDOptional, allPrimitives.myUUIDOptional)
                && java.util.Objects.equals(this.myUUIDRequired, allPrimitives.myUUIDRequired)
                && java.util.Objects.equals(this.myEnumStringOptional, allPrimitives.myEnumStringOptional)
                && java.util.Objects.equals(this.myEnumStringRequired, allPrimitives.myEnumStringRequired)
                && java.util.Objects.equals(this.myEnumIntegerOptional, allPrimitives.myEnumIntegerOptional)
                && java.util.Objects.equals(this.myEnumIntegerRequired, allPrimitives.myEnumIntegerRequired)
                && java.util.Objects.equals(this.myEnumNumberOptional, allPrimitives.myEnumNumberOptional)
                && java.util.Objects.equals(this.myEnumNumberRequired, allPrimitives.myEnumNumberRequired)
                && java.util.Objects.equals(
                this.myInlineEnumStringOptional, allPrimitives.myInlineEnumStringOptional)
                && java.util.Objects.equals(
                this.myInlineEnumStringRequired, allPrimitives.myInlineEnumStringRequired)
                && java.util.Objects.equals(
                this.myInlineEnumIntegerOptional, allPrimitives.myInlineEnumIntegerOptional)
                && java.util.Objects.equals(
                this.myInlineEnumIntegerRequired, allPrimitives.myInlineEnumIntegerRequired)
                && java.util.Objects.equals(
                this.myInlineEnumNumberOptional, allPrimitives.myInlineEnumNumberOptional)
                && java.util.Objects.equals(
                this.myInlineEnumNumberRequired, allPrimitives.myInlineEnumNumberRequired)
                && java.util.Objects.equals(this.allowEmptyValueTrue, allPrimitives.allowEmptyValueTrue);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
                myIntOptional,
                myIntRequired,
                myInt64Optional,
                myInt64Required,
                myFloatOptional,
                myFloatRequired,
                myDoubleOptional,
                myDoubleRequired,
                myStringOptional,
                myStringRequired,
                java.util.Arrays.hashCode(myBytesOptional),
                java.util.Arrays.hashCode(myBytesRequired),
                myBinaryOptional,
                myBinaryRequired,
                myBooleanOptional,
                myBooleanRequired,
                myDateOptional,
                myDateRequired,
                myDateTimeOptional,
                myDateTimeRequired,
                myFileOptional,
                myFileRequired,
                myUUIDOptional,
                myUUIDRequired,
                myEnumStringOptional,
                myEnumStringRequired,
                myEnumIntegerOptional,
                myEnumIntegerRequired,
                myEnumNumberOptional,
                myEnumNumberRequired,
                myInlineEnumStringOptional,
                myInlineEnumStringRequired,
                myInlineEnumIntegerOptional,
                myInlineEnumIntegerRequired,
                myInlineEnumNumberOptional,
                myInlineEnumNumberRequired,
                allowEmptyValueTrue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllPrimitives {\n");

        sb.append("    " + JSONB_PROPERTY_MY_INT_OPTIONAL + ": ")
                .append(toIndentedString(myIntOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INT_REQUIRED + ": ")
                .append(toIndentedString(myIntRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INT64_OPTIONAL + ": ")
                .append(toIndentedString(myInt64Optional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INT64_REQUIRED + ": ")
                .append(toIndentedString(myInt64Required))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_FLOAT_OPTIONAL + ": ")
                .append(toIndentedString(myFloatOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_FLOAT_REQUIRED + ": ")
                .append(toIndentedString(myFloatRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_DOUBLE_OPTIONAL + ": ")
                .append(toIndentedString(myDoubleOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_DOUBLE_REQUIRED + ": ")
                .append(toIndentedString(myDoubleRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_STRING_OPTIONAL + ": ")
                .append(toIndentedString(myStringOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_STRING_REQUIRED + ": ")
                .append(toIndentedString(myStringRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_BYTES_OPTIONAL + ": ")
                .append(toIndentedString(myBytesOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_BYTES_REQUIRED + ": ")
                .append(toIndentedString(myBytesRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_BINARY_OPTIONAL + ": ")
                .append(toIndentedString(myBinaryOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_BINARY_REQUIRED + ": ")
                .append(toIndentedString(myBinaryRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_BOOLEAN_OPTIONAL + ": ")
                .append(toIndentedString(myBooleanOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_BOOLEAN_REQUIRED + ": ")
                .append(toIndentedString(myBooleanRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_DATE_OPTIONAL + ": ")
                .append(toIndentedString(myDateOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_DATE_REQUIRED + ": ")
                .append(toIndentedString(myDateRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_DATE_TIME_OPTIONAL + ": ")
                .append(toIndentedString(myDateTimeOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_DATE_TIME_REQUIRED + ": ")
                .append(toIndentedString(myDateTimeRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_FILE_OPTIONAL + ": ")
                .append(toIndentedString(myFileOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_FILE_REQUIRED + ": ")
                .append(toIndentedString(myFileRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_U_U_I_D_OPTIONAL + ": ")
                .append(toIndentedString(myUUIDOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_U_U_I_D_REQUIRED + ": ")
                .append(toIndentedString(myUUIDRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_ENUM_STRING_OPTIONAL + ": ")
                .append(toIndentedString(myEnumStringOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_ENUM_STRING_REQUIRED + ": ")
                .append(toIndentedString(myEnumStringRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_ENUM_INTEGER_OPTIONAL + ": ")
                .append(toIndentedString(myEnumIntegerOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_ENUM_INTEGER_REQUIRED + ": ")
                .append(toIndentedString(myEnumIntegerRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_ENUM_NUMBER_OPTIONAL + ": ")
                .append(toIndentedString(myEnumNumberOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_ENUM_NUMBER_REQUIRED + ": ")
                .append(toIndentedString(myEnumNumberRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INLINE_ENUM_STRING_OPTIONAL + ": ")
                .append(toIndentedString(myInlineEnumStringOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INLINE_ENUM_STRING_REQUIRED + ": ")
                .append(toIndentedString(myInlineEnumStringRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_OPTIONAL + ": ")
                .append(toIndentedString(myInlineEnumIntegerOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_REQUIRED + ": ")
                .append(toIndentedString(myInlineEnumIntegerRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_OPTIONAL + ": ")
                .append(toIndentedString(myInlineEnumNumberOptional))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_REQUIRED + ": ")
                .append(toIndentedString(myInlineEnumNumberRequired))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_ALLOW_EMPTY_VALUE_TRUE + ": ")
                .append(toIndentedString(allowEmptyValueTrue))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static Builder builder() {
        return Builder.create();
    }

    public static final class Builder {
        private java.util.Optional<Integer> myIntOptional;
        private Integer myIntRequired;
        private java.util.Optional<Long> myInt64Optional;
        private Long myInt64Required;
        private java.util.Optional<Float> myFloatOptional;
        private Float myFloatRequired;
        private java.util.Optional<Double> myDoubleOptional;
        private Double myDoubleRequired;
        private java.util.Optional<String> myStringOptional;
        private String myStringRequired;
        private java.util.Optional<byte[]> myBytesOptional;
        private byte[] myBytesRequired;
        private java.util.Optional<java.io.File> myBinaryOptional;
        private java.io.File myBinaryRequired;
        private java.util.Optional<Boolean> myBooleanOptional;
        private Boolean myBooleanRequired;
        private java.util.Optional<java.time.LocalDate> myDateOptional;
        private java.time.LocalDate myDateRequired;
        private java.util.Optional<java.time.OffsetDateTime> myDateTimeOptional;
        private java.time.OffsetDateTime myDateTimeRequired;
        private java.util.Optional<java.io.File> myFileOptional;
        private java.io.File myFileRequired;
        private java.util.Optional<java.util.UUID> myUUIDOptional;
        private java.util.UUID myUUIDRequired;
        private java.util.Optional<EnumString> myEnumStringOptional;
        private EnumString myEnumStringRequired;
        private java.util.Optional<EnumInteger> myEnumIntegerOptional;
        private EnumInteger myEnumIntegerRequired;
        private java.util.Optional<EnumNumber> myEnumNumberOptional;
        private EnumNumber myEnumNumberRequired;
        private java.util.Optional<MyInlineEnumStringOptionalEnum> myInlineEnumStringOptional;
        private MyInlineEnumStringRequiredEnum myInlineEnumStringRequired;
        private java.util.Optional<MyInlineEnumIntegerOptionalEnum> myInlineEnumIntegerOptional;
        private MyInlineEnumIntegerRequiredEnum myInlineEnumIntegerRequired;
        private java.util.Optional<MyInlineEnumNumberOptionalEnum> myInlineEnumNumberOptional;
        private MyInlineEnumNumberRequiredEnum myInlineEnumNumberRequired;
        private java.util.Optional<String> allowEmptyValueTrue;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder myIntOptional(final java.util.Optional<Integer> myIntOptional) {
            this.myIntOptional = myIntOptional;
            return this;
        }

        public Builder myIntOptional(final Integer myIntOptional) {
            this.myIntOptional = java.util.Optional.ofNullable(myIntOptional);
            return this;
        }

        public Builder myIntRequired(final Integer myIntRequired) {
            this.myIntRequired = myIntRequired;
            return this;
        }

        public Builder myInt64Optional(final java.util.Optional<Long> myInt64Optional) {
            this.myInt64Optional = myInt64Optional;
            return this;
        }

        public Builder myInt64Optional(final Long myInt64Optional) {
            this.myInt64Optional = java.util.Optional.ofNullable(myInt64Optional);
            return this;
        }

        public Builder myInt64Required(final Long myInt64Required) {
            this.myInt64Required = myInt64Required;
            return this;
        }

        public Builder myFloatOptional(final java.util.Optional<Float> myFloatOptional) {
            this.myFloatOptional = myFloatOptional;
            return this;
        }

        public Builder myFloatOptional(final Float myFloatOptional) {
            this.myFloatOptional = java.util.Optional.ofNullable(myFloatOptional);
            return this;
        }

        public Builder myFloatRequired(final Float myFloatRequired) {
            this.myFloatRequired = myFloatRequired;
            return this;
        }

        public Builder myDoubleOptional(final java.util.Optional<Double> myDoubleOptional) {
            this.myDoubleOptional = myDoubleOptional;
            return this;
        }

        public Builder myDoubleOptional(final Double myDoubleOptional) {
            this.myDoubleOptional = java.util.Optional.ofNullable(myDoubleOptional);
            return this;
        }

        public Builder myDoubleRequired(final Double myDoubleRequired) {
            this.myDoubleRequired = myDoubleRequired;
            return this;
        }

        public Builder myStringOptional(final java.util.Optional<String> myStringOptional) {
            this.myStringOptional = myStringOptional;
            return this;
        }

        public Builder myStringOptional(final String myStringOptional) {
            this.myStringOptional = java.util.Optional.ofNullable(myStringOptional);
            return this;
        }

        public Builder myStringRequired(final String myStringRequired) {
            this.myStringRequired = myStringRequired;
            return this;
        }

        public Builder myBytesOptional(final java.util.Optional<byte[]> myBytesOptional) {
            this.myBytesOptional = myBytesOptional;
            return this;
        }

        public Builder myBytesOptional(final byte[] myBytesOptional) {
            this.myBytesOptional = java.util.Optional.ofNullable(myBytesOptional);
            return this;
        }

        public Builder myBytesRequired(final byte[] myBytesRequired) {
            this.myBytesRequired = myBytesRequired;
            return this;
        }

        public Builder myBinaryOptional(final java.util.Optional<java.io.File> myBinaryOptional) {
            this.myBinaryOptional = myBinaryOptional;
            return this;
        }

        public Builder myBinaryOptional(final java.io.File myBinaryOptional) {
            this.myBinaryOptional = java.util.Optional.ofNullable(myBinaryOptional);
            return this;
        }

        public Builder myBinaryRequired(final java.io.File myBinaryRequired) {
            this.myBinaryRequired = myBinaryRequired;
            return this;
        }

        public Builder myBooleanOptional(final java.util.Optional<Boolean> myBooleanOptional) {
            this.myBooleanOptional = myBooleanOptional;
            return this;
        }

        public Builder myBooleanOptional(final Boolean myBooleanOptional) {
            this.myBooleanOptional = java.util.Optional.ofNullable(myBooleanOptional);
            return this;
        }

        public Builder myBooleanRequired(final Boolean myBooleanRequired) {
            this.myBooleanRequired = myBooleanRequired;
            return this;
        }

        public Builder myDateOptional(final java.util.Optional<java.time.LocalDate> myDateOptional) {
            this.myDateOptional = myDateOptional;
            return this;
        }

        public Builder myDateOptional(final java.time.LocalDate myDateOptional) {
            this.myDateOptional = java.util.Optional.ofNullable(myDateOptional);
            return this;
        }

        public Builder myDateRequired(final java.time.LocalDate myDateRequired) {
            this.myDateRequired = myDateRequired;
            return this;
        }

        public Builder myDateTimeOptional(
                final java.util.Optional<java.time.OffsetDateTime> myDateTimeOptional) {
            this.myDateTimeOptional = myDateTimeOptional;
            return this;
        }

        public Builder myDateTimeOptional(final java.time.OffsetDateTime myDateTimeOptional) {
            this.myDateTimeOptional = java.util.Optional.ofNullable(myDateTimeOptional);
            return this;
        }

        public Builder myDateTimeRequired(final java.time.OffsetDateTime myDateTimeRequired) {
            this.myDateTimeRequired = myDateTimeRequired;
            return this;
        }

        public Builder myFileOptional(final java.util.Optional<java.io.File> myFileOptional) {
            this.myFileOptional = myFileOptional;
            return this;
        }

        public Builder myFileOptional(final java.io.File myFileOptional) {
            this.myFileOptional = java.util.Optional.ofNullable(myFileOptional);
            return this;
        }

        public Builder myFileRequired(final java.io.File myFileRequired) {
            this.myFileRequired = myFileRequired;
            return this;
        }

        public Builder myUUIDOptional(final java.util.Optional<java.util.UUID> myUUIDOptional) {
            this.myUUIDOptional = myUUIDOptional;
            return this;
        }

        public Builder myUUIDOptional(final java.util.UUID myUUIDOptional) {
            this.myUUIDOptional = java.util.Optional.ofNullable(myUUIDOptional);
            return this;
        }

        public Builder myUUIDRequired(final java.util.UUID myUUIDRequired) {
            this.myUUIDRequired = myUUIDRequired;
            return this;
        }

        public Builder myEnumStringOptional(final java.util.Optional<EnumString> myEnumStringOptional) {
            this.myEnumStringOptional = myEnumStringOptional;
            return this;
        }

        public Builder myEnumStringOptional(final EnumString myEnumStringOptional) {
            this.myEnumStringOptional = java.util.Optional.ofNullable(myEnumStringOptional);
            return this;
        }

        public Builder myEnumStringRequired(final EnumString myEnumStringRequired) {
            this.myEnumStringRequired = myEnumStringRequired;
            return this;
        }

        public Builder myEnumIntegerOptional(
                final java.util.Optional<EnumInteger> myEnumIntegerOptional) {
            this.myEnumIntegerOptional = myEnumIntegerOptional;
            return this;
        }

        public Builder myEnumIntegerOptional(final EnumInteger myEnumIntegerOptional) {
            this.myEnumIntegerOptional = java.util.Optional.ofNullable(myEnumIntegerOptional);
            return this;
        }

        public Builder myEnumIntegerRequired(final EnumInteger myEnumIntegerRequired) {
            this.myEnumIntegerRequired = myEnumIntegerRequired;
            return this;
        }

        public Builder myEnumNumberOptional(final java.util.Optional<EnumNumber> myEnumNumberOptional) {
            this.myEnumNumberOptional = myEnumNumberOptional;
            return this;
        }

        public Builder myEnumNumberOptional(final EnumNumber myEnumNumberOptional) {
            this.myEnumNumberOptional = java.util.Optional.ofNullable(myEnumNumberOptional);
            return this;
        }

        public Builder myEnumNumberRequired(final EnumNumber myEnumNumberRequired) {
            this.myEnumNumberRequired = myEnumNumberRequired;
            return this;
        }

        public Builder myInlineEnumStringOptional(
                final java.util.Optional<MyInlineEnumStringOptionalEnum> myInlineEnumStringOptional) {
            this.myInlineEnumStringOptional = myInlineEnumStringOptional;
            return this;
        }

        public Builder myInlineEnumStringOptional(final String myInlineEnumStringOptional) {
            this.myInlineEnumStringOptional = java.util.Optional.ofNullable(myInlineEnumStringOptional);
            return this;
        }

        public Builder myInlineEnumStringRequired(
                final MyInlineEnumStringRequiredEnum myInlineEnumStringRequired) {
            this.myInlineEnumStringRequired = myInlineEnumStringRequired;
            return this;
        }

        public Builder myInlineEnumIntegerOptional(
                final java.util.Optional<MyInlineEnumIntegerOptionalEnum> myInlineEnumIntegerOptional) {
            this.myInlineEnumIntegerOptional = myInlineEnumIntegerOptional;
            return this;
        }

        public Builder myInlineEnumIntegerOptional(final Integer myInlineEnumIntegerOptional) {
            this.myInlineEnumIntegerOptional = java.util.Optional.ofNullable(myInlineEnumIntegerOptional);
            return this;
        }

        public Builder myInlineEnumIntegerRequired(
                final MyInlineEnumIntegerRequiredEnum myInlineEnumIntegerRequired) {
            this.myInlineEnumIntegerRequired = myInlineEnumIntegerRequired;
            return this;
        }

        public Builder myInlineEnumNumberOptional(
                final java.util.Optional<MyInlineEnumNumberOptionalEnum> myInlineEnumNumberOptional) {
            this.myInlineEnumNumberOptional = myInlineEnumNumberOptional;
            return this;
        }

        public Builder myInlineEnumNumberOptional(final Float myInlineEnumNumberOptional) {
            this.myInlineEnumNumberOptional = java.util.Optional.ofNullable(myInlineEnumNumberOptional);
            return this;
        }

        public Builder myInlineEnumNumberRequired(
                final MyInlineEnumNumberRequiredEnum myInlineEnumNumberRequired) {
            this.myInlineEnumNumberRequired = myInlineEnumNumberRequired;
            return this;
        }

        public Builder allowEmptyValueTrue(final java.util.Optional<String> allowEmptyValueTrue) {
            this.allowEmptyValueTrue = allowEmptyValueTrue;
            return this;
        }

        public Builder allowEmptyValueTrue(final String allowEmptyValueTrue) {
            this.allowEmptyValueTrue = java.util.Optional.ofNullable(allowEmptyValueTrue);
            return this;
        }

        public AllPrimitives build() {
            return new AllPrimitives(
                    this.myIntOptional,
                    this.myIntRequired,
                    this.myInt64Optional,
                    this.myInt64Required,
                    this.myFloatOptional,
                    this.myFloatRequired,
                    this.myDoubleOptional,
                    this.myDoubleRequired,
                    this.myStringOptional,
                    this.myStringRequired,
                    this.myBytesOptional,
                    this.myBytesRequired,
                    this.myBinaryOptional,
                    this.myBinaryRequired,
                    this.myBooleanOptional,
                    this.myBooleanRequired,
                    this.myDateOptional,
                    this.myDateRequired,
                    this.myDateTimeOptional,
                    this.myDateTimeRequired,
                    this.myFileOptional,
                    this.myFileRequired,
                    this.myUUIDOptional,
                    this.myUUIDRequired,
                    this.myEnumStringOptional,
                    this.myEnumStringRequired,
                    this.myEnumIntegerOptional,
                    this.myEnumIntegerRequired,
                    this.myEnumNumberOptional,
                    this.myEnumNumberRequired,
                    this.myInlineEnumStringOptional,
                    this.myInlineEnumStringRequired,
                    this.myInlineEnumIntegerOptional,
                    this.myInlineEnumIntegerRequired,
                    this.myInlineEnumNumberOptional,
                    this.myInlineEnumNumberRequired,
                    this.allowEmptyValueTrue);
        }
    }
}
