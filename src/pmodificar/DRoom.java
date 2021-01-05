package pmodificar;

import datos.SalasAsociadasCRUD;
import datos.SetMapData;
import entidades.SalasAsociadas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DRoom extends javax.swing.JPanel {
    private DefaultTableModel modeloDRoom;
    private final SalasAsociadasCRUD sac = new SalasAsociadasCRUD();
    private final SetMapData smd = new SetMapData();
    private int idPeli;

    public DRoom() {
        initComponents();
        comprobarComboBox();
        desactivarCampos();
    }

    private void comprobarComboBox() {
        final SetMapData setdata = new SetMapData();

        for (String key : setdata.keysMovie) {
            this.cbMovie.addItem(key);
        }

        for (String key : setdata.keysRoom) {
            this.cbRoom.addItem(key);
        }
    }

    private void resetSelectionData() {
        this.cbMovie.setSelectedIndex(0);
        this.cbRoom.setSelectedIndex(0);
    }

    private void activarCampos() {
        this.cbMovie.setEnabled(true);
        this.cbRoom.setEnabled(true);

        this.btnUpdate.setEnabled(true);
        this.btnDelete.setEnabled(true);
    }

    private void desactivarCampos() {
        this.cbMovie.setEnabled(false);
        this.cbRoom.setEnabled(false);

        this.btnUpdate.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnSelect.setEnabled(false);
    }

    private void modeloDRoom() {
        modeloDRoom = new DefaultTableModel();
        List<SalasAsociadas> lista = sac.mostrar();
        String[] registro = new String[2];

        modeloDRoom.addColumn("Sala");
        modeloDRoom.addColumn("Peliculas");

        for (SalasAsociadas dato : lista) {
            int codePeli = dato.getCodigoPeli();
            for (String key : smd.keysMovie) {
                int valor = smd.lisMovie.get(key);
                if (codePeli == valor) {
                    registro[0] = key;
                    break;
                }
            }
            int codeRoom = dato.getCodigoSala();
            for (String key : smd.keysRoom) {
                int valor = smd.lisRoom.get(key);
                if (codeRoom == valor) {
                    registro[1] = key;
                    break;
                }
            }
            modeloDRoom.addRow(registro);
        }

        this.tableRoomMovie.setModel(modeloDRoom);
    }

    private void seleccionar() {
        if (this.tableRoomMovie.getSelectedRow() > -1) {
            String codigoPeli = (String) modeloDRoom.getValueAt(this.tableRoomMovie.getSelectedRow(), 0);
            String codigoSala = (String) modeloDRoom.getValueAt(this.tableRoomMovie.getSelectedRow(), 1);

            for (String key : smd.keysMovie) {
                if (codigoPeli == key) {
                    idPeli = smd.lisMovie.get(key);
                    break;
                }
            }

            this.cbMovie.setSelectedItem(codigoPeli);
            this.cbRoom.setSelectedItem(codigoSala);
            this.tableRoomMovie.setEnabled(false);

            activarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbMovie = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbRoom = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRoomMovie = new javax.swing.JTable();
        btnShow = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Editar Salas Asociadas:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Pelicula:");

        jLabel2.setText("Sala:");

        btnUpdate.setText("Modificar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMovie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(cbMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/salaCineIcon128.png"))); // NOI18N

        tableRoomMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableRoomMovie);

        btnShow.setText("Mostrar Datos");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnSelect.setText("Seleccionar");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShow)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSelect)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        modeloDRoom();
        this.btnSelect.setEnabled(true);
        this.btnShow.setEnabled(false);
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        seleccionar();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String codigoPeli = cbMovie.getSelectedItem().toString();
        String codigoSala = cbRoom.getSelectedItem().toString();
        int peli = 0;
        int sala = 0;

        for (String key : smd.keysMovie) {
            if (codigoPeli.equals(key)) {
                peli = smd.lisMovie.get(key);
                break;
            }
        }

        for (String key : smd.keysRoom) {
            if (codigoSala.equals(key)) {
                sala = smd.lisRoom.get(key);
                break;
            }
        }

        boolean modificar = sac.modificar(peli, sala, idPeli);

        if (modificar) {
            modeloDRoom.getDataVector().removeAllElements();
            tableRoomMovie.updateUI();
            modeloDRoom();
            resetSelectionData();
            this.btnUpdate.setEnabled(false);
            this.btnDelete.setEnabled(false);

            this.cbMovie.setEnabled(false);
            this.cbRoom.setEnabled(false);
            this.tableRoomMovie.setEnabled(true);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = sac.desasociar(idPeli);
                if (delete) {
                    resetSelectionData();
                    this.btnUpdate.setEnabled(false);
                    this.btnDelete.setEnabled(false);

                    this.cbMovie.setEnabled(false);
                    this.cbRoom.setEnabled(false);
                    this.tableRoomMovie.setEnabled(true);
                    modeloDRoom.removeRow(this.tableRoomMovie.getSelectedRow());
                    this.tableRoomMovie.setEnabled(true);
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
    private javax.swing.JComboBox<String> cbMovie;
    private javax.swing.JComboBox<String> cbRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRoomMovie;
    // End of variables declaration//GEN-END:variables
}
