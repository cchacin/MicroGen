package io.swagger.codegen.v3.generators.java;

import io.swagger.codegen.v3.CodegenOperation;
import io.swagger.codegen.v3.CodegenParameter;

import java.util.List;

class MicroGenOperation extends CodegenOperation {
    
    MicroGenOperation(final CodegenOperation codegenOperation) {
        super();
        this.path = codegenOperation.path;
        if (codegenOperation.path.charAt(0) == '/') {
            // Removes "/" to make paths relative to baseUrl
            this.path = codegenOperation.path.substring(1);
        }
        this.responseHeaders.addAll(codegenOperation.responseHeaders);
        this.returnTypeIsPrimitive = codegenOperation.returnTypeIsPrimitive;
        this.returnSimpleType = codegenOperation.returnSimpleType;
        this.subresourceOperation = codegenOperation.subresourceOperation;
        this.operationId = codegenOperation.operationId;
        this.returnType = codegenOperation.returnType;
        this.httpMethod = codegenOperation.httpMethod;
        this.returnBaseType = codegenOperation.returnBaseType;
        this.returnContainer = codegenOperation.returnContainer;
        this.summary = codegenOperation.summary;
        this.unescapedNotes = codegenOperation.unescapedNotes;
        this.notes = codegenOperation.notes;
        this.baseName = codegenOperation.baseName;
        this.defaultResponse = codegenOperation.defaultResponse;
        this.discriminator = codegenOperation.discriminator;
        this.consumes = codegenOperation.consumes;
        this.produces = codegenOperation.produces;
        this.bodyParam = codegenOperation.bodyParam;
        this.authMethods = codegenOperation.authMethods;
        this.tags = codegenOperation.tags;
        this.responses = codegenOperation.responses;
        this.imports = codegenOperation.imports;
        this.examples = codegenOperation.examples;
        this.externalDocs = codegenOperation.externalDocs;
        this.vendorExtensions = codegenOperation.vendorExtensions;
        this.nickname = codegenOperation.nickname;
        this.operationIdLowerCase = codegenOperation.operationIdLowerCase;

        this.bodyParams = addHasMore(codegenOperation.bodyParams);
        this.pathParams = addHasMore(codegenOperation.pathParams);
        this.formParams = addHasMore(codegenOperation.formParams);
        this.queryParams = addHasMore(codegenOperation.queryParams);
        this.allParams.addAll(codegenOperation.headerParams);
        this.allParams.addAll(codegenOperation.queryParams);
        this.allParams.addAll(codegenOperation.pathParams);
        this.allParams.addAll(codegenOperation.formParams);
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
