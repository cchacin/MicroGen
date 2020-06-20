package org.openapitools.server.model;

/**
 * Description: This model object contains one optional property and one required property for each
 * data type defined here:
 * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#dataTypeFormat.
 */
@org.immutables.value.Value.Immutable
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
@javax.json.bind.annotation.JsonbTypeSerializer(AllPrimitivesSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(AllPrimitivesSerializer.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class AllPrimitives implements OpenAPIModel {

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

    @javax.json.bind.annotation.JsonbCreator
    public AllPrimitives() {}

    /**
     * This is an optional property with type=integer and format=int32. It has a default value of 123.
     *
     * @return myIntOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT_OPTIONAL)
    public abstract java.util.Optional<Integer> getMyIntOptional();

    /**
     * This is a required property with type=integer and format=int32.
     *
     * @return myIntRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT_REQUIRED)
    public abstract Integer getMyIntRequired();

    /**
     * This is an optional property with type=integer and format=int64.
     *
     * @return myInt64Optional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT64_OPTIONAL)
    public abstract java.util.Optional<Long> getMyInt64Optional();

    /**
     * This is a required property with type=integer and format=int64.
     *
     * @return myInt64Required
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INT64_REQUIRED)
    public abstract Long getMyInt64Required();

    /**
     * This is an optional property with type=number and format=float.
     *
     * @return myFloatOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FLOAT_OPTIONAL)
    public abstract java.util.Optional<Float> getMyFloatOptional();

    /**
     * This is a required property with type=integer and format=float.
     *
     * @return myFloatRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FLOAT_REQUIRED)
    public abstract Float getMyFloatRequired();

    /**
     * This is an optional property with type=number and format=double.
     *
     * @return myDoubleOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DOUBLE_OPTIONAL)
    public abstract java.util.Optional<Double> getMyDoubleOptional();

    /**
     * This is a required property with type=integer and format=double.
     *
     * @return myDoubleRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DOUBLE_REQUIRED)
    public abstract Double getMyDoubleRequired();

    /**
     * This is an optional property with type=string and no format specifier. It has a default value
     * of myStringOptionalDefaultValue.
     *
     * @return myStringOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_STRING_OPTIONAL)
    public abstract java.util.Optional<String> getMyStringOptional();

    /**
     * This is a required property with type=string and no format specifier.
     *
     * @return myStringRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_STRING_REQUIRED)
    public abstract String getMyStringRequired();

    /**
     * This is an optional property with type=string and format=byte.
     *
     * @return myBytesOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BYTES_OPTIONAL)
    public abstract java.util.Optional<byte[]> getMyBytesOptional();

    /**
     * This is a required property with type=string and format=byte.
     *
     * @return myBytesRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BYTES_REQUIRED)
    public abstract byte[] getMyBytesRequired();

    /**
     * This is an optional property with type=string and format=binary.
     *
     * @return myBinaryOptional
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BINARY_OPTIONAL)
    public abstract java.util.Optional<java.io.File> getMyBinaryOptional();

    /**
     * This is a required property with type=string and format=binary.
     *
     * @return myBinaryRequired
     */
    @javax.validation.constraints.NotNull
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BINARY_REQUIRED)
    public abstract java.io.File getMyBinaryRequired();

    /**
     * This is an optional property with type=boolean and no format specifier.
     *
     * @return myBooleanOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BOOLEAN_OPTIONAL)
    public abstract java.util.Optional<Boolean> getMyBooleanOptional();

    /**
     * This is a required property with type=boolean and no format specifier.
     *
     * @return myBooleanRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_BOOLEAN_REQUIRED)
    public abstract Boolean getMyBooleanRequired();

    /**
     * This is an optional property with type=string and format=date.
     *
     * @return myDateOptional
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_OPTIONAL)
    public abstract java.util.Optional<java.time.LocalDate> getMyDateOptional();

    /**
     * This is a required property with type=string and format=date.
     *
     * @return myDateRequired
     */
    @javax.validation.constraints.NotNull
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_REQUIRED)
    public abstract java.time.LocalDate getMyDateRequired();

    /**
     * This is an optional property with type=string and format=date-time.
     *
     * @return myDateTimeOptional
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_TIME_OPTIONAL)
    public abstract java.util.Optional<java.time.OffsetDateTime> getMyDateTimeOptional();

    /**
     * This is a required property with type=string and format=date-time.
     *
     * @return myDateTimeRequired
     */
    @javax.validation.constraints.NotNull
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_DATE_TIME_REQUIRED)
    public abstract java.time.OffsetDateTime getMyDateTimeRequired();

    /**
     * This is an optional property with type=file and no format specifier.
     *
     * @return myFileOptional
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FILE_OPTIONAL)
    public abstract java.util.Optional<java.io.File> getMyFileOptional();

    /**
     * This is a required property with type=file and no format specifier.
     *
     * @return myFileRequired
     */
    @javax.validation.constraints.NotNull
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_FILE_REQUIRED)
    public abstract java.io.File getMyFileRequired();

    /**
     * This is an optional property with type=string and format=uuid.
     *
     * @return myUUIDOptional
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_U_U_I_D_OPTIONAL)
    public abstract java.util.Optional<java.util.UUID> getMyUUIDOptional();

    /**
     * This is a required property with type=string and format=uuid.
     *
     * @return myUUIDRequired
     */
    @javax.validation.constraints.NotNull
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_U_U_I_D_REQUIRED)
    public abstract java.util.UUID getMyUUIDRequired();

    /**
     * Get myEnumStringOptional
     *
     * @return myEnumStringOptional
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_STRING_OPTIONAL)
    public abstract java.util.Optional<EnumString> getMyEnumStringOptional();

    /**
     * Get myEnumStringRequired
     *
     * @return myEnumStringRequired
     */
    @javax.validation.constraints.NotNull
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_STRING_REQUIRED)
    public abstract EnumString getMyEnumStringRequired();

    /**
     * Get myEnumIntegerOptional
     *
     * @return myEnumIntegerOptional
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_INTEGER_OPTIONAL)
    public abstract java.util.Optional<EnumInteger> getMyEnumIntegerOptional();

    /**
     * Get myEnumIntegerRequired
     *
     * @return myEnumIntegerRequired
     */
    @javax.validation.constraints.NotNull
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_INTEGER_REQUIRED)
    public abstract EnumInteger getMyEnumIntegerRequired();

    /**
     * Get myEnumNumberOptional
     *
     * @return myEnumNumberOptional
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_NUMBER_OPTIONAL)
    public abstract java.util.Optional<EnumNumber> getMyEnumNumberOptional();

    /**
     * Get myEnumNumberRequired
     *
     * @return myEnumNumberRequired
     */
    @javax.validation.constraints.NotNull
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_ENUM_NUMBER_REQUIRED)
    public abstract EnumNumber getMyEnumNumberRequired();

    /**
     * This is an optional enum property with type&#x3D;string and three enumerated string values.
     * This enum is defined inline.
     */
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumStringOptionalEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumStringOptionalEnumSerializer.class)
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
        public static MyInlineEnumStringOptionalEnum fromValue(final String text) {
            return java.util.Arrays.stream(MyInlineEnumStringOptionalEnum.values())
                    .filter(b -> b.value.equals(text))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumStringOptionalEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumStringOptionalEnum>,
            javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumStringOptionalEnum> {

        @Override
        public void serialize(
                MyInlineEnumStringOptionalEnum obj,
                javax.json.stream.JsonGenerator generator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            generator.write(obj.getValue());
        }

        @Override
        public MyInlineEnumStringOptionalEnum deserialize(
                javax.json.stream.JsonParser parser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumStringOptionalEnum.fromValue(parser.getString());
        }
    }

    /**
     * This is an optional enum property with type=string and three enumerated string values. This
     * enum is defined inline.
     *
     * @return myInlineEnumStringOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_STRING_OPTIONAL)
    public abstract java.util.Optional<MyInlineEnumStringOptionalEnum>
    getMyInlineEnumStringOptional();

    /**
     * This is a required enum property with type&#x3D;string and three enumerated string values. This
     * enum is defined inline.
     */
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumStringRequiredEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumStringRequiredEnumSerializer.class)
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
        public static MyInlineEnumStringRequiredEnum fromValue(final String text) {
            return java.util.Arrays.stream(MyInlineEnumStringRequiredEnum.values())
                    .filter(b -> b.value.equals(text))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumStringRequiredEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumStringRequiredEnum>,
            javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumStringRequiredEnum> {

        @Override
        public void serialize(
                MyInlineEnumStringRequiredEnum obj,
                javax.json.stream.JsonGenerator generator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            generator.write(obj.getValue());
        }

        @Override
        public MyInlineEnumStringRequiredEnum deserialize(
                javax.json.stream.JsonParser parser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumStringRequiredEnum.fromValue(parser.getString());
        }
    }

    /**
     * This is a required enum property with type=string and three enumerated string values. This enum
     * is defined inline.
     *
     * @return myInlineEnumStringRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_STRING_REQUIRED)
    public abstract MyInlineEnumStringRequiredEnum getMyInlineEnumStringRequired();

    /**
     * This is an optional enum property with type&#x3D;integer. It has three legal values: 12, 34,
     * and 56. This enum is defined inline.
     */
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumIntegerOptionalEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumIntegerOptionalEnumSerializer.class)
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
        public static MyInlineEnumIntegerOptionalEnum fromValue(final String text) {
            return java.util.Arrays.stream(MyInlineEnumIntegerOptionalEnum.values())
                    .filter(b -> b.value.equals(text))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumIntegerOptionalEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumIntegerOptionalEnum>,
            javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumIntegerOptionalEnum> {

        @Override
        public void serialize(
                MyInlineEnumIntegerOptionalEnum obj,
                javax.json.stream.JsonGenerator generator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            generator.write(obj.getValue());
        }

        @Override
        public MyInlineEnumIntegerOptionalEnum deserialize(
                javax.json.stream.JsonParser parser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumIntegerOptionalEnum.fromValue(parser.getString());
        }
    }

    /**
     * This is an optional enum property with type=integer. It has three legal values: 12, 34, and 56.
     * This enum is defined inline.
     *
     * @return myInlineEnumIntegerOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_OPTIONAL)
    public abstract java.util.Optional<MyInlineEnumIntegerOptionalEnum>
    getMyInlineEnumIntegerOptional();

    /**
     * This is a required enum property with type&#x3D;integer. It has three legal values: 12, 34, and
     * 56. This enum is defined inline.
     */
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumIntegerRequiredEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumIntegerRequiredEnumSerializer.class)
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
        public static MyInlineEnumIntegerRequiredEnum fromValue(final String text) {
            return java.util.Arrays.stream(MyInlineEnumIntegerRequiredEnum.values())
                    .filter(b -> b.value.equals(text))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumIntegerRequiredEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumIntegerRequiredEnum>,
            javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumIntegerRequiredEnum> {

        @Override
        public void serialize(
                MyInlineEnumIntegerRequiredEnum obj,
                javax.json.stream.JsonGenerator generator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            generator.write(obj.getValue());
        }

        @Override
        public MyInlineEnumIntegerRequiredEnum deserialize(
                javax.json.stream.JsonParser parser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumIntegerRequiredEnum.fromValue(parser.getString());
        }
    }

    /**
     * This is a required enum property with type=integer. It has three legal values: 12, 34, and 56.
     * This enum is defined inline.
     *
     * @return myInlineEnumIntegerRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_INTEGER_REQUIRED)
    public abstract MyInlineEnumIntegerRequiredEnum getMyInlineEnumIntegerRequired();

    /**
     * This is an optional enum property with type&#x3D;number. It has three legal values: 1.2, 3.4,
     * and 5.6. This enum is defined inline.
     */
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumNumberOptionalEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumNumberOptionalEnumSerializer.class)
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
        public static MyInlineEnumNumberOptionalEnum fromValue(final String text) {
            return java.util.Arrays.stream(MyInlineEnumNumberOptionalEnum.values())
                    .filter(b -> b.value.equals(text))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumNumberOptionalEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumNumberOptionalEnum>,
            javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumNumberOptionalEnum> {

        @Override
        public void serialize(
                MyInlineEnumNumberOptionalEnum obj,
                javax.json.stream.JsonGenerator generator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            generator.write(obj.getValue());
        }

        @Override
        public MyInlineEnumNumberOptionalEnum deserialize(
                javax.json.stream.JsonParser parser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumNumberOptionalEnum.fromValue(parser.getString());
        }
    }

    /**
     * This is an optional enum property with type=number. It has three legal values: 1.2, 3.4, and
     * 5.6. This enum is defined inline.
     *
     * @return myInlineEnumNumberOptional
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_OPTIONAL)
    public abstract java.util.Optional<MyInlineEnumNumberOptionalEnum>
    getMyInlineEnumNumberOptional();

    /**
     * This is a required enum property with type&#x3D;number. It has three legal values: 1.2, 3.4,
     * and 5.6. This enum is defined inline.
     */
    @javax.json.bind.annotation.JsonbTypeSerializer(
            AllPrimitives.MyInlineEnumNumberRequiredEnumSerializer.class)
    @javax.json.bind.annotation.JsonbTypeDeserializer(
            AllPrimitives.MyInlineEnumNumberRequiredEnumSerializer.class)
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
        public static MyInlineEnumNumberRequiredEnum fromValue(final String text) {
            return java.util.Arrays.stream(MyInlineEnumNumberRequiredEnum.values())
                    .filter(b -> b.value.equals(text))
                    .findFirst()
                    .orElse(null);
        }
    }

    public static class MyInlineEnumNumberRequiredEnumSerializer
            implements javax.json.bind.serializer.JsonbSerializer<MyInlineEnumNumberRequiredEnum>,
            javax.json.bind.serializer.JsonbDeserializer<MyInlineEnumNumberRequiredEnum> {

        @Override
        public void serialize(
                MyInlineEnumNumberRequiredEnum obj,
                javax.json.stream.JsonGenerator generator,
                javax.json.bind.serializer.SerializationContext serializationContext) {
            generator.write(obj.getValue());
        }

        @Override
        public MyInlineEnumNumberRequiredEnum deserialize(
                javax.json.stream.JsonParser parser,
                javax.json.bind.serializer.DeserializationContext deserializationContext,
                java.lang.reflect.Type type) {
            return MyInlineEnumNumberRequiredEnum.fromValue(parser.getString());
        }
    }

    /**
     * This is a required enum property with type=number. It has three legal values: 1.2, 3.4, and
     * 5.6. This enum is defined inline.
     *
     * @return myInlineEnumNumberRequired
     */
    @javax.validation.constraints.NotNull
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_MY_INLINE_ENUM_NUMBER_REQUIRED)
    public abstract MyInlineEnumNumberRequiredEnum getMyInlineEnumNumberRequired();

    /**
     * This is an optional property with type=string and no format specifier. It has
     * allowEmptyValue=true.
     *
     * @return allowEmptyValueTrue
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ALLOW_EMPTY_VALUE_TRUE)
    public abstract java.util.Optional<String> getAllowEmptyValueTrue();

    public static class Builder extends ImmutableAllPrimitives.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
