package org.openapitools.server.model;

@javax.ws.rs.ext.Provider
public class BaseCardTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<BaseCard, ImmutableBaseCard> {

    @Override
    public ImmutableBaseCard adaptToJson(BaseCard obj) throws Exception {
        return ImmutableBaseCard.copyOf(obj);
    }

    @Override
    public BaseCard adaptFromJson(ImmutableBaseCard obj) throws Exception {
        return obj;
    }
}
