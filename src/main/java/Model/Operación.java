package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import.main.Controller.*;

public class Operación {
    //Declaro los atributos PRIVADOS
    private int usId;
    private int unId;
    private boolean procesado = false;

    private List<LineaDeOperacion> lineaDeOperacionList = null;


    //Constructor
    public Operación (int usId, int unId) {
        this.usId = usId;
        this.unId = unId;
        this.lineaDeOperacionList = new LinkedList<lineaDeOperacionList>();
    }

    public void add (Operación operación, int usId, int unId ){
        //this.productosList.add(pd);
        //this.numDeCadaProducto.add(num);

        this.lineaDeOperacionList.add(new LineaDeOperacion(operación, usId, unId));
    }




    //Constructores (para inicializar con estas variables)
   /* public Operación(int uniId, boolean procesado, List<Alumno> alumnos) {
        this.uniId = uniId;
        this.alumnos = alumnos;
    }*/

    /*public Operación () {
        this.alumnos = new ArrayList<>();
    }*/

    //Getters and Setters


    public int getUsId() {
        return usId;
    }

    public void setUsId(int usId) {
        this.usId = usId;
    }

    public int getUnId() {
        return unId;
    }

    public void setUnId(int unId) {
        this.unId = unId;
    }

    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    public List<LineaDeOperacion> getLineaDeOperacionList() {
        return lineaDeOperacionList;
    }

    public void setLineaDeOperacionList(List<LineaDeOperacion> lineaDeOperacionList) {
        this.lineaDeOperacionList = lineaDeOperacionList;
    }
}
