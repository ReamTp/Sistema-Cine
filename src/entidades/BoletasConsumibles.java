package entidades;

public class BoletasConsumibles {
    private int codigo;
    private int id_mp;
    private double precioFinal;

    public BoletasConsumibles(int codigo, int id_mp, double precioFinal) {
        this.codigo = codigo;
        this.id_mp = id_mp;
        this.precioFinal = precioFinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId_mp() {
        return id_mp;
    }

    public void setId_mp(int id_mp) {
        this.id_mp = id_mp;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
