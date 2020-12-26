package diseño;

import pimportantes.PayMovie;

public class MenuEmpleado extends javax.swing.JFrame {
    
    PayMovie pm = new PayMovie();
    
    public MenuEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgLogo, "src\\diseño\\imagenes\\logoIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgUsuario, "src\\diseño\\imagenes\\usuarioIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgEntrada, "src\\diseño\\imagenes\\entradaIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgComida, "src\\diseño\\imagenes\\comidaIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgOpcion, "src\\diseño\\imagenes\\opcionesIcon.png");
        this.contenedor.add(pm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbEntrada = new javax.swing.JLabel();
        lbComida = new javax.swing.JLabel();
        lbOpciones = new javax.swing.JLabel();
        imgEntrada = new javax.swing.JLabel();
        imgComida = new javax.swing.JLabel();
        imgOpcion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        lbNombreA = new javax.swing.JLabel();
        lbNombreB = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CineName");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(69, 179, 157));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setText("Cine");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lbEntrada.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbEntrada.setForeground(new java.awt.Color(255, 255, 255));
        lbEntrada.setText("          Entradas");
        lbEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, -1));

        lbComida.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbComida.setForeground(new java.awt.Color(255, 255, 255));
        lbComida.setText("          Comidas");
        lbComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, -1));

        lbOpciones.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbOpciones.setForeground(new java.awt.Color(255, 255, 255));
        lbOpciones.setText("          Opciones");
        lbOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOpcionesMouseClicked(evt);
            }
        });
        jPanel1.add(lbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 180, -1));

        imgEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(imgEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 32, 32));

        imgComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(imgComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 32, 32));

        imgOpcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(imgOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 32, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro Boletas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 180, 2));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 2));
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 64, 64));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 15, 32, 32));

        lbNombreA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombreA.setText("Nombre Empleado");
        jPanel2.add(lbNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

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

    private void lbOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOpcionesMouseClicked
        opciones op = new opciones();
        op.setVisible(true);
    }//GEN-LAST:event_lbOpcionesMouseClicked

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
    private javax.swing.JPanel contenedor;
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
    private javax.swing.JLabel lbComida;
    private javax.swing.JLabel lbEntrada;
    private javax.swing.JLabel lbNombreA;
    private javax.swing.JLabel lbNombreB;
    private javax.swing.JLabel lbOpciones;
    // End of variables declaration//GEN-END:variables
}
