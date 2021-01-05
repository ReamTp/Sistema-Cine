package entidades;

public class Movies {
    private int codigo;
    private String nombre;
    private double duracion;
    private int idCategoria;
    private String descripcion;
    private int idHora;

    public Movies(int codigo, String nombre, double duracion, int idCategoria, String descripcion, int idHora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.idHora = idHora;
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdHora() {
        return idHora;
    }

    public void setIdHora(int idHora) {
        this.idHora = idHora;
    }
}
