/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Docente;

import com.unab.edu.DAO.CLSMateriaDocente;
import com.unab.edu.DAO.CLSNotas;
import com.unab.edu.Entidades.Materias_Docentes;
import com.unab.edu.Entidades.Notas;
import com.unab.edu.Vistas.FrmLogin;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndresC
 */
public class PnPublicar_Notas extends javax.swing.JPanel {

    /**
     * Creates new form PnPublicar_Notas
     */
    public PnPublicar_Notas() {
        initComponents();
        MostrarMaterias();
        lblidNota.setVisible(false);
    }

    String valueMember[];
    int contador = 1;

    public void limpiarTabla(JTable Tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            int filas = Tabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    public void MostrarMaterias() {

        DefaultComboBoxModel cbdefault = new DefaultComboBoxModel();
        CLSMateriaDocente clsMateria = new CLSMateriaDocente();
        Materias_Docentes m = new Materias_Docentes();
        m.setIdDocente(FrmLogin.envioIdDocente);
        ArrayList<Materias_Docentes> materia = clsMateria.ShowMateriasByDocente(m);
        valueMember = new String[materia.size() + 1];

        String Filas[] = new String[6];
        cbdefault.addElement("Seleccione una opcion");
        for (var iterar : materia) {

            Filas[0] = String.valueOf(iterar.getIdMateria());
            Filas[1] = iterar.getNombre_Materia();
            valueMember[contador] = Filas[0];
            cbdefault.addElement(Filas[1]);
            contador++;
        }

        cbMateria.setModel(cbdefault);
    }

    public void TablaNotas() {

        int combo = Integer.parseInt(valueMember[cbMateria.getSelectedIndex()]);

        String TITULOS[] = {"ID", "", "CORREO ELECTRONICO", "P1", "P2", "P3", "FINAL", "RECUP."};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS);

        CLSNotas clsNotas = new CLSNotas();
        Notas not = new Notas();
        not.setIdMateria(combo);
        ArrayList<Notas> vistaNotas = clsNotas.NOTAS_PUBLICADAS(not);
        String Filas[] = new String[9];

        for (var iterar : vistaNotas) {

            Filas[0] = String.valueOf(iterar.getIdNota());
            Filas[1] = String.valueOf(iterar.getIdEstudiante());
            Filas[2] = String.valueOf(iterar.getCorreo_Electronico());
            Filas[3] = String.valueOf(iterar.getPeriodo1());
            Filas[4] = String.valueOf(iterar.getPeriodo2());
            Filas[5] = String.valueOf(iterar.getPeriodo3());
            Filas[6] = String.valueOf(iterar.getNotaFinal());
            Filas[7] = String.valueOf(iterar.getRecuperacion());

            ModeloTabla.addRow(Filas);
        }

        tb_Notas.setModel(ModeloTabla);

        tb_Notas.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(60);

        tb_Notas.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(0);
        tb_Notas.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tb_Notas.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);

        tb_Notas.getTableHeader().getColumnModel().getColumn(3).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(3).setMinWidth(60);

        tb_Notas.getTableHeader().getColumnModel().getColumn(4).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(4).setMinWidth(60);

        tb_Notas.getTableHeader().getColumnModel().getColumn(5).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(5).setMinWidth(60);

        tb_Notas.getTableHeader().getColumnModel().getColumn(6).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(6).setMinWidth(60);

        tb_Notas.getTableHeader().getColumnModel().getColumn(7).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(7).setMinWidth(60);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Notas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        btnMostrar = new com.unab.edu.Otros.Boton();
        lblidNota = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_Correo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_P1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_P2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_P3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        lbl_Final = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txt_REP = new javax.swing.JTextField();
        btn_Publicar = new com.unab.edu.Otros.Boton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_Limpiar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(68, 130, 195));

        tb_Notas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tb_Notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_Notas.setFocusable(false);
        tb_Notas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_Notas.setRowHeight(25);
        tb_Notas.setSelectionBackground(new java.awt.Color(48, 218, 174));
        tb_Notas.setShowVerticalLines(false);
        tb_Notas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_NotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Notas);

        jLabel2.setBackground(new java.awt.Color(68, 130, 195));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Materia:");

        cbMateria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        btnMostrar.setText("      Mostrar notas");
        btnMostrar.setBorderPainted(false);
        btnMostrar.setFocusPainted(false);
        btnMostrar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMostrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        lblidNota.setText("idNota");

        jLabel4.setBackground(new java.awt.Color(68, 130, 195));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail:");

        lbl_Correo.setBackground(new java.awt.Color(68, 130, 195));
        lbl_Correo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_Correo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Correo.setText("-");

        jLabel5.setBackground(new java.awt.Color(68, 130, 195));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 58, 108));
        jLabel5.setText("P1:");

        txt_P1.setBackground(new java.awt.Color(68, 130, 195));
        txt_P1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_P1.setForeground(new java.awt.Color(255, 255, 255));
        txt_P1.setBorder(null);
        txt_P1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_P1KeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(18, 58, 108));

        jLabel6.setBackground(new java.awt.Color(68, 130, 195));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 58, 108));
        jLabel6.setText("P2:");

        txt_P2.setBackground(new java.awt.Color(68, 130, 195));
        txt_P2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_P2.setForeground(new java.awt.Color(255, 255, 255));
        txt_P2.setBorder(null);
        txt_P2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_P2KeyTyped(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(18, 58, 108));

        jLabel7.setBackground(new java.awt.Color(68, 130, 195));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 58, 108));
        jLabel7.setText("P3:");

        txt_P3.setBackground(new java.awt.Color(68, 130, 195));
        txt_P3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_P3.setForeground(new java.awt.Color(255, 255, 255));
        txt_P3.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(18, 58, 108));

        jLabel8.setBackground(new java.awt.Color(68, 130, 195));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 58, 108));
        jLabel8.setText("FINAL:");

        lbl_Final.setBackground(new java.awt.Color(68, 130, 195));
        lbl_Final.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_Final.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Final.setText("9.8");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(68, 130, 195));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Rep.:");

        txt_REP.setBackground(new java.awt.Color(68, 130, 195));
        txt_REP.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_REP.setForeground(new java.awt.Color(255, 255, 255));
        txt_REP.setBorder(null);

        btn_Publicar.setText("                             PUBLICAR NOTAS");
        btn_Publicar.setBorderPainted(false);
        btn_Publicar.setFocusPainted(false);
        btn_Publicar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Publicar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Publicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PublicarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(68, 130, 195));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido a tu sección de Notas!");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Notaas.png"))); // NOI18N

        lbl_Limpiar.setBackground(new java.awt.Color(68, 130, 195));
        lbl_Limpiar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eraser.png"))); // NOI18N
        lbl_Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_LimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(lbl_Correo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_P1)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_P2)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_P3)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Final)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(lblidNota)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_REP)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Publicar, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidNota))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Correo))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lbl_Final))
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_REP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Publicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_NotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_NotasMouseClicked

        //Acá estamos obteniendo la fila que el usuario seleccionó.
        int filas = tb_Notas.getSelectedRow();
        //Asignamos todos los campos de la tabla.
        String ID = String.valueOf(tb_Notas.getValueAt(filas, 0));
        String ID_Est = String.valueOf(tb_Notas.getValueAt(filas, 1));
        String CorreoElec = String.valueOf(tb_Notas.getValueAt(filas, 2));
        String P1 = String.valueOf(tb_Notas.getValueAt(filas, 3));
        String P2 = String.valueOf(tb_Notas.getValueAt(filas, 4));
        String P3 = String.valueOf(tb_Notas.getValueAt(filas, 5));
        String FINAL = String.valueOf(tb_Notas.getValueAt(filas, 6));
        String REPO = String.valueOf(tb_Notas.getValueAt(filas, 7));

        lblidNota.setText(ID);
        lbl_Correo.setText(CorreoElec);
        txt_P1.setText(String.valueOf(Math.round(Double.parseDouble(P1) / 0.33)));
        txt_P2.setText(String.valueOf(Math.round(Double.parseDouble(P2) / 0.33)));
        txt_P3.setText(String.valueOf(Math.round(Double.parseDouble(P3) / 0.33)));
        lbl_Final.setText(String.valueOf(Math.round(Double.parseDouble(FINAL))));
        txt_REP.setText(REPO);
    }//GEN-LAST:event_tb_NotasMouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        TablaNotas();
    }//GEN-LAST:event_btnMostrarActionPerformed

    public void LImpiarControles() {

        lbl_Correo.setText("-");
        lblidNota.setText("0");
        lbl_Final.setText("0.00");
        cbMateria.setSelectedIndex(0);
        txt_P1.setText("");
        txt_P2.setText("");
        txt_P3.setText("");
        txt_REP.setText("");
    }
    private void btn_PublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PublicarActionPerformed

        int idNota = Integer.parseInt(lblidNota.getText());

        if (txt_P1.getText().isEmpty() || txt_P2.getText().isEmpty() || txt_P3.getText().isEmpty() || txt_REP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡No se permiten campos vacios!");
        } else {

            String botones[] = {"Continuar", "Cancelar"};
            int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres guardar la nota?", "Confirmar", 0, 0, null, botones, this);

            if (opcion == JOptionPane.YES_OPTION) {
                Date date = new Date();
                //Clase que me formatea la salida de los Double.
                DecimalFormat twoDForm = new DecimalFormat("#.00");
                Double P1 = (Double.parseDouble(txt_P1.getText()) * 0.33);
                Double P2 = (Double.parseDouble(txt_P2.getText()) * 0.33);
                Double P3 = (Double.parseDouble(txt_P3.getText()) * 0.33);
                Double REPO = (Double.parseDouble(txt_REP.getText()) * 0.33);
                Double Final = P1 + P2 + P3;
                CLSNotas clsNotas = new CLSNotas();
                Notas nota = new Notas();
                nota.setIdNota(idNota);
                nota.setPeriodo1(Double.parseDouble(twoDForm.format(P1)));
                nota.setPeriodo2(Double.parseDouble(twoDForm.format(P2)));
                nota.setPeriodo3(Double.parseDouble(twoDForm.format(P3)));
                nota.setNotaFinal(Final);
                nota.setUltima_Modificacion(date);
                clsNotas.ActualizarNotas(nota);
                TablaNotas();
                LImpiarControles();
            } else if (opcion == JOptionPane.NO_OPTION) {
                System.out.println("¡Cancelado!");
            }

        }

    }//GEN-LAST:event_btn_PublicarActionPerformed

    private void lbl_LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LimpiarMouseClicked
        LImpiarControles();
        limpiarTabla(tb_Notas);
    }//GEN-LAST:event_lbl_LimpiarMouseClicked

    private void txt_P1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_P1KeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (Character.isLetter(car) && (car < '.' || car > '.')) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESE SOLO LOS NUMEROS Y PUNTOS CORRESPONDIENTES");
        } else if (txt_P1.getText().length() > 3) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_P1KeyTyped

    private void txt_P2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_P2KeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (Character.isLetter(car) && (car < '.' || car > '.')) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESE SOLO LOS NUMEROS Y PUNTOS CORRESPONDIENTES");
        } else if (txt_P1.getText().length() > 3) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_P2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unab.edu.Otros.Boton btnMostrar;
    private com.unab.edu.Otros.Boton btn_Publicar;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_Correo;
    private javax.swing.JLabel lbl_Final;
    private javax.swing.JLabel lbl_Limpiar;
    private javax.swing.JLabel lblidNota;
    private javax.swing.JTable tb_Notas;
    private javax.swing.JTextField txt_P1;
    private javax.swing.JTextField txt_P2;
    private javax.swing.JTextField txt_P3;
    private javax.swing.JTextField txt_REP;
    // End of variables declaration//GEN-END:variables
}
