package pmodificar;

import datos.SetMapData;
import datos.*;
import modelosDatos.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserMembers extends javax.swing.JPanel {

    private final ModeloTablas mt = new ModeloTablas();
    private final UsuariosCRUD uc = new UsuariosCRUD();
    private final MiembrosCRUD mc = new MiembrosCRUD();
    private final TUsuariosCRUD tuc = new TUsuariosCRUD();
    private final TDocumentosCRUD tdc = new TDocumentosCRUD();
    private final SetMapData smd = new SetMapData();
    private DefaultTableModel modeloUser;
    private DefaultTableModel modeloMember;
    private DefaultTableModel modeloTUser;
    private DefaultTableModel modeloTDoc;
    private int idUser, idMember, idTUser, idTDoc;

    public UserMembers() {
        initComponents();
        comprobarComboBox();
        desactivarBtnCampos();
        modelosTablas();
    }

    private void limpiarUsuario() {
        this.txtCodeUser.setText("");
        this.txtNameUser.setText("");
        this.cbTDocUser.setSelectedIndex(0);
        this.txtNumTDocUser.setText("");
        this.txtCorreoUser.setText("");
        this.txtPassUser.setText("");
        this.cbTipoUser.setSelectedIndex(0);
    }

    private void limpiarMiembros() {
        this.txtCodeMember.setText("");
        this.txtCodeMember.setText("");
        this.cbTDocMember.setSelectedIndex(0);
        this.txtNumerDocMember.setText("");
    }

    private void limpiarTUser() {
        this.txtCodTUser.setText("");
        this.txtNameTUser.setText("");
    }

    private void limpiarTDoc() {
        this.txtCodeTDoc.setText("");
        this.txtNameTDoc.setText("");
    }

    private void comprobarComboBox() {
        final SetMapData setdata = new SetMapData();
        for (String key : setdata.keysTDoc) {
            this.cbTDocUser.addItem(key);
            this.cbTDocMember.addItem(key);
        }

        for (String key : setdata.keysTUser) {
            this.cbTipoUser.addItem(key);
        }
    }

    private void resetComboBox() {
        this.cbTDocUser.removeAllItems();
        this.cbTDocMember.removeAllItems();
        this.cbTipoUser.removeAllItems();
        comprobarComboBox();
    }

    private void CamposUsuarios(boolean valor) {
        this.btnUpdateUser.setEnabled(valor);
        this.btnDeleteUser.setEnabled(valor);

        this.txtCodeUser.setEnabled(valor);
        this.txtNameUser.setEnabled(valor);
        this.cbTDocUser.setEnabled(valor);
        this.txtNumTDocUser.setEnabled(valor);
        this.txtCorreoUser.setEnabled(valor);
        this.txtPassUser.setEnabled(valor);
        this.cbTipoUser.setEnabled(valor);
    }

    private void CamposMember(boolean valor) {
        this.txtCodeMember.setEnabled(valor);
        this.txtNameMember.setEnabled(valor);
        this.cbTDocMember.setEnabled(valor);
        this.txtNumerDocMember.setEnabled(valor);

        this.btnUpdateMember.setEnabled(valor);
        this.btnDeleteMember.setEnabled(valor);
    }

    private void CamposTUser(boolean valor) {
        this.txtCodTUser.setEnabled(valor);
        this.txtNameTUser.setEnabled(valor);

        this.btnUpdateTUser.setEnabled(valor);
        this.btnDeleteTUser.setEnabled(valor);
    }

    private void CamposTDoc(boolean valor) {
        this.txtCodeTDoc.setEnabled(valor);
        this.txtNameTDoc.setEnabled(valor);

        this.btnUpdateTDoc.setEnabled(valor);
        this.btnDeleteTDoc.setEnabled(valor);
    }

    private void desactivarBtnCampos() {
        // Usuarios
        this.btnUpdateUser.setEnabled(false);
        this.btnDeleteUser.setEnabled(false);

        this.txtCodeUser.setEnabled(false);
        this.txtNameUser.setEnabled(false);
        this.cbTDocUser.setEnabled(false);
        this.txtNumTDocUser.setEnabled(false);
        this.txtCorreoUser.setEnabled(false);
        this.txtPassUser.setEnabled(false);
        this.cbTipoUser.setEnabled(false);

        // Miembros
        this.txtCodeMember.setEnabled(false);
        this.txtNameMember.setEnabled(false);
        this.cbTDocMember.setEnabled(false);
        this.txtNumerDocMember.setEnabled(false);

        this.btnUpdateMember.setEnabled(false);
        this.btnDeleteMember.setEnabled(false);

        // Tipo Usuarios
        this.txtCodTUser.setEnabled(false);
        this.txtNameTUser.setEnabled(false);

        this.btnUpdateTUser.setEnabled(false);
        this.btnDeleteTUser.setEnabled(false);

        // Tipo Documentos
        this.txtCodeTDoc.setEnabled(false);
        this.txtNameTDoc.setEnabled(false);

        this.btnUpdateTDoc.setEnabled(false);
        this.btnDeleteTDoc.setEnabled(false);
    }

    private void modelosTablas() {
        modeloUser = mt.modeloUsuario();
        modeloMember = mt.modeloMiembro();
        modeloTUser = mt.modeloTUser();
        modeloTDoc = mt.modeloTDoc();
        this.tableUser.setModel(modeloUser);
        this.tableMember.setModel(modeloMember);
        this.tableTUser.setModel(modeloTUser);
        this.tableTDoc.setModel(modeloTDoc);
    }

    private void seleccionarUser() {
        // Obtenemos el primer dato del renglon seleccionado
        if (this.tableUser.getSelectedRow() > -1) {
            String codigo = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 0);
            String nombre = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 1);
            String tDoc = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 2);
            String numDoc = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 3);
            String email = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 4);
            String pass = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 5);
            String tUser = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 6);

            idUser = Integer.parseInt(codigo);

            this.txtCodeUser.setText(codigo);
            this.txtNameUser.setText(nombre);
            this.cbTDocUser.setSelectedItem(tDoc);
            this.txtNumTDocUser.setText(numDoc);
            this.txtCorreoUser.setText(email);
            this.txtPassUser.setText(pass);
            this.cbTipoUser.setSelectedItem(tUser);
            this.tableUser.setEnabled(false);

            CamposUsuarios(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }

    private void seleccionarMember() {
        // Obtenemos el primer dato del renglon seleccionado
        if (this.tableMember.getSelectedRow() > -1) {
            String codigo = (String) modeloMember.getValueAt(this.tableMember.getSelectedRow(), 0);
            String nombre = (String) modeloMember.getValueAt(this.tableMember.getSelectedRow(), 1);
            String tDoc = (String) modeloMember.getValueAt(this.tableMember.getSelectedRow(), 2);
            String numDoc = (String) modeloMember.getValueAt(this.tableMember.getSelectedRow(), 3);

            idMember = Integer.parseInt(codigo);

            this.txtCodeMember.setText(codigo);
            this.txtNameMember.setText(nombre);
            this.cbTDocMember.setSelectedItem(tDoc);
            this.txtNumerDocMember.setText(numDoc);
            this.tableMember.setEnabled(false);

            CamposMember(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }

    private void seleccionarTUser() {
        if (this.tableTUser.getSelectedRow() > -1) {
            String codigo = (String) tableTUser.getValueAt(this.tableTUser.getSelectedRow(), 0);
            String nombre = (String) tableTUser.getValueAt(this.tableTUser.getSelectedRow(), 1);

            idTUser = Integer.parseInt(codigo);

            this.txtCodTUser.setText(codigo);
            this.txtNameTUser.setText(nombre);
            this.tableTUser.setEnabled(false);

            CamposTUser(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }

    private void seleccionarTDoc() {
        if (this.tableTDoc.getSelectedRow() > -1) {
            String codigo = (String) tableTDoc.getValueAt(this.tableTDoc.getSelectedRow(), 0);
            String nombre = (String) tableTDoc.getValueAt(this.tableTDoc.getSelectedRow(), 1);

            idTDoc = Integer.parseInt(codigo);

            this.txtCodeTDoc.setText(codigo);
            this.txtNameTDoc.setText(nombre);
            this.tableTDoc.setEnabled(false);

            CamposTDoc(true);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbTipoUser = new javax.swing.JComboBox<>();
        txtCodeUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumTDocUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassUser = new javax.swing.JTextField();
        txtCorreoUser = new javax.swing.JTextField();
        txtNameUser = new javax.swing.JTextField();
        cbTDocUser = new javax.swing.JComboBox<>();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        btnSelectUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNameMember = new javax.swing.JTextField();
        txtCodeMember = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbTDocMember = new javax.swing.JComboBox<>();
        txtNumerDocMember = new javax.swing.JTextField();
        btnUpdateMember = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMember = new javax.swing.JTable();
        btnSelectMember = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnDeleteMember = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCodTUser = new javax.swing.JTextField();
        txtNameTUser = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnUpdateTUser = new javax.swing.JButton();
        btnDeleteTUser = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableTUser = new javax.swing.JTable();
        btnSelectTUser = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtCodeTDoc = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNameTDoc = new javax.swing.JTextField();
        btnUpdateTDoc = new javax.swing.JButton();
        btnDeleteTDoc = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableTDoc = new javax.swing.JTable();
        btnSelectTDoc = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Elije el tipo de dato que desees modificar");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Tipo de Doc:");

        cbTipoUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtCodeUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Número de Doc:");

        txtNumTDocUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("Correo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Contraseña:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Tipo de Usuario:");

        txtPassUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtCorreoUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtNameUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        cbTDocUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        btnUpdateUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnUpdateUser.setText("Modificar");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDeleteUser.setText("Eliminar");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        tableUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableUser);

        btnSelectUser.setText("Seleccionar");
        btnSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(txtCodeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addComponent(txtCorreoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cbTDocUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(5, 5, 5)
                                .addComponent(cbTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addComponent(txtNumTDocUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(btnSelectUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCodeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnUpdateUser)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(cbTDocUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cbTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnDeleteUser)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelectUser)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtNumTDocUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Modificar Usuarios", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("Código:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("Nombre:");

        txtNameMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtCodeMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("Tipo Doc:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("Número de Doc:");

        cbTDocMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtNumerDocMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        btnUpdateMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnUpdateMember.setText("Modificar");
        btnUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMemberActionPerformed(evt);
            }
        });

        tableMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tableMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableMember);

        btnSelectMember.setText("Seleccionar");
        btnSelectMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectMemberActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Editar Miembros:");

        btnDeleteMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDeleteMember.setText("Eliminar");
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(19, 19, 19)
                                .addComponent(txtCodeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(16, 16, 16)
                                .addComponent(txtNameMember, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTDocMember, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumerDocMember, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteMember, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectMember, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtCodeMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtNameMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cbTDocMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txtNumerDocMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnUpdateMember)
                        .addGap(17, 17, 17)
                        .addComponent(btnDeleteMember)
                        .addGap(17, 17, 17)
                        .addComponent(btnSelectMember)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Miembros", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Editar Tipos de Usuarios:");

        jLabel25.setText("Código:");

        jLabel26.setText("Descripcion:");

        btnUpdateTUser.setText("Modificar");
        btnUpdateTUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTUserActionPerformed(evt);
            }
        });

        btnDeleteTUser.setText("Eliminar");
        btnDeleteTUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTUserActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/tipoUsuario128.png"))); // NOI18N

        tableTUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tableTUser);

        btnSelectTUser.setText("Seleccionar");
        btnSelectTUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectTUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(260, 260, 260)
                        .addComponent(btnSelectTUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel25)
                                .addGap(53, 53, 53)
                                .addComponent(txtCodTUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel26)
                                .addGap(32, 32, 32)
                                .addComponent(txtNameTUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnUpdateTUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnDeleteTUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel14)))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(btnSelectTUser))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(txtCodTUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtNameTUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateTUser)
                            .addComponent(btnDeleteTUser))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Modificar Tipo de Usuarios", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Editar Tipos de Documentos:");

        jLabel27.setText("Código:");

        jLabel28.setText("Descripcion:");

        btnUpdateTDoc.setText("Modificar");
        btnUpdateTDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTDocActionPerformed(evt);
            }
        });

        btnDeleteTDoc.setText("Eliminar");
        btnDeleteTDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTDocActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/tipoDocumento128.png"))); // NOI18N

        tableTDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tableTDoc);

        btnSelectTDoc.setText("Seleccionar");
        btnSelectTDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectTDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(233, 233, 233)
                        .addComponent(btnSelectTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel27)
                                .addGap(53, 53, 53)
                                .addComponent(txtCodeTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel28)
                                .addGap(32, 32, 32)
                                .addComponent(txtNameTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnUpdateTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnDeleteTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel16)))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(btnSelectTDoc))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(txtCodeTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(txtNameTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateTDoc)
                            .addComponent(btnDeleteTDoc))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel16))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Modificar Tipo de Documentos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectUserActionPerformed
        seleccionarUser();
    }//GEN-LAST:event_btnSelectUserActionPerformed

    private void btnSelectMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectMemberActionPerformed
        seleccionarMember();
    }//GEN-LAST:event_btnSelectMemberActionPerformed

    private void btnSelectTUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectTUserActionPerformed
        seleccionarTUser();
    }//GEN-LAST:event_btnSelectTUserActionPerformed

    private void btnSelectTDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectTDocActionPerformed
        seleccionarTDoc();
    }//GEN-LAST:event_btnSelectTDocActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        int code = Integer.parseInt(this.txtCodeUser.getText());
        String name = this.txtNameUser.getText();
        int typeDoc = 0;
        String key = cbTDocUser.getSelectedItem().toString();
        for (String value : smd.keysTDoc) {
            System.out.println(value);
            if (key == value) {
                typeDoc = smd.lisTDoc.get(key);
                System.out.println(typeDoc);
                break;
            }
        }
        int numDoc = Integer.parseInt(this.txtNumTDocUser.getText());
        String correo = this.txtCorreoUser.getText();
        String password = this.txtPassUser.getText();
        int typeUser = 0;
        String key2 = (String) cbTipoUser.getSelectedItem();
        for (String value : smd.keysTUser) {
            System.out.println(value);
            if (value.equals(key2)) {
                typeUser = smd.lisTUser.get(key2);
                System.out.println(typeUser);
                break;
            }
        }

        boolean modificar = uc.modificar(code, name, typeDoc, numDoc, correo, password, typeUser, idUser);

        if (modificar) {
            modeloUser.getDataVector().removeAllElements();
            tableUser.updateUI();
            modeloUser = mt.modeloUsuario();
            this.tableUser.setModel(modeloUser);
            limpiarUsuario();
            CamposUsuarios(false);
            this.tableUser.setEnabled(true);
        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = uc.eliminar(idUser);
                if (delete) {
                    limpiarUsuario();
                    CamposUsuarios(false);
                    modeloUser.removeRow(this.tableUser.getSelectedRow());
                    this.tableUser.setEnabled(true);
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMemberActionPerformed

        int code = Integer.parseInt(this.txtCodeMember.getText());
        String name = this.txtNameMember.getText();
        int typeDoc = 0;
        String key = cbTDocUser.getSelectedItem().toString();
        for (String value : smd.keysTDoc) {
            System.out.println(value);
            if (key == value) {
                typeDoc = smd.lisTDoc.get(key);
                System.out.println(typeDoc);
                break;
            }
        }
        int numDoc = Integer.parseInt(this.txtNumerDocMember.getText());

        boolean modificar = mc.modificar(code, name, typeDoc, numDoc, idMember);

        if (modificar) {
            modeloMember.getDataVector().removeAllElements();
            tableMember.updateUI();
            modeloMember = mt.modeloMiembro();
            this.tableMember.setModel(modeloMember);
            limpiarMiembros();
            CamposMember(false);
            this.tableMember.setEnabled(true);
        }
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch (opcion) {
            case 0 -> {
                boolean delete = mc.eliminar(idMember);
                if (delete) {
                    limpiarMiembros();
                    CamposMember(false);
                    modeloMember.removeRow(this.tableMember.getSelectedRow());
                    this.tableMember.setEnabled(true);
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void btnUpdateTUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTUserActionPerformed
        int code = Integer.parseInt(this.txtCodTUser.getText());
        String name = this.txtNameTUser.getText();

        boolean modificar = tuc.modificar(code, name, idTUser);

        if (modificar) {
            modeloTUser.getDataVector().removeAllElements();
            tableTUser.updateUI();
            modeloTUser = mt.modeloTUser();
            this.tableTUser.setModel(modeloTUser);
            limpiarTUser();
            CamposTUser(false);
            this.tableTUser.setEnabled(true);
            resetComboBox();
        }
    }//GEN-LAST:event_btnUpdateTUserActionPerformed

    private void btnDeleteTUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTUserActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch (opcion) {
            case 0 -> {
                boolean delete = tuc.eliminar(idTUser);
                if (delete) {
                    limpiarTUser();
                    CamposTUser(false);
                    modeloTUser.removeRow(this.tableTUser.getSelectedRow());
                    this.tableTUser.setEnabled(true);
                    resetComboBox();
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteTUserActionPerformed

    private void btnUpdateTDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTDocActionPerformed
        int code = Integer.parseInt(this.txtCodeTDoc.getText());
        String name = this.txtNameTDoc.getText();

        boolean modificar = tdc.modificar(code, name, idTDoc);

        if (modificar) {
            modeloTDoc.getDataVector().removeAllElements();
            tableTDoc.updateUI();
            modeloTDoc = mt.modeloTDoc();
            this.tableTDoc.setModel(modeloTDoc);
            limpiarTDoc();
            CamposTDoc(false);
            this.tableTDoc.setEnabled(true);
            resetComboBox();
        }
    }//GEN-LAST:event_btnUpdateTDocActionPerformed

    private void btnDeleteTDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTDocActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch (opcion) {
            case 0 -> {
                boolean delete = tdc.eliminar(idTDoc);
                if (delete) {
                    limpiarTDoc();
                    CamposTDoc(false);
                    modeloTDoc.removeRow(this.tableTDoc.getSelectedRow());
                    this.tableTDoc.setEnabled(true);
                    resetComboBox();
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteTDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnDeleteTDoc;
    private javax.swing.JButton btnDeleteTUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnSelectMember;
    private javax.swing.JButton btnSelectTDoc;
    private javax.swing.JButton btnSelectTUser;
    private javax.swing.JButton btnSelectUser;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JButton btnUpdateTDoc;
    private javax.swing.JButton btnUpdateTUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JComboBox<String> cbTDocMember;
    private javax.swing.JComboBox<String> cbTDocUser;
    private javax.swing.JComboBox<String> cbTipoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableMember;
    private javax.swing.JTable tableTDoc;
    private javax.swing.JTable tableTUser;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtCodTUser;
    private javax.swing.JTextField txtCodeMember;
    private javax.swing.JTextField txtCodeTDoc;
    private javax.swing.JTextField txtCodeUser;
    private javax.swing.JTextField txtCorreoUser;
    private javax.swing.JTextField txtNameMember;
    private javax.swing.JTextField txtNameTDoc;
    private javax.swing.JTextField txtNameTUser;
    private javax.swing.JTextField txtNameUser;
    private javax.swing.JTextField txtNumTDocUser;
    private javax.swing.JTextField txtNumerDocMember;
    private javax.swing.JTextField txtPassUser;
    // End of variables declaration//GEN-END:variables
}
