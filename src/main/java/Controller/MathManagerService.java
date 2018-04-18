package Controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static main.java.Controller.MathManagerImpl.*;

@Path("/service")
@Singleton

public class MathManagerService {

    public MathManagerService(){
        //inicializo las variables
    }


    //Testing purposes "/products"
    @GET
    @Path("/Hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

}

