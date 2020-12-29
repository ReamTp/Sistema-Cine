package database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection cadena;
    public static Conexion instancia;
    Properties datos = new Properties(), conexionSQL = new Properties();
    String DRIVER, URL, DB, USER, PASSWORD, db;
    
    public Conexion(){
        iniciarVariables();
        this.cadena = null;
    }
    
    public Connection conectarMySQL(){
        try{
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL+DB, USER , PASSWORD);
            System.out.println("Coneccion correcta");
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }
    
    //Falta probar :c
    public Connection conectarOracle(){
        try{
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL, USER , PASSWORD);
            System.out.println("Coneccion correcta");
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }
    
    public void desconectar(){
        try{
            this.cadena.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void iniciarVariables(){
        try {
            datos.load(new FileInputStream("src/configuraciones/opciones.properties"));

            db = datos.get("database").toString();

            switch (db){
                case "mysql" -> {
                    conexionSQL.load(new FileInputStream("src/configuraciones/conexionMySQL.properties"));
                    DRIVER = conexionSQL.get("DRIVER").toString();
                    URL = conexionSQL.get("URL").toString();
                    DB = conexionSQL.get("DB").toString();
                    USER = conexionSQL.get("USER").toString();
                    PASSWORD = conexionSQL.get("PASSWORD").toString();
                    break;
                }
                case "oracle" -> {
                    conexionSQL.load(new FileInputStream("src/configuraciones/conexionOracle.properties"));
                    DRIVER = conexionSQL.get("DRIVER").toString();
                    URL = conexionSQL.get("URL").toString();
                    USER = conexionSQL.get("USER").toString();
                    PASSWORD = conexionSQL.get("PASSWORD").toString();
                    break;
                }
                default -> JOptionPane.showMessageDialog(null, "Error al obtener información de la Base de Datos");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
    
    public synchronized static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
