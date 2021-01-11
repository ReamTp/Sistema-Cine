package datos;

import database.TipoConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ComprobarLogin {
    private ResultSet rs;
    private final TipoConexion tc = new TipoConexion();
    int tipo;
    
    public int revisarUsuario(String correo, String contra){
        PreparedStatement ps;
        try{
            ps = tc.consultaSQL("SELECT id_tipo_user FROM usuarios WHERE correo = ? AND contra = ?");
            ps.setString(1, correo);
            ps.setString(2, contra);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipo = rs.getInt("id_tipo_user");
            }
            ps.close();
            rs.close();
            tc.desconectar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return tipo;
    }
    
    public String obtenerNombre(String correo, String password){
        String name = "";
        PreparedStatement ps;
        try{
            ps = tc.consultaSQL("SELECT nombre_user FROM usuarios WHERE correo = ? AND contra = ?");
            ps.setString(1, correo);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString("nombre_user");
            }
            ps.close();
            rs.close();
            tc.desconectar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return name;
    }
}
