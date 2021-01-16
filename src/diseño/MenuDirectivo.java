package diseño;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import pimportantes.AddData;
import pimportantes.ModifyData;
import pimportantes.Reportes;

public class MenuDirectivo extends javax.swing.JFrame {
    private Properties datos = new Properties();
    private String name;
    
    public MenuDirectivo() {
        initComponents();
        setLocationRelativeTo(null);
        ObtenerNombre();
    }
    
    private void ObtenerNombre(){
        try {
            datos.load(new FileInputStream("src/configuraciones/datosUsuario.properties"));
      
            name = datos.get("nombre").toString();
            System.out.println(name);
            this.lbNombreA.setText(name);
            this.lbNombreB.setText(name);
            
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnOptions = new javax.swing.JLabel();
        imgOpcion = new javax.swing.JLabel();
        separador2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        separador1 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        pnAgregar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        imgAgregar = new javax.swing.JLabel();
        pnModificar = new javax.swing.JPanel();
        btnModificar = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        imgEditar = new javax.swing.JLabel();
        pnReportes = new javax.swing.JPanel();
        btnReportes = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        imgReporte = new javax.swing.JLabel();
        imgCerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbNombreB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNombreA = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        contenedor = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(205, 97, 85));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(170, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setText("Cine");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("          Cerrar Sesión");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 220, -1));

        btnOptions.setBackground(new java.awt.Color(255, 255, 255));
        btnOptions.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnOptions.setForeground(new java.awt.Color(255, 255, 255));
        btnOptions.setText("          Opciones");
        btnOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOptionsMouseClicked(evt);
            }
        });
        jPanel1.add(btnOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 220, -1));

        imgOpcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/opcionesIcon.png"))); // NOI18N
        jPanel1.add(imgOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 32, 32));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 220, 2));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos del Sistema");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 2));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/logoIcon.png"))); // NOI18N
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 64, 64));

        pnAgregar.setBackground(new java.awt.Color(205, 97, 85));
        pnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnAgregarMouseExited(evt);
            }
        });
        pnAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        pnAgregar.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 223, 50));

        titulo2.setBackground(new java.awt.Color(255, 255, 255));
        titulo2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Agregar Datos");
        titulo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo2MouseClicked(evt);
            }
        });
        pnAgregar.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, -1));

        imgAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/agregarIcon.png"))); // NOI18N
        pnAgregar.add(imgAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 223, 50));

        pnModificar.setBackground(new java.awt.Color(205, 97, 85));
        pnModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });
        pnModificar.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 223, 50));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Modificar Datos");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloMouseClicked(evt);
            }
        });
        pnModificar.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        imgEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/editarIcon.png"))); // NOI18N
        pnModificar.add(imgEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 223, 50));

        pnReportes.setBackground(new java.awt.Color(205, 97, 85));
        pnReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
        });
        pnReportes.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 223, 50));

        titulo1.setBackground(new java.awt.Color(255, 255, 255));
        titulo1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Reportes");
        titulo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo1MouseClicked(evt);
            }
        });
        pnReportes.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, -1));

        imgReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/reporteIcon.png"))); // NOI18N
        pnReportes.add(imgReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 332, 223, 50));

        imgCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/cerrarSesionIcon.png"))); // NOI18N
        jPanel1.add(imgCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 32, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 223, 620));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(674, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNombreB.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        lbNombreB.setText("Nombre");
        jPanel2.add(lbNombreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel4.setText("Bienvenido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lbNombreA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombreA.setText("Nombre Directivo");
        jPanel2.add(lbNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/usuarioIcon.png"))); // NOI18N
        jPanel2.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 15, 32, 32));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 700, 60));
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 700, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOptionsMouseClicked
        opciones op = new opciones();
        op.setVisible(true);
    }//GEN-LAST:event_btnOptionsMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        AddData ad = new AddData();
        this.contenedor.setViewportView(ad);
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        ModifyData md = new ModifyData();
        this.contenedor.setViewportView(md);
    }//GEN-LAST:event_btnModificarMouseClicked

    private void tituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloMouseClicked

    private void titulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo2MouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        try{
            Properties datos = new Properties(), data = new Properties();
            datos.load(new FileInputStream("src/configuraciones/datosUsuario.properties"));
            datos.setProperty("nombre", "");
            datos.setProperty("email", "");
            datos.setProperty("password", "");
            
            datos.store(new FileWriter("src/configuraciones/datosUsuario.properties"),"");
            
            data.store(new FileWriter("src/configuraciones/opciones.properties"),"");
            data.setProperty("database", "mysql");
            data.store(new FileWriter("src/configuraciones/opciones.properties"),"");
            
            Login l = new Login();
            l.setVisible(true);
            this.dispose();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        Reportes r = new Reportes();
        this.contenedor.setViewportView(r);
    }//GEN-LAST:event_btnReportesMouseClicked

    private void titulo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo1MouseClicked

    private void pnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnAgregarMouseEntered
        
    }//GEN-LAST:event_pnAgregarMouseEntered

    private void pnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnAgregarMouseExited
        
    }//GEN-LAST:event_pnAgregarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        this.pnAgregar.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        this.pnAgregar.setBackground(new java.awt.Color(205, 97, 85));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        this.pnModificar.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        this.pnModificar.setBackground(new java.awt.Color(205, 97, 85));
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        this.pnReportes.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        this.pnReportes.setBackground(new java.awt.Color(205, 97, 85));
    }//GEN-LAST:event_btnReportesMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDirectivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnModificar;
    private javax.swing.JLabel btnOptions;
    private javax.swing.JLabel btnReportes;
    private javax.swing.JScrollPane contenedor;
    private javax.swing.JLabel imgAgregar;
    private javax.swing.JLabel imgCerrar;
    private javax.swing.JLabel imgEditar;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgOpcion;
    private javax.swing.JLabel imgReporte;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbNombreA;
    private javax.swing.JLabel lbNombreB;
    private javax.swing.JPanel pnAgregar;
    private javax.swing.JPanel pnModificar;
    private javax.swing.JPanel pnReportes;
    private javax.swing.JPanel separador1;
    private javax.swing.JPanel separador2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
