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

import org.openapitools.codegen.CodegenOperation;

class MicroGenOperation extends CodegenOperation {

    MicroGenOperation(final CodegenOperation delegate) {
        super();
        this.responseHeaders.clear();
        this.responseHeaders.addAll(delegate.responseHeaders);
        this.hasAuthMethods = delegate.hasAuthMethods;
        this.hasConsumes = delegate.hasConsumes;
        this.hasProduces = delegate.hasProduces;
        this.hasParams = delegate.hasParams;
        this.hasOptionalParams = delegate.hasOptionalParams;
        this.hasRequiredParams = delegate.hasRequiredParams;
        this.returnTypeIsPrimitive = delegate.returnTypeIsPrimitive;
        this.returnSimpleType = delegate.returnSimpleType;
        this.subresourceOperation = delegate.subresourceOperation;
        this.isMapContainer = delegate.isMapContainer;
        this.isListContainer = delegate.isListContainer;
        this.isMultipart = delegate.isMultipart;
        this.hasMore = delegate.hasMore;
        this.isResponseBinary = delegate.isResponseBinary;
        this.isResponseFile = delegate.isResponseFile;
        this.hasReference = delegate.hasReference;
        this.isRestfulIndex = delegate.isRestfulIndex;
        this.isRestfulShow = delegate.isRestfulShow;
        this.isRestfulCreate = delegate.isRestfulCreate;
        this.isRestfulUpdate = delegate.isRestfulUpdate;
        this.isRestfulDestroy = delegate.isRestfulDestroy;
        this.isRestful = delegate.isRestful;
        this.isDeprecated = delegate.isDeprecated;
        this.isCallbackRequest = delegate.isCallbackRequest;
        this.path = delegate.path;
        this.operationId = delegate.operationId;
        this.returnType = delegate.returnType;
        this.httpMethod = delegate.httpMethod;
        this.returnBaseType = delegate.returnBaseType;
        this.returnContainer = delegate.returnContainer;
        this.summary = delegate.summary;
        this.unescapedNotes = delegate.unescapedNotes;
        this.notes = delegate.notes;
        this.baseName = delegate.baseName;
        this.defaultResponse = delegate.defaultResponse;
        this.discriminator = delegate.discriminator;
        this.consumes = delegate.consumes;
        this.produces = delegate.produces;
        this.prioritizedContentTypes = delegate.prioritizedContentTypes;
        this.servers = delegate.servers;
        this.bodyParam = delegate.bodyParam;
        this.allParams = delegate.allParams;
        this.bodyParams = delegate.bodyParams;
        this.pathParams = delegate.pathParams;
        this.queryParams = delegate.queryParams;
        this.headerParams = delegate.headerParams;
        this.formParams = delegate.formParams;
        this.cookieParams = delegate.cookieParams;
        this.requiredParams = delegate.requiredParams;
        this.optionalParams = delegate.optionalParams;
        this.authMethods = delegate.authMethods;
        this.tags = delegate.tags;
        this.responses = delegate.responses;
        this.callbacks = delegate.callbacks;
        this.imports = delegate.imports;
        this.examples = delegate.examples;
        this.requestBodyExamples = delegate.requestBodyExamples;
        this.externalDocs = delegate.externalDocs;
        this.vendorExtensions = delegate.vendorExtensions;
        this.nickname = delegate.nickname;
        this.operationIdOriginal = delegate.operationIdOriginal;
        this.operationIdLowerCase = delegate.operationIdLowerCase;
        this.operationIdCamelCase = delegate.operationIdCamelCase;
        this.operationIdSnakeCase = delegate.operationIdSnakeCase;
    }

    public boolean getHasParams() {
        return this.allParams.size() - this.bodyParams.size() > 0;
    }
}
