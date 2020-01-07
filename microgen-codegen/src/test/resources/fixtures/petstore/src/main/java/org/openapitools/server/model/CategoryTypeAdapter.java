package org.openapitools.server.model;

@javax.ws.rs.ext.Provider
public class CategoryTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<Category, ImmutableCategory> {

    @Override
    public ImmutableCategory adaptToJson(Category obj) throws Exception {
        return ImmutableCategory.copyOf(obj);
    }

    @Override
    public Category adaptFromJson(ImmutableCategory obj) throws Exception {
        return obj;
    }
}
