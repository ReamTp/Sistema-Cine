package datos;

import database.TipoConexion;
import entidades.TUsuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TUsuariosCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean agregar(int codigo, String nombre){
        boolean result = false;
        consulta = "INSERT INTO tipo_usuarios(id_miembro, nombre_member) VALUES(?,?)";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
                    
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
    
    public List<TUsuarios> mostrar(){
        List<TUsuarios> lista = new ArrayList();
        consulta = "SELECT * FROM tipo_usuarios";
        
        try{
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                lista.add(new TUsuarios(rs.getInt("id_tipo_user"),rs.getString("nombre_type_user")));
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
