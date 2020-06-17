/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.openapitools.codegen.languages;


import org.openapitools.codegen.CodegenProperty;

import java.util.Map;
import java.util.stream.Collectors;

public class MicroGenProperty extends CodegenProperty {

    public MicroGenProperty(final CodegenProperty delegate) {
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

//    @Override
//    public String getDatatypeWithEnum() {
//        if (this.dataType != null && !this.required && !this.isEnum) {
//            return String.format("java.util.Optional<%s>", super.getDatatypeWithEnum());
//        }
//        return super.getDatatypeWithEnum();
//    }

    @Override
    public String getGetter() {
        return this.vendorExtensions.getOrDefault("x-name", super.getGetter()).toString();
    }

    public String jsonbPropertyName() {
        return "JSONB_PROPERTY_" + getNameInSnakeCase();
    }

    public String getFieldType() {
        if (!this.required) {
            return String.format("java.util.Optional<%s>", super.getDatatypeWithEnum());
        }
        return super.getDatatypeWithEnum();
    }

    public String deserializer() {
        if (!isContainer) {
            if (isLong) {
                return "." + name + "(jsonObject.getJsonNumber(\"" + baseName + "\").longValue())";
            }

            if (isInteger) {
                return "." + name + "(jsonObject.getJsonNumber(\"" + baseName + "\").intValue())";
            }

            if (isDouble) {
                return "." + name + "(jsonObject.getJsonNumber(\"" + baseName + "\").doubleValue())";
            }

            if (isFloat) {
                return "." + name + "(jsonObject.getJsonNumber(\"" + baseName + "\").doubleValue())";
            }

            if (isString) {
                return "." + name + "(jsonObject.getString(\"" + baseName + "\"))";
            }

            if (isBoolean) {
                return "." + name + "(jsonObject.getBoolean(\"" + baseName + "\"))";
            }
            if (isModel) {
                return "." + name + "(" + dataType + "Serializer.fromJsonObject(jsonObject))";
            }
        }

        if (isListContainer) {
            if (items.isLong) {
                return ".addAll" + nameInCamelCase + "(jsonObject.getJsonArray(\"" + baseName + "\").getValuesAs(JsonNumber::longValue))";
            }
            if (items.isInteger) {
                return ".addAll" + nameInCamelCase + "(jsonObject.getJsonArray(\"" + baseName + "\").getValuesAs(JsonNumber::intValue))";
            }
            if (items.isDouble) {
                return ".addAll" + nameInCamelCase + "(jsonObject.getJsonArray(\"" + baseName + "\").getValuesAs(JsonNumber::doubleValue))";
            }
            if (items.isFloat) {
                return ".addAll" + nameInCamelCase + "(jsonObject.getJsonArray(\"" + baseName + "\").getValuesAs(JsonNumber::doubleValue))";
            }
            if (items.isString) {
                return ".addAll" + nameInCamelCase + "(jsonObject.getJsonArray(\"" + baseName + "\").getValuesAs(JsonString::getString))";
            }
            if (items.isBoolean) {
                return ".addAll" + nameInCamelCase + "(jsonObject.getJsonArray(\"" + baseName + "\").getValuesAs(JsonString::getString))"; // TODO Boolean, DateTime, Date, UUID
            }
            if (items.isModel) {
                return ".addAll" + nameInCamelCase + "(" + items.dataType + "." + items.dataType + "Serializer.fromJsonArray(jsonObject.getJsonArray(\"" + baseName + "\")))";
            }
        }

        if (isMapContainer) {
            if (items.isLong) {
                return ".putAll" + nameInCamelCase + "(jsonObject.getJsonObject(\"" + baseName + "\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))";
            }
            if (items.isInteger) {
                return ".putAll" + nameInCamelCase + "(jsonObject.getJsonObject(\"" + baseName + "\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))";
            }
            if (items.isDouble) {
                return ".putAll" + nameInCamelCase + "(jsonObject.getJsonObject(\"" + baseName + "\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))";
            }
            if (items.isFloat) {
                return ".putAll" + nameInCamelCase + "(jsonObject.getJsonObject(\"" + baseName + "\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))";
            }
            if (items.isString) {
                return ".putAll" + nameInCamelCase + "(jsonObject.getJsonObject(\"" + baseName + "\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))";
            }
            if (items.isBoolean) {
                return ".putAll" + nameInCamelCase + "(jsonObject.getJsonObject(\"" + baseName + "\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))";
            }
            if (items.isModel) {
                return ".putAll" + nameInCamelCase + "(jsonObject.getJsonObject(\"" + baseName + "\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> " + items.dataType + "." + items.dataType + "Serializer.fromJsonObject(entry.getValue().asJsonObject()))))";
            }
        }

        return "." + name + "(jsonObject.getJsonObject(\"" + baseName + "\"))";
    }
}
