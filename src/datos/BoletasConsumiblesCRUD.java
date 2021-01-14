package datos;

import database.TipoConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BoletasConsumiblesCRUD {

    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;

    public boolean agregar(String fecha, String hora, int idMPago, double precioFinal) {
        resp = false;
        consulta = "INSERT INTO boleta_consumibles(fecha, hora, id_mp, pago_total) VALUES(?,?,?,?)";

        try {
            ps = TC.consultaSQL(consulta);
            ps.setString(1, fecha);
            ps.setString(2, hora);
            ps.setInt(3, idMPago);
            ps.setDouble(4, precioFinal);

            if (ps.executeUpdate() > 0) {
                resp = true;
            }

            int id = 0;
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        return resp;
    }

    public boolean agregarComida(int codeFood, int cantidad) {
        resp = false;
        consulta = "SELECT MAX(id_boleta) FROM boleta_consumibles";
        int id = 0;
        boolean valor = false;
        
        try {
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MAX(id_boleta)");
                resp = true;
            }

            if (resp && id != 0) {
                String consul = "INSERT INTO lista_comida(id_boleta, id_comida, cantidad) VALUES(?,?,?)";
                ps = TC.consultaSQL(consul);
                ps.setInt(1, id);
                ps.setInt(2, codeFood);
                ps.setInt(3, cantidad);
                if (ps.executeUpdate() > 0) {
                    valor = true;
                }
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        return valor;
    }

    public boolean agregarBebida(int codeDrink, int cantidad) {
        resp = false;
        consulta = "SELECT MAX(id_boleta) FROM boleta_consumibles";
        int id = 0;
        boolean valor = false;
        
        try {
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MAX(id_boleta)");
                resp = true;
            }

            if (resp && id != 0) {
                String consul = "INSERT INTO lista_bebidas(id_boleta, id_bebida, cantidad) VALUES(?,?,?)";
                ps = TC.consultaSQL(consul);
                ps.setInt(1, id);
                ps.setInt(2, codeDrink);
                ps.setInt(3, cantidad);
                if (ps.executeUpdate() > 0) {
                    valor = true;
                }
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        return valor;
    }

    public boolean modificarPorMP(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boleta_consumibles SET id_mp = ? WHERE id_mp = ?";

        try {
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setInt(2, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }

        return resp;
    }

    public boolean eliminar(int code) {
        consulta = "DELETE FROM boleta_consumibles WHERE id_boleta = ?";
        resp = false;

        try {
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            TC.getConexion().desconectar();
        }

        return resp;
    }

    public boolean eliminarPorMPago(int code) {
        consulta = "DELETE FROM boleta_consumibles WHERE id_mp = ?";
        resp = false;

        try {
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            TC.getConexion().desconectar();
        }

        return resp;
    }
}
