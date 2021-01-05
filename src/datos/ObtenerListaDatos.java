package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import database.Conexion;
import database.TipoConexion;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class ObtenerListaDatos {
    private final TipoConexion tc = new TipoConexion();
    private final Conexion con = tc.getConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private String consulta;
    
    public Map tipoDoc(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_tipo_doc, nombre_type_doc FROM tipo_documentos";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("nombre_type_doc"), rs.getInt("id_tipo_doc"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
    public Map tipoUser(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_tipo_user, nombre_type_user FROM tipo_usuarios";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("nombre_type_user"), rs.getInt("id_tipo_user"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
    public Map categoria(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_categ, nombre_categ FROM categorias";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("nombre_categ"), rs.getInt("id_categ"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
    public Map peliculas(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_peli, nombre_peli FROM peliculas";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("nombre_peli"), rs.getInt("id_peli"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
    public Map horario(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_hor, hora FROM horarios";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("hora"), rs.getInt("id_hor"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
    public Map sala(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_sala, nombre_sala FROM salas";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("nombre_sala"), rs.getInt("id_sala"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
    public Map comidas(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_comida, nombre_comida FROM comidas";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("nombre_comida"), rs.getInt("id_comida"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
    public Map bebidas(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_bebida, nombre_bebida FROM bebidas";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("nombre_bebida"), rs.getInt("id_bebida"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
    public Map metodosPago(){
        Map<String, Integer> datos = new TreeMap<>();
        
        try{
            consulta = "SELECT id_mp, nombre_mp FROM metodos_pagos";
            ps = tc.consultaSQL(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                datos.put(rs.getString("nombre_mp"), rs.getInt("id_mp"));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            con.desconectar();
        }
        
        return datos;
    }
    
}
