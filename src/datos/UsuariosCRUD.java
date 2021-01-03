package datos;

import database.TipoConexion;
import entidades.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuariosCRUD{
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean agregar(int codigo, String nombre, int tipoDoc, int numDoc, String correo, String contra, int tipoUser) {
        boolean result = false;
        consulta = "INSERT INTO usuarios(id_user, nombre_user, id_tipo_doc, numero_doc, correo, contra, id_tipo_user) VALUES(?,?,?,?,?,?,?)";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, tipoDoc);
            ps.setInt(4, numDoc);
            ps.setString(5, correo);
            ps.setString(6, contra);
            ps.setInt(7, tipoUser);
                    
            if(ps.executeUpdate()>0){
                result = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        return result;
    }

    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Usuarios> mostrar(){
        List<Usuarios> lista = new ArrayList();
        consulta = "SELECT * FROM usuarios";
        
        try{
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                lista.add(new Usuarios(rs.getInt("id_user"),rs.getString("nombre_user"),rs.getInt("id_tipo_doc"),rs.getInt("numero_doc"),rs.getString("correo"),rs.getString("contra"),rs.getInt("id_tipo_user")));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        return lista;
    }
}
