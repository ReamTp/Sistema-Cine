package pmodificar;

import datos.SetMapData;
import datos.MovieCRUD;
import datos.SalasCRUD;
import datos.HorariosCRUD;
import datos.CategoriaCRUD;
import datos.EstrenoCRUD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelosDatos.ModeloTablas;

public class AMovie extends javax.swing.JPanel {

    private final MovieCRUD mc = new MovieCRUD();
    private final SalasCRUD sc = new SalasCRUD();
    private final HorariosCRUD hc = new HorariosCRUD();
    private final CategoriaCRUD cc = new CategoriaCRUD();
    private final EstrenoCRUD ec = new EstrenoCRUD();
    private final SetMapData smd = new SetMapData();
    private final ModeloTablas mt = new ModeloTablas();
    private DefaultTableModel modeloMovie;
    private DefaultTableModel modeloSala;
    private DefaultTableModel modeloHorario;
    private DefaultTableModel modeloCategoria;
    private DefaultTableModel modeloEstreno;
    private int idMovie, idSala, idHora, idCateg, idPeliE;

    public AMovie() {
        initComponents();
        cargarComboBox();
        modelosTablas();
        camposPeliculas(false);
        campoSalas(false);
        camposHorarios(false);
        camposCategoria(false);
        camposEstrenos(false);
    }

    private void cargarComboBox() {
        for (String key : smd.keysCateg) {
            this.cbCategoryMovie.addItem(key);
        }

        for (String key : smd.keysMovie) {
            this.cbMovieEstreno.addItem(key);
        }
        
        for (String key : smd.keysHour) {
            this.cbHorario.addItem(key);
        }
    }
    
    private void resetComboBox(){
        this.cbCategoryMovie.removeAllItems();
        this.cbMovieEstreno.removeAllItems();
        this.cbHorario.removeAllItems();
        cargarComboBox();
    }
    
    private String obtenerHora() {
        int hora, minuto;
        hora = txtHora.getCalendar().get(Calendar.HOUR);
        minuto = txtHora.getCalendar().get(Calendar.MINUTE);
        String horario;
        horario = hora + ":" + minuto;
        return horario;
    }

    private String obtenerFecha() {
        SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dformat.format(this.txtFechaEstreno.getDate());
        return date;
    }

    private void limpiarPeliculas() {
        this.txtCodeMovie.setText("");
        this.txtNameMovie.setText("");
        this.txtDuracionMovie.setText("");
        this.cbCategoryMovie.setSelectedIndex(0);
        this.txtDesciptionMovie.setText("");
        this.cbHorario.setSelectedIndex(0);
    }

    private void limpiarSalas() {
        this.txtCodeRoom.setText("");
        this.txtNameRoom.setText("");
        this.txtCapacityRoom.setText("");
    }

    private void limpiarHorarios() {
        this.txtCodeHour.setText("");
        this.txtHora.setCalendar(null);
    }

    private void limpiarCategorias() {
        this.txtCodeCategory.setText("");
        this.txtNameCategory.setText("");
        this.txtDescipCategory.setText("");
    }

    private void limpiarEstrenos() {
        this.cbMovieEstreno.setSelectedIndex(0);
        this.txtFechaEstreno.setCalendar(null);
    }

    private void modelosTablas() {
        modeloMovie = mt.modeloPelicula();
        this.tableMovie.setModel(modeloMovie);
        modeloSala = mt.modeloSala();
        this.tableRoom.setModel(modeloSala);
        modeloHorario = mt.modeloHorario();
        this.tableHour.setModel(modeloHorario);
        modeloCategoria = mt.modeloCategoria();
        this.tableCategory.setModel(modeloCategoria);
        modeloEstreno = mt.modeloEstreno();
        this.tableEstreno.setModel(modeloEstreno);
    }
    
    private void camposPeliculas(boolean valor) {
        this.txtCodeMovie.setEnabled(valor);
        this.txtNameMovie.setEnabled(valor);
        this.txtDuracionMovie.setEnabled(valor);
        this.cbCategoryMovie.setEnabled(valor);
        this.txtDesciptionMovie.setEnabled(valor);
        this.cbHorario.setEnabled(valor);
        
        this.btnUpdateMovie.setEnabled(valor);
        this.btnDeleteMovie.setEnabled(valor);
    }
    
    private void campoSalas(boolean valor){
        this.txtCodeRoom.setEnabled(valor);
        this.txtNameRoom.setEnabled(valor);
        this.txtCapacityRoom.setEnabled(valor);
        
        this.btnUpdateRoom.setEnabled(valor);
        this.btnDeleteRoom.setEnabled(valor);
    }
    
    private void camposHorarios(boolean valor){
        this.txtCodeHour.setEnabled(valor);
        this.txtHora.setEnabled(valor);
        
        this.btnUpdateHour.setEnabled(valor);
        this.btnDeleteHour.setEnabled(valor);
    }
    
    private void camposCategoria(boolean valor){
        this.txtCodeCategory.setEnabled(valor);
        this.txtNameCategory.setEnabled(valor);
        this.txtDescipCategory.setEnabled(valor);
        
        this.btnUpdateCategory.setEnabled(valor);
        this.btnDeleteCategory.setEnabled(valor);
    }
    
    private void camposEstrenos(boolean valor){
        this.cbMovieEstreno.setEnabled(valor);
        this.txtFechaEstreno.setEnabled(valor);
        
        this.btnUpdateEstreno.setEnabled(valor);
        this.btnDeleteEstreno.setEnabled(valor);
    }

    private void seleccionarMovie() {
        if (this.tableMovie.getSelectedRow() > -1) {
            String codigo = (String) modeloMovie.getValueAt(this.tableMovie.getSelectedRow(), 0);
            String nombre = (String) modeloMovie.getValueAt(this.tableMovie.getSelectedRow(), 1);
            String duracion = (String) modeloMovie.getValueAt(this.tableMovie.getSelectedRow(), 2);
            String categ = (String) modeloMovie.getValueAt(this.tableMovie.getSelectedRow(), 3);
            String descrip = (String) modeloMovie.getValueAt(this.tableMovie.getSelectedRow(), 4);
            String hora = (String) modeloMovie.getValueAt(this.tableMovie.getSelectedRow(), 5);

            idMovie = Integer.parseInt(codigo);

            this.txtCodeMovie.setText(codigo);
            this.txtNameMovie.setText(nombre);
            this.txtDuracionMovie.setText(duracion);
            this.cbCategoryMovie.setSelectedItem(categ);
            this.txtDesciptionMovie.setText(descrip);
            this.cbHorario.setSelectedItem(hora);
            this.tableMovie.setEnabled(false);

            camposPeliculas(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }

    private void seleccionarSala(){
        if (this.tableRoom.getSelectedRow() > -1) {
            String codigo = (String) modeloSala.getValueAt(this.tableRoom.getSelectedRow(), 0);
            String nombre = (String) modeloSala.getValueAt(this.tableRoom.getSelectedRow(), 1);
            String capacidad = (String) modeloSala.getValueAt(this.tableRoom.getSelectedRow(), 2);

            idSala = Integer.parseInt(codigo);

            this.txtCodeRoom.setText(codigo);
            this.txtNameRoom.setText(nombre);
            this.txtCapacityRoom.setText(capacidad);
            this.tableRoom.setEnabled(false);
            
            campoSalas(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    private void seleccionarHorario(){
        if (this.tableHour.getSelectedRow() > -1) {
            String codigo = (String) modeloHorario.getValueAt(this.tableHour.getSelectedRow(), 0);
            String hora = (String) modeloHorario.getValueAt(this.tableHour.getSelectedRow(), 1);
            Date fechaParseada = null;
            try{
                fechaParseada = new SimpleDateFormat("HH:mm").parse(hora);
            }catch(ParseException e){
                JOptionPane.showMessageDialog(null, "Error al obtener hora");
            }
            idHora = Integer.parseInt(codigo);

            this.txtCodeHour.setText(codigo);
            this.txtHora.setDate(fechaParseada);
            this.tableHour.setEnabled(false);
            
            camposHorarios(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    private void seleccionarCategoria(){
        if (this.tableCategory.getSelectedRow() > -1) {
            String codigo = (String) modeloCategoria.getValueAt(this.tableCategory.getSelectedRow(), 0);
            String nombre = (String) modeloCategoria.getValueAt(this.tableCategory.getSelectedRow(), 1);
            String descripcion = (String) modeloCategoria.getValueAt(this.tableCategory.getSelectedRow(), 2);
            
            idCateg = Integer.parseInt(codigo);

            this.txtCodeCategory.setText(codigo);
            this.txtNameCategory.setText(nombre);
            this.txtDescipCategory.setText(descripcion);
            this.tableCategory.setEnabled(false);
            
            camposCategoria(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    private void seleccionarEstreno(){
        if (this.tableEstreno.getSelectedRow() > -1) {
            String codigo = (String) modeloEstreno.getValueAt(this.tableEstreno.getSelectedRow(), 0);
            String fecha = (String) modeloEstreno.getValueAt(this.tableEstreno.getSelectedRow(), 1);
            Date fechaParseada = null;
            try{
                fechaParseada = new SimpleDateFormat("d MMM y").parse(fecha);
            }catch(ParseException e){
                JOptionPane.showMessageDialog(null, "Error al obtener hora");
            }
            idPeliE = Integer.parseInt(codigo);

            this.cbMovieEstreno.setSelectedItem(codigo);
            this.txtFechaEstreno.setDate(fechaParseada);
            this.tableEstreno.setEnabled(false);
            
            camposEstrenos(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNameMovie = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDuracionMovie = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesciptionMovie = new javax.swing.JTextArea();
        cbCategoryMovie = new javax.swing.JComboBox<>();
        btnDeleteMovie = new javax.swing.JButton();
        txtCodeMovie = new javax.swing.JTextField();
        btnUpdateMovie = new javax.swing.JButton();
        btnSelectMovie = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cbHorario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMovie = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCapacityRoom = new javax.swing.JTextField();
        btnUpdateRoom = new javax.swing.JButton();
        btnDeleteRoom = new javax.swing.JButton();
        txtCodeRoom = new javax.swing.JTextField();
        txtNameRoom = new javax.swing.JTextField();
        btnSelectRoom = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRoom = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtCodeHour = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnUpdateHour = new javax.swing.JButton();
        btnDeleteHour = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableHour = new javax.swing.JTable();
        btnSelectHour = new javax.swing.JButton();
        txtHora = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtCodeCategory = new javax.swing.JTextField();
        txtNameCategory = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDescipCategory = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        btnUpdateCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableCategory = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnSelectCategory = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbMovieEstreno = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnUpdateEstreno = new javax.swing.JButton();
        btnDeleteEstreno = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableEstreno = new javax.swing.JTable();
        btnSelectEstreno = new javax.swing.JButton();
        txtFechaEstreno = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Modificar Datos relacionados con las Peliculas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jLabel1.setText("Código:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Duración:");

        jLabel7.setText("Categoria:");

        jLabel9.setText("Descipción:");

        txtDesciptionMovie.setColumns(20);
        txtDesciptionMovie.setRows(5);
        jScrollPane2.setViewportView(txtDesciptionMovie);

        btnDeleteMovie.setText("Eliminar");
        btnDeleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMovieActionPerformed(evt);
            }
        });

        btnUpdateMovie.setText("Modificar");
        btnUpdateMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMovieActionPerformed(evt);
            }
        });

        btnSelectMovie.setText("Seleccionar");
        btnSelectMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectMovieActionPerformed(evt);
            }
        });

        jLabel18.setText("Horario:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdateMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnDeleteMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(btnSelectMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDuracionMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNameMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(76, 76, 76))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtCodeMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cbCategoryMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodeMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtNameMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtDuracionMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cbCategoryMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18)
                    .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateMovie)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeleteMovie)
                        .addComponent(btnSelectMovie)))
                .addContainerGap())
        );

        tableMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMovie);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Editar Peliculas", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jLabel19.setText("Código:");

        jLabel20.setText("Nombre:");

        jLabel21.setText("Capacidad:");

        btnUpdateRoom.setText("Modificar");
        btnUpdateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRoomActionPerformed(evt);
            }
        });

        btnDeleteRoom.setText("Eliminar");
        btnDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomActionPerformed(evt);
            }
        });

        txtNameRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameRoomActionPerformed(evt);
            }
        });

        btnSelectRoom.setText("Seleccionar");
        btnSelectRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(33, 33, 33)
                        .addComponent(txtCodeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(29, 29, 29)
                                .addComponent(txtNameRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(16, 16, 16)
                                .addComponent(txtCapacityRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnUpdateRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSelectRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel19))
                    .addComponent(txtCodeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(txtNameRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(txtCapacityRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateRoom)
                            .addComponent(btnSelectRoom))
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteRoom)))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        tableRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableRoom);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Editar Salas", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setText("Código:");

        jLabel26.setText("Hora:");

        btnUpdateHour.setText("Modificar");
        btnUpdateHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHourActionPerformed(evt);
            }
        });

        btnDeleteHour.setText("Eliminar");
        btnDeleteHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHourActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Editar Horarios:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("(!) Ingresar hora con el formato de 13:00");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/horarioIcon128.png"))); // NOI18N

        tableHour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tableHour);

        btnSelectHour.setText("Seleccionar");
        btnSelectHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectHourActionPerformed(evt);
            }
        });

        txtHora.setDateFormatString("hh:mm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(313, 313, 313)
                        .addComponent(btnSelectHour, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel25)
                                .addGap(23, 23, 23)
                                .addComponent(txtCodeHour, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel26)
                                .addGap(33, 33, 33)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnUpdateHour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnDeleteHour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnSelectHour))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(txtCodeHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateHour)
                            .addComponent(btnDeleteHour))
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Editar Horarios", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Código:");

        jLabel14.setText("Nombre:");

        txtDescipCategory.setColumns(20);
        txtDescipCategory.setRows(5);
        jScrollPane5.setViewportView(txtDescipCategory);

        jLabel17.setText("Descipción:");

        btnUpdateCategory.setText("Modificar");
        btnUpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCategoryActionPerformed(evt);
            }
        });

        btnDeleteCategory.setText("Eliminar");
        btnDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCategoryActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Editar Categorias:");

        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableCategory);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/categoriaIcon128.png"))); // NOI18N

        btnSelectCategory.setText("Seleccionar");
        btnSelectCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelectCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(19, 19, 19)
                                .addComponent(txtNameCategory))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(23, 23, 23)
                                .addComponent(txtCodeCategory))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnUpdateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSelectCategory)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtCodeCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtNameCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateCategory)
                            .addComponent(btnDeleteCategory))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Editar Categorias", jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Editar Estrenos:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("Peliculas:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("Fecha");

        btnUpdateEstreno.setText("Modificar");
        btnUpdateEstreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEstrenoActionPerformed(evt);
            }
        });

        btnDeleteEstreno.setText("Eliminar");
        btnDeleteEstreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEstrenoActionPerformed(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/fechaIcon64.png"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/estrenoIcon128.png"))); // NOI18N

        tableEstreno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tableEstreno);

        btnSelectEstreno.setText("Seleccionar");
        btnSelectEstreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectEstrenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cbMovieEstreno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(btnUpdateEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnDeleteEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectEstreno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnSelectEstreno))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbMovieEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateEstreno)
                            .addComponent(btnDeleteEstreno))
                        .addGap(58, 58, 58)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar Estrenos", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteEstrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEstrenoActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = ec.eliminar(idPeliE);
                if (delete) {
                    limpiarEstrenos();
                    camposEstrenos(false);
                    modeloEstreno.removeRow(this.tableEstreno.getSelectedRow());
                    this.tableEstreno.setEnabled(true);
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteEstrenoActionPerformed

    private void btnSelectMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectMovieActionPerformed
        seleccionarMovie();
    }//GEN-LAST:event_btnSelectMovieActionPerformed

    private void btnSelectRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectRoomActionPerformed
        seleccionarSala();
    }//GEN-LAST:event_btnSelectRoomActionPerformed

    private void btnSelectHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectHourActionPerformed
        seleccionarHorario();
    }//GEN-LAST:event_btnSelectHourActionPerformed

    private void btnSelectCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectCategoryActionPerformed
        seleccionarCategoria();
    }//GEN-LAST:event_btnSelectCategoryActionPerformed

    private void btnSelectEstrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectEstrenoActionPerformed
        seleccionarEstreno();
    }//GEN-LAST:event_btnSelectEstrenoActionPerformed

    private void btnUpdateMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMovieActionPerformed
        int code = Integer.parseInt(this.txtCodeMovie.getText());
        String name = this.txtNameMovie.getText();
        double duracion = Double.parseDouble(this.txtDuracionMovie.getText());
        int idcateg = 0;
        String key = cbCategoryMovie.getSelectedItem().toString();
        for (String value : smd.keysCateg) {
            if (key.equals(value)) {
                idcateg = smd.lisCateg.get(key);
                break;
            }
        }
        String decrip = this.txtDesciptionMovie.getText();
        int idHora = 0;
        String hora = this.cbHorario.getSelectedItem().toString();
        for (String value : smd.keysHour) {
            if (value.equals(hora)) {
                idHora = smd.lisHour.get(hora);
                break;
            }
        }

        boolean modificar = mc.modificar(code, name, duracion, idcateg, decrip, idHora, idMovie);

        if (modificar) {
            modeloMovie.getDataVector().removeAllElements();
            tableMovie.updateUI();
            modeloMovie = mt.modeloPelicula();
            this.tableMovie.setModel(modeloMovie);
            limpiarPeliculas();
            camposPeliculas(false);
            this.tableMovie.setEnabled(true);
        }
    }//GEN-LAST:event_btnUpdateMovieActionPerformed

    private void btnDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMovieActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = mc.eliminar(idMovie);
                if (delete) {
                    limpiarPeliculas();
                    camposPeliculas(false);
                    modeloMovie.removeRow(this.tableMovie.getSelectedRow());
                    this.tableMovie.setEnabled(true);
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteMovieActionPerformed

    private void btnUpdateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRoomActionPerformed
        int code = Integer.parseInt(this.txtCodeRoom.getText());
        String name = this.txtNameRoom.getText();
        int capacidad = Integer.parseInt(this.txtCapacityRoom.getText());

        boolean variar = sc.modificar(code, name, capacidad, idSala);

        if (variar) {
            modeloSala.getDataVector().removeAllElements();
            tableRoom.updateUI();
            modeloSala = mt.modeloSala();
            this.tableRoom.setModel(modeloSala);
            limpiarSalas();
            campoSalas(false);
            this.tableRoom.setEnabled(true);
            resetComboBox();
        }
    }//GEN-LAST:event_btnUpdateRoomActionPerformed

    private void txtNameRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameRoomActionPerformed

    private void btnDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = sc.eliminar(idSala);
                if (delete) {
                    limpiarSalas();
                    campoSalas(false);
                    modeloSala.removeRow(this.tableRoom.getSelectedRow());
                    this.tableRoom.setEnabled(true);
                    resetComboBox();
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteRoomActionPerformed

    private void btnUpdateHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHourActionPerformed
        int code = Integer.parseInt(this.txtCodeHour.getText());
        String hora = obtenerHora();
        boolean modificar = hc.modificar(code, hora, idHora);

        if (modificar) {
            modeloHorario.getDataVector().removeAllElements();
            tableHour.updateUI();
            modeloHorario = mt.modeloHorario();
            this.tableHour.setModel(modeloHorario);
            limpiarHorarios();
            camposHorarios(false);
            this.tableHour.setEnabled(true);
            resetComboBox();
        }
    }//GEN-LAST:event_btnUpdateHourActionPerformed

    private void btnDeleteHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHourActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = hc.eliminar(idHora);
                if (delete) {
                    limpiarHorarios();
                    camposHorarios(false);
                    modeloHorario.removeRow(this.tableHour.getSelectedRow());
                    this.tableHour.setEnabled(true);
                    resetComboBox();
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteHourActionPerformed

    private void btnUpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCategoryActionPerformed
        int code = Integer.parseInt(this.txtCodeCategory.getText());
        String name = this.txtNameCategory.getText();
        String descrip = this.txtDescipCategory.getText();
        boolean modificar = cc.modificar(code, name, descrip, idCateg);

        if (modificar) {
            modeloCategoria.getDataVector().removeAllElements();
            tableCategory.updateUI();
            modeloCategoria= mt.modeloCategoria();
            this.tableCategory.setModel(modeloCategoria);
            limpiarCategorias();
            camposCategoria(false);
            this.tableCategory.setEnabled(true);
            resetComboBox();
        }
    }//GEN-LAST:event_btnUpdateCategoryActionPerformed

    private void btnDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCategoryActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Tenga en cuenta que se eliminarán todos los datos relacionados con este", "¿Seguro que quiere eliminar el Dato?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (opcion) {
            case 0 -> {
                boolean delete = cc.eliminar(idCateg);
                if (delete) {
                    limpiarCategorias();
                    camposCategoria(false);
                    modeloCategoria.removeRow(this.tableCategory.getSelectedRow());
                    this.tableCategory.setEnabled(true);
                    resetComboBox();
                }
                break;
            }
        }
    }//GEN-LAST:event_btnDeleteCategoryActionPerformed

    private void btnUpdateEstrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEstrenoActionPerformed
        int code = Integer.parseInt(this.cbMovieEstreno.getSelectedItem().toString());
        String fecha = obtenerFecha();
        boolean modificar = ec.modificar(code, fecha, idPeliE);

        if (modificar) {
            modeloEstreno.getDataVector().removeAllElements();
            tableEstreno.updateUI();
            modeloEstreno = mt.modeloEstreno();
            this.tableEstreno.setModel(modeloEstreno);
            limpiarEstrenos();
            camposEstrenos(false);
            this.tableEstreno.setEnabled(true);
        }
    }//GEN-LAST:event_btnUpdateEstrenoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnDeleteEstreno;
    private javax.swing.JButton btnDeleteHour;
    private javax.swing.JButton btnDeleteMovie;
    private javax.swing.JButton btnDeleteRoom;
    private javax.swing.JButton btnSelectCategory;
    private javax.swing.JButton btnSelectEstreno;
    private javax.swing.JButton btnSelectHour;
    private javax.swing.JButton btnSelectMovie;
    private javax.swing.JButton btnSelectRoom;
    private javax.swing.JButton btnUpdateCategory;
    private javax.swing.JButton btnUpdateEstreno;
    private javax.swing.JButton btnUpdateHour;
    private javax.swing.JButton btnUpdateMovie;
    private javax.swing.JButton btnUpdateRoom;
    private javax.swing.JComboBox<String> cbCategoryMovie;
    private javax.swing.JComboBox<String> cbHorario;
    private javax.swing.JComboBox<String> cbMovieEstreno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableCategory;
    private javax.swing.JTable tableEstreno;
    private javax.swing.JTable tableHour;
    private javax.swing.JTable tableMovie;
    private javax.swing.JTable tableRoom;
    private javax.swing.JTextField txtCapacityRoom;
    private javax.swing.JTextField txtCodeCategory;
    private javax.swing.JTextField txtCodeHour;
    private javax.swing.JTextField txtCodeMovie;
    private javax.swing.JTextField txtCodeRoom;
    private javax.swing.JTextArea txtDescipCategory;
    private javax.swing.JTextArea txtDesciptionMovie;
    private javax.swing.JTextField txtDuracionMovie;
    private com.toedter.calendar.JDateChooser txtFechaEstreno;
    private com.toedter.calendar.JDateChooser txtHora;
    private javax.swing.JTextField txtNameCategory;
    private javax.swing.JTextField txtNameMovie;
    private javax.swing.JTextField txtNameRoom;
    // End of variables declaration//GEN-END:variables
}
