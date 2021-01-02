package datos;

import database.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ComprobarLogin {
    private PreparedStatement ps;
    private ResultSet rs;
    private final Conexion CON;
    int tipo;
    
    public ComprobarLogin(){
        this.CON = Conexion.getInstancia();
    }
    
    public int revisarUsuarioMySQL(String correo, String password){
        try{
            ps = CON.conectarMySQL().prepareCall("SELECT id_tipo_user FROM usuarios WHERE correo = ? AND contra = ?");
            ps.setString(1, correo);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipo = rs.getInt("id_tipo_user");
            }
            
            System.out.println(tipo);
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return tipo;
    }
    
    public String obtenerNombreMySQL(String correo, String password){
        String name = "";
        try{
            ps = CON.conectarMySQL().prepareCall("SELECT nombre_user FROM usuarios WHERE correo = ? AND contra = ?");
            ps.setString(1, correo);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString("nombre_user");
            }
            
            System.out.println(name);
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return name;
    }
    
    public int revisarUsuarioOracle(String correo, String password){
        try{
            ps = CON.conectarOracle().prepareCall("SELECT id_tipo_user FROM usuarios WHERE correo = ? AND contra = ?");
            ps.setString(1, correo);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipo = rs.getInt("id_tipo_user");
            }
            
            System.out.println(tipo);
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return tipo;
    }
    
    public String obtenerNombreOracle(String correo, String password){
        String name = "";
        try{
            ps = CON.conectarOracle().prepareCall("SELECT nombre_user FROM usuarios WHERE correo = ? AND contra = ?");
            ps.setString(1, correo);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString("nombre_user");
            }
            
            System.out.println(name);
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return name;
    }
}
