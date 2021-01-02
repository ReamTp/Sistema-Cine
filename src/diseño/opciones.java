package diseño;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class opciones extends javax.swing.JFrame {
    
    public opciones() {
        initComponents();
        setLocationRelativeTo(null);
        comprobarCarga();
    }
    
    private void comprobarCarga(){
        try{
            Properties datos = new Properties();
            datos.load(new FileInputStream("src/configuraciones/opciones.properties"));
            String db = datos.getProperty("database").toString();
            String tm = datos.getProperty("tema").toString();
            String cr = datos.getProperty("cerrar").toString();
            switch(db){
                case "mysql" ->{
                    this.opDbMysql.setSelected(true);
                }
                case "oracle" ->{
                    this.opDbOracle.setSelected(true);
                }
            }
            
            switch(tm){
                case "claro" ->{
                    this.opTClaro.setSelected(true);
                    break;
                }
                case "oscuro" ->{
                    this.opTOscuro.setSelected(true);
                    break;
                }
            }
            
            switch(cr){
                case "no" -> this.btnCerrarSesion.setEnabled(false);
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opDbOracle = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opDbMysql = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        opTClaro = new javax.swing.JCheckBox();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        opTOscuro = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajustes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Configuración");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Base de Datos:");

        opDbOracle.setBackground(new java.awt.Color(255, 255, 255));
        opDbOracle.setText("Oracle DataBase");
        opDbOracle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDbOracleActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/oracle.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/mysql.png"))); // NOI18N

        opDbMysql.setBackground(new java.awt.Color(255, 255, 255));
        opDbMysql.setText("MySQL DataBase");
        opDbMysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDbMysqlActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Cambiar Tema:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/configuracion32.png"))); // NOI18N

        opTClaro.setBackground(new java.awt.Color(255, 255, 255));
        opTClaro.setText("Tema Claro");
        opTClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTClaroActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/temaClaroIcon32.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/temaOscuroIcon32.png"))); // NOI18N

        opTOscuro.setBackground(new java.awt.Color(255, 255, 255));
        opTOscuro.setText("Tema Oscuro");
        opTOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTOscuroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addGap(7, 7, 7)
                                .addComponent(opDbOracle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opTClaro)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(opDbMysql))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opTOscuro))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnCerrarSesion)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(opDbOracle))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(opDbMysql)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opTClaro)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opTOscuro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opDbOracleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDbOracleActionPerformed
        this.opDbMysql.setSelected(false);
        this.opDbOracle.setSelected(true);
        
        try{
            Properties datos = new Properties();
            datos.load(new FileInputStream("src/configuraciones/opciones.properties"));
            datos.setProperty("database", "oracle");
            
            datos.store(new FileWriter("src/configuraciones/opciones.properties"),"");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_opDbOracleActionPerformed

    private void opDbMysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDbMysqlActionPerformed
        this.opDbOracle.setSelected(false);
        this.opDbMysql.setSelected(true);
        
        try{
            Properties datos = new Properties();
            datos.load(new FileInputStream("src/configuraciones/opciones.properties"));
            datos.setProperty("database", "mysql");
            
            datos.store(new FileWriter("src/configuraciones/opciones.properties"),"");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_opDbMysqlActionPerformed

    private void opTClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTClaroActionPerformed
        this.opTOscuro.setSelected(false);
        this.opTClaro.setSelected(true);
        
        try{
            Properties datos = new Properties();
            datos.load(new FileInputStream("src/configuraciones/opciones.properties"));
            datos.setProperty("tema", "claro");
            
            datos.store(new FileWriter("src/configuraciones/opciones.properties"),"");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_opTClaroActionPerformed

    private void opTOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTOscuroActionPerformed
        this.opTClaro.setSelected(false);
        this.opTOscuro.setSelected(true);
        
        try{
            Properties datos = new Properties();
            datos.load(new FileInputStream("src/configuraciones/opciones.properties"));
            datos.setProperty("tema", "oscuro");
            
            datos.store(new FileWriter("src/configuraciones/opciones.properties"),"");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_opTOscuroActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        try{
            Properties datos = new Properties(), data = new Properties();
            datos.load(new FileInputStream("src/configuraciones/datosUsuario.properties"));
            datos.setProperty("nombre", "");
            datos.setProperty("email", "");
            datos.setProperty("password", "");
            
            datos.store(new FileWriter("src/configuraciones/datosUsuario.properties"),"");
            
            data.store(new FileWriter("src/configuraciones/opciones.properties"),"");
            datos.setProperty("cerrar", "no");
            datos.store(new FileWriter("src/configuraciones/opciones.properties"),"");
            
            Login l = new Login();
            l.setVisible(true);
            System.in.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox opDbMysql;
    private javax.swing.JCheckBox opDbOracle;
    private javax.swing.JCheckBox opTClaro;
    private javax.swing.JCheckBox opTOscuro;
    // End of variables declaration//GEN-END:variables
}
