package org.openapitools.server.api;

import org.openapitools.server.model.Order;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface StoreApi {

    /**
     * Delete purchase order by ID For valid response try integer IDs with positive integer value.
     * Negative or non-integer values will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("store/order/{orderId}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deleteOrder(
            @javax.ws.rs.BeanParam DeleteOrderParam params) throws javax.ws.rs.WebApplicationException;

    public class DeleteOrderParam {
        @javax.ws.rs.PathParam("orderId")
        @javax.validation.constraints.Min(1)
        public Long orderId;
    }

    /**
     * Returns pet inventories by status Returns a map of status codes to quantities
     *
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("store/inventory")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getInventory()
            throws javax.ws.rs.WebApplicationException;

    /**
     * Find purchase order by ID For valid response try integer IDs with value &gt;&#x3D; 1 and
     * &lt;&#x3D; 10. Other values will generated exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("store/order/{orderId}")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getOrderById(
            @javax.ws.rs.BeanParam GetOrderByIdParam params) throws javax.ws.rs.WebApplicationException;

    public class GetOrderByIdParam {
        @javax.ws.rs.PathParam("orderId")
        @javax.validation.constraints.Min(1)
        @javax.validation.constraints.Max(10)
        public Long orderId;
    }

    /**
     * Place an order for a pet
     *
     * @param order order placed for purchasing the pet (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("store/order")
    @javax.ws.rs.Consumes({"application/json"})
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> placeOrder(
            @javax.validation.constraints.NotNull @javax.validation.Valid Order order)
            throws javax.ws.rs.WebApplicationException;
}
