package pimportantes;

import datos.BebidasCRUD;
import datos.BoletasConsumiblesCRUD;
import datos.ComidasCRUD;
import datos.SetMapData;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PayFood extends javax.swing.JPanel {
    private final BoletasConsumiblesCRUD bcc = new BoletasConsumiblesCRUD();
    private final ComidasCRUD cc = new ComidasCRUD();
    private final BebidasCRUD bc = new BebidasCRUD();
    private final SetMapData smd = new SetMapData();
    private DefaultTableModel modeloComidas, modeloBebidas;
    private DecimalFormat df = new DecimalFormat("#.00");
    private double cantPagar = 0;

    public PayFood() {
        initComponents();
        comprobarComboBox();
        modeloTablas();
        bloquearCampos();
    }

    private void comprobarComboBox() {
        for (String key : smd.keysFood) {
            this.cbComida.addItem(key);
        }

        for (String key : smd.keysDrink) {
            this.cbBebidas.addItem(key);
        }

        for (String key : smd.keysMPago) {
            this.cbMPago.addItem(key);
        }
    }

    private void modeloTablas() {
        modeloComidas = new DefaultTableModel();
        modeloBebidas = new DefaultTableModel();

        modeloComidas.addColumn("Nombre");
        modeloComidas.addColumn("Cantidad");

        modeloBebidas.addColumn("Nombre");
        modeloBebidas.addColumn("Cantidad");
        this.tableFood.setModel(modeloComidas);
        this.tableDrink.setModel(modeloBebidas);
    }

    private boolean recorrerTables() {
        boolean respFood = false, respDrink = false, valor = false;

        int filaFood = tableFood.getRowCount();
        if (filaFood > 0) {
            for (int i = 0; i < filaFood; i++) {
                String nameFood = tableFood.getValueAt(i, 0).toString();
                int codeFood = smd.ValueFood(nameFood);
                int cantFood = (int) tableFood.getValueAt(i, 1);
                respFood = bcc.agregarComida(codeFood, cantFood);
            }
        }

        int filaDrink = tableDrink.getRowCount();
        if (filaDrink > 0) {
            for (int i = 0; i < filaDrink; i++) {
                String nameDrink = tableDrink.getValueAt(i, 0).toString();
                int codeDrink = smd.ValueDrink(nameDrink);
                int cantDrink = (int) tableDrink.getValueAt(i, 1);

                respDrink = bcc.agregarBebida(codeDrink, cantDrink);
            }
        }

        if (respFood || respDrink) {
            valor = true;
        }
        return valor;
    }

    private void resetFood() {
        this.cbComida.setSelectedIndex(0);
        this.jsCantFood.setValue(0);
    }

    private void resetDrink() {
        this.cbBebidas.setSelectedIndex(0);
        this.jsCantDrink.setValue(0);
    }

    private void bloquearCampos() {
        cbMPago.setEnabled(false);
        btnPagar.setEnabled(false);
    }

    private double calcular() {
        cantPagar = 0;
        int filaFood = tableFood.getRowCount();
        if (filaFood > 0) {
            for (int i = 0; i < filaFood; i++) {
                String nameFood = tableFood.getValueAt(i, 0).toString();
                System.out.println(nameFood);
                int code = smd.ValueFood(nameFood);
                double precio = cc.obtenerPrecio(code);
                int cantFood = (int) tableFood.getValueAt(i, 1);
                double operacion = precio * cantFood;
                cantPagar = cantPagar + operacion;
            }
        }

        int filaDrink = tableDrink.getRowCount();
        if (filaDrink > 0) {
            for (int i = 0; i < filaDrink; i++) {
                String nameDrink = tableDrink.getValueAt(i, 0).toString();
                int code = smd.ValueDrink(nameDrink);
                double precio = bc.obtenerPrecio(code);
                int cantDrink = (int) tableDrink.getValueAt(i, 1);
                double operacion = precio * cantDrink;
                cantPagar = cantPagar + operacion;
            }
        }
        if (cantPagar != 0) {
            this.lbCosto.setText("S/" + df.format(cantPagar));
        } else {
            this.lbCosto.setText("S/0.00");
        }
        return cantPagar;
    }

    private void activarCampos() {
        double valor = calcular();
        if (valor != 0) {
            this.cbMPago.setEnabled(true);
            this.btnPagar.setEnabled(true);
        } else {
            this.cbMPago.setEnabled(false);
            this.btnPagar.setEnabled(false);
        }
    }

    private void limpiarCampos() {
        modeloComidas.getDataVector().removeAllElements();
        tableFood.updateUI();
        modeloBebidas.getDataVector().removeAllElements();
        tableDrink.updateUI();
        modeloTablas();
    }

    private String obtenerFecha() {
        Date fecha = new Date();
        SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dformat.format(fecha);
        return date;
    }

    private String obtenerHora() {
        Date hora = new Date();
        SimpleDateFormat hformat = new SimpleDateFormat("hh:mm");
        String hour = hformat.format(hora);
        return hour;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMPago = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lbCosto = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbComida = new javax.swing.JComboBox<>();
        jsCantFood = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btnAddFood = new javax.swing.JButton();
        cbBebidas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jsCantDrink = new javax.swing.JSpinner();
        btnAddDrink = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFood = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDrink = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDeleteDrink = new javax.swing.JButton();
        btnDeleteFood = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Metodo de Pago:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Registrar Nueva Boleta de Pago de Consumibles");

        jLabel5.setText("Total a Pagar:");

        lbCosto.setText("S/. 0.00");

        btnPagar.setText("Pagar Consumibles");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jLabel3.setText("Comida:");

        jsCantFood.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel4.setText("Cantidad:");

        btnAddFood.setText("Agregar");
        btnAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodActionPerformed(evt);
            }
        });

        jLabel7.setText("Bebida:");

        jLabel8.setText("Cantidad:");

        jsCantDrink.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnAddDrink.setText("Agregar");
        btnAddDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrinkActionPerformed(evt);
            }
        });

        tableFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableFood);

        tableDrink.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableDrink);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Agregar Bebida:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Agregar Comida:");

        btnDeleteDrink.setText("Eliminar");
        btnDeleteDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDrinkActionPerformed(evt);
            }
        });

        btnDeleteFood.setText("Eliminar");
        btnDeleteFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel10)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(73, 73, 73)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jsCantFood, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbComida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAddFood, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteFood, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbMPago, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCosto))
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsCantDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jsCantDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddDrink)
                            .addComponent(btnDeleteDrink))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbCosto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPagar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jsCantFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddFood)
                            .addComponent(btnDeleteFood))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodActionPerformed
        int cantFood = (int) this.jsCantFood.getValue();
        if (cantFood != 0) {
            String comida = this.cbComida.getSelectedItem().toString();
            modeloComidas.addRow(new Object[]{comida, cantFood});
            resetFood();
            activarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese como minimo 1 producto");
        }
    }//GEN-LAST:event_btnAddFoodActionPerformed

    private void btnDeleteFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFoodActionPerformed
        int filaFood = tableFood.getRowCount();

        if (filaFood > 0) {
            int opcion = JOptionPane.showConfirmDialog(null, "Eliminar Comida", "¿Seguro que quiere eliminarlo?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (opcion) {
                case 0 -> {
                    int a = this.tableFood.getSelectedRow();
                    if (a >= 0) {
                        modeloComidas.removeRow(this.tableFood.getSelectedRow());
                        activarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione un dato a eliminar");
                    }
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos");
        }
    }//GEN-LAST:event_btnDeleteFoodActionPerformed

    private void btnDeleteDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDrinkActionPerformed
        int filaFood = tableDrink.getRowCount();

        if (filaFood > 0) {
            int opcion = JOptionPane.showConfirmDialog(null, "Eliminar Bebida", "¿Seguro que quiere eliminarlo?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (opcion) {
                case 0 -> {
                    int a = this.tableDrink.getSelectedRow();
                    if (a >= 0) {
                        modeloBebidas.removeRow(this.tableDrink.getSelectedRow());
                        activarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione un dato a eliminar");
                    }
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos");
        }
    }//GEN-LAST:event_btnDeleteDrinkActionPerformed

    private void btnAddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrinkActionPerformed
        int cantDrink = (int) this.jsCantDrink.getValue();
        if (cantDrink != 0) {
            String bebida = this.cbBebidas.getSelectedItem().toString();
            modeloBebidas.addRow(new Object[]{bebida, cantDrink});
            resetDrink();
            activarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese como minimo 1 producto");
        }
    }//GEN-LAST:event_btnAddDrinkActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        boolean valor = false;
        String fecha = obtenerFecha();
        String hora = obtenerHora();
        String mPago = this.cbMPago.getSelectedItem().toString();
        int idMPago = smd.ValueMPago(mPago);

        boolean resp = bcc.agregar(fecha, hora, idMPago, cantPagar);

        if (resp) {
            valor = recorrerTables();
        }
        if (valor) {
            limpiarCampos();
            cantPagar = 0;
            activarCampos();
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDrink;
    private javax.swing.JButton btnAddFood;
    private javax.swing.JButton btnDeleteDrink;
    private javax.swing.JButton btnDeleteFood;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cbBebidas;
    private javax.swing.JComboBox<String> cbComida;
    private javax.swing.JComboBox<String> cbMPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jsCantDrink;
    private javax.swing.JSpinner jsCantFood;
    private javax.swing.JLabel lbCosto;
    private javax.swing.JTable tableDrink;
    private javax.swing.JTable tableFood;
    // End of variables declaration//GEN-END:variables
}
