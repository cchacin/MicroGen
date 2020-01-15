package org.openapitools.server.model;

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
