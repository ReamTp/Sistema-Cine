package entidades;

public class BoletasClientes {
    private int boleta;
    private String nombreCliente;
    private int idTipoDoc;
    private int numDoc;
    private int idMovie;
    private int idRoom;
    private int idMPago;
    private double precioFinal;

    public BoletasClientes(int boleta, String nombreCliente, int idTipoDoc, int numDoc, int idMovie, int idRoom, int idMPago, double precioFinal) {
        this.boleta = boleta;
        this.nombreCliente = nombreCliente;
        this.idTipoDoc = idTipoDoc;
        this.numDoc = numDoc;
        this.idMovie = idMovie;
        this.idRoom = idRoom;
        this.idMPago = idMPago;
        this.precioFinal = precioFinal;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
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

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
