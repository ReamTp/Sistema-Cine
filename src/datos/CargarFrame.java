package datos;

import diseño.Login;
import diseño.MenuDirectivo;
import diseño.MenuEmpleado;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class CargarFrame {
    private final Properties datos = new Properties();
    private final Properties datos2 = new Properties();
    String db, correo, pass;
    private int tipo = 0;
    private ComprobarLogin cl = new ComprobarLogin();
    
    public void cargarDiseño(){
        try {
            datos.load(new FileInputStream("src/configuraciones/opciones.properties"));

            db = datos.get("database").toString();
            System.out.println(db);
            
            datos2.load(new FileInputStream("src/configuraciones/datosUsuario.properties"));

            correo = datos2.get("email").toString();
            pass = datos2.get("password").toString();
//            System.out.println(correo+" "+pass);


            switch (db){
                case "mysql" -> {
                    tipo = cl.revisarUsuarioMySQL(correo, pass);
                    break;
                }
                case "oracle" -> {
                    tipo = cl.revisarUsuarioOracle(correo, pass);
                    break;
                }
                default -> System.out.println("El usuario no existe");
            }
            
            switch (tipo){
                case 1 ->{
                    MenuDirectivo menD = new MenuDirectivo();
                    menD.setVisible(true);
                    break;
                }
                case 2 ->{
                    MenuEmpleado menE = new MenuEmpleado();
                    menE.setVisible(true);
                    break;
                }
                default ->{
                    Login l = new Login();
                    l.setVisible(true);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
