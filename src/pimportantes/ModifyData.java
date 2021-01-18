package pimportantes;

import pmodificar.*;

public class ModifyData extends javax.swing.JPanel {
    Bienvenida bn = new Bienvenida();
    
    public ModifyData() {
        initComponents();
        this.contenedor.setViewportView(bn);
        generarImagenes();
    }
    
    public final void generarImagenes(){
        imgUserMember.setSize(32, 32);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgUserMember, "src\\diseño\\imagenes\\userMemberIconWhite32.png");
        
        imgMPago.setSize(32, 32);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgMPago, "src\\diseño\\imagenes\\mPagoIcon32.png");
        
        imgMovie.setSize(32, 32);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgMovie, "src\\diseño\\imagenes\\movieIcon.png");
        
        imgConsumibles.setSize(32, 32);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgConsumibles, "src\\diseño\\imagenes\\comidaIcon.png");
        
        imgSala.setSize(32, 32);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgSala, "src\\diseño\\imagenes\\salaWhite32.png");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnUserMember = new javax.swing.JPanel();
        btnUserMember = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imgUserMember = new javax.swing.JLabel();
        pnMPago = new javax.swing.JPanel();
        btnMPago = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        imgMPago = new javax.swing.JLabel();
        pnMovie = new javax.swing.JPanel();
        btnAMovie = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        imgMovie = new javax.swing.JLabel();
        pnConsumibles = new javax.swing.JPanel();
        btnConsumbiles = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imgConsumibles = new javax.swing.JLabel();
        pnDSala = new javax.swing.JPanel();
        btnDRoom = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        imgSala = new javax.swing.JLabel();
        contenedor = new javax.swing.JScrollPane();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnUserMember.setBackground(new java.awt.Color(241, 148, 138));
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
        pnUserMember.add(btnUserMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 134, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("y usuarios");
        pnUserMember.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 26, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sobre miembros");
        pnUserMember.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 12, -1, -1));
        pnUserMember.add(imgUserMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 32, 32));

        add(pnUserMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 134, 50));

        pnMPago.setBackground(new java.awt.Color(241, 148, 138));
        pnMPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMPagoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMPagoMouseExited(evt);
            }
        });
        pnMPago.add(btnMPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 134, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pago");
        pnMPago.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 26, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Metodos de");
        pnMPago.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 12, -1, -1));
        pnMPago.add(imgMPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 32, 32));

        add(pnMPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 0, 134, 50));

        pnMovie.setBackground(new java.awt.Color(241, 148, 138));
        pnMovie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAMovie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAMovieMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAMovieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAMovieMouseExited(evt);
            }
        });
        pnMovie.add(btnAMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 134, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Peliculas");
        pnMovie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 26, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sobre");
        pnMovie.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 12, -1, -1));
        pnMovie.add(imgMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 32, 32));

        add(pnMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 134, 50));

        pnConsumibles.setBackground(new java.awt.Color(241, 148, 138));
        pnConsumibles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsumbiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsumbiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsumbilesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsumbilesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsumbilesMouseExited(evt);
            }
        });
        pnConsumibles.add(btnConsumbiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 134, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consumibles");
        pnConsumibles.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        pnConsumibles.add(imgConsumibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        add(pnConsumibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 0, 134, 50));

        pnDSala.setBackground(new java.awt.Color(241, 148, 138));
        pnDSala.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDRoomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDRoomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDRoomMouseExited(evt);
            }
        });
        pnDSala.add(btnDRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sala");
        pnDSala.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 26, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Desasociar");
        pnDSala.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 12, -1, -1));
        pnDSala.add(imgSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 10, 32, 32));

        add(pnDSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 140, 50));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 680, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMemberMouseEntered
        this.pnUserMember.setBackground(new java.awt.Color(205, 97, 85));
    }//GEN-LAST:event_btnUserMemberMouseEntered

    private void btnUserMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMemberMouseExited
        this.pnUserMember.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnUserMemberMouseExited

    private void btnMPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPagoMouseEntered
        this.pnMPago.setBackground(new java.awt.Color(205, 97, 85));
    }//GEN-LAST:event_btnMPagoMouseEntered

    private void btnMPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPagoMouseExited
        this.pnMPago.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnMPagoMouseExited

    private void btnAMovieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMovieMouseEntered
        this.pnMovie.setBackground(new java.awt.Color(205, 97, 85));
    }//GEN-LAST:event_btnAMovieMouseEntered

    private void btnAMovieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMovieMouseExited
        this.pnMovie.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnAMovieMouseExited

    private void btnConsumbilesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsumbilesMouseEntered
        this.pnConsumibles.setBackground(new java.awt.Color(205, 97, 85));
    }//GEN-LAST:event_btnConsumbilesMouseEntered

    private void btnConsumbilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsumbilesMouseExited
        this.pnConsumibles.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnConsumbilesMouseExited

    private void btnDRoomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDRoomMouseEntered
        this.pnDSala.setBackground(new java.awt.Color(205, 97, 85));
    }//GEN-LAST:event_btnDRoomMouseEntered

    private void btnDRoomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDRoomMouseExited
        this.pnDSala.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnDRoomMouseExited

    private void btnUserMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMemberMouseClicked
        UserMembers um = new UserMembers();
        this.contenedor.setViewportView(um);
    }//GEN-LAST:event_btnUserMemberMouseClicked

    private void btnMPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPagoMouseClicked
        MPay mp = new MPay();
        this.contenedor.setViewportView(mp);
    }//GEN-LAST:event_btnMPagoMouseClicked

    private void btnAMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMovieMouseClicked
        AMovie am = new AMovie();
        this.contenedor.setViewportView(am);
    }//GEN-LAST:event_btnAMovieMouseClicked

    private void btnConsumbilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsumbilesMouseClicked
        Consumibles cs = new Consumibles();
        this.contenedor.setViewportView(cs);
    }//GEN-LAST:event_btnConsumbilesMouseClicked

    private void btnDRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDRoomMouseClicked
        DRoom dr = new DRoom();
        this.contenedor.setViewportView(dr);
    }//GEN-LAST:event_btnDRoomMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAMovie;
    private javax.swing.JLabel btnConsumbiles;
    private javax.swing.JLabel btnDRoom;
    private javax.swing.JLabel btnMPago;
    private javax.swing.JLabel btnUserMember;
    private javax.swing.JScrollPane contenedor;
    private javax.swing.JLabel imgConsumibles;
    private javax.swing.JLabel imgMPago;
    private javax.swing.JLabel imgMovie;
    private javax.swing.JLabel imgSala;
    private javax.swing.JLabel imgUserMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnConsumibles;
    private javax.swing.JPanel pnDSala;
    private javax.swing.JPanel pnMPago;
    private javax.swing.JPanel pnMovie;
    private javax.swing.JPanel pnUserMember;
    // End of variables declaration//GEN-END:variables
}