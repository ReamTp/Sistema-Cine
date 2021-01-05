package datos;

import database.TipoConexion;
import entidades.SalasAsociadas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SalasAsociadasCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean asociar(int codigoPeli, int codigoSala){
        boolean result = false;
        consulta = "INSERT INTO sala_peliculas(id_peli, id_sala) VALUES(?,?)";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigoPeli);
            ps.setInt(2, codigoSala);
                    
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
    
    public boolean modificar(int codigoPeli, int codigoSala, int id) {
        resp = false;
        consulta = "UPDATE sala_peliculas SET id_peli = ?, id_sala = ? WHERE id_peli = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigoPeli);
            ps.setInt(2, codigoSala);
            ps.setInt(3, id);
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
    
    public boolean desasociar(int code) {
        consulta = "DELETE FROM sala_peliculas WHERE id_peli = ?";
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
    
    public List<SalasAsociadas> mostrar(){
        List<SalasAsociadas> lista = new ArrayList();
        consulta = "SELECT * FROM sala_peliculas";
        
        try{
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                lista.add(new SalasAsociadas(rs.getInt("id_peli"), rs.getInt("id_sala")));
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
