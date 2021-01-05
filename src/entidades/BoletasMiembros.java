package entidades;

public class BoletasMiembros {
    private int codigo;
    private String nombreMiembro;
    private int idTipoDoc;
    private int numDoc;
    private int idMovie;
    private int idRoom;
    private int idMPago;
    private double preciofinal;

    public BoletasMiembros(int codigo, String nombreMiembro, int idTipoDoc, int numDoc, int idMovie, int idRoom, int idMPago, double preciofinal) {
        this.codigo = codigo;
        this.nombreMiembro = nombreMiembro;
        this.idTipoDoc = idTipoDoc;
        this.numDoc = numDoc;
        this.idMovie = idMovie;
        this.idRoom = idRoom;
        this.idMPago = idMPago;
        this.preciofinal = preciofinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreMiembro() {
        return nombreMiembro;
    }

    public void setNombreMiembro(String nombreMiembro) {
        this.nombreMiembro = nombreMiembro;
    }

    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getIdMPago() {
        return idMPago;
    }

    public void setIdMPago(int idMPago) {
        this.idMPago = idMPago;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }
}
