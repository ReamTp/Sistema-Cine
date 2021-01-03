package pmodificar;

import datos.SetMapData;
import datos.*;
import entidades.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserMembers extends javax.swing.JPanel {
    private final UsuariosCRUD uc = new UsuariosCRUD();
    private final MiembrosCRUD mc = new MiembrosCRUD();
    private final TUsuariosCRUD tuc = new TUsuariosCRUD();
    private final TDocumentosCRUD tdc = new TDocumentosCRUD();
    private final SetMapData smd = new SetMapData();
    private final DefaultTableModel modeloUser = new DefaultTableModel();
    private final DefaultTableModel modeloMember = new DefaultTableModel();
    private final DefaultTableModel modeloTUser = new DefaultTableModel();
    private final DefaultTableModel modeloTDoc = new DefaultTableModel();
    
    public UserMembers() {
        initComponents();
        comprobarComboBox();
        desactivarBtnCampos();
    }
    
    private void comprobarComboBox(){
        for(String key : smd.keysTDoc){
            this.cbTDocUser.addItem(key);
            this.cbTDocMember.addItem(key);
        }
        
        for(String key : smd.keysTUser){
            this.cbTipoUser.addItem(key);
        }
    }
    private void activarCamposUser(){
        this.txtCodeUser.setEnabled(true);
        this.txtNameUser.setEnabled(true);
        this.cbTDocUser.setEnabled(true);
        this.txtNumTDocUser.setEnabled(true);
        this.txtCorreoUser.setEnabled(true);
        this.txtPassUser.setEnabled(true);
        this.cbTipoUser.setEnabled(true);
        
        
        this.btnUpdateUser.setEnabled(true);
        this.btnDeleteUser.setEnabled(true);
    }
    
    private void activarCamposMember(){
        this.txtCodeMember.setEnabled(true);
        this.txtNameMember.setEnabled(true);
        this.cbTDocMember.setEnabled(true);
        this.txtNumerDocMember.setEnabled(true);
        
        this.btnUpdateMember.setEnabled(true);
        this.btnDeleteMember.setEnabled(true);
    }
    
    private void activarCamposTUser(){
        this.txtCodTUser.setEnabled(true);
        this.txtNameTUser.setEnabled(true);
        
        this.btnUpdateTUser.setEnabled(true);
        this.btnDeleteTUser.setEnabled(true);
    }
    
    private void activarCamposTDoc(){
        this.txtCodeTDoc.setEnabled(true);
        this.txtNameTDoc.setEnabled(true);
        
        this.btnUpdateTDoc.setEnabled(true);
        this.btnDeleteTDoc.setEnabled(true);
    }
    
    private void desactivarBtnCampos(){
        // Usuarios
        this.btnUpdateUser.setEnabled(false);
        this.btnDeleteUser.setEnabled(false);
        this.btnSelectUser.setEnabled(false);
        
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
        
        this.btnSelectMember.setEnabled(false);
        this.btnUpdateMember.setEnabled(false);
        this.btnDeleteMember.setEnabled(false);
        
        // Tipo Usuarios
        this.txtCodTUser.setEnabled(false);
        this.txtNameTUser.setEnabled(false);
        
        this.btnUpdateTUser.setEnabled(false);
        this.btnDeleteTUser.setEnabled(false);
        this.btnSelectTUser.setEnabled(false);
        
        // Tipo Documentos
        this.txtCodeTDoc.setEnabled(false);
        this.txtNameTDoc.setEnabled(false);
        
        this.btnUpdateTDoc.setEnabled(false);
        this.btnDeleteTDoc.setEnabled(false);
        this.btnSelectTDoc.setEnabled(false);
    }
    
    private void modeloUser(){
        List<Usuarios> lista = uc.mostrar();
        String[] registro = new String[7];
        
        modeloUser.addColumn("Código");
        modeloUser.addColumn("Nombre");
        modeloUser.addColumn("Tipo Doc");
        modeloUser.addColumn("Numero Doc");
        modeloUser.addColumn("Correo");
        modeloUser.addColumn("Contraseña");
        modeloUser.addColumn("Tipo Usuario");
        
        for(Usuarios dato: lista){
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            int tDoc = dato.getTipoDoc();            
            for(String key : smd.keysTDoc){
                int valor = smd.lisTDoc.get(key);
                if(tDoc == valor){
                    registro[2] = key;
                    break;
                }
            }
            registro[3] = Integer.toString(dato.getNumeroDoc());
            registro[4] = dato.getCorreo();
            registro[5] = dato.getPass();
            int tUser = dato.getTipoUser();
            for(String key : smd.keysTUser){
                int valor = smd.lisTUser.get(key);
                if(tUser == valor){
                    registro[6] = key;
                    break;
                }
            }
            modeloUser.addRow(registro);
        }
        this.tableUser.setModel(modeloUser);
    }
    
    private void modeloMember(){
        List<Miembros> lista = mc.mostrar();
        String[] registro = new String[4];
        
        modeloMember.addColumn("Código");
        modeloMember.addColumn("Nombre");
        modeloMember.addColumn("Tipo Doc");
        modeloMember.addColumn("Numero Doc");
        
        for(Miembros dato: lista){
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            int tDoc = dato.getTipoDoc();
            for(String key : smd.keysTDoc){
                int valor = smd.lisTDoc.get(key);
                if(tDoc == valor){
                    registro[2] = key;
                    break;
                }
            }
            registro[3] = Integer.toString(dato.getNumeroDoc());
            modeloMember.addRow(registro);
        }
        this.tableMember.setModel(modeloMember);
    }
    
    private void modeloTUser(){
        List<TUsuarios> lista = tuc.mostrar();
        String[] registro = new String[2];
        
        modeloTUser.addColumn("Código");
        modeloTUser.addColumn("Descripcion");
        
        for(TUsuarios dato: lista){
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getName();
            modeloTUser.addRow(registro);
        }
        this.tableTUser.setModel(modeloTUser);
    }
    
    private void modeloTDoc(){
        List<TDocumentos> lista = tdc.mostrar();
        String[] registro = new String[2];
        
        modeloTDoc.addColumn("Código");
        modeloTDoc.addColumn("Descripcion");
        
        for(TDocumentos dato: lista){
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getName();
            modeloTDoc.addRow(registro);
        }
        this.tableTDoc.setModel(modeloTDoc);
    }
    
    private void seleccionarUser(){
        // Obtenemos el primer dato del renglon seleccionado
        if (this.tableUser.getSelectedRow() > -1) {
            String codigo = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 0);
            String nombre = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 1);
            String tDoc = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 2);
            String numDoc = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 3);
            String email = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 4);
            String pass = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 5);
            String tUser = (String) modeloUser.getValueAt(this.tableUser.getSelectedRow(), 6);
            
            this.txtCodeUser.setText(codigo);
            this.txtNameUser.setText(nombre);
            this.cbTDocUser.setSelectedItem(tDoc);
            this.txtNumTDocUser.setText(numDoc);
            this.txtCorreoUser.setText(email);
            this.txtPassUser.setText(pass);
            this.cbTipoUser.setSelectedItem(tUser);
            
            activarCamposUser();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    private void seleccionarMember(){
        // Obtenemos el primer dato del renglon seleccionado
        if (this.tableMember.getSelectedRow() > -1) {
            String codigo = (String) modeloMember.getValueAt(this.tableMember.getSelectedRow(), 0);
            String nombre = (String) modeloMember.getValueAt(this.tableMember.getSelectedRow(), 1);
            String tDoc = (String) modeloMember.getValueAt(this.tableUser.getSelectedRow(), 2);
            String numDoc = (String) modeloMember.getValueAt(this.tableMember.getSelectedRow(), 3);
            
            this.txtCodeMember.setText(codigo);
            this.txtNameMember.setText(nombre);
            this.cbTDocUser.setSelectedItem(tDoc);
            this.txtNumerDocMember.setText(numDoc);
            
            activarCamposMember();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    private void seleccionarTUser(){
        if (this.tableTUser.getSelectedRow() > -1) {
            String codigo = (String) tableTUser.getValueAt(this.tableTUser.getSelectedRow(), 0);
            String nombre = (String) tableTUser.getValueAt(this.tableTUser.getSelectedRow(), 1);
            
            this.txtCodTUser.setText(codigo);
            this.txtNameTUser.setText(nombre);
            
            activarCamposTUser();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    private void seleccionarTDoc(){
        if (this.tableTDoc.getSelectedRow() > -1) {
            String codigo = (String) tableTDoc.getValueAt(this.tableTDoc.getSelectedRow(), 0);
            String nombre = (String) tableTDoc.getValueAt(this.tableTDoc.getSelectedRow(), 1);
            
            this.txtCodeTDoc.setText(codigo);
            this.txtNameTDoc.setText(nombre);
            
            activarCamposTDoc();
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
        btnMostarUser = new javax.swing.JButton();
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
        btnDeleteMember = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMember = new javax.swing.JTable();
        btnShowMember = new javax.swing.JButton();
        btnSelectMember = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
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
        btnShowTUser = new javax.swing.JButton();
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
        btnShowTDoc = new javax.swing.JButton();
        btnSelectTDoc = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Elije el tipo de dato que desees modificar");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Código:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Tipo de Doc:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        cbTipoUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel1.add(cbTipoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, -1));

        txtCodeUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel1.add(txtCodeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Número de Doc:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtNumTDocUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel1.add(txtNumTDocUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("Correo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Tipo de Usuario:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        txtPassUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel1.add(txtPassUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 110, -1));

        txtCorreoUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel1.add(txtCorreoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, -1));

        txtNameUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel1.add(txtNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, -1));

        cbTDocUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel1.add(cbTDocUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, -1));

        btnUpdateUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnUpdateUser.setText("Modificar");
        jPanel1.add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 120, -1));

        btnDeleteUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDeleteUser.setText("Eliminar");
        jPanel1.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 120, -1));

        tableUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableUser);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 550, 210));

        btnMostarUser.setText("Mostrar Datos");
        btnMostarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 120, -1));

        btnSelectUser.setText("Seleccionar");
        btnSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 120, -1));

        jTabbedPane1.addTab("Modificar Usuarios", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("Código:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("Nombre:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtNameMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel2.add(txtNameMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, -1));

        txtCodeMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel2.add(txtCodeMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("Tipo Doc:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("Número de Doc:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        cbTDocMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel2.add(cbTDocMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 130, -1));

        txtNumerDocMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel2.add(txtNumerDocMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 130, -1));

        btnUpdateMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnUpdateMember.setText("Modificar");
        jPanel2.add(btnUpdateMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 110, -1));

        btnDeleteMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDeleteMember.setText("Eliminar");
        jPanel2.add(btnDeleteMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 110, -1));

        tableMember.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tableMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableMember);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 570, 230));

        btnShowMember.setText("Mostrar Datos");
        btnShowMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMemberActionPerformed(evt);
            }
        });
        jPanel2.add(btnShowMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 120, -1));

        btnSelectMember.setText("Seleccionar");
        btnSelectMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectMemberActionPerformed(evt);
            }
        });
        jPanel2.add(btnSelectMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 110, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Editar Miembros:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jTabbedPane1.addTab("Modificar Miembros", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Editar Tipos de Usuarios:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel25.setText("Código:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel3.add(txtCodTUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, -1));
        jPanel3.add(txtNameTUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 130, -1));

        jLabel26.setText("Descripcion:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnUpdateTUser.setText("Modificar");
        jPanel3.add(btnUpdateTUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        btnDeleteTUser.setText("Eliminar");
        jPanel3.add(btnDeleteTUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/tipoUsuario128.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 128, 128));

        tableTUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tableTUser);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 310, 320));

        btnShowTUser.setText("Mostrar Datos");
        btnShowTUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTUserActionPerformed(evt);
            }
        });
        jPanel3.add(btnShowTUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 120, -1));

        btnSelectTUser.setText("Seleccionar");
        btnSelectTUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectTUserActionPerformed(evt);
            }
        });
        jPanel3.add(btnSelectTUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, -1));

        jTabbedPane1.addTab("Modificar Tipo de Usuarios", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Editar Tipos de Documentos:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel27.setText("Código:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel4.add(txtCodeTDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, -1));

        jLabel28.setText("Descripcion:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel4.add(txtNameTDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, -1));

        btnUpdateTDoc.setText("Modificar");
        jPanel4.add(btnUpdateTDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        btnDeleteTDoc.setText("Eliminar");
        jPanel4.add(btnDeleteTDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/tipoDocumento128.png"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 128, 128));

        tableTDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tableTDoc);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 310, 320));

        btnShowTDoc.setText("Mostrar Datos");
        btnShowTDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTDocActionPerformed(evt);
            }
        });
        jPanel4.add(btnShowTDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 120, -1));

        btnSelectTDoc.setText("Seleccionar");
        btnSelectTDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectTDocActionPerformed(evt);
            }
        });
        jPanel4.add(btnSelectTDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, -1));

        jTabbedPane1.addTab("Modificar Tipo de Documentos", jPanel4);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 640, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarUserActionPerformed
        modeloUser();
        this.btnSelectUser.setEnabled(true);
        this.btnMostarUser.setEnabled(false);
    }//GEN-LAST:event_btnMostarUserActionPerformed

    private void btnSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectUserActionPerformed
        seleccionarUser();
    }//GEN-LAST:event_btnSelectUserActionPerformed

    private void btnShowMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMemberActionPerformed
        modeloMember();
        this.btnSelectMember.setEnabled(true);
        this.btnShowMember.setEnabled(false);
    }//GEN-LAST:event_btnShowMemberActionPerformed

    private void btnShowTUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTUserActionPerformed
        modeloTUser();
        this.btnSelectTUser.setEnabled(true);
        this.btnShowTUser.setEnabled(false);
    }//GEN-LAST:event_btnShowTUserActionPerformed

    private void btnShowTDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTDocActionPerformed
        modeloTDoc();
        this.btnSelectTDoc.setEnabled(true);
        this.btnShowTDoc.setEnabled(false);
    }//GEN-LAST:event_btnShowTDocActionPerformed

    private void btnSelectMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectMemberActionPerformed
        seleccionarMember();
    }//GEN-LAST:event_btnSelectMemberActionPerformed

    private void btnSelectTUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectTUserActionPerformed
        seleccionarTUser();
    }//GEN-LAST:event_btnSelectTUserActionPerformed

    private void btnSelectTDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectTDocActionPerformed
        seleccionarTDoc();
    }//GEN-LAST:event_btnSelectTDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnDeleteTDoc;
    private javax.swing.JButton btnDeleteTUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnMostarUser;
    private javax.swing.JButton btnSelectMember;
    private javax.swing.JButton btnSelectTDoc;
    private javax.swing.JButton btnSelectTUser;
    private javax.swing.JButton btnSelectUser;
    private javax.swing.JButton btnShowMember;
    private javax.swing.JButton btnShowTDoc;
    private javax.swing.JButton btnShowTUser;
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
