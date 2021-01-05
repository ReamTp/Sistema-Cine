package entidades;

public class Horarios {
    private int codigo;
    private String hora;

    public Horarios(int codigo, String hora) {
        this.codigo = codigo;
        this.hora = hora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
