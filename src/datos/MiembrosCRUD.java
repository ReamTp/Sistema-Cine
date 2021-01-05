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
    private BoletasMiembrosCRUD bmc = new BoletasMiembrosCRUD();
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
    
    public boolean modificar(int codigo, String nombre, int tipoDoc, int numDoc, int id) {
        resp = false;
        consulta = "UPDATE miembros SET id_miembro = ?, nombre_member = ?, id_tipo_doc = ?, num_doc = ? WHERE id_miembro = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, tipoDoc);
            ps.setInt(4, numDoc);
            ps.setInt(5, id);
            if(ps.executeUpdate()>0){
                resp = true;
                bmc.modificarPorMiembros(codigo, id);
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean modificarPorTDoc(int codigo, int id) {
        resp = false;
        consulta = "UPDATE miembros SET id_tipo_doc = ? WHERE id_tipo_doc = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setInt(2, id);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }

    public boolean eliminar(int code) {
        consulta = "DELETE FROM miembros WHERE id_miembro = ?";
        resp = false;
        bmc.eliminarPorMiembro(code);
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean eliminarPorTDoc(int code) {
        consulta = "DELETE FROM miembros WHERE id_tipo_doc = ?";
        resp = false;
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
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
