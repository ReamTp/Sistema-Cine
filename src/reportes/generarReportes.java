package reportes;

import java.sql.Connection;
import database.TipoConexion;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class generarReportes {
    private final TipoConexion CON = new TipoConexion();
    private final Connection conexion;
    
    public generarReportes(){
        conexion = CON.conectar();
    }
    
    public void reporteBCli(){
        try{
            String rutaReport = System.getProperty("user.dir")+"/src/reportes/reporteBoletasPeli.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(rutaReport);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer view = new JasperViewer(jp, false);
            view.setVisible(true);
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar Reporte");
        }
    }
    
    public void reporteBMem(){
        try{
            String rutaReport = System.getProperty("user.dir")+"/src/reportes/reporteBoletasPeli2.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(rutaReport);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer view = new JasperViewer(jp, false);
            view.setVisible(true);
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar Reporte");
        }
    }
    
    public void reporteDrink(){
        try{
            String rutaReport = System.getProperty("user.dir")+"/src/reportes/reporteDrink.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(rutaReport);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer view = new JasperViewer(jp, false);
            view.setVisible(true);
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar Reporte");
        }
    }
    
    public void reporteFood(){
        try{
            String rutaReport = System.getProperty("user.dir")+"/src/reportes/reporteFood.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(rutaReport);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer view = new JasperViewer(jp, false);
            view.setVisible(true);
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar Reporte");
        }
    }

    public void reporteMember(){
        try{
            Map<String,Object> parametros = new HashMap<String, Object>();
            Date fecha = new Date();
            parametros.put("Ingresar Mes", fecha);
            String rutaReport = System.getProperty("user.dir")+"/src/reportes/reporteMiembros.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(rutaReport);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer view = new JasperViewer(jp, false);
            view.setVisible(true);
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar Reporte");
        }
    }
    
    public void reporteMovie(){
        try{
            String rutaReport = System.getProperty("user.dir")+"/src/reportes/reportePeliculas.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(rutaReport);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer view = new JasperViewer(jp, false);
            view.setVisible(true);
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Error al generar Reporte");
        }
    }
}
