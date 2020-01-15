package org.openapitools.server.model;

public class PersonCardTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<PersonCard, ImmutablePersonCard> {

    @Override
    public ImmutablePersonCard adaptToJson(PersonCard obj) throws Exception {
        return ImmutablePersonCard.copyOf(obj);
    }

    @Override
    public PersonCard adaptFromJson(ImmutablePersonCard obj) throws Exception {
        return obj;
    }
}
