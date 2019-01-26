package io.swagger.codegen.v3.generators.java;


import io.swagger.codegen.v3.CodegenModel;

class MicroGenModel extends CodegenModel {

    MicroGenModel(final CodegenModel model) {
        super();
        this.parent = model.parent;
        this.parentSchema = model.parentSchema;
        this.parentModel = model.parentModel;
        this.name = model.name;
        this.classname = model.classname;
        this.title = model.title;
        this.description = model.description;
        this.classVarName = model.classVarName;
        this.modelJson = model.modelJson;
        this.dataType = model.dataType;
        this.xmlPrefix = model.xmlPrefix;
        this.xmlNamespace = model.xmlNamespace;
        this.xmlName = model.xmlName;
        this.classFilename = model.classFilename;
        this.unescapedDescription = model.unescapedDescription;
        this.discriminator = model.discriminator;
        this.defaultValue = model.defaultValue;
        this.arrayModelType = model.arrayModelType;
        this.emptyVars = model.emptyVars;
        this.additionalPropertiesType = model.additionalPropertiesType;
        this.vendorExtensions = model.vendorExtensions;
        this.interfaces = model.interfaces;
        this.interfaceModels = model.interfaceModels;
        this.children = model.children;
        this.vars = model.vars;
        this.requiredVars = model.requiredVars;
        this.optionalVars = model.optionalVars;
        this.readOnlyVars = model.readOnlyVars;
        this.readWriteVars = model.readWriteVars;
        this.allVars = model.allVars;
        this.parentVars = model.parentVars;
        this.allowableValues = model.allowableValues;
        this.mandatory = model.mandatory;
        this.allMandatory = model.allMandatory;
        this.imports = model.imports;
    }
}
