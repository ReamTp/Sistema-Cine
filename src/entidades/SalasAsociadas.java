package entidades;

public class SalasAsociadas {
    private int codigoPeli;
    private int codigoSala;

    public SalasAsociadas(int codigoPeli, int codigoSala) {
        this.codigoPeli = codigoPeli;
        this.codigoSala = codigoSala;
    }

    public int getCodigoPeli() {
        return codigoPeli;
    }

    public void setCodigoPeli(int codigoPeli) {
        this.codigoPeli = codigoPeli;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }
}
