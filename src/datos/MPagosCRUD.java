package datos;

import database.TipoConexion;
import entidades.MPagos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MPagosCRUD {
    private final TipoConexion TC = new TipoConexion();
    private final BoletasClientesCRUD bcc = new BoletasClientesCRUD();
    private final BoletasMiembrosCRUD bmc = new BoletasMiembrosCRUD();
    private final BoletasConsumiblesCRUD bcoc = new BoletasConsumiblesCRUD();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean agregar(int codigo, String nombre){
        boolean result = false;
        consulta = "INSERT INTO metodos_pagos(id_mp, nombre_mp) VALUES(?,?)";
        
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
    
    public boolean modificar(int codigo, String nombre, int id) {
        resp = false;
        consulta = "UPDATE metodos_pagos SET id_mp = ?, nombre_mp = ? WHERE id_mp = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, id);
            if(ps.executeUpdate()>0){
                resp = true;
                bcc.modificarPorMP(codigo, id);
                bmc.modificarPorMP(codigo, id);
                bcoc.modificarPorMP(codigo, id);
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
        consulta = "DELETE FROM metodos_pagos WHERE id_mp = ?";
        resp = false;
        bcc.eliminarPorMPago(code);
        bmc.eliminarPorMPago(code);
        bcoc.eliminarPorMPago(code);
        
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
    
    public List<MPagos> mostrar(){
        List<MPagos> lista = new ArrayList();
        consulta = "SELECT * FROM metodos_pagos";
        
        try{
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                lista.add(new MPagos(rs.getInt("id_mp"),rs.getString("nombre_mp")));
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
