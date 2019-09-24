[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com)

[![forthebadge](https://forthebadge.com/images/badges/approved-by-george-costanza.svg)](https://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/contains-technical-debt.svg)](https://forthebadge.com)
# MicroGen => μGen => /ˈmaɪ.kɹoʊdʒən/
![Java CI](https://github.com/cchacin/MicroGen/workflows/Java%20CI/badge.svg)
![Greetings](https://github.com/cchacin/MicroGen/workflows/Greetings/badge.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.microgen/MicroGen/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.microgen/MicroGen)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=square)](http://makeapullrequest.com)

## An OpenAPI Spec Generator for Eclipse JakartaEE + Eclipse MicroProfile

![Eclipse MicroProfile logo](images/microprofile-logo.png)
![Eclipse JakartaEE logo](images/jakartaee-logo.png)

### Features

Given an OpenAPI Spec file, we are generating for you all of the following:

```yaml
openapi: 3.0.0
info:
  description: This is a sample server Petstore server.
  version: 1.0.0
  title: Swagger Petstore
tags:
  - name: pet
    description: Everything about your Pets
paths:
  /pet:
    post:
      tags:
        - pet
      summary: Add a new pet to the store
      description: ''
      operationId: addPet
      responses:
        '405':
          description: Invalid input
      security:
        - petstore_auth:
            - 'write:pets'
            - 'read:pets'
      requestBody:
        $ref: '#/components/requestBodies/Pet'
components:
  requestBodies:
    Pet:
      content:
        application/json:
          schema:
            $ref: '#/components/schemas/Pet'
        application/xml:
          schema:
            $ref: '#/components/schemas/Pet'
      description: Pet object that needs to be added to the store
      required: true
  schemas:
    Pet:
      type: object
      required:
        - name
        - photoUrls
      properties:
        id:
          type: integer
          format: int64
        category:
          $ref: '#/components/schemas/Category'
        name:
          type: string
          example: doggie
        photoUrls:
          type: array
          items:
            type: string
        tags:
          type: array
          items:
            $ref: '#/components/schemas/Tag'
        status:
          type: string
          description: pet status in the store
          enum:
            - available
            - pending
            - sold
```

#### Server API Contract (JAX-RS)
- JAX-RS interface with all the annotations necessary annotations

```java
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface PetApi {
  /**
   * Add a new pet to the store
   *
   * @param pet Pet object that needs to be added to the store (required)
   * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
   */
  @javax.ws.rs.POST
  @javax.ws.rs.Path("pet")
  @javax.ws.rs.Consumes({"application/json", "application/xml"})
  java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addPet(
          @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet
  ) throws javax.ws.rs.WebApplicationException;
  .
  .
  .
}
```

- `@BeanParams` wrapper class to minimize the breaking changes in the Java API contract, this includes not only the parameters defined in the OpenAPI spec but also `@HttpHeaders` and `@UriInfo`:

```java
public class AddPetParams {
    @javax.ws.rs.core.Context
    public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

    public AddPetParams coreHttpHeaders(
            final javax.ws.rs.core.HttpHeaders coreHttpHeaders
    ) {
        this.coreHttpHeaders = coreHttpHeaders;
        return this;
    }

    @javax.ws.rs.core.Context
    public javax.ws.rs.core.UriInfo coreUriInfo;

    public AddPetParams coreUriInfo(
            final javax.ws.rs.core.UriInfo coreUriInfo
    ) {
        this.coreUriInfo = coreUriInfo;
        return this;
    }
}
```

- Request and Response objects:
  - Ctor including all fields and `Jsonb` annotations

  ```java
  /**
   * Pet
   */
  @javax.json.bind.annotation.JsonbPropertyOrder({
    Pet.JSON_PROPERTY_ID,
    Pet.JSON_PROPERTY_CATEGORY,
    Pet.JSON_PROPERTY_NAME,
    Pet.JSON_PROPERTY_PHOTO_URLS,
    Pet.JSON_PROPERTY_TAGS,
    Pet.JSON_PROPERTY_STATUS
  })
  @javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
  public final class Pet {
      private final java.util.OptionalLong id;
      public static final String JSON_PROPERTY_ID = "id";

      @javax.validation.Valid
      private final java.util.Optional<Category> category;
      public static final String JSON_PROPERTY_CATEGORY = "category";

      @javax.validation.constraints.NotNull
      private final String name;
      public static final String JSON_PROPERTY_NAME = "name";

      @javax.validation.constraints.NotNull
      private final java.util.List<String> photoUrls;
      public static final String JSON_PROPERTY_PHOTO_URLS = "photoUrls";

      @javax.validation.Valid
      private final java.util.Optional<java.util.List<Tag>> tags;
      public static final String JSON_PROPERTY_TAGS = "tags";

      private final StatusEnum status;
      public static final String JSON_PROPERTY_STATUS = "status";

      @javax.json.bind.annotation.JsonbCreator
      public Pet(
          @javax.json.bind.annotation.JsonbProperty("id")
          final java.util.OptionalLong id,
          @javax.json.bind.annotation.JsonbProperty("category")
          final java.util.Optional<Category> category,
          @javax.json.bind.annotation.JsonbProperty("name")
          final String name,
          @javax.json.bind.annotation.JsonbProperty("photoUrls")
          final java.util.List<String> photoUrls,
          @javax.json.bind.annotation.JsonbProperty("tags")
          final java.util.Optional<java.util.List<Tag>> tags,
          @javax.json.bind.annotation.JsonbProperty("status")
          final StatusEnum status
    ) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    // getter omitted
    // more details explained below
  }
  ```

  - Inner static factory builder to make easier the instantiation:

  ```java
  public static Builder builder() {
      return Builder.create();
  }

  public static final class Builder {
      private java.util.OptionalLong                  id;
      private java.util.Optional<Category>            category;
      private String                                  name;
      private java.util.List<String>                  photoUrls;
      private java.util.Optional<java.util.List<Tag>> tags;
      private StatusEnum                              status;

      private Builder() {
      }

      public static Builder create() {
          return new Builder();
      }

      public Builder setId(final java.util.OptionalLong id) {
          this.id = id;
          return this;
      }
      // more info omitted
    }
  ```

  - Enumerations:

  ```java
  @javax.json.bind.annotation.JsonbTypeSerializer(Pet.StatusEnumSerializer.class)
  @javax.json.bind.annotation.JsonbTypeDeserializer(Pet.StatusEnumDeserializer.class)
  public static enum StatusEnum {

      AVAILABLE("available"),
      PENDING("pending"),
      SOLD("sold");

      private final String value;

      StatusEnum(final String value) {
          this.value = value;
      }

      public String getValue() {
          return this.value;
      }

      @Override
      public String toString() {
          return String.valueOf(this.value);
      }

      @javax.json.bind.annotation.JsonbCreator
      public static StatusEnum fromValue(final String text) {
          return java.util.Arrays.stream(StatusEnum.values())
                                 .filter(b -> java.util.Objects.equals(String.valueOf(b.value), text))
                                 .findFirst()
                                 .orElse(null);
      }
  }
  ```

  - Enum's `Jsonb` Serializers/Deserializer

  ```java
  public static class StatusEnumSerializer implements javax.json.bind.serializer.JsonbSerializer<StatusEnum> {

      public StatusEnumSerializer() { }

      @Override
      public void serialize(
              StatusEnum aEnum,
              javax.json.stream.JsonGenerator jsonGenerator,
              javax.json.bind.serializer.SerializationContext serializationContext) {
          jsonGenerator.write(aEnum.value);
      }
  }

  public static class StatusEnumDeserializer implements javax.json.bind.serializer.JsonbDeserializer<StatusEnum> {

      public StatusEnumDeserializer() {}

      @Override
      public StatusEnum deserialize(
              javax.json.stream.JsonParser jsonParser,
              javax.json.bind.serializer.DeserializationContext deserializationContext,
              java.lang.reflect.Type type) {
          return StatusEnum.fromValue(jsonParser.getString());
      }
  }
  ```

### Using MicroGen with the Maven Archetype

Execute this command

```bash
$ mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=example \
    -DarchetypeGroupId=io.microgen \
    -DarchetypeArtifactId=microgen-archetype
```

Check what is created

```bash
$ cd example && tree . --dirsfirst
example
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── JAXRSConfiguration.java
│       ├── resources
│       │   └── META-INF
│       │       ├── microprofile-config.properties
│       │       └── openapi.yml
│       └── webapp
│           └── WEB-INF
│               └── beans.xml
├── Dockerfile
├── README.md
├── mvnw
├── mvnw.cmd
└── pom.xml

9 directories, 9 files
```

Implement the JAX-RS API contract

```java
@Path("v1")
@ApplicationScoped
public class PetResource implements PetApi {

    @Override
    public CompletionStage<Response> addPet(Pet pet) throws WebApplicationException {
        return CompletableFuture.completedFuture(
                Response.noContent().build()
        );
    }

    @Override
    public CompletionStage<Response> getPetById(GetPetByIdParams params) throws WebApplicationException {
        return CompletableFuture.completedFuture(
                Response.ok(
                        Pet.builder()
                           .setId(OptionalLong.of(1))
                           .setName("pet")
                           .build()
                ).build()
        );
    }
```

Run and enjoy

```bash
$ ./mvnw clean install
```

```bash
$ docker rm -f example || true && docker run -d -p 9080:9080 --name example com.example/example:1.0-SNAPSHOT
```

```bash
$ curl -s -X GET -H "Accept: application/json" http://localhost:9080/api/v1/pet/1 | jq .
{
  "category": {
    "id": 1,
    "name": ""
  },
  "id": 1,
  "name": "name",
  "status": "available"
}
```
