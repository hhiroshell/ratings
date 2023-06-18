package com.bookinfo.rataings;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ratings")
public class RatingsResource {

    @Inject
    RatingsService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{productId}")
    public Ratings greeting(int productId) {
        return service.getByProductId(productId);
    }

}
