package entidades;

public class ListDrink {
    private int codeBoleta;
    private int codeBebida;
    private int cantidad;

    public ListDrink(int codeBoleta, int codeBebida, int cantidad) {
        this.codeBoleta = codeBoleta;
        this.codeBebida = codeBebida;
        this.cantidad = cantidad;
    }

    public int getCodeBoleta() {
        return codeBoleta;
    }

    public void setCodeBoleta(int codeBoleta) {
        this.codeBoleta = codeBoleta;
    }

    public int getCodeBebida() {
        return codeBebida;
    }

    public void setCodeBebida(int codeBebida) {
        this.codeBebida = codeBebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
