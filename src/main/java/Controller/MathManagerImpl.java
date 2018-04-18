package Controller;

import.main.java.Model.*;
import Model.Alumno;
import Model.Instituto;
import Model.Operación;
import org.apache.log4j.Logger;


import java.util.*;

public class MathManagerImpl implements MathManager{

    //Declaro las variables
    private static MathManagerImpl instance = null;
    final static Logger logger = Logger.getLogger(MathManagerImpl.class);

    private Queue<Operación> ordenes;
    private List<Operación> servedOrdenes;

    //Singleton Pattern
    public static MathManagerImplgetInstance() {
        if (instance == null) instance = new MathManagerImpl();
        return instance;
    }

    //Constructor del singleton DEBE SER PRIVADO
    private ProductManagerImpl() {
        this.ordenes = new ArrayDeque<>();
        this.servedOrdenes = new ArrayList<>();
    }

    //Getters and Setters
    public Queue<Operación> getOrdenes() {
        return ordenes;
    }

    public List<Operación> getServedOrdenes() {
        return servedOrdenes;
    }


//Public functions INICIO
    //1-Realizar una operación matemática basada en la notación polaca inversa
    // (por parte de un alumno que pertenece a un instituto). Esta operación se
    // procesará más adelante (ver operación procesar una operación matemática).
    public int realizoOperacion(){
        //llamo al procesado de la operacion

        return 0;
    }

    //2-Listado de operaciones matemáticas realizadas por un instituto
    public List<Operación> getAllOpByUni(int unId) {
        logger.info("getAllOperationsByInstituto: Retreiving All institute's operations...");

        List<Operación> temp = new ArrayList<>();
        List<Operación> allop = Operación.findAll();

        Instituto instituto = Instituto.find("byUnid", unId).first();

        if (instituto != null) {
            logger.info("getAllOperationsByInstituto: Getting all ordered products from userId: "+unId);
            for(Operación o : allop) {
                if (o.getUnId() == unId)
                    temp.add(o);
            }
            logger.info("getAllServedUserOrders: Historic from userId: "+unId+" retreived");
            return temp;
        }
        else {
            logger.warn("getAllOperationsByInstituto: There is no instituto from id: "+unId);
            return temp;
        }

    }


    //3-Listado de operaciones matemáticas realizadas por un alumno
    public List<Operación> getAllOpByUs (int usid){

            logger.info("getAllOperationsByUser: Retreiving All alumn's operations...");

            List<Operación> temp = new ArrayList<>();
            List<Operación> allop = Operación.findAll();

            Alumno a = Alumno.find("byUsid", usId).first();

            if (a != null) {
                logger.info("getAllOperationsByUser: Getting all ordered products from userId: "+usId);
                for(Operación o : allop) {
                    if (o.getUsId() == usid)
                        temp.add(o);
                }
                logger.info("getAllOperationsByUser: Historic from userId: "+usId+" retreived");
                return temp;
            }
            else {
                logger.warn("getAllOperationsByUser: There is no user from id: "+uniId);
                return temp;
            }

    }



    //4-Listado de institutos ordenado (descendentemente) por número de
    // operaciones matemáticas realizadas por sus alumnos
    public List<Instituto> getAllUniByOp () {
        List<Instituto> temp = new ArrayList<>();

        return temp;
    }

}
