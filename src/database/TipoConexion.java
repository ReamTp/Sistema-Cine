package database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TipoConexion {
    private final Properties data = new Properties();
    private final int result;
    private final Conexion CON;
    
    public TipoConexion(){
        CON = Conexion.getInstancia();
        result = comprobarDB();
    }
    
    public Conexion getConexion(){
        return this.CON;
    }
    
    private int comprobarDB(){
        int resuldb=1;
        
        try {
            String db;
            data.load(new FileInputStream("src/configuraciones/opciones.properties"));
      
            db = data.get("database").toString();
            switch (db){
                case "mysql" -> {
                    resuldb = 1;
                    break;
                }
                case "oracle" -> {
                    resuldb = 2;
                    break;
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
        return resuldb;
    }
    
    
    public PreparedStatement consultaSQL(String consulta){
        PreparedStatement ps = null;
        try{
            switch(result){
            case 1 -> {
                ps = CON.conectarMySQL().prepareCall(consulta);
                break;
            }
            case 2 -> {
                ps = CON.conectarOracle().prepareCall(consulta);
                break;
            }
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return ps;
    }
    
    public void desconectar(){
        CON.desconectar();
    }
}
