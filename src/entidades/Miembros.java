package entidades;

public class Miembros {
    private int codigo;
    private String nombre;
    private int tipoDoc;
    private int numeroDoc;

    public Miembros(int codigo, String nombre, int tipoDoc, int numeroDoc) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(int tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(int numeroDoc) {
        this.numeroDoc = numeroDoc;
    }
}
