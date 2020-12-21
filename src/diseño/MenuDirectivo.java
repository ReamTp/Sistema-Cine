package diseño;

public class MenuDirectivo extends javax.swing.JFrame {

    public MenuDirectivo() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgLogo, "src\\diseño\\imagenes\\logoIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgUsuario, "src\\diseño\\imagenes\\usuarioIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgAgregar, "src\\diseño\\imagenes\\agregarIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgEditar, "src\\diseño\\imagenes\\editarIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgMostrar, "src\\diseño\\imagenes\\mostrarIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgOpcion, "src\\diseño\\imagenes\\opcionesIcon.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbAgregar = new javax.swing.JLabel();
        lbMostrar = new javax.swing.JLabel();
        lbModificar = new javax.swing.JLabel();
        lbOpciones = new javax.swing.JLabel();
        imgAgregar = new javax.swing.JLabel();
        imgEditar = new javax.swing.JLabel();
        imgMostrar = new javax.swing.JLabel();
        imgOpcion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(205, 97, 85));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(170, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setText("Cine");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbAgregar.setBackground(new java.awt.Color(255, 255, 255));
        lbAgregar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lbAgregar.setText("          Agregar Datos");
        lbAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, -1));

        lbMostrar.setBackground(new java.awt.Color(255, 255, 255));
        lbMostrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMostrar.setForeground(new java.awt.Color(255, 255, 255));
        lbMostrar.setText("          Mostrar Datos");
        lbMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 220, -1));

        lbModificar.setBackground(new java.awt.Color(255, 255, 255));
        lbModificar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbModificar.setForeground(new java.awt.Color(255, 255, 255));
        lbModificar.setText("          Cambiar Datos");
        lbModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, -1));

        lbOpciones.setBackground(new java.awt.Color(255, 255, 255));
        lbOpciones.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbOpciones.setForeground(new java.awt.Color(255, 255, 255));
        lbOpciones.setText("          Opciones");
        lbOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOpcionesMouseClicked(evt);
            }
        });
        jPanel1.add(lbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 220, -1));
        jPanel1.add(imgAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 32, 32));
        jPanel1.add(imgEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 32, 32));

        imgMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(imgMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 32, 32));
        jPanel1.add(imgOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 32, 32));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 220, 2));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos del Sistema");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 2));
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 64, 64));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(674, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel4.setText("Bienvenido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombre Directivo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 20, -1, -1));
        jPanel2.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 15, 32, 32));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 670, 60));
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 670, 540));

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
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel imgAgregar;
    private javax.swing.JLabel imgEditar;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgMostrar;
    private javax.swing.JLabel imgOpcion;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbAgregar;
    private javax.swing.JLabel lbModificar;
    private javax.swing.JLabel lbMostrar;
    private javax.swing.JLabel lbOpciones;
    // End of variables declaration//GEN-END:variables
}
