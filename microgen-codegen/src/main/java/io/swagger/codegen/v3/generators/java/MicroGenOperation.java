package io.swagger.codegen.v3.generators.java;

import io.swagger.codegen.v3.CodegenOperation;
import io.swagger.codegen.v3.CodegenParameter;

import java.util.List;

class MicroGenOperation extends CodegenOperation {

    MicroGenOperation(final CodegenOperation operation) {
        super();
        this.path = operation.path;
        if (operation.path.charAt(0) == '/') {
            // Removes "/" to make paths relative to baseUrl
            this.path = operation.path.substring(1);
        }
        this.responseHeaders.addAll(operation.responseHeaders);
        this.returnTypeIsPrimitive = operation.returnTypeIsPrimitive;
        this.returnSimpleType = operation.returnSimpleType;
        this.subresourceOperation = operation.subresourceOperation;
        this.operationId = operation.operationId;
        this.returnType = operation.returnType;
        this.httpMethod = operation.httpMethod;
        this.returnBaseType = operation.returnBaseType;
        this.returnContainer = operation.returnContainer;
        this.summary = operation.summary;
        this.unescapedNotes = operation.unescapedNotes;
        this.notes = operation.notes;
        this.baseName = operation.baseName;
        this.defaultResponse = operation.defaultResponse;
        this.discriminator = operation.discriminator;
        this.consumes = operation.consumes;
        this.produces = operation.produces;
        this.bodyParam = operation.bodyParam;
        this.bodyParams = operation.bodyParams;
        this.authMethods = operation.authMethods;
        this.tags = operation.tags;
        this.responses = operation.responses;
        this.imports.clear();
        if (this.bodyParam != null &&
                this.bodyParam.getIsBodyParam()
        ) {
            if (bodyParam.getIsContainer()) {
                this.bodyParam.dataType = Builder.JAVA_UTIL_LIST + "<Immutable" + this.bodyParam.baseType + ">";

                this.imports.add("Immutable" + this.bodyParam.baseType);
            } else {
                this.bodyParam.dataType = "Immutable" + this.bodyParam.baseType;
                this.imports.add(this.bodyParam.dataType);
            }
            this.getBodyParams().clear();
            this.getBodyParams().add(this.bodyParam);
        }
        this.examples = operation.examples;
        this.externalDocs = operation.externalDocs;
        this.vendorExtensions = operation.vendorExtensions;
        this.nickname = operation.nickname;
        this.operationIdLowerCase = operation.operationIdLowerCase;

        this.bodyParams = addHasMore(this.bodyParams);
        this.pathParams = addHasMore(operation.pathParams);
        this.formParams = addHasMore(operation.formParams);
        this.queryParams = addHasMore(operation.queryParams);
        this.allParams.addAll(operation.headerParams);
        this.allParams.addAll(operation.queryParams);
        this.allParams.addAll(operation.pathParams);
        this.allParams.addAll(operation.formParams);
        this.allParams = addHasMore(this.allParams);
    }

    private List<CodegenParameter> addHasMore(final List<CodegenParameter> parameters) {
        if (parameters != null) {
            for (int i = 0; i < parameters.size(); i++) {
                if (i > 0) {
                    parameters.get(i).secondaryParam = true;
                }
            }
        }
        return parameters;
    }

    public boolean isHasParams() {
        return this.allParams.size() > 0;
    }
}
