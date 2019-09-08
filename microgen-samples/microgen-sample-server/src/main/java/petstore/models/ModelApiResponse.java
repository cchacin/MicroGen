package petstore.models;


/**
 * ModelApiResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class ModelApiResponse {
    
    private final java.util.OptionalInt code;
    
    
    private final String type;
    
    
    private final String message;
    

    @javax.json.bind.annotation.JsonbCreator
    public ModelApiResponse(
        @javax.json.bind.annotation.JsonbProperty("code") final java.util.OptionalInt code,
        @javax.json.bind.annotation.JsonbProperty("type") final String type,
        @javax.json.bind.annotation.JsonbProperty("message") final String message
    ) {
        this.code = code;
        this.type = type;
        this.message = message;
    }
    
    /**
 * Get code
 *
 * @return code
 */
    @javax.json.bind.annotation.JsonbProperty("code")
    public java.util.OptionalInt getCode() {
        return code;
    }

    
    /**
 * Get type
 *
 * @return type
 */
    @javax.json.bind.annotation.JsonbProperty("type")
    public String getType() {
        return type;
    }

    
    /**
 * Get message
 *
 * @return message
 */
    @javax.json.bind.annotation.JsonbProperty("message")
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelApiResponse _apiResponse = (ModelApiResponse) o;
        return java.util.Objects.equals(this.code, _apiResponse.code) &&
    java.util.Objects.equals(this.type, _apiResponse.type) &&
    java.util.Objects.equals(this.message, _apiResponse.message);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(code, type, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelApiResponse {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
        return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
