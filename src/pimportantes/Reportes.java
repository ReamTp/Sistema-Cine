package pimportantes;

import java.awt.Color;
import reportes.generarReportes;

public class Reportes extends javax.swing.JPanel {
    private final generarReportes gr = new generarReportes();
    
    public Reportes() {
        initComponents();
        generarImagenes();
    }
    
    public final void generarImagenes(){
        imgBoletaCli.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgBoletaCli, "src\\diseño\\imagenes\\boletoCliIcon.png");
        
        imgBoletaMem.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgBoletaMem, "src\\diseño\\imagenes\\boletoMemIcon.png");
        
        imgMember.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgMember, "src\\diseño\\imagenes\\memberIcon.png");
        
        imgDrink.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgDrink, "src\\diseño\\imagenes\\bebidaIcon.png");
        
        imgFood.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgFood, "src\\diseño\\imagenes\\palomitasIcon.png");
        
        imgPeliculas.setSize(64, 64);
        rsscalelabel.RSScaleLabel.setScaleLabel(imgPeliculas, "src\\diseño\\imagenes\\peliculaCineIcon.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbSubtitulo = new javax.swing.JLabel();
        pnBoletaCli = new javax.swing.JPanel();
        btnBoletaCli = new javax.swing.JLabel();
        imgBoletaCli = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnBoletaMem = new javax.swing.JPanel();
        btnBoletaMem = new javax.swing.JLabel();
        imgBoletaMem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnMember = new javax.swing.JPanel();
        btnMember = new javax.swing.JLabel();
        imgMember = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnDrink = new javax.swing.JPanel();
        btnDrink = new javax.swing.JLabel();
        imgDrink = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnFood = new javax.swing.JPanel();
        btnFood = new javax.swing.JLabel();
        imgFood = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnPeliculas = new javax.swing.JPanel();
        btnPeliculas = new javax.swing.JLabel();
        imgPeliculas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setFocusable(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 148, 138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Reporte de Datos");
        lbTitulo.setToolTipText("");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 29, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSubtitulo.setText("Elija el reporte de datos que desea ver");
        lbSubtitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lbSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        pnBoletaCli.setBackground(new java.awt.Color(255, 255, 255));
        pnBoletaCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnBoletaCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBoletaCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBoletaCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBoletaCliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBoletaCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBoletaCliMouseExited(evt);
            }
        });
        pnBoletaCli.add(btnBoletaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnBoletaCli.add(imgBoletaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Boletas de Clientes");
        pnBoletaCli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 104, -1, -1));

        jPanel2.add(pnBoletaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 155, 155));

        pnBoletaMem.setBackground(new java.awt.Color(255, 255, 255));
        pnBoletaMem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnBoletaMem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBoletaMem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBoletaMem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBoletaMemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBoletaMemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBoletaMemMouseExited(evt);
            }
        });
        pnBoletaMem.add(btnBoletaMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnBoletaMem.add(imgBoletaMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Boletas de Miembros");
        pnBoletaMem.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 104, -1, -1));

        jPanel2.add(pnBoletaMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 155, 155));

        pnMember.setBackground(new java.awt.Color(255, 255, 255));
        pnMember.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMemberMouseExited(evt);
            }
        });
        pnMember.add(btnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnMember.add(imgMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Miembros");
        pnMember.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 104, -1, -1));

        jPanel2.add(pnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 155, 155));

        pnDrink.setBackground(new java.awt.Color(255, 255, 255));
        pnDrink.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnDrink.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDrink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDrinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDrinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDrinkMouseExited(evt);
            }
        });
        pnDrink.add(btnDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnDrink.add(imgDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Bebidas");
        pnDrink.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 104, -1, -1));

        jPanel2.add(pnDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 155, 155));

        pnFood.setBackground(new java.awt.Color(255, 255, 255));
        pnFood.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnFood.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFoodMouseExited(evt);
            }
        });
        pnFood.add(btnFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnFood.add(imgFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Comidas");
        pnFood.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 104, -1, -1));

        jPanel2.add(pnFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 155, 155));

        pnPeliculas.setBackground(new java.awt.Color(255, 255, 255));
        pnPeliculas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnPeliculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPeliculasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPeliculasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPeliculasMouseExited(evt);
            }
        });
        pnPeliculas.add(btnPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 154, 154));
        pnPeliculas.add(imgPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 64, 64));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Peliculas");
        pnPeliculas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 104, -1, -1));

        jPanel2.add(pnPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 155, 155));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 670, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoletaCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaCliMouseEntered
        this.pnBoletaCli.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnBoletaCliMouseEntered

    private void btnBoletaMemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMemMouseExited
        this.pnBoletaMem.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnBoletaMemMouseExited

    private void btnBoletaMemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMemMouseEntered
        this.pnBoletaMem.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnBoletaMemMouseEntered

    private void btnBoletaCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaCliMouseExited
        this.pnBoletaCli.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnBoletaCliMouseExited

    private void btnMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseEntered
        this.pnMember.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnMemberMouseEntered

    private void btnMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseExited
        this.pnMember.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnMemberMouseExited

    private void btnDrinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDrinkMouseEntered
        this.pnDrink.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnDrinkMouseEntered

    private void btnDrinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDrinkMouseExited
        this.pnDrink.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnDrinkMouseExited

    private void btnFoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFoodMouseEntered
        this.pnFood.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnFoodMouseEntered

    private void btnFoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFoodMouseExited
        this.pnFood.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnFoodMouseExited

    private void btnPeliculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeliculasMouseEntered
        this.pnPeliculas.setBackground(new java.awt.Color(241, 148, 138));
    }//GEN-LAST:event_btnPeliculasMouseEntered

    private void btnPeliculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeliculasMouseExited
        this.pnPeliculas.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnPeliculasMouseExited

    private void btnBoletaCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaCliMouseClicked
        gr.reporteBCli();
    }//GEN-LAST:event_btnBoletaCliMouseClicked

    private void btnBoletaMemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMemMouseClicked
        gr.reporteBMem();
    }//GEN-LAST:event_btnBoletaMemMouseClicked

    private void btnMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseClicked
        gr.reporteMember();
    }//GEN-LAST:event_btnMemberMouseClicked

    private void btnDrinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDrinkMouseClicked
        gr.reporteDrink();
    }//GEN-LAST:event_btnDrinkMouseClicked

    private void btnFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFoodMouseClicked
        gr.reporteFood();
    }//GEN-LAST:event_btnFoodMouseClicked

    private void btnPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeliculasMouseClicked
        gr.reporteMovie();
    }//GEN-LAST:event_btnPeliculasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBoletaCli;
    private javax.swing.JLabel btnBoletaMem;
    private javax.swing.JLabel btnDrink;
    private javax.swing.JLabel btnFood;
    private javax.swing.JLabel btnMember;
    private javax.swing.JLabel btnPeliculas;
    private javax.swing.JLabel imgBoletaCli;
    private javax.swing.JLabel imgBoletaMem;
    private javax.swing.JLabel imgDrink;
    private javax.swing.JLabel imgFood;
    private javax.swing.JLabel imgMember;
    private javax.swing.JLabel imgPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnBoletaCli;
    private javax.swing.JPanel pnBoletaMem;
    private javax.swing.JPanel pnDrink;
    private javax.swing.JPanel pnFood;
    private javax.swing.JPanel pnMember;
    private javax.swing.JPanel pnPeliculas;
    // End of variables declaration//GEN-END:variables
}
