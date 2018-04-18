package Model;

public class LineaDeOperacion {
    private static int num = 0; //numero de operaciones en la linea de operacion
    private int linopid;
    private Operación operaciónclass;

    protected LineaDePedido() {

    }

    protected LineaDePedido(Operación operaciónclass) {
        this.linopid = ++num;
        this.operaciónclass = operaciónclass;
    }

    //Getters & Setters
    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        LineaDeOperacion.num = num;
    }

    public int getLinopid() {
        return linopid;
    }

    public void setLinopid(int linopid) {
        this.linopid = linopid;
    }

    public Operación getOperaciónclass() {
        return operaciónclass;
    }

    public void setOperaciónclass(Operación operaciónclass) {
        this.operaciónclass = operaciónclass;
    }
}
