package io.swagger.codegen.v3.generators.java;


import io.swagger.codegen.v3.CodegenModel;

class MicroGenModel extends CodegenModel {

    MicroGenModel(final CodegenModel m) {
        super();
        this.parent = m.parent;
        this.parentSchema = m.parentSchema;
        this.parentModel = m.parentModel;
        this.name = m.name;
        this.classname = m.classname;
        this.title = m.title;
        this.description = m.description;
        this.classVarName = m.classVarName;
        this.modelJson = m.modelJson;
        this.dataType = m.dataType;
        this.xmlPrefix = m.xmlPrefix;
        this.xmlNamespace = m.xmlNamespace;
        this.xmlName = m.xmlName;
        this.classFilename = m.classFilename;
        this.unescapedDescription = m.unescapedDescription;
        this.discriminator = m.discriminator;
        this.defaultValue = m.defaultValue;
        this.arrayModelType = m.arrayModelType;
        this.emptyVars = m.emptyVars;
        this.additionalPropertiesType = m.additionalPropertiesType;
        this.vendorExtensions = m.vendorExtensions;
        this.interfaces = m.interfaces;
        this.interfaceModels = m.interfaceModels;
        this.children = m.children;
        this.vars = m.vars;
        this.requiredVars = m.requiredVars;
        this.optionalVars = m.optionalVars;
        this.readOnlyVars = m.readOnlyVars;
        this.readWriteVars = m.readWriteVars;
        this.allVars = m.allVars;
        this.parentVars = m.parentVars;
        this.allowableValues = m.allowableValues;
        this.mandatory = m.mandatory;
        this.allMandatory = m.allMandatory;
        this.imports = m.imports;
    }
}
