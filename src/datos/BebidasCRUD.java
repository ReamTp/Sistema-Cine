package datos;

import database.TipoConexion;
import entidades.Consumible;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BebidasCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean agregar(int codigo, String nombre, double precio){
        boolean result = false;
        consulta = "INSERT INTO bebidas(id_bebida, nombre_bebida, precio) VALUES(?,?,?)";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setDouble(3, precio);
                    
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
    
    public boolean modificar(int codigo, String nombre, double precio, int id) {
        resp = false;
        consulta = "UPDATE bebidas SET id_bebida = ?, nombre_bebida = ?, precio = ? WHERE id_bebida = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setDouble(3, precio);
            ps.setInt(4, id);
            if(ps.executeUpdate()>0){
                resp = true;;
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
        consulta = "DELETE FROM bebidas WHERE id_bebida = ?";
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
    
    public List<Consumible> mostrar(){
        List<Consumible> lista = new ArrayList();
        consulta = "SELECT * FROM bebidas";
        
        try{
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                lista.add(new Consumible(rs.getInt("id_bebida"),rs.getString("nombre_bebida"), rs.getDouble("precio")));
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
