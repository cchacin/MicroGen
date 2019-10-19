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

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public interface Util {

    static Set<String> extractStringSet(final Map<String, Object> additionalProperties,
                                        final String keyName) {
        Set<String> returnSet = Collections.emptySet();
        if (additionalProperties.containsKey(keyName)) {
            final Object property = additionalProperties.get(keyName);
            if (!(property instanceof Set)) {
                final String value = Objects.toString(property, "");
                if (!value.isEmpty()) {
                    returnSet = Pattern.compile("[, \t\r\n]+")
                            .splitAsStream(value)
                            .map(StringUtils::trimToNull)
                            .filter(Objects::nonNull)
                            .collect(Collectors.toSet());
                }
            }
        }
        return returnSet;
    }

    static boolean isMultipartType(final List<Map<String, String>> consumes) {

        return Optional.ofNullable(consumes.get(0))
                .flatMap(value -> Optional.of("multipart/form-data".equals(value.get(JavaClientCodegen.MEDIA_TYPE))))
                .orElse(false);
    }

}
