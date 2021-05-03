package com.jakartastartjavaclasses.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class JerseyApplicationConfig extends ResourceConfig {

    public JerseyApplicationConfig() {

        // register(JerseyController.class);
        // packages("com.resttest.api");

    }
}
