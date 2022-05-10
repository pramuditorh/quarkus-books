package rh.pramudito;

import rh.pramudito.service.GreetingService;
import rh.pramudito.service.GreetingServiceImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        GreetingService greetingService = new GreetingServiceImpl();
        return greetingService.sayHello("Mac");
    }
}