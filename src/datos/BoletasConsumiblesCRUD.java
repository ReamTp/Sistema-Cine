package datos;

import database.TipoConexion;
import entidades.BoletasConsumibles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BoletasConsumiblesCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean modificarPorMP(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boleta_consumibles SET id_mp = ? WHERE id_mp = ?";
        
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
        consulta = "DELETE FROM boleta_consumibles WHERE id_boleta = ?";
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
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean eliminarPorMPago(int code) {
        consulta = "DELETE FROM boleta_consumibles WHERE id_mp = ?";
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
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
}
