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

public enum TemplateType {

    CLIENT_API(DirectoryConstants.CLIENT_API_FOLDER),
    CLIENT_APICLIENT(DirectoryConstants.CLIENT_FOLDER),
    CLIENT_AUTH(DirectoryConstants.CLIENT_AUTH_FOLDER),
    CLIENT_MODEL(DirectoryConstants.CLIENT_MODEL_FOLDER),
    CLIENT_RESOURCE(DirectoryConstants.CLIENT_RESOURCE_FOLDER),
    SERVER_API(DirectoryConstants.SERVER_API_FOLDER),
    SERVER_API_TEST(DirectoryConstants.API_TEST_FOLDER),
    SERVER_MODEL_TEST(DirectoryConstants.MODEL_TEST_FOLDER),
    SERVER_EXAMPLE_TEST(DirectoryConstants.EXAMPLE_TEST_FOLDER),
    SERVER_MODEL(DirectoryConstants.SERVER_MODEL_FOLDER),
    SERVER_RESOURCE(DirectoryConstants.SERVER_RESOURCE_FOLDER);

    final String folder;

    TemplateType(final String folder) {
        this.folder = folder;
    }

    public String getFolder() {
        return this.folder;
    }

    @Override
    public String toString() {
        return this.folder;
    }
}
