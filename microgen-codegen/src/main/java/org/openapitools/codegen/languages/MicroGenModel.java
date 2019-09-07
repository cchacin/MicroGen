package org.openapitools.codegen.languages;


import org.openapitools.codegen.CodegenModel;

class MicroGenModel extends CodegenModel {

    MicroGenModel(final CodegenModel delegate) {
        super();
        this.parent = delegate.parent;
        this.parentSchema = delegate.parentSchema;
        this.interfaces = delegate.interfaces;
        this.allParents = delegate.allParents;
        this.parentModel = delegate.parentModel;
        this.interfaceModels = delegate.interfaceModels;
        this.children = delegate.children;
        this.anyOf = delegate.anyOf;
        this.oneOf = delegate.oneOf;
        this.allOf = delegate.allOf;
        this.name = delegate.name;
        this.classname = delegate.classname;
        this.title = delegate.title;
        this.description = delegate.description;
        this.classVarName = delegate.classVarName;
        this.modelJson = delegate.modelJson;
        this.dataType = delegate.dataType;
        this.xmlPrefix = delegate.xmlPrefix;
        this.xmlNamespace = delegate.xmlNamespace;
        this.xmlName = delegate.xmlName;
        this.classFilename = delegate.classFilename;
        this.unescapedDescription = delegate.unescapedDescription;
        this.discriminator = delegate.discriminator;
        this.defaultValue = delegate.defaultValue;
        this.arrayModelType = delegate.arrayModelType;
        this.isAlias = delegate.isAlias;
        this.isString = delegate.isString;
        this.isInteger = delegate.isInteger;
        this.isLong = delegate.isLong;
        this.isNumber = delegate.isNumber;
        this.isNumeric = delegate.isNumeric;
        this.isFloat = delegate.isFloat;
        this.isDouble = delegate.isDouble;
        this.vars = delegate.vars;
        this.allVars = delegate.allVars;
        this.requiredVars = delegate.requiredVars;
        this.optionalVars = delegate.optionalVars;
        this.readOnlyVars = delegate.readOnlyVars;
        this.readWriteVars = delegate.readWriteVars;
        this.parentVars = delegate.parentVars;
        this.allowableValues = delegate.allowableValues;
        this.mandatory = delegate.mandatory;
        this.allMandatory = delegate.allMandatory;
        this.imports = delegate.imports;
        this.hasVars = delegate.hasVars;
        this.emptyVars = delegate.emptyVars;
        this.hasMoreModels = delegate.hasMoreModels;
        this.hasEnums = delegate.hasEnums;
        this.isEnum = delegate.isEnum;
        this.isNullable = delegate.isNullable;
        this.hasRequired = delegate.hasRequired;
        this.hasOptional = delegate.hasOptional;
        this.isArrayModel = delegate.isArrayModel;
        this.hasChildren = delegate.hasChildren;
        this.isMapModel = delegate.isMapModel;
        this.hasOnlyReadOnly = delegate.hasOnlyReadOnly;
        this.externalDocumentation = delegate.externalDocumentation;
        this.vendorExtensions = delegate.vendorExtensions;
        this.additionalPropertiesType = delegate.additionalPropertiesType;
    }
}
