package pmodificar;

import datos.BebidasCRUD;
import datos.ComidasCRUD;
import datos.SetMapData;
import entidades.Consumible;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consumibles extends javax.swing.JPanel {
    private DefaultTableModel modeloComida;
    private DefaultTableModel modeloBebida;
    private final BebidasCRUD bc = new BebidasCRUD();
    private final ComidasCRUD cc = new ComidasCRUD();
    private final SetMapData smd = new SetMapData();
    private int idComida, idBebida;
    
    public Consumibles() {
        initComponents();
        desactivarCampos();
    }
    
    private void activarCamposComidas() {
        this.txtCodeFood.setEnabled(true);
        this.txtNameFood.setEnabled(true);
        this.txtPrecioFood.setEnabled(true);

        this.btnUpdateFood.setEnabled(true);
        this.btnDeleteFood.setEnabled(true);
    }
    
    private void activarCamposBebidas() {
        this.txtCodeDrink.setEnabled(true);
        this.txtNameDrink.setEnabled(true);
        this.txtPrecioDrink.setEnabled(true);

        this.btnUpdateDrink.setEnabled(true);
        this.btnDeleteDrink.setEnabled(true);
    }

    private void desactivarCampos() {
        this.txtCodeFood.setEnabled(false);
        this.txtNameFood.setEnabled(false);
        this.txtPrecioFood.setEnabled(false);

        this.btnUpdateFood.setEnabled(false);
        this.btnDeleteFood.setEnabled(false);
        this.btnSelectFood.setEnabled(false);
        
        this.txtCodeDrink.setEnabled(false);
        this.txtNameDrink.setEnabled(false);
        this.txtPrecioDrink.setEnabled(false);

        this.btnUpdateDrink.setEnabled(false);
        this.btnDeleteDrink.setEnabled(false);
        this.btnSelectDrink.setEnabled(false);
    }
    
    private void limpiarDatosComida(){
        this.txtCodeFood.setText("");
        this.txtNameFood.setText("");
        this.txtPrecioFood.setText("");
    }
    
    private void limpiarDatosBebida(){
        this.txtCodeDrink.setText("");
        this.txtNameDrink.setText("");
        this.txtPrecioDrink.setText("");
    }
    
    private void modeloComidas() {
        modeloComida = new DefaultTableModel();
        List<Consumible> lista = cc.mostrar();
        String[] registro = new String[3];

        modeloComida.addColumn("Código");
        modeloComida.addColumn("Nombre Comida");
        modeloComida.addColumn("Precio");

        for (Consumible dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            registro[2] = Double.toString(dato.getPrecio());
            modeloComida.addRow(registro);
        }

        this.tableComidas.setModel(modeloComida);
    }
    
    private void modeloBebidas() {
        modeloBebida = new DefaultTableModel();
        List<Consumible> lista = bc.mostrar();
        String[] registro = new String[3];

        modeloBebida.addColumn("Código");
        modeloBebida.addColumn("Nombre Bebida");
        modeloBebida.addColumn("Precio");

        for (Consumible dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            registro[2] = Double.toString(dato.getPrecio());
            modeloBebida.addRow(registro);
        }

        this.tableBebidas.setModel(modeloBebida);
    }
    
    private void seleccionarComida() {
        if (this.tableComidas.getSelectedRow() > -1) {
            String codigo = (String) modeloComida.getValueAt(this.tableComidas.getSelectedRow(), 0);
            String nombre = (String) modeloComida.getValueAt(this.tableComidas.getSelectedRow(), 1);
            String precio = (String) modeloComida.getValueAt(this.tableComidas.getSelectedRow(), 2);
            
            idComida = Integer.parseInt(codigo);

            this.txtCodeFood.setText(codigo);
            this.txtNameFood.setText(nombre);
            this.txtPrecioFood.setText(precio);
            this.tableComidas.setEnabled(false);

            activarCamposComidas();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    private void seleccionarBebida() {
        if (this.tableBebidas.getSelectedRow() > -1) {
            String codigo = (String) modeloBebida.getValueAt(this.tableBebidas.getSelectedRow(), 0);
            String nombre = (String) modeloBebida.getValueAt(this.tableBebidas.getSelectedRow(), 1);
            String precio = (String) modeloBebida.getValueAt(this.tableBebidas.getSelectedRow(), 2);
            
            idBebida = Integer.parseInt(codigo);

            this.txtCodeDrink.setText(codigo);
            this.txtNameDrink.setText(nombre);
            this.txtPrecioDrink.setText(precio);
            this.tableBebidas.setEnabled(false);

            activarCamposBebidas();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableComidas = new javax.swing.JTable();
        btnShowFood = new javax.swing.JButton();
        btnSelectFood = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnUpdateFood = new javax.swing.JButton();
        btnDeleteFood = new javax.swing.JButton();
        txtCodeFood = new javax.swing.JTextField();
        txtNameFood = new javax.swing.JTextField();
        txtPrecioFood = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnShowDrink = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSelectDrink = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBebidas = new javax.swing.JTable();
        btnUpdateDrink = new javax.swing.JButton();
        btnDeleteDrink = new javax.swing.JButton();
        txtPrecioDrink = new javax.swing.JTextField();
        txtNameDrink = new javax.swing.JTextField();
        txtCodeDrink = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Editar Consumibles:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tableComidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableComidas);

        btnShowFood.setText("Mostrar Datos");
        btnShowFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFoodActionPerformed(evt);
            }
        });

        btnSelectFood.setText("Seleccionar");
        btnSelectFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFoodActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/comidaIcon128.png"))); // NOI18N

        btnUpdateFood.setText("Modificar");
        btnUpdateFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFoodActionPerformed(evt);
            }
        });

        btnDeleteFood.setText("Eliminar");
        btnDeleteFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFoodActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Precio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameFood, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txtPrecioFood)
                            .addComponent(txtCodeFood))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteFood, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnShowFood, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnSelectFood, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodeFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtNameFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecioFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnUpdateFood)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteFood))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShowFood)
                            .addComponent(btnSelectFood))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar Comidas", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnShowDrink.setText("Mostrar Datos");
        btnShowDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDrinkActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/bebidaIcon128.png"))); // NOI18N

        btnSelectDrink.setText("Seleccionar");
        btnSelectDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDrinkActionPerformed(evt);
            }
        });

        tableBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableBebidas);

        btnUpdateDrink.setText("Modificar");
        btnUpdateDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDrinkActionPerformed(evt);
            }
        });

        btnDeleteDrink.setText("Eliminar");
        btnDeleteDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDrinkActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre:");

        jLabel8.setText("Precio:");

        jLabel6.setText("Código:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNameDrink)
                            .addComponent(txtCodeDrink)
                            .addComponent(txtPrecioDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateDrink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnShowDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSelectDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodeDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtNameDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecioDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnUpdateDrink)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteDrink))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShowDrink)
                            .addComponent(btnSelectDrink))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar Bebidas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFoodActionPerformed
        modeloComidas();
        this.btnSelectFood.setEnabled(true);
        this.btnShowFood.setEnabled(false);
    }//GEN-LAST:event_btnShowFoodActionPerformed

    private void btnSelectFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFoodActionPerformed
        seleccionarComida();
    }//GEN-LAST:event_btnSelectFoodActionPerformed

    private void btnUpdateFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFoodActionPerformed
        int codigo = Integer.parseInt(txtCodeFood.getText());
        String nombre = txtNameFood.getText();
        double precio = Double.parseDouble(txtPrecioFood.getText());

        boolean modificar = cc.modificar(codigo, nombre, precio, idComida);

        if (modificar) {
            modeloComida.getDataVector().removeAllElements();
            tableComidas.updateUI();
            modeloComidas();
            limpiarDatosComida();
            this.btnUpdateFood.setEnabled(false);
            this.btnDeleteFood.setEnabled(false);

            this.txtCodeFood.setEnabled(false);
            this.txtNameFood.setEnabled(false);
            this.txtPrecioFood.setEnabled(false);
            this.tableComidas.setEnabled(true);
        }
    }//GEN-LAST:event_btnUpdateFoodActionPerformed

    private void btnDeleteFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFoodActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = cc.eliminar(idComida);
                if (delete) {
                    limpiarDatosComida();
                    this.btnUpdateFood.setEnabled(false);
                    this.btnDeleteFood.setEnabled(false);

                    this.txtCodeFood.setEnabled(false);
                    this.txtNameFood.setEnabled(false);
                    this.txtPrecioFood.setEnabled(false);
                    this.tableComidas.setEnabled(true);
                    modeloComida.removeRow(this.tableComidas.getSelectedRow());
                    this.tableComidas.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Error");
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteFoodActionPerformed

    private void btnShowDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDrinkActionPerformed
        modeloBebidas();
        this.btnSelectDrink.setEnabled(true);
        this.btnShowDrink.setEnabled(false);
    }//GEN-LAST:event_btnShowDrinkActionPerformed

    private void btnSelectDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDrinkActionPerformed
        seleccionarBebida();
    }//GEN-LAST:event_btnSelectDrinkActionPerformed

    private void btnUpdateDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDrinkActionPerformed
        int codigo = Integer.parseInt(txtCodeDrink.getText());
        String nombre = txtNameDrink.getText();
        double precio = Double.parseDouble(txtPrecioDrink.getText());

        boolean modificar = bc.modificar(codigo, nombre, precio, idBebida);

        if (modificar) {
            modeloBebida.getDataVector().removeAllElements();
            tableBebidas.updateUI();
            modeloBebidas();
            limpiarDatosBebida();
            this.btnUpdateDrink.setEnabled(false);
            this.btnDeleteDrink.setEnabled(false);

            this.txtCodeDrink.setEnabled(false);
            this.txtNameDrink.setEnabled(false);
            this.txtPrecioDrink.setEnabled(false);
            this.tableBebidas.setEnabled(true);
        }
    }//GEN-LAST:event_btnUpdateDrinkActionPerformed

    private void btnDeleteDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDrinkActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = bc.eliminar(idBebida);
                if (delete) {
                    limpiarDatosBebida();
                    this.btnUpdateDrink.setEnabled(false);
                    this.btnDeleteDrink.setEnabled(false);

                    this.txtCodeDrink.setEnabled(false);
                    this.txtNameDrink.setEnabled(false);
                    this.txtPrecioDrink.setEnabled(false);
                    this.tableBebidas.setEnabled(true);
                    modeloBebida.removeRow(this.tableBebidas.getSelectedRow());
                    this.tableBebidas.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Error");
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteDrinkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteDrink;
    private javax.swing.JButton btnDeleteFood;
    private javax.swing.JButton btnSelectDrink;
    private javax.swing.JButton btnSelectFood;
    private javax.swing.JButton btnShowDrink;
    private javax.swing.JButton btnShowFood;
    private javax.swing.JButton btnUpdateDrink;
    private javax.swing.JButton btnUpdateFood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableBebidas;
    private javax.swing.JTable tableComidas;
    private javax.swing.JTextField txtCodeDrink;
    private javax.swing.JTextField txtCodeFood;
    private javax.swing.JTextField txtNameDrink;
    private javax.swing.JTextField txtNameFood;
    private javax.swing.JTextField txtPrecioDrink;
    private javax.swing.JTextField txtPrecioFood;
    // End of variables declaration//GEN-END:variables
}
