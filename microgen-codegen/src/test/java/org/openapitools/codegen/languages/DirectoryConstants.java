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

class DirectoryConstants {
    private static final String SOURCE_MAIN_FOLDER = "src/main/";
    private static final String SOURCE_TEST_FOLDER = "src/test/";
    private static final String JAVA_FOLDER = SOURCE_MAIN_FOLDER + "java/";
    private static final String TEST_FOLDER = SOURCE_TEST_FOLDER + "java/";
    static final String CLIENT_FOLDER = JAVA_FOLDER + "org/openapitools/client/";
    private static final String SERVER_FOLDER = JAVA_FOLDER + "org/openapitools/server/";
    private static final String MODEL_FOLDER = "model/";
    public static final String MODEL_TEST_FOLDER = TEST_FOLDER + "org/openapitools/server/model/";
    public static final String EXAMPLE_TEST_FOLDER = SOURCE_TEST_FOLDER + "resources/";
    public static final String API_TEST_FOLDER = TEST_FOLDER + "org/openapitools/server/api/";
    private static final String API_FOLDER = "api/";
    private static final String AUTH_FOLDER = "auth/";
    private static final String RESOURCE_FOLDER = SOURCE_MAIN_FOLDER + "resources/";

    static final String CLIENT_API_FOLDER = CLIENT_FOLDER + API_FOLDER;
    static final String CLIENT_AUTH_FOLDER = CLIENT_FOLDER + AUTH_FOLDER;
    static final String CLIENT_MODEL_FOLDER = CLIENT_FOLDER + MODEL_FOLDER;
    static final String CLIENT_RESOURCE_FOLDER = RESOURCE_FOLDER;

    static final String SERVER_API_FOLDER = SERVER_FOLDER + API_FOLDER;
    static final String SERVER_MODEL_FOLDER = SERVER_FOLDER + MODEL_FOLDER;
    static final String SERVER_RESOURCE_FOLDER = RESOURCE_FOLDER;
}
