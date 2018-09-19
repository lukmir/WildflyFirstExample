package com.wildflyfirstexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class HelloWorldResource {

    @GET
    @Path("hello")
    public String hello() {
        return "Hello world!";
    }
}
