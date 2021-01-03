package entidades;

public class Usuarios {
    private int codigo;
    private String nombre;
    private int tipoDoc;
    private int numeroDoc;
    private String correo;
    private String pass;
    private int tipoUser;

    public Usuarios(int codigo, String nombre, int tipoDoc, int numeroDoc, String correo, String pass, int tipoUser) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.correo = correo;
        this.pass = pass;
        this.tipoUser = tipoUser;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(int tipoUser) {
        this.tipoUser = tipoUser;
    }
}
