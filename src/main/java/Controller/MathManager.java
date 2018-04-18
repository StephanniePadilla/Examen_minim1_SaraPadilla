package Controller;

import Model.Instituto;
import Model.Operación;

import java.util.List;

public interface MathManager {

    //1-Realizar una operación matemática basada en la notación polaca inversa
    // (por parte de un alumno que pertenece a un instituto). Esta operación se
    // procesará más adelante (ver operación procesar una operación matemática).
    int  ealizoOperacion();


    //2-Listado de operaciones matemáticas realizadas por un instituto
    List<Operación> getAllOpByUni(int unId);


    //3-Listado de operaciones matemáticas realizadas por un alumno
    List<Operación> getAllOpByUs (int usid);


    //4-Listado de institutos ordenado (descendentemente) por número de
    // operaciones matemáticas realizadas por sus alumnos
    List<Instituto> getAllUniByOp ();


}
