package pimportantes;

import pmostrar.*;

public class Boletas extends javax.swing.JPanel {
    Bienvenida b = new Bienvenida();
    
    public Boletas() {
        initComponents();
        this.contenedor.setViewportView(b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsumibles = new javax.swing.JLabel();
        btnMiembros = new javax.swing.JLabel();
        btnPeliculas = new javax.swing.JLabel();
        btnMPagos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        contenedor = new javax.swing.JScrollPane();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 148, 138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsumibles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsumibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsumiblesMouseClicked(evt);
            }
        });
        jPanel1.add(btnConsumibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 0, 170, 50));

        btnMiembros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMiembros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMiembrosMouseClicked(evt);
            }
        });
        jPanel1.add(btnMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        btnPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPeliculasMouseClicked(evt);
            }
        });
        jPanel1.add(btnPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 0, 137, 50));

        btnMPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMPagosMouseClicked(evt);
            }
        });
        jPanel1.add(btnMPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 0, 195, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/vipIcon32.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 32, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Miembros");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/peliculaIcon32.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, 32, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Peliculas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 16, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Metodos de Pago");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 16, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/mPagoIcon32.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 11, 32, 32));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/consumiblesIcon32.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 11, 32, 32));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Consumibles");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 16, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 0, 2, 52));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 2, 52));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 0, 2, 52));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 52));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 670, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMiembrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiembrosMouseClicked
        Miembros m = new Miembros();
        this.contenedor.setViewportView(m);
    }//GEN-LAST:event_btnMiembrosMouseClicked

    private void btnPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPeliculasMouseClicked
        Peliculas p = new Peliculas();
        this.contenedor.setViewportView(p);
    }//GEN-LAST:event_btnPeliculasMouseClicked

    private void btnMPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMPagosMouseClicked
        MPagos mp = new MPagos();
        this.contenedor.setViewportView(mp);
    }//GEN-LAST:event_btnMPagosMouseClicked

    private void btnConsumiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsumiblesMouseClicked
        Consumibles c = new Consumibles();
        this.contenedor.setViewportView(c);
    }//GEN-LAST:event_btnConsumiblesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnConsumibles;
    private javax.swing.JLabel btnMPagos;
    private javax.swing.JLabel btnMiembros;
    private javax.swing.JLabel btnPeliculas;
    private javax.swing.JScrollPane contenedor;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
