package io.swagger.codegen.v3.generators.java;

import io.swagger.codegen.v3.CodegenProperty;

class MicroGenProperty extends CodegenProperty {

    MicroGenProperty(final CodegenProperty codegenProperty) {
        super();
        this.baseName = codegenProperty.baseName;
        this.complexType = codegenProperty.complexType;
        this.getter = this.processGetter(codegenProperty);
        this.setter = codegenProperty.setter;
        this.description = codegenProperty.description;
        this.datatype = codegenProperty.datatype;
        this.datatypeWithEnum = codegenProperty.datatypeWithEnum;
        this.dataFormat = codegenProperty.dataFormat;
        this.name = codegenProperty.name;
        this.min = codegenProperty.min;
        this.max = codegenProperty.max;
        this.defaultValue = codegenProperty.defaultValue;
        this.defaultValueWithParam = codegenProperty.defaultValueWithParam;
        this.baseType = codegenProperty.baseType;
        this.containerType = codegenProperty.containerType;
        this.title = codegenProperty.title;
        this.unescapedDescription = codegenProperty.unescapedDescription;
        this.maxLength = codegenProperty.maxLength;
        this.minLength = codegenProperty.minLength;
        this.pattern = codegenProperty.pattern;
        this.example = codegenProperty.example;
        this.jsonSchema = codegenProperty.jsonSchema;
        this.minimum = codegenProperty.minimum;
        this.maximum = codegenProperty.maximum;
        this.exclusiveMinimum = codegenProperty.exclusiveMinimum;
        this.exclusiveMaximum = codegenProperty.exclusiveMaximum;
        this.required = codegenProperty.required;
        this.secondaryParam = codegenProperty.secondaryParam;
        this._enum = codegenProperty._enum;
        this.allowableValues = codegenProperty.allowableValues;
        this.items = codegenProperty.items;
        this.vendorExtensions = codegenProperty.vendorExtensions;
        this.discriminatorValue = codegenProperty.discriminatorValue;
        this.nameInCamelCase = codegenProperty.nameInCamelCase;
        this.enumName = codegenProperty.enumName;
        this.maxItems = codegenProperty.maxItems;
        this.minItems = codegenProperty.minItems;
        this.xmlPrefix = codegenProperty.xmlPrefix;
        this.xmlName = codegenProperty.xmlName;
        this.xmlNamespace = codegenProperty.xmlNamespace;
    }

    private String processGetter(final CodegenProperty codegenProperty) {
        return codegenProperty.vendorExtensions.getOrDefault("x-name", codegenProperty.getter)
                                               .toString();
    }
}
