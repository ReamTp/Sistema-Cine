package pmodificar;

public class AMovie extends javax.swing.JPanel {

    public AMovie() {
        initComponents();
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
        btnShowMovie = new javax.swing.JButton();
        btnDeleteMovie = new javax.swing.JButton();
        txtCodeMovie = new javax.swing.JTextField();
        btnUpdateMovie = new javax.swing.JButton();
        btnSelectMovie = new javax.swing.JButton();
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
        btnShowRoom = new javax.swing.JButton();
        btnSelectRoom = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRoom = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtCodeHour = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtHour = new javax.swing.JTextField();
        btnUpdateHour = new javax.swing.JButton();
        btnDeleteHour = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableHour = new javax.swing.JTable();
        btnShowHour = new javax.swing.JButton();
        btnSelectHour = new javax.swing.JButton();
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
        btnShowCategory = new javax.swing.JButton();
        btnSelectCategory = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbMovieEstreno = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        numDayEstreno = new javax.swing.JSpinner();
        numMesEstreno = new javax.swing.JSpinner();
        numYearEstreno = new javax.swing.JSpinner();
        btnUpdateEstreno = new javax.swing.JButton();
        btnDeleteEstreno = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableEstreno = new javax.swing.JTable();
        btnShowEstreno = new javax.swing.JButton();
        btnSelectEstreno = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Modificar Datos relacionados con las Peliculas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 32, -1, -1));

        jLabel5.setText("Nombre:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 72, -1, -1));
        jPanel5.add(txtNameMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, -1));

        jLabel6.setText("Duración:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel7.setText("Categoria:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel9.setText("Descipción:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));
        jPanel5.add(txtDuracionMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        txtDesciptionMovie.setColumns(20);
        txtDesciptionMovie.setRows(5);
        jScrollPane2.setViewportView(txtDesciptionMovie);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 220, 100));

        jPanel5.add(cbCategoryMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 120, -1));

        btnShowMovie.setText("Mostrar Datos");
        jPanel5.add(btnShowMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 120, -1));

        btnDeleteMovie.setText("Eliminar");
        jPanel5.add(btnDeleteMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 90, -1));
        jPanel5.add(txtCodeMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, -1));

        btnUpdateMovie.setText("Modificar");
        jPanel5.add(btnUpdateMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, -1));

        btnSelectMovie.setText("Seleccionar");
        jPanel5.add(btnSelectMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 100, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 230));

        tableMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMovie);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 550, 240));

        jTabbedPane1.addTab("Editar Peliculas", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Código:");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 32, -1, -1));

        jLabel20.setText("Nombre:");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel21.setText("Capacidad:");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel7.add(txtCapacityRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));

        btnUpdateRoom.setText("Modificar");
        jPanel7.add(btnUpdateRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, -1));

        btnDeleteRoom.setText("Eliminar");
        jPanel7.add(btnDeleteRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 90, -1));
        jPanel7.add(txtCodeRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 150, -1));
        jPanel7.add(txtNameRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, -1));

        btnShowRoom.setText("Mostrar Datos");
        jPanel7.add(btnShowRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 100, -1));

        btnSelectRoom.setText("Seleccionar");
        jPanel7.add(btnSelectRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 530, 150));

        tableRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableRoom);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 530, 310));

        jTabbedPane1.addTab("Editar Salas", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Código:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel4.add(txtCodeHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, -1));

        jLabel26.setText("Hora:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel4.add(txtHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 150, -1));

        btnUpdateHour.setText("Modificar");
        jPanel4.add(btnUpdateHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        btnDeleteHour.setText("Eliminar");
        jPanel4.add(btnDeleteHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Editar Horarios:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("(!) Ingresar hora con el formato de 13:00");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/horarioIcon128.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 128, 128));

        tableHour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tableHour);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 310, 410));

        btnShowHour.setText("Mostrar Datos");
        jPanel4.add(btnShowHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 100, -1));

        btnSelectHour.setText("Seleccionar");
        jPanel4.add(btnSelectHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 100, -1));

        jTabbedPane1.addTab("Editar Horarios", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Código:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel2.add(txtCodeCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, -1));
        jPanel2.add(txtNameCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 180, -1));

        jLabel14.setText("Nombre:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtDescipCategory.setColumns(20);
        txtDescipCategory.setRows(5);
        jScrollPane5.setViewportView(txtDescipCategory);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, 120));

        jLabel17.setText("Descipción:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnUpdateCategory.setText("Modificar");
        jPanel2.add(btnUpdateCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, -1));

        btnDeleteCategory.setText("Eliminar");
        jPanel2.add(btnDeleteCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 100, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Editar Categorias:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableCategory);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 87, 290, 390));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/categoriaIcon128.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 128, 128));

        btnShowCategory.setText("Mostrar Datos");
        jPanel2.add(btnShowCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 100, -1));

        btnSelectCategory.setText("Seleccionar");
        jPanel2.add(btnSelectCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 100, -1));

        jTabbedPane1.addTab("Editar Categorias", jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Editar Estrenos:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("Peliculas:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Fecha");

        jLabel18.setText("Día:");

        jLabel22.setText("Mes:");

        jLabel23.setText("Año:");

        btnUpdateEstreno.setText("Modificar");

        btnDeleteEstreno.setText("Eliminar");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/fechaIcon64.png"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/estrenoIcon128.png"))); // NOI18N

        tableEstreno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tableEstreno);

        btnShowEstreno.setText("Mostrar Datos");

        btnSelectEstreno.setText("Seleccionar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(cbMovieEstreno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(numYearEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(numDayEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addGap(18, 18, 18)
                                            .addComponent(numMesEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnUpdateEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnDeleteEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnShowEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelectEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel16)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSelectEstreno)
                            .addComponent(btnShowEstreno))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbMovieEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(numDayEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(numMesEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(numYearEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateEstreno)
                            .addComponent(btnDeleteEstreno))
                        .addGap(43, 43, 43)
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
    private javax.swing.JButton btnShowCategory;
    private javax.swing.JButton btnShowEstreno;
    private javax.swing.JButton btnShowHour;
    private javax.swing.JButton btnShowMovie;
    private javax.swing.JButton btnShowRoom;
    private javax.swing.JButton btnUpdateCategory;
    private javax.swing.JButton btnUpdateEstreno;
    private javax.swing.JButton btnUpdateHour;
    private javax.swing.JButton btnUpdateMovie;
    private javax.swing.JButton btnUpdateRoom;
    private javax.swing.JComboBox<String> cbCategoryMovie;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JSpinner numDayEstreno;
    private javax.swing.JSpinner numMesEstreno;
    private javax.swing.JSpinner numYearEstreno;
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
    private javax.swing.JTextField txtHour;
    private javax.swing.JTextField txtNameCategory;
    private javax.swing.JTextField txtNameMovie;
    private javax.swing.JTextField txtNameRoom;
    // End of variables declaration//GEN-END:variables
}
