/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Alumno;

import com.unab.edu.DAO.CLSNotas;
import com.unab.edu.Entidades.Notas;
import com.unab.edu.Vistas.FrmLogin;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class PnNotasAlumno extends javax.swing.JPanel {

    /**
     * Creates new form PnNotasAlumno
     */
    public PnNotasAlumno() {
        initComponents();
        
        lblNombre_Estudiante.setText("> " + FrmLogin.FULLNAME);
        Mostrar_Tabla_Materias();
    }

    public void Mostrar_Tabla_Materias() {

        String TITULOS2[] = {"MATERIA", "P1", "P2", "P3", "NOTA FINAL", "RECUPERACIÓN"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS2);
        CLSNotas clsNotas = new CLSNotas();
        Notas nota = new Notas();
        nota.setIdEstudiante(FrmLogin.envioIdEstudiante);
        System.out.println(FrmLogin.envioIdEstudiante);
        ArrayList<Notas> vistaNotas = clsNotas.MostrarNotaByStudente(nota);
        String Filas[] = new String[7];

        for (var iterar : vistaNotas) {

            Filas[0] = String.valueOf(iterar.getNombre_Materia());
            Filas[1] = String.valueOf(iterar.getPeriodo1());
            Filas[2] = String.valueOf(iterar.getPeriodo2());
            Filas[3] = String.valueOf(iterar.getPeriodo2());
            Filas[4] = String.valueOf(iterar.getNotaFinal());
            Filas[5] = String.valueOf(iterar.getRecuperacion());

            ModeloTabla.addRow(Filas);
        }

        tb_Notas.setModel(ModeloTabla);
        
        tb_Notas.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(1).setMinWidth(60);
        
        tb_Notas.getTableHeader().getColumnModel().getColumn(2).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(2).setMinWidth(60);
        
        tb_Notas.getTableHeader().getColumnModel().getColumn(3).setPreferredWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(60);
        tb_Notas.getTableHeader().getColumnModel().getColumn(3).setMinWidth(60);
        
        tb_Notas.getTableHeader().getColumnModel().getColumn(4).setPreferredWidth(80);
        tb_Notas.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(80);
        tb_Notas.getTableHeader().getColumnModel().getColumn(4).setMinWidth(80);
        
        tb_Notas.getTableHeader().getColumnModel().getColumn(5).setPreferredWidth(95);
        tb_Notas.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(95);
        tb_Notas.getTableHeader().getColumnModel().getColumn(5).setMinWidth(95);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre_Estudiante = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Notas = new javax.swing.JTable();

        setBackground(new java.awt.Color(68, 130, 195));

        jLabel1.setBackground(new java.awt.Color(68, 130, 195));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido a tu sección de Notas!");

        lblNombre_Estudiante.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNombre_Estudiante.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre_Estudiante.setText(">Nombre");

        lblActualizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/browser.png"))); // NOI18N
        lblActualizar.setText("Actualizar");
        lblActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
        });

        tb_Notas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tb_Notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE MATERIA"
            }
        ));
        tb_Notas.setFocusable(false);
        tb_Notas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_Notas.setRowHeight(25);
        tb_Notas.setSelectionBackground(new java.awt.Color(48, 218, 174));
        tb_Notas.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tb_Notas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre_Estudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblActualizar)
                    .addComponent(lblNombre_Estudiante))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        
        Mostrar_Tabla_Materias();
    }//GEN-LAST:event_lblActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblNombre_Estudiante;
    private javax.swing.JTable tb_Notas;
    // End of variables declaration//GEN-END:variables
}
