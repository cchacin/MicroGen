package org.openapitools.codegen.languages;


import org.openapitools.codegen.CodegenProperty;

class MicroGenProperty extends CodegenProperty {

    MicroGenProperty(final CodegenProperty delegate) {
        super();
        this.openApiType = delegate.openApiType;
        this.baseName = delegate.baseName;
        this.complexType = delegate.complexType;
        this.getter = delegate.getter;
        this.setter = delegate.setter;
        this.description = delegate.description;
        this.dataType = delegate.dataType;
        this.datatypeWithEnum = delegate.datatypeWithEnum;
        this.dataFormat = delegate.dataFormat;
        this.name = delegate.name;
        this.min = delegate.min;
        this.max = delegate.max;
        this.defaultValue = delegate.defaultValue;
        this.defaultValueWithParam = delegate.defaultValueWithParam;
        this.baseType = delegate.baseType;
        this.containerType = delegate.containerType;
        this.title = delegate.title;
        this.unescapedDescription = delegate.unescapedDescription;
        this.maxLength = delegate.maxLength;
        this.minLength = delegate.minLength;
        this.pattern = delegate.pattern;
        this.example = delegate.example;
        this.jsonSchema = delegate.jsonSchema;
        this.minimum = delegate.minimum;
        this.maximum = delegate.maximum;
        this.exclusiveMinimum = delegate.exclusiveMinimum;
        this.exclusiveMaximum = delegate.exclusiveMaximum;
        this.hasMore = delegate.hasMore;
        this.required = delegate.required;
        this.secondaryParam = delegate.secondaryParam;
        this.hasMoreNonReadOnly = delegate.hasMoreNonReadOnly;
        this.isPrimitiveType = delegate.isPrimitiveType;
        this.isModel = delegate.isModel;
        this.isContainer = delegate.isContainer;
        this.isString = delegate.isString;
        this.isNumeric = delegate.isNumeric;
        this.isInteger = delegate.isInteger;
        this.isLong = delegate.isLong;
        this.isNumber = delegate.isNumber;
        this.isFloat = delegate.isFloat;
        this.isDouble = delegate.isDouble;
        this.isByteArray = delegate.isByteArray;
        this.isBinary = delegate.isBinary;
        this.isFile = delegate.isFile;
        this.isBoolean = delegate.isBoolean;
        this.isDate = delegate.isDate;
        this.isDateTime = delegate.isDateTime;
        this.isUuid = delegate.isUuid;
        this.isUri = delegate.isUri;
        this.isEmail = delegate.isEmail;
        this.isFreeFormObject = delegate.isFreeFormObject;
        this.isListContainer = delegate.isListContainer;
        this.isMapContainer = delegate.isMapContainer;
        this.isEnum = delegate.isEnum;
        this.isReadOnly = delegate.isReadOnly;
        this.isWriteOnly = delegate.isWriteOnly;
        this.isNullable = delegate.isNullable;
        this.isSelfReference = delegate.isSelfReference;
        this._enum = delegate._enum;
        this.allowableValues = delegate.allowableValues;
        this.items = delegate.items;
        this.mostInnerItems = delegate.mostInnerItems;
        this.vendorExtensions = delegate.vendorExtensions;
        this.hasValidation = delegate.hasValidation;
        this.isInherited = delegate.isInherited;
        this.discriminatorValue = delegate.discriminatorValue;
        this.nameInCamelCase = delegate.nameInCamelCase;
        this.nameInSnakeCase = delegate.nameInSnakeCase;
        this.enumName = delegate.enumName;
        this.maxItems = delegate.maxItems;
        this.minItems = delegate.minItems;
        this.isXmlAttribute = delegate.isXmlAttribute;
        this.xmlPrefix = delegate.xmlPrefix;
        this.xmlName = delegate.xmlName;
        this.xmlNamespace = delegate.xmlNamespace;
        this.isXmlWrapped = delegate.isXmlWrapped;
    }

    @Override
    public String getDatatypeWithEnum() {
        if (!required && !isEnum) {
            if ("Integer".equals(dataType)) {
                return "java.util.OptionalInt";
            } else if ("Double".equals(dataType)) {
                return "java.util.OptionalDouble";
            } else if ("Long".equals(dataType)) {
                return "java.util.OptionalLong";
            }
        }
        return super.getDatatypeWithEnum();
    }

    @Override
    public String getGetter() {
        return this.vendorExtensions.getOrDefault("x-name", super.getGetter()).toString();
    }
}
