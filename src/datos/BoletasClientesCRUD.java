package datos;

import database.TipoConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BoletasClientesCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean agregar(String fecha, String hora, String name, int TDoc, int NDoc, int idPeli,  int idMPago, double precioFinal, int cantAdult, int cantBoy){
        boolean valor = false;
        resp = false;
        consulta = "INSERT INTO boletos_clientes(fecha, hora, nombre_cli, id_tipo_doc, num_doc, id_peli, id_mp, precio_final) VALUES(?,?,?,?,?,?,?,?)";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setString(1, fecha);
            ps.setString(2, hora);
            ps.setString(3, name);
            ps.setInt(4, TDoc);
            ps.setInt(5, NDoc);
            ps.setInt(6, idPeli);
            ps.setInt(7, idMPago);
            ps.setDouble(8, precioFinal);
            
            if(ps.executeUpdate()>0){
                resp = true;
            }
            
            int id = 0;
            if(resp){
                boolean res = false;
                String consult = "SELECT MAX(id_boleto) FROM boletos_clientes";
                ps = TC.consultaSQL(consult);
                rs = ps.executeQuery();
                if(rs.next()){
                    id = rs.getInt("MAX(id_boleto)");
                    res = true;
                }
                System.out.println("Hola estes es el id");
                System.out.println(id);
                if(res && id != 0){
                    String consul = "INSERT INTO cant_bol_cli(id_boleto, cant_bol_adultos, cant_bol_niños) VALUES(?,?,?)";
                    ps = TC.consultaSQL(consul);
                    ps.setInt(1, id);
                    ps.setInt(2, cantAdult);
                    ps.setInt(3, cantBoy);
                    if(ps.executeUpdate()>0){
                        valor = true;
                    }
                }
            }
            
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        return valor;
    }
    
    public boolean modificarPorMP(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boletos_clientes SET id_mp = ? WHERE id_mp = ?";
        
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
    
    public boolean modificarPorTDoc(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boletos_clientes SET id_tipo_doc = ? WHERE id_tipo_doc = ?";
        
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
    
    public boolean modificarPorPeli(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boletos_clientes SET id_peli = ? WHERE id_peli = ?";
        
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
        consulta = "DELETE FROM boletos_clientes WHERE id_boleto = ?";
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
    
    public boolean eliminarPorTDoc(int code) {
        consulta = "DELETE FROM boletos_clientes WHERE id_tipo_doc = ?";
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
    
    public boolean eliminarPorPeli(int code) {
        consulta = "DELETE FROM boletos_clientes WHERE id_peli = ?";
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
        consulta = "DELETE FROM boletos_clientes WHERE id_mp = ?";
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
