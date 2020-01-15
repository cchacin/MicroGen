package myservice;

import java.util.Optional;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.ws.rs.ext.ContextResolver;

@javax.ws.rs.ext.Provider
public class JSONConfiguration implements ContextResolver<Jsonb> {
    private Jsonb jsonb;

    @Override
    public Jsonb getContext(final Class type) {
        return Optional.ofNullable(this.jsonb).orElseGet(this::createJsonb);
    }

    private Jsonb createJsonb() {
        final JsonbConfig config = new JsonbConfig()
            .withAdapters(
                // Register the adapters here
            );
        this.jsonb = JsonbBuilder.newBuilder()
                                 .withConfig(config)
                                 .build();
        return this.jsonb;
    }
}
