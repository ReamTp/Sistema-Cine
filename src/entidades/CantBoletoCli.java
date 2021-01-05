package entidades;

public class CantBoletoCli {
    private int codeBoleta;
    private int cantBNiños;
    private int cantBAdultos;

    public CantBoletoCli(int codeBoleta, int cantBNiños, int cantBAdultos) {
        this.codeBoleta = codeBoleta;
        this.cantBNiños = cantBNiños;
        this.cantBAdultos = cantBAdultos;
    }

    public int getCodeBoleta() {
        return codeBoleta;
    }

    public void setCodeBoleta(int codeBoleta) {
        this.codeBoleta = codeBoleta;
    }

    public int getCantBNiños() {
        return cantBNiños;
    }

    public void setCantBNiños(int cantBNiños) {
        this.cantBNiños = cantBNiños;
    }

    public int getCantBAdultos() {
        return cantBAdultos;
    }

    public void setCantBAdultos(int cantBAdultos) {
        this.cantBAdultos = cantBAdultos;
    }
}
