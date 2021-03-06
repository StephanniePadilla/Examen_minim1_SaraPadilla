package Model;

import java.util.LinkedList;
import java.util.List;

public class Instituto {

    //Declaro los atributos PRIVADOS
    private static int num = 0;     //Cantidad de institutos
    private int unid;
    private String uniname;

    private List<Operación> operacionUniList = new LinkedList<Operación>();//Operaciones de cada alumno


    //Constructores (para inicializar con estas variables)
    public Instituto () {//contructor para el POST
    }

    public Instituto(String uniname) {
        this.unid = ++num;
        this.uniname = uniname;
    }

    //Getters and Setters
    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Instituto.num = num;
    }

    public int getUnid() {
        return unid;
    }

    public void setUnid(int unid) {
        this.unid = unid;
    }

    public String getUniname() {
        return uniname;
    }

    public void setUniname(String uniname) {
        this.uniname = uniname;
    }

    public void setOperacionUniList(List<Operación> operacionUniList) {
        this.operacionUniList = operacionUniList;
    }

    public List<Operación> getOperacionUniList() {
        return operacionUniList;
    }
}
