package datos;

import database.TipoConexion;
import entidades.TDocumentos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TDocumentosCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean agregar(int codigo, String nombre){
        boolean result = false;
        consulta = "INSERT INTO tipo_documentos(id_tipo_doc, nombre_type_doc) VALUES(?,?)";
        
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
    
    public List<TDocumentos> mostrar(){
        List<TDocumentos> lista = new ArrayList();
        consulta = "SELECT * FROM tipo_documentos";
        
        try{
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                lista.add(new TDocumentos(rs.getInt("id_tipo_doc"),rs.getString("nombre_type_doc")));
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
