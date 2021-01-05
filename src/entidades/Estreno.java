package entidades;

public class Estreno {
    private int codigoPeli;
    private String fecha;

    public Estreno(int codigoPeli, String fecha) {
        this.codigoPeli = codigoPeli;
        this.fecha = fecha;
    }

    public int getCodigoPeli() {
        return codigoPeli;
    }

    public void setCodigoPeli(int codigoPeli) {
        this.codigoPeli = codigoPeli;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
