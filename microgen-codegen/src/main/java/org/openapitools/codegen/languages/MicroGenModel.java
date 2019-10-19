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
