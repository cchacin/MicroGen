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
