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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.swagger.v3.oas.models.media.Schema;

public interface ModelTest {
    
    enum Optionality {
        NON_REQUIRED,
        REQUIRED
    }

    default List<String> extractProperty(
            final Schema<?> schema,
            final Optionality optionality,
            final Function<MicroGenProperty, String> extractor
            ) {
        return getVarsFor(schema, optionality)
                .stream()
                .filter(Objects::nonNull)
                .map(extractor)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    default List<MicroGenProperty> getVarsFor(
            final Schema<?> schema,
            final Optionality optionality) {
        return getCodegenModel(schema, optionality).vars.stream().map(MicroGenProperty::new).collect(Collectors.toList());
    }

    default CodegenModel getCodegenModel(
            final Schema<?> schema,
            final Optionality optionality) {
        final Schema<?> rootSchema = new Schema<>()
                .name("id")
                .description("a sample model");
        final Map<String, Schema> properties = new HashMap<>();
        properties.put("myschema", schema);
        rootSchema.properties(properties);
        if (Optionality.REQUIRED.equals(optionality)) {
            rootSchema.addRequiredItem("myschema");
        }

        final MicroGen codegen = new MicroGen();
        codegen.processOpts();
        return codegen.fromModel("sample", rootSchema);
    }
}
