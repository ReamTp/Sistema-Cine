package pimportantes;

import java.awt.Color;

public class AddData extends javax.swing.JPanel {

    public AddData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMiembro = new javax.swing.JLabel();
        btnPelicula = new javax.swing.JLabel();
        btnSala = new javax.swing.JLabel();
        btnMetodoPago = new javax.swing.JLabel();
        btnFoodDrink = new javax.swing.JLabel();
        btnHorarios = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        imgHorario = new javax.swing.JLabel();
        imgFoodDrink = new javax.swing.JLabel();
        imgMPago = new javax.swing.JLabel();
        imgSala = new javax.swing.JLabel();
        imgPelicula = new javax.swing.JLabel();
        imgMiembro = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setFocusable(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 148, 138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registros de Datos");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 29, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMiembro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMiembro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMiembro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMiembroMouseEntered(evt);
            }
        });
        jPanel2.add(btnMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 155, 153));

        btnPelicula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 155, 153));

        btnSala.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 155, 153));

        btnMetodoPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMetodoPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 155, 153));

        btnFoodDrink.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFoodDrink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnFoodDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 155, 153));

        btnHorarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 155, 153));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Elija la categoria que le va agregar datos");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        imgHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/horarioIcon.png"))); // NOI18N
        imgHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(imgHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 300, 64, 64));

        imgFoodDrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/foodDrinkIcon.png"))); // NOI18N
        imgFoodDrink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(imgFoodDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 300, 64, 64));

        imgMPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/mPagoIcon.png"))); // NOI18N
        imgMPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(imgMPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 300, 64, 64));

        imgSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/salaIcon.png"))); // NOI18N
        imgSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(imgSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 116, 64, 64));

        imgPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/peliculaIcon.png"))); // NOI18N
        imgPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(imgPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 116, 64, 64));

        imgMiembro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/vipIcon.png"))); // NOI18N
        imgMiembro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(imgMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 116, 64, 64));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Comidas y Bebidas");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Salas");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Miembros");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Peliculas");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Metodo de Pagos");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Horarios");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 370, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 670, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMiembroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiembroMouseEntered

    }//GEN-LAST:event_btnMiembroMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFoodDrink;
    private javax.swing.JLabel btnHorarios;
    private javax.swing.JLabel btnMetodoPago;
    private javax.swing.JLabel btnMiembro;
    private javax.swing.JLabel btnPelicula;
    private javax.swing.JLabel btnSala;
    private javax.swing.JLabel imgFoodDrink;
    private javax.swing.JLabel imgHorario;
    private javax.swing.JLabel imgMPago;
    private javax.swing.JLabel imgMiembro;
    private javax.swing.JLabel imgPelicula;
    private javax.swing.JLabel imgSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
