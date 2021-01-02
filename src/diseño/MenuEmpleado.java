package diseño;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        rsscalelabel.RSScaleLabel.setScaleLabel(imgLogo, "src\\diseño\\imagenes\\logoIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgUsuario, "src\\diseño\\imagenes\\usuarioIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgEntrada, "src\\diseño\\imagenes\\entradaIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgComida, "src\\diseño\\imagenes\\comidaIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgOpcion, "src\\diseño\\imagenes\\opcionesIcon.png");
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
        });
        pnEntradas.add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Entradas");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnEntradas.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));

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
        });
        pnComidas.add(btnComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        titulo2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Comidas");
        titulo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnComidas.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));

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

        imgOpcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnOpciones.add(imgOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 700, 60));
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 700, 540));

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
    private javax.swing.JLabel btnComida;
    private javax.swing.JLabel btnEntrada;
    private javax.swing.JLabel btnOpciones;
    private javax.swing.JScrollPane contenedor;
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
    private javax.swing.JPanel pnComidas;
    private javax.swing.JPanel pnEntradas;
    private javax.swing.JPanel pnOpciones;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
