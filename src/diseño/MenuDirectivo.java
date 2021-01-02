package diseño;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import pimportantes.AddData;
import pimportantes.ModifyData;
import pimportantes.Boletas;

public class MenuDirectivo extends javax.swing.JFrame {
    Properties datos = new Properties();
    String name;
    
    public MenuDirectivo() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgLogo, "src\\diseño\\imagenes\\logoIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgUsuario, "src\\diseño\\imagenes\\usuarioIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgAgregar, "src\\diseño\\imagenes\\agregarIcon.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgEditar, "src\\diseño\\imagenes\\editarIcon.png");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel1.add(btnOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 220, -1));
        jPanel1.add(imgOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 32, 32));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 220, 2));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos del Sistema");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 2));
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 64, 64));

        pnAgregar.setBackground(new java.awt.Color(205, 97, 85));
        pnAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
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
        pnModificar.add(imgEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jPanel1.add(pnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 223, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 223, 610));

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
        jPanel2.add(lbNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 20, -1, -1));
        jPanel2.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 15, 32, 32));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 680, 60));
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 680, 550));

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
    private javax.swing.JLabel btnModificar;
    private javax.swing.JLabel btnOptions;
    private javax.swing.JScrollPane contenedor;
    private javax.swing.JLabel imgAgregar;
    private javax.swing.JLabel imgEditar;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgOpcion;
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
    private javax.swing.JPanel separador1;
    private javax.swing.JPanel separador2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
