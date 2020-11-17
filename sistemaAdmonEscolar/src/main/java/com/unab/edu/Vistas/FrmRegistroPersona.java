/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author AndresC
 */
public class FrmRegistroPersona extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistroPersona
     */
    public FrmRegistroPersona() {
        initComponents();
        this.setLocationRelativeTo(null);
        pwContra.setEchoChar('\u2022');
        pwConfirmarContra.setEchoChar('\u2022');

        lblGradoAcad.setVisible(false);
        cbGradoAcademico.setVisible(false);

        lblEspecialidad.setVisible(false);
        txtEspecialidad.setVisible(false);
        sepEspecialidad.setVisible(false);
        
        cbGradoAcademico.addItem("");
        cbGradoAcademico.addItem("Ingenieria en Sistemas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnCentral = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDUI = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cbTipoUsuario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        pwContra = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        pwConfirmarContra = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblGradoAcad = new javax.swing.JLabel();
        cbGradoAcademico = new javax.swing.JComboBox<>();
        lblEspecialidad = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        sepEspecialidad = new javax.swing.JSeparator();
        pnSuperior = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnCentral.setBackground(new java.awt.Color(13, 94, 222));

        lblRegistro.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("¡Bienvenido a la sección de Registro!");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");
        jLabel1.setToolTipText("");

        txtNombres.setBackground(new java.awt.Color(13, 94, 222));
        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        jLabel2.setToolTipText("");

        txtApellidos.setBackground(new java.awt.Color(13, 94, 222));
        txtApellidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo:");
        jLabel3.setToolTipText("");

        cbSexo.setBackground(new java.awt.Color(13, 94, 222));
        cbSexo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Nacimiento:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DUI:");
        jLabel5.setToolTipText("");

        txtDUI.setBackground(new java.awt.Color(13, 94, 222));
        txtDUI.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDUI.setForeground(new java.awt.Color(255, 255, 255));
        txtDUI.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NIT:");
        jLabel6.setToolTipText("");

        txtNIT.setBackground(new java.awt.Color(13, 94, 222));
        txtNIT.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNIT.setForeground(new java.awt.Color(255, 255, 255));
        txtNIT.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Cómo desea registrarse?");

        cbTipoUsuario.setBackground(new java.awt.Color(13, 94, 222));
        cbTipoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Estudiante", "Docente" }));
        cbTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo Electrónico:");
        jLabel8.setToolTipText("");

        txtCorreoElectronico.setBackground(new java.awt.Color(13, 94, 222));
        txtCorreoElectronico.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreoElectronico.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña:");
        jLabel9.setToolTipText("");

        pwContra.setBackground(new java.awt.Color(13, 94, 222));
        pwContra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pwContra.setForeground(new java.awt.Color(255, 255, 255));
        pwContra.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Confirmar contraseña:");
        jLabel10.setToolTipText("");

        pwConfirmarContra.setBackground(new java.awt.Color(13, 94, 222));
        pwConfirmarContra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pwConfirmarContra.setForeground(new java.awt.Color(255, 255, 255));
        pwConfirmarContra.setBorder(null);

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        btnRegistrar.setBackground(new java.awt.Color(13, 94, 222));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("¡Registrarse ahora!");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtFecha.setBackground(new java.awt.Color(13, 94, 222));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblGradoAcad.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblGradoAcad.setForeground(new java.awt.Color(255, 255, 255));
        lblGradoAcad.setText("Grado/Carrera Academíca:");
        lblGradoAcad.setToolTipText("");

        cbGradoAcademico.setBackground(new java.awt.Color(13, 94, 222));
        cbGradoAcademico.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblEspecialidad.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecialidad.setText("Especialidad:");
        lblEspecialidad.setToolTipText("");

        txtEspecialidad.setBackground(new java.awt.Color(13, 94, 222));
        txtEspecialidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        txtEspecialidad.setBorder(null);

        sepEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        sepEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        sepEspecialidad.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        javax.swing.GroupLayout pnCentralLayout = new javax.swing.GroupLayout(pnCentral);
        pnCentral.setLayout(pnCentralLayout);
        pnCentralLayout.setHorizontalGroup(
            pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentralLayout.createSequentialGroup()
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnCentralLayout.createSequentialGroup()
                                    .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2)
                                        .addComponent(jLabel2)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
                                .addGroup(pnCentralLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                                .addGroup(pnCentralLayout.createSequentialGroup()
                                    .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))))
                            .addGroup(pnCentralLayout.createSequentialGroup()
                                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pwContra, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(cbTipoUsuario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCentralLayout.createSequentialGroup()
                                        .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbGradoAcademico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sepEspecialidad)
                                            .addComponent(txtEspecialidad))
                                        .addGap(5, 5, 5))
                                    .addGroup(pnCentralLayout.createSequentialGroup()
                                        .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pwConfirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblGradoAcad)
                                            .addComponent(lblEspecialidad))
                                        .addGap(0, 6, Short.MAX_VALUE))))))
                    .addGroup(pnCentralLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblRegistro))
                    .addGroup(pnCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(pnCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCentralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)))
                .addContainerGap())
        );
        pnCentralLayout.setVerticalGroup(
            pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRegistro)
                .addGap(24, 24, 24)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnCentralLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCentralLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblGradoAcad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGradoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblEspecialidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator5)
                    .addComponent(sepEspecialidad))
                .addGap(14, 14, 14)
                .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCentralLayout.createSequentialGroup()
                        .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwConfirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnPrincipal.add(pnCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 590));

        pnSuperior.setBackground(new java.awt.Color(8, 62, 148));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minus-sign.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblRegresar.setBackground(new java.awt.Color(8, 62, 148));
        lblRegresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reply.png"))); // NOI18N
        lblRegresar.setText("Regresar");
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnSuperiorLayout = new javax.swing.GroupLayout(pnSuperior);
        pnSuperior.setLayout(pnSuperiorLayout);
        pnSuperiorLayout.setHorizontalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnSuperiorLayout.setVerticalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegresar)
                    .addComponent(lblMinimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnPrincipal.add(pnSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked

        String botones[] = {"Salir", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres salir?", "Confirmar", 0, 0, null, botones, this);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (opcion == JOptionPane.NO_OPTION) {
            System.out.println("¡Cancelado!");
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked

        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void cbTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoUsuarioActionPerformed

        String opcion = String.valueOf(cbTipoUsuario.getSelectedItem());

        if (opcion.equals("Seleccione una opción")) {
            lblGradoAcad.setVisible(false);
            cbGradoAcademico.setVisible(false);

            lblEspecialidad.setVisible(false);
            txtEspecialidad.setVisible(false);
            sepEspecialidad.setVisible(false);
        } else if (opcion.equals("Docente")) {
            lblGradoAcad.setVisible(false);
            cbGradoAcademico.setVisible(false);

            lblEspecialidad.setVisible(true);
            txtEspecialidad.setVisible(true);
            sepEspecialidad.setVisible(true);
        } else if (opcion.equals("Estudiante")) {
            lblGradoAcad.setVisible(true);
            cbGradoAcademico.setVisible(true);

            lblEspecialidad.setVisible(false);
            txtEspecialidad.setVisible(false);
            sepEspecialidad.setVisible(false);
        }
    }//GEN-LAST:event_cbTipoUsuarioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || cbSexo.getSelectedItem() == null
                || txtFecha.getDate() == null || txtDUI.getText().isEmpty() || txtNIT.getText().isEmpty()
                || txtCorreoElectronico.getText().isEmpty() || pwContra.getText().isEmpty() || pwConfirmarContra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Por favor rellene todos los campos para el registro!");
        } else {
            if(!pwConfirmarContra.getText().equals(pwContra.getText())){
                JOptionPane.showMessageDialog(null, "¡Las contraseñas no coinciden, compruebe y vuelva a intentar!");
            }
            else{
                if(cbTipoUsuario.getSelectedItem().equals("Seleccione una opción")){
                    JOptionPane.showMessageDialog(null, "¡Aún no ha seleccionado un tipo de usuario!");
                }
                else if(cbTipoUsuario.getSelectedItem().equals("Estudiante")){
                    if(cbGradoAcademico.getSelectedItem().equals("")){
                        System.out.println("No ha seleccionado nada ");
                    }
                    else{
                        System.out.println("Ya seleccionó algo");
                    }   
                }
                else if(cbTipoUsuario.getSelectedItem().equals("Docente")){
                    if(txtEspecialidad.getText().isEmpty()){
                        System.out.println("No ha escrito nada");
                    }
                    else{
                        System.out.println("Ya escribió algo");
                    } 
                }      
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        
        this.setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbGradoAcademico;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblGradoAcad;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JPanel pnCentral;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnSuperior;
    private javax.swing.JPasswordField pwConfirmarContra;
    private javax.swing.JPasswordField pwContra;
    private javax.swing.JSeparator sepEspecialidad;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDUI;
    private javax.swing.JTextField txtEspecialidad;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}