package Controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import Model.*;

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

    //1-Realizar una operación matemática basada en la notación polaca inversa
    // (por parte de un alumno que pertenece a un instituto). Esta operación se
    // procesará más adelante (ver operación procesar una operación matemática).
    @GET
    @Path("/realizoLaOperacion")
    @Produces(MediaType.APPLICATION_JSON)
    public int realizoLaOperacion() {
        return getInstance().realizoOperacion();
    }

    //2-Listado de operaciones matemáticas realizadas por un instituto
    @GET
    @Path("/getAllTheOpByUni")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Operación> getAllTheOpByUni() {
        return getInstance().getAllOpByUni;
    }

    //3-Listado de operaciones matemáticas realizadas por un alumno
    @GET
    @Path("/getAllTheOpByUs")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Operación> getAllTheOpByUs() {
        return getInstance().getAllOpByUs;
    }

    //4-Listado de institutos ordenado (descendentemente) por número de
    // operaciones matemáticas realizadas por sus alumnos
    @GET
    @Path("/getAllTheUniByOp")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Operación> getAllTheUniByOp() {
        return getInstance().getAllUniByOp;
    }

}

