package org.openapitools.server.model;

@javax.ws.rs.ext.Provider
public class OrderTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<Order, ImmutableOrder> {

    @Override
    public ImmutableOrder adaptToJson(Order obj) throws Exception {
        return ImmutableOrder.copyOf(obj);
    }

    @Override
    public Order adaptFromJson(ImmutableOrder obj) throws Exception {
        return obj;
    }
}
