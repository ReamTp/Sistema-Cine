package datos;

import database.TipoConexion;
import entidades.Movies;
import entidades.Salas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MovieCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean agregar(int codigo, String nombre, double duracion, int categ, String descrip, int hora){
        boolean result = false;
        consulta = "INSERT INTO peliculas(id_peli, nombre_peli, duracion, id_categ, descripcion, id_hor) VALUES(?,?,?,?,?,?)";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setDouble(3, duracion);
            ps.setInt(4, categ);
            ps.setString(5, descrip);
            ps.setInt(6, hora);
                    
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
    
    public boolean modificar(int codigo, String nombre, double duracion, int categ, String descrip, int hora, int id) {
        resp = false;
        consulta = "UPDATE peliculas SET id_peli = ?, nombre_peli = ?, duracion = ?, id_categ = ?, descripcion = ?, id_hor = ? WHERE id_peli = ?";
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setDouble(3, duracion);
            ps.setInt(4, categ);
            ps.setString(5, descrip);
            ps.setInt(6, hora);
            ps.setInt(7, id);
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
        consulta = "DELETE FROM peliculas WHERE id_peli = ?";
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
    
    public List<Movies> mostrar(){
        List<Movies> lista = new ArrayList();
        consulta = "SELECT * FROM peliculas";
        
        try{
            ps = TC.consultaSQL(consulta);
            rs = ps.executeQuery();
            
            while (rs.next()){
                lista.add(new Movies(rs.getInt("id_peli"), rs.getString("nombre_peli"), rs.getDouble("duracion"), rs.getInt("id_categ"), rs.getString("descripcion"), rs.getInt("id_hor")));
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
