package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Operación {
    //Declaro los atributos PRIVADOS
    Alumno alumno = null;
    private boolean procesado = false;

    private List<LineaDeOperacion> lineaDeOperacionList = null;

    /*private List<Alumno> alumnos;
    private int uniId;
    private int usId;*/

    //Constructor
    public Operación () {
        this.lineaDeOperacionList = new LinkedList<lineaDeOperacionList>();
    }

    public void add (Operación operación, int num ){
        //this.productosList.add(pd);
        //this.numDeCadaProducto.add(num);

        this.lp.add(new LineaDePedido(pd, num));
    }




    //Constructores (para inicializar con estas variables)
   /* public Operación(int uniId, boolean procesado, List<Alumno> alumnos) {
        this.uniId = uniId;
        this.alumnos = alumnos;
    }*/

    public Operación () {
        this.alumnos = new ArrayList<>();
    }

    //Getters and Setters


}
