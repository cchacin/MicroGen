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
package org.openapitools.codegen.languages.server;

import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.MicroGen;
import org.openapitools.codegen.languages.TemplateTest;

import java.nio.file.Path;

public interface ServerTemplateTest extends TemplateTest {

    @Override
    default CodegenConfig codegen(final Path tempDirectory) {
        final MicroGen codegen = new MicroGen();
        codegen.setLibrary("server");
        codegen.setModelPackage("org.openapitools.server.model");
        codegen.setApiPackage("org.openapitools.server.api");
        codegen.setOutputDir(tempDirectory.toString());
        return codegen;
    }

    default void executeTest(final String openAPIFile,
                             final String expectedFile,
                             final Path tmpFolder,
                             final boolean formatted) {
        this.executeTest(openAPIFile, openAPIFile, expectedFile, tmpFolder, formatted);
    }

    default void executeTest(final String openAPIFile,
                             final String expectedFile,
                             final Path tmpFolder) {
        this.executeTest(openAPIFile, expectedFile, tmpFolder, true);
    }
}
