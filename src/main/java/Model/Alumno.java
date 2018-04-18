package Model;

import java.util.LinkedList;
import java.util.List;

public class Alumno {
    //Declaro los atributos PRIVADOS
    private static int num = 0;     //Cantidad de alumnos
    private int usid;
    private String username;

    private List<Operación> operacionAlumnoList = new LinkedList<Operación>();//Operaciones de cada alumno

    //Constructores (para inicializar con estas variables)
    public Alumno () {//contructor para el POST
    }

    public Alumno(String username) {
        this.usid = ++num;
        this.username = username;
    }

    //Getters and Setters
    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Alumno.num = num;
    }

    public int getUsid() {
        return usid;
    }

    public void setUsid(int usid) {
        this.usid = usid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setOperacionAlumnoList(List<Operación> operacionAlumnoList) {
        this.operacionAlumnoList = operacionAlumnoList;
    }

    public List<Operación> getOperacionAlumnoList() {
        return operacionAlumnoList;
    }
}
