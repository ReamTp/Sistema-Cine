package pimportantes;

import java.awt.Color;
import jfagregar.*;

public class AddData extends javax.swing.JPanel {

    public AddData() {
        initComponents();
        generarImagenes();
    }
    
    public final void generarImagenes(){
        imgUserMember.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgUserMember, "src\\diseño\\imagenes\\usuarioMemberIcon.png");
        
        imgTypeInfo.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgTypeInfo, "src\\diseño\\imagenes\\tipoUserDocIcon.png");
        
        imgMPay.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgMPay, "src\\diseño\\imagenes\\mPagoIcon.png");
        
        imgConsumibles.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgConsumibles, "src\\diseño\\imagenes\\foodDrinkIcon.png");
        
        imgInfoMovie.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgInfoMovie, "src\\diseño\\imagenes\\peliculaIcon.png");
        
        imgARoom.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgARoom, "src\\diseño\\imagenes\\aRoomIcon.png");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbSubtitulo = new javax.swing.JLabel();
        pnUserMember = new javax.swing.JPanel();
        btnUserMember = new javax.swing.JLabel();
        imgUserMember = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnTypeInfo = new javax.swing.JPanel();
        btnTypeInfo = new javax.swing.JLabel();
        imgTypeInfo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnMPay = new javax.swing.JPanel();
        btnMPay = new javax.swing.JLabel();
        imgMPay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnInfoFoodDrink = new javax.swing.JPanel();
        btnConsumibles = new javax.swing.JLabel();
        imgConsumibles = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnInfoMovie = new javax.swing.JPanel();
        btnInfoMovie = new javax.swing.JLabel();
        imgInfoMovie = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnARoom = new javax.swing.JPanel();
        btnASala = new javax.swing.JLabel();
        imgARoom = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setFocusable(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 148, 138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Registros de Datos");
        lbTitulo.setToolTipText("");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 29, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSubtitulo.setText("Elija la categoria que le va agregar datos");
        lbSubtitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lbSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        pnUserMember.setBackground(new java.awt.Color(255, 255, 255));
        pnUserMember.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnUserMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUserMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMemberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUserMemberMouseExited(evt);
            }
        });
        pnUserMember.add(btnUserMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnUserMember.add(imgUserMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Usuarios y Miembros");
        pnUserMember.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 104, -1, -1));

        jPanel2.add(pnUserMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 155, 155));

        pnTypeInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnTypeInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnTypeInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTypeInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTypeInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTypeInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTypeInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTypeInfoMouseExited(evt);
            }
        });
        pnTypeInfo.add(btnTypeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnTypeInfo.add(imgTypeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("y Usuarios");
        pnTypeInfo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de Documentos");
        pnTypeInfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 104, -1, -1));

        jPanel2.add(pnTypeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 155, 155));

        pnMPay.setBackground(new java.awt.Color(255, 255, 255));
        pnMPay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnMPay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMPayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMPayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMPayMouseExited(evt);
            }
        });
        pnMPay.add(btnMPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnMPay.add(imgMPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Metodos de Pago");
        pnMPay.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 104, -1, -1));

        jPanel2.add(pnMPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 155, 155));

        pnInfoFoodDrink.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoFoodDrink.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnInfoFoodDrink.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsumibles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsumibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsumiblesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsumiblesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsumiblesMouseExited(evt);
            }
        });
        pnInfoFoodDrink.add(btnConsumibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnInfoFoodDrink.add(imgConsumibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Consumibles");
        pnInfoFoodDrink.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 104, -1, -1));

        jPanel2.add(pnInfoFoodDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 155, 155));

        pnInfoMovie.setBackground(new java.awt.Color(255, 255, 255));
        pnInfoMovie.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnInfoMovie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInfoMovie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfoMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMovieMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoMovieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoMovieMouseExited(evt);
            }
        });
        pnInfoMovie.add(btnInfoMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnInfoMovie.add(imgInfoMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Info relacionado con");
        pnInfoMovie.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Peliculas");
        pnInfoMovie.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jPanel2.add(pnInfoMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 155, 155));

        pnARoom.setBackground(new java.awt.Color(255, 255, 255));
        pnARoom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnARoom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnASala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnASala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnASalaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnASalaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnASalaMouseExited(evt);
            }
        });
        pnARoom.add(btnASala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnARoom.add(imgARoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Asociar Sala");
        pnARoom.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 104, -1, -1));

        jPanel2.add(pnARoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 155, 155));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 670, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMemberMouseEntered
        this.pnUserMember.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnUserMemberMouseEntered

    private void btnTypeInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTypeInfoMouseExited
        this.pnTypeInfo.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnTypeInfoMouseExited

    private void btnTypeInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTypeInfoMouseEntered
        this.pnTypeInfo.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnTypeInfoMouseEntered

    private void btnUserMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMemberMouseExited
        this.pnUserMember.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnUserMemberMouseExited

    private void btnMPayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPayMouseEntered
        this.pnMPay.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnMPayMouseEntered

    private void btnMPayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPayMouseExited
        this.pnMPay.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnMPayMouseExited

    private void btnConsumiblesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsumiblesMouseEntered
        this.pnInfoFoodDrink.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnConsumiblesMouseEntered

    private void btnConsumiblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsumiblesMouseExited
        this.pnInfoFoodDrink.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnConsumiblesMouseExited

    private void btnInfoMovieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMovieMouseEntered
        this.pnInfoMovie.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnInfoMovieMouseEntered

    private void btnInfoMovieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMovieMouseExited
        this.pnInfoMovie.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnInfoMovieMouseExited

    private void btnASalaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnASalaMouseEntered
        this.pnARoom.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnASalaMouseEntered

    private void btnASalaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnASalaMouseExited
        this.pnARoom.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnASalaMouseExited

    private void btnUserMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMemberMouseClicked
        UserMember um = new UserMember();
        um.setVisible(true);
    }//GEN-LAST:event_btnUserMemberMouseClicked

    private void btnTypeInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTypeInfoMouseClicked
        TypeInfo ti = new TypeInfo();
        ti.setVisible(true);
    }//GEN-LAST:event_btnTypeInfoMouseClicked

    private void btnMPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPayMouseClicked
        MPagos mp = new MPagos();
        mp.setVisible(true);
    }//GEN-LAST:event_btnMPayMouseClicked

    private void btnConsumiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsumiblesMouseClicked
        Consumibles c = new Consumibles();
        c.setVisible(true);
    }//GEN-LAST:event_btnConsumiblesMouseClicked

    private void btnInfoMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMovieMouseClicked
        InfoMovie im = new InfoMovie();
        im.setVisible(true);
    }//GEN-LAST:event_btnInfoMovieMouseClicked

    private void btnASalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnASalaMouseClicked
        ARoom ar = new ARoom();
        ar.setVisible(true);
    }//GEN-LAST:event_btnASalaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnASala;
    private javax.swing.JLabel btnConsumibles;
    private javax.swing.JLabel btnInfoMovie;
    private javax.swing.JLabel btnMPay;
    private javax.swing.JLabel btnTypeInfo;
    private javax.swing.JLabel btnUserMember;
    private javax.swing.JLabel imgARoom;
    private javax.swing.JLabel imgConsumibles;
    private javax.swing.JLabel imgInfoMovie;
    private javax.swing.JLabel imgMPay;
    private javax.swing.JLabel imgTypeInfo;
    private javax.swing.JLabel imgUserMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnARoom;
    private javax.swing.JPanel pnInfoFoodDrink;
    private javax.swing.JPanel pnInfoMovie;
    private javax.swing.JPanel pnMPay;
    private javax.swing.JPanel pnTypeInfo;
    private javax.swing.JPanel pnUserMember;
    // End of variables declaration//GEN-END:variables
}
