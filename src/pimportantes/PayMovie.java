package pimportantes;

import datos.BoletasClientesCRUD;
import datos.BoletasMiembrosCRUD;
import datos.ObtenerListaDatos;
import datos.SetMapData;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

public class PayMovie extends javax.swing.JPanel {

    private final BoletasClientesCRUD bcc = new BoletasClientesCRUD();
    private final BoletasMiembrosCRUD bmc = new BoletasMiembrosCRUD();
    private final ObtenerListaDatos old = new ObtenerListaDatos();
    private final SetMapData smd = new SetMapData();
    private Map lisTDoc, lisMovie, lisMPago;
    private double pagoTotal, pagoTotal2;
    DecimalFormat df = new DecimalFormat("#.00");

    public PayMovie() {
        initComponents();
        cargarComboBox();
        this.txtDiscount.setEnabled(false);
        this.btnAgregar.setEnabled(false);
        this.btnAgregarBMem.setEnabled(false);
        membersCampos(false);
    }

    private void limpiarBCliente() {
        txtNameBCli.setText("");
        cbTDoc.setSelectedIndex(0);
        txtNumDoc.setText("");
        cbMovieBCli.setSelectedIndex(0);
        cbMPagoBCli.setSelectedIndex(0);
        jsCantAdultosBCli.setValue(0);
        jsCantPequesBCli.setValue(0);
    }

    private void limpiarBMiembro() {
        txtCodeMember.setText("");
        cbMovieBMem.setSelectedIndex(0);
        cbMPagoBMem.setSelectedIndex(0);
        jsCantAdultosBMem.setValue(0);
        jsCantPequesBMem.setValue(0);
    }

    private void cargarComboBox() {
        lisTDoc = old.tipoDoc();
        lisMovie = old.peliculas();
        lisMPago = old.metodosPago();

        Set<String> keysDoc = lisTDoc.keySet();
        Set<String> keysMovie = lisMovie.keySet();
        Set<String> keysMPago = lisMPago.keySet();

        for (String key : keysDoc) {
            this.cbTDoc.addItem(key);
        }

        for (String key : keysMovie) {
            this.cbMovieBCli.addItem(key);
            this.cbMovieBMem.addItem(key);
        }

        for (String key : keysMPago) {
            this.cbMPagoBCli.addItem(key);
            this.cbMPagoBMem.addItem(key);
        }
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

    private void membersCampos(boolean valor) {
        cbMovieBMem.setEnabled(valor);
        cbMPagoBMem.setEnabled(valor);
        jsCantAdultosBMem.setEnabled(valor);
        jsCantPequesBMem.setEnabled(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNameBCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbTDoc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbMovieBCli = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbMPagoBCli = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lbTPago = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jsCantAdultosBCli = new javax.swing.JSpinner();
        jsCantPequesBCli = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCodeMember = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbMovieBMem = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cbMPagoBMem = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        lbTPago2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jsCantAdultosBMem = new javax.swing.JSpinner();
        jsCantPequesBMem = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        btnAgregarBMem = new javax.swing.JButton();
        btnLimpiarBMem = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnCalcularBMiem = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnComprobarMember = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Registrar Nueva Boleta de Pago de Entrada");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Tipo de Documento:");

        jLabel4.setText("Número de Documento:");

        jLabel5.setText("Pelicula:");

        jLabel6.setText("Metodo de Pago:");

        jLabel7.setText("Total a Pagar:");

        lbTPago.setText("S/.0.00");

        jLabel9.setText("Cantidad de Boletos para Adultos:");

        jsCantAdultosBCli.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jsCantPequesBCli.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel10.setText("Cantidad de Boletos para Niños:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/boletoCliIcon128.png"))); // NOI18N

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbMPagoBCli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNumDoc, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbMovieBCli, javax.swing.GroupLayout.Alignment.TRAILING, 0, 154, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNameBCli, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnCalcular)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(132, 132, 132))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jsCantAdultosBCli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsCantPequesBCli, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(115, 115, 115)
                                        .addComponent(lbTPago))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNameBCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jsCantAdultosBCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsCantPequesBCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cbTDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMovieBCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cbMPagoBCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbTPago)
                            .addComponent(btnCalcular))
                        .addGap(21, 21, 21))))
        );

        jTabbedPane1.addTab("Boleta para Cliente Común", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Codigo:");

        jLabel14.setText("Pelicula:");

        jLabel15.setText("Metodo de Pago:");

        jLabel16.setText("Total a Pagar:");

        lbTPago2.setText("S/.0.00");

        jLabel18.setText("Cantidad de Boletos para Adultos:");

        jLabel19.setText("Cantidad de Boletos para Niños:");

        btnAgregarBMem.setText("Agregar");

        btnLimpiarBMem.setText("Limpiar");
        btnLimpiarBMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarBMemActionPerformed(evt);
            }
        });

        jLabel20.setText("Descuento:");

        txtDiscount.setText("20");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/imagenes/boletoMiemIcon128.png"))); // NOI18N

        btnCalcularBMiem.setText("Calcular");
        btnCalcularBMiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularBMiemActionPerformed(evt);
            }
        });

        jLabel25.setText("%");

        btnComprobarMember.setText("Comprobar Código");
        btnComprobarMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnComprobarMember)
                                    .addComponent(txtCodeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnCalcularBMiem))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25))
                            .addComponent(cbMPagoBMem, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMovieBMem, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(112, 112, 112)
                                        .addComponent(lbTPago2))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18))))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsCantAdultosBMem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsCantPequesBMem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAgregarBMem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnLimpiarBMem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCodeMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jsCantAdultosBMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnComprobarMember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel14))
                        .addGap(7, 7, 7)
                        .addComponent(cbMovieBMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addComponent(jsCantPequesBMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarBMem)
                            .addComponent(btnLimpiarBMem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMPagoBMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lbTPago2)
                    .addComponent(btnCalcularBMiem))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Boleta para Miembros", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarBCliente();
        this.lbTPago.setText("S/0.00");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarBMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBMemActionPerformed
        limpiarBMiembro();
        this.lbTPago2.setText("S/0.00");
    }//GEN-LAST:event_btnLimpiarBMemActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int cantAdult = (int) jsCantAdultosBCli.getValue();
        int cantBoys = (int) jsCantPequesBCli.getValue();

        if (cantAdult == 0 && cantBoys == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese como minimo la compra de un boleto!!");
        } else {
            pagoTotal = cantAdult * 12.5 + cantBoys * 8.5;

            this.lbTPago.setText("S/." + df.format(pagoTotal));
            this.btnAgregar.setEnabled(true);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalcularBMiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularBMiemActionPerformed
        int cantAdult = (int) jsCantAdultosBMem.getValue();
        int cantBoys = (int) jsCantPequesBMem.getValue();

        if (cantAdult == 0 && cantBoys == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese como minimo la compra de un boleto!!");
        } else {
            pagoTotal2 = cantAdult * 12.5 + cantBoys * 8.5;

            this.lbTPago2.setText("S/." + df.format(pagoTotal2));
            this.btnAgregarBMem.setEnabled(true);
        }
    }//GEN-LAST:event_btnCalcularBMiemActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int nameCli = this.txtNameBCli.getText().length();
        int numDoc = this.txtNumDoc.getText().length();
        
        if(pagoTotal != 0 && nameCli > 0 && numDoc > 0){
            String fecha = obtenerFecha();
            System.out.println(fecha);
            String hora = obtenerHora();
            System.out.println(hora);
            String nombre = this.txtNameBCli.getText();
            System.out.println(nombre);

            int idTDoc = smd.ValueTDoc(this.cbTDoc.getSelectedItem().toString());
            System.out.println(idTDoc);

            int nDoc = Integer.parseInt(this.txtNumDoc.getText());
            System.out.println(nDoc);

            int idMovie = smd.ValueTMovie(this.cbMovieBCli.getSelectedItem().toString());
            System.out.println(idMovie);

            int idMPago = smd.ValueMPago(this.cbMPagoBCli.getSelectedItem().toString());
            System.out.println(idMPago);

            int bAdult = (int) jsCantAdultosBCli.getValue();
            System.out.println(bAdult);
            int bBoy = (int) jsCantPequesBCli.getValue();
            System.out.println(bBoy);

            boolean resp = bcc.agregar(fecha, hora, nombre, idTDoc, nDoc, idMovie, idMPago, pagoTotal, bAdult, bBoy);
            if (!resp) {
                limpiarBCliente();
                this.btnAgregar.setEnabled(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "¡Llene todos los campos!");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnComprobarMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarMemberActionPerformed
        int cant = this.txtCodeMember.getText().length();

        if (cant > 0) {
            boolean valor = bmc.combrobarMember(Integer.parseInt(this.txtCodeMember.getText()));

            if (valor) {
                this.btnAgregarBMem.setEnabled(true);
                membersCampos(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un código!!!");
        }
    }//GEN-LAST:event_btnComprobarMemberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarBMem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularBMiem;
    private javax.swing.JButton btnComprobarMember;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarBMem;
    private javax.swing.JComboBox<String> cbMPagoBCli;
    private javax.swing.JComboBox<String> cbMPagoBMem;
    private javax.swing.JComboBox<String> cbMovieBCli;
    private javax.swing.JComboBox<String> cbMovieBMem;
    private javax.swing.JComboBox<String> cbTDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner jsCantAdultosBCli;
    private javax.swing.JSpinner jsCantAdultosBMem;
    private javax.swing.JSpinner jsCantPequesBCli;
    private javax.swing.JSpinner jsCantPequesBMem;
    private javax.swing.JLabel lbTPago;
    private javax.swing.JLabel lbTPago2;
    private javax.swing.JTextField txtCodeMember;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtNameBCli;
    private javax.swing.JTextField txtNumDoc;
    // End of variables declaration//GEN-END:variables
}
