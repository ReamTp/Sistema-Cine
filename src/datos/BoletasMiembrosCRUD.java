package datos;

import database.TipoConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BoletasMiembrosCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean combrobarMember(int id){
        resp = false;
        consulta = "SELECT id_miembro FROM miembros WHERE id_miembro = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                resp = true;
            }else{
                JOptionPane.showMessageDialog(null, "El Miembro no existe");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean agregar(String fecha, String hora, int idMember, int idPeli, double totalPagar, double discount, int idMPago, double precioFinal, int cantAdult, int cantBoy){
        boolean valor = false;
        resp = false;
        consulta = "INSERT INTO boletos_miembros(fecha, hora, id_miembro, id_peli, total_pagar, descuento, id_mp, precio_final) VALUES(?,?,?,?,?,?,?,?)";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setString(1, fecha);
            ps.setString(2, hora);
            ps.setInt(3, idMember);
            ps.setInt(4, idPeli);
            ps.setDouble(5, totalPagar);
            ps.setDouble(6, discount);
            ps.setInt(7, idMPago);
            ps.setDouble(8, precioFinal);
            
            if(ps.executeUpdate()>0){
                resp = true;
            }
            
            int id = 0;
            if(resp){
                boolean res = false;
                String consult = "SELECT MAX(id_boleto) FROM boletos_miembros";
                ps = TC.consultaSQL(consult);
                rs = ps.executeQuery();
                if(rs.next()){
                    id = rs.getInt("MAX(id_boleto)");
                    res = true;
                }
                if(res && id != 0){
                    String consul = "INSERT INTO cant_bol_mie(id_boleto, cant_bol_adultos, cant_bol_niños) VALUES(?,?,?)";
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
        consulta = "UPDATE boletos_miembros SET id_mp = ? WHERE id_mp = ?";
        
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
    
    public boolean modificarPorMiembros(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boletos_miembros SET id_miembro = ? WHERE id_miembro = ?";
        
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
        consulta = "UPDATE boletos_miembros SET id_peli = ? WHERE id_peli = ?";
        
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
        consulta = "DELETE FROM boletos_miembros WHERE id_boleto = ?";
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
    
    public boolean eliminarPorMiembro(int code) {
        consulta = "DELETE FROM boletos_miembros WHERE id_miembro = ?";
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
        consulta = "DELETE FROM boletos_miembros WHERE id_peli = ?";
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
        consulta = "DELETE FROM boletos_miembros WHERE id_mp = ?";
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
