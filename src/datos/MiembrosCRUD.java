package datos;

import database.TipoConexion;
import entidades.Miembros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MiembrosCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean agregar(int codigo, String nombre, int tipoDoc, int numDoc){
        boolean result = false;
        consulta = "INSERT INTO miembros(id_miembro, nombre_member, id_tipo_doc, num_doc) VALUES(?,?,?,?)";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, tipoDoc);
            ps.setInt(4, numDoc);
                    
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
    
    public List<Miembros> mostrar(){
        List<Miembros> lista = new ArrayList();
        consulta = "SELECT * FROM miembros";
        
        try{
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                lista.add(new Miembros(rs.getInt("id_miembro"),rs.getString("nombre_member"),rs.getInt("id_tipo_doc"),rs.getInt("num_doc")));
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
