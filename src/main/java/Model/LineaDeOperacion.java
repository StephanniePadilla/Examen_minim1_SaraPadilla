package Model;

public class LineaDeOperacion {
    private int num;
    private Operación operaciónclass;

    protected LineaDePedido() {

    }

    protected LineaDePedido(Operación operaciónclass, int num) {
        this.operaciónclass = operaciónclass;
        this.num = num;
    }

    //Getters & Setters

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Operación getOperaciónclass() {
        return operaciónclass;
    }

    public void setOperaciónclass(Operación operaciónclass) {
        this.operaciónclass = operaciónclass;
    }
}
