package entidades;

public class TDocumentos {
    private int codigo;
    private String name;

    public TDocumentos(int codigo, String name) {
        this.codigo = codigo;
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
