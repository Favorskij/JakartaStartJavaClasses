package com.jakartastartjavaclasses.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class JerseyController {

    @GET
    @Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
    public String hello() {
        return "Привет мир!!!";
    }

}
