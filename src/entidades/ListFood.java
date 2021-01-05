package entidades;

public class ListFood {
    private int codeBoleta;
    private int codeComida;
    private int cantidad;

    public ListFood(int codeBoleta, int codeComida, int cantidad) {
        this.codeBoleta = codeBoleta;
        this.codeComida = codeComida;
        this.cantidad = cantidad;
    }

    public int getCodeBoleta() {
        return codeBoleta;
    }

    public void setCodeBoleta(int codeBoleta) {
        this.codeBoleta = codeBoleta;
    }

    public int getCodeComida() {
        return codeComida;
    }

    public void setCodeComida(int codeComida) {
        this.codeComida = codeComida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
