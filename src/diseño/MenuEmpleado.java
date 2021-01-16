package diseño;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import pimportantes.PayFood;
import pimportantes.PayMovie;

public class MenuEmpleado extends javax.swing.JFrame {
    Properties datos = new Properties();
    String name;
    PayMovie pm = new PayMovie();
    
    public MenuEmpleado() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        pnEntradas = new javax.swing.JPanel();
        btnEntrada = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        imgEntrada = new javax.swing.JLabel();
        pnComidas = new javax.swing.JPanel();
        btnComida = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        imgComida = new javax.swing.JLabel();
        pnOpciones = new javax.swing.JPanel();
        btnOpciones = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        imgOpcion = new javax.swing.JLabel();
        pnCerrar = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        imgCerrarSesion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        lbNombreA = new javax.swing.JLabel();
        lbNombreB = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contenedor = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CineName");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(69, 179, 157));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setText("Cine");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro Boletas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 180, 2));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 2));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/logoIcon.png"))); // NOI18N
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 64, 64));

        pnEntradas.setBackground(new java.awt.Color(69, 179, 157));
        pnEntradas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrada.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntradaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntradaMouseExited(evt);
            }
        });
        pnEntradas.add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Entradas");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnEntradas.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));

        imgEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/entradaIcon.png"))); // NOI18N
        imgEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnEntradas.add(imgEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 50));

        pnComidas.setBackground(new java.awt.Color(69, 179, 157));
        pnComidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComida.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnComida.setForeground(new java.awt.Color(255, 255, 255));
        btnComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComidaMouseExited(evt);
            }
        });
        pnComidas.add(btnComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        titulo2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Comidas");
        titulo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnComidas.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));

        imgComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/comidaIcon.png"))); // NOI18N
        imgComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnComidas.add(imgComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, 50));

        pnOpciones.setBackground(new java.awt.Color(69, 179, 157));
        pnOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOpciones.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnOpciones.setForeground(new java.awt.Color(255, 255, 255));
        btnOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpcionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOpcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOpcionesMouseExited(evt);
            }
        });
        pnOpciones.add(btnOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        titulo3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 255, 255));
        titulo3.setText("Opciones");
        titulo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo3MouseClicked(evt);
            }
        });
        pnOpciones.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, -1));

        imgOpcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/opcionesIcon.png"))); // NOI18N
        imgOpcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnOpciones.add(imgOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 485, 180, 50));

        pnCerrar.setBackground(new java.awt.Color(69, 179, 157));
        pnCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        pnCerrar.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        titulo4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo4.setForeground(new java.awt.Color(255, 255, 255));
        titulo4.setText("Cerrar");
        titulo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titulo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo4MouseClicked(evt);
            }
        });
        pnCerrar.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, -1));

        imgCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/cerrarSesionIcon.png"))); // NOI18N
        imgCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnCerrar.add(imgCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 610));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/usuarioIcon.png"))); // NOI18N
        jPanel2.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 16, 32, 32));

        lbNombreA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombreA.setText("Nombre Empleado");
        jPanel2.add(lbNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        lbNombreB.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        lbNombreB.setText("Nombre");
        jPanel2.add(lbNombreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel7.setText("Bienvenido");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 710, 60));
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 710, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionesMouseClicked
        opciones op = new opciones();
        op.setVisible(true);
    }//GEN-LAST:event_btnOpcionesMouseClicked

    private void titulo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo3MouseClicked

    private void btnEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseClicked
        PayMovie pm = new PayMovie();
        this.contenedor.setViewportView(pm);
    }//GEN-LAST:event_btnEntradaMouseClicked

    private void btnComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComidaMouseClicked
        PayFood pf = new PayFood();
        this.contenedor.setViewportView(pf);
    }//GEN-LAST:event_btnComidaMouseClicked

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

    private void titulo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo4MouseClicked

    private void btnEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseEntered
        this.pnEntradas.setBackground(new java.awt.Color(69, 205, 165));
    }//GEN-LAST:event_btnEntradaMouseEntered

    private void btnEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseExited
        this.pnEntradas.setBackground(new java.awt.Color(69, 179, 157));
    }//GEN-LAST:event_btnEntradaMouseExited

    private void btnComidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComidaMouseEntered
        this.pnComidas.setBackground(new java.awt.Color(69, 205, 165));
    }//GEN-LAST:event_btnComidaMouseEntered

    private void btnComidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComidaMouseExited
        this.pnComidas.setBackground(new java.awt.Color(69, 179, 157));
    }//GEN-LAST:event_btnComidaMouseExited

    private void btnOpcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionesMouseEntered
        this.pnOpciones.setBackground(new java.awt.Color(69, 205, 165));
    }//GEN-LAST:event_btnOpcionesMouseEntered

    private void btnOpcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionesMouseExited
        this.pnOpciones.setBackground(new java.awt.Color(69, 179, 157));
    }//GEN-LAST:event_btnOpcionesMouseExited

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        this.pnCerrar.setBackground(new java.awt.Color(69, 205, 165));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        this.pnCerrar.setBackground(new java.awt.Color(69, 179, 157));
    }//GEN-LAST:event_btnCerrarMouseExited

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
            java.util.logging.Logger.getLogger(MenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnComida;
    private javax.swing.JLabel btnEntrada;
    private javax.swing.JLabel btnOpciones;
    private javax.swing.JScrollPane contenedor;
    private javax.swing.JLabel imgCerrarSesion;
    private javax.swing.JLabel imgComida;
    private javax.swing.JLabel imgEntrada;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgOpcion;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbNombreA;
    private javax.swing.JLabel lbNombreB;
    private javax.swing.JPanel pnCerrar;
    private javax.swing.JPanel pnComidas;
    private javax.swing.JPanel pnEntradas;
    private javax.swing.JPanel pnOpciones;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}
