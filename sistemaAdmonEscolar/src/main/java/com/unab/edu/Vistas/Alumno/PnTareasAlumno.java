/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Alumno;

import com.unab.edu.DAO.CLSGradoAcademico;
import com.unab.edu.DAO.CLSMateria;
import com.unab.edu.DAO.CLSMateriaAlumno;
import com.unab.edu.DAO.CLSNotas;
import com.unab.edu.Entidades.Grados_Academicos;
import com.unab.edu.Entidades.Materia;
import com.unab.edu.Entidades.Materias_Alumnos;
import com.unab.edu.Entidades.Notas;
import com.unab.edu.Vistas.FrmLogin;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author AndresC
 */
public class PnTareasAlumno extends javax.swing.JPanel {

    /**
     * Creates new form PnTareasAlumno
     */
    public PnTareasAlumno() {
        initComponents();
        txtActividad.setEditable(false);
        MostrarMaterias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_Materias = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnEntregar = new com.unab.edu.Otros.Boton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(68, 130, 195));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(68, 130, 195));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido a tu sección de Tareas!");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione una materia para visualizar las tareas:");

        cb_Materias.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cb_Materias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tarea seleccionada:");
        jLabel3.setToolTipText("");

        txtActividad.setBackground(new java.awt.Color(68, 130, 195));
        txtActividad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtActividad.setForeground(new java.awt.Color(255, 255, 255));
        txtActividad.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/browser.png"))); // NOI18N

        btnEntregar.setText("  Marcar como Entregada");
        btnEntregar.setBorderPainted(false);
        btnEntregar.setFocusPainted(false);
        btnEntregar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEntregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccionar un archivo:");
        jLabel5.setToolTipText("");

        btnSeleccionar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnSeleccionar.setText("Selecionar pdf...");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");
        jLabel6.setToolTipText("");

        lblEstado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("********");
        lblEstado.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_Materias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 110, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstado)
                        .addGap(190, 190, 190))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_Materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(lblEstado))
                .addGap(8, 8, 8)
                .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        
        SeleccionarPDF();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        System.out.println("Materia Seleccionada: " + Integer.parseInt(valueMember[cb_Materias.getSelectedIndex()]));
    }//GEN-LAST:event_btnEntregarActionPerformed

    String ruta_archivo = "";

    public void SeleccionarPDF() {

        JFileChooser jchooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
        jchooser.setFileFilter(filtro);
        int c = jchooser.showOpenDialog(this);

        if (c == 0) {
            this.btnSeleccionar.setText("" + jchooser.getSelectedFile().getName());
            ruta_archivo = jchooser.getSelectedFile().getAbsolutePath();
        }
    }
    
    String valueMember[];
    int contador = 1;

    public void MostrarMaterias() {

        DefaultComboBoxModel cbdefault = new DefaultComboBoxModel();
        CLSNotas clsNotas = new CLSNotas();
        Notas nota = new Notas();
        nota.setIdEstudiante(FrmLogin.envioIdEstudiante);
        ArrayList<Notas> vistaNotas = clsNotas.MostrarNotaByStudente(nota);
        valueMember = new String[vistaNotas.size() + 1];

        String Filas[] = new String[6];
        cbdefault.addElement("");
        for (var iterar : vistaNotas) {

            Filas[0] = String.valueOf(iterar.getIdMateria());
            Filas[1] = iterar.getNombre_Materia();
            valueMember[contador] = Filas[0];
            cbdefault.addElement(Filas[1]);
            contador++;
        }

        cb_Materias.setModel(cbdefault);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unab.edu.Otros.Boton btnAcceder;
    private com.unab.edu.Otros.Boton btnEntregar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cb_Materias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextField txtActividad;
    // End of variables declaration//GEN-END:variables
}
