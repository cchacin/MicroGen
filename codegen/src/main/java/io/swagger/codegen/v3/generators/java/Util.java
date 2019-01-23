package io.swagger.codegen.v3.generators.java;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static io.swagger.codegen.v3.generators.java.JavaClientCodegen.MEDIA_TYPE;

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
                       .flatMap(value -> Optional.of("multipart/form-data".equals(value.get(MEDIA_TYPE))))
                       .orElse(false);
    }

}
