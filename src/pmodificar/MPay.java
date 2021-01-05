package pmodificar;

import datos.MPagosCRUD;
import entidades.MPagos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MPay extends javax.swing.JPanel {
    private DefaultTableModel modeloMPay;
    private final MPagosCRUD mpc = new MPagosCRUD();
    private int idMPago;
    
    public MPay() {
        initComponents();
        bloquearCampos();
    }
    
    private void limpiarMPago(){
        this.txtCode.setText("");
        this.txtNombre.setText("");
    }
    
    private void bloquearCampos(){
        this.txtCode.setEnabled(false);
        this.txtNombre.setEnabled(false);
        
        this.btnUpdate.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnSelect.setEnabled(false);
    }
    
    private void activarCampos(){
        this.txtCode.setEnabled(true);
        this.txtNombre.setEnabled(true);
        
        this.btnUpdate.setEnabled(true);
        this.btnDelete.setEnabled(true);
        this.btnSelect.setEnabled(true);
    }
    
    private void modeloMPago() {
        modeloMPay = new DefaultTableModel();
        List<MPagos> lista = mpc.mostrar();
        String[] registro = new String[2];

        modeloMPay.addColumn("Código");
        modeloMPay.addColumn("Nombre");

        for (MPagos dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            modeloMPay.addRow(registro);
        }
        this.tableMPago.setModel(modeloMPay);
    }
    
    private void seleccionarMPago(){
        if (this.tableMPago.getSelectedRow() > -1) {
            String codigo = (String) modeloMPay.getValueAt(this.tableMPago.getSelectedRow(), 0);
            String nombre = (String) modeloMPay.getValueAt(this.tableMPago.getSelectedRow(), 1);

            idMPago = Integer.parseInt(codigo);

            this.txtCode.setText(codigo);
            this.txtNombre.setText(nombre);
            this.tableMPago.setEnabled(false);

            activarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMPago = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Editar Metodos de Pago:");

        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Editar Metodos de Pago:");

        jLabel4.setText("Nombre:");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnUpdate.setText("Modificar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tableMPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMPago);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/mPagoIcon.png"))); // NOI18N

        btnSelect.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnSelect.setText("Seleccionar");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnShow.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnShow.setText("Mostrar Datos");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnShow))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelect)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        modeloMPago();
        this.btnSelect.setEnabled(true);
        this.btnShow.setEnabled(false);
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        seleccionarMPago();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int code = Integer.parseInt(this.txtCode.getText());
        String name = this.txtNombre.getText();

        boolean modificar = mpc.modificar(code, name, idMPago);

        if (modificar) {
            modeloMPay.getDataVector().removeAllElements();
            tableMPago.updateUI();
            modeloMPago();
            limpiarMPago();
            this.btnUpdate.setEnabled(false);
            this.btnDelete.setEnabled(false);

            this.txtCode.setEnabled(false);
            this.txtNombre.setEnabled(false);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = mpc.eliminar(idMPago);
                if (delete) {
                    limpiarMPago();
                    this.btnUpdate.setEnabled(false);
                    this.btnDelete.setEnabled(false);

                    this.txtCode.setEnabled(false);
                    this.txtNombre.setEnabled(false);
                    modeloMPay.removeRow(this.tableMPago.getSelectedRow());
                    this.tableMPago.setEnabled(true);
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMPago;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
