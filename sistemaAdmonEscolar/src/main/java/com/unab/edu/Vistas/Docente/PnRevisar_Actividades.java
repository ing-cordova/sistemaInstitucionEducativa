/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Docente;

import com.unab.edu.DAO.CLSActividades;
import com.unab.edu.DAO.CLSActividades_Alumno;
import com.unab.edu.DAO.CLSMateriaDocente;
import com.unab.edu.Entidades.Actividades;
import com.unab.edu.Entidades.Actividades_Estudiantes;
import com.unab.edu.Entidades.Materias_Docentes;
import com.unab.edu.Otros.ImagenTabla;
import com.unab.edu.Vistas.FrmLogin;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndresC
 */
public class PnRevisar_Actividades extends javax.swing.JPanel {

    /**
     * Creates new form PnRevisar_Actividades
     */
    public PnRevisar_Actividades() {
        initComponents();
        MostrarMaterias();
        lblidActividad_Estudiante.setVisible(false);
        lblidEstudiante.setVisible(false);

        lblCorreo_Electronico.setText("");
        lbl_Tarea_Seleccionada.setText("");
        lbl_Porcentaje.setText("0.00");
        lbl_Calificacion.setText("");
        lblidActividad_Estudiante.setText("");
        lblidEstudiante.setText("");
    }

    String valueMember[];
    int contador = 1;

    String valueMember1[];
    int contador1 = 1;

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

    public void MostrarActividades(int idMateria) {

        DefaultComboBoxModel cbdefault = new DefaultComboBoxModel();
        CLSActividades clsActs = new CLSActividades();
        Actividades m = new Actividades();
        m.setIdMateria(idMateria);
        ArrayList<Actividades> materia = clsActs.Mostrar_Tareas_By_Materia(m);
        valueMember1 = new String[materia.size() + 1];

        String Filas[] = new String[6];
        cbdefault.addElement("Seleccione una opcion");
        for (var iterar : materia) {

            Filas[0] = String.valueOf(iterar.getIdActividad());
            Filas[1] = iterar.getNombre_Actividad();
            valueMember1[contador1] = Filas[0];
            cbdefault.addElement(Filas[1]);
            contador1++;
        }

        cb_Actividades.setModel(cbdefault);
    }

    public void Limpiar() {
        lblCorreo_Electronico.setText("");
        lbl_Tarea_Seleccionada.setText("");
        lbl_Porcentaje.setText("0.00");
        lbl_Calificacion.setText("");
        lblidActividad_Estudiante.setText("");
        lblidEstudiante.setText("");

        cb_Actividades.removeAllItems();
        valueMember1 = null;
        contador1 = 1;

        limpiarTabla(tb_Actividades);
    }

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

    int combo, combo2;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbMateria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_Actividades = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Actividades = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCorreo_Electronico = new javax.swing.JLabel();
        lbl_Tarea_Seleccionada = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_Porcentaje = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_Calificacion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnEntregar = new com.unab.edu.Otros.Boton();
        lblidEstudiante = new javax.swing.JLabel();
        lblidActividad_Estudiante = new javax.swing.JLabel();

        setBackground(new java.awt.Color(68, 130, 195));

        cbMateria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMateriaItemStateChanged(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(68, 130, 195));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Materia:");

        jLabel3.setBackground(new java.awt.Color(68, 130, 195));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Actividad:");

        cb_Actividades.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(68, 130, 195));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sección para revisar actividades.");

        lblActualizar.setBackground(new java.awt.Color(68, 130, 195));
        lblActualizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/browser.png"))); // NOI18N
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
        });

        tb_Actividades.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tb_Actividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_Actividades.setFocusable(false);
        tb_Actividades.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_Actividades.setRowHeight(25);
        tb_Actividades.setSelectionBackground(new java.awt.Color(48, 218, 174));
        tb_Actividades.setShowVerticalLines(false);
        tb_Actividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Actividades);

        jLabel5.setBackground(new java.awt.Color(68, 130, 195));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");

        jLabel6.setBackground(new java.awt.Color(68, 130, 195));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tarea:");

        lblCorreo_Electronico.setBackground(new java.awt.Color(68, 130, 195));
        lblCorreo_Electronico.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo_Electronico.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo_Electronico.setText("E-mail:");

        lbl_Tarea_Seleccionada.setBackground(new java.awt.Color(68, 130, 195));
        lbl_Tarea_Seleccionada.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_Tarea_Seleccionada.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Tarea_Seleccionada.setText("Tarea:");

        jLabel7.setBackground(new java.awt.Color(68, 130, 195));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Porcentaje:");

        lbl_Porcentaje.setBackground(new java.awt.Color(68, 130, 195));
        lbl_Porcentaje.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_Porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Porcentaje.setText("%%");

        jLabel8.setBackground(new java.awt.Color(68, 130, 195));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Calificación:");

        lbl_Calificacion.setBackground(new java.awt.Color(68, 130, 195));
        lbl_Calificacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_Calificacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Calificacion.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(18, 58, 108));

        btnEntregar.setText("                             EVALUAR ALUMNO");
        btnEntregar.setBorderPainted(false);
        btnEntregar.setFocusPainted(false);
        btnEntregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEntregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        lblidEstudiante.setBackground(new java.awt.Color(68, 130, 195));
        lblidEstudiante.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblidEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        lblidEstudiante.setText("idEstudiante");

        lblidActividad_Estudiante.setBackground(new java.awt.Color(68, 130, 195));
        lblidActividad_Estudiante.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblidActividad_Estudiante.setForeground(new java.awt.Color(255, 255, 255));
        lblidActividad_Estudiante.setText("idActiEstudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_Tarea_Seleccionada))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCorreo_Electronico)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_Actividades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblActualizar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Porcentaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Calificacion)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblidEstudiante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblidActividad_Estudiante))
                                    .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cb_Actividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActualizar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_Porcentaje)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblCorreo_Electronico))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(lbl_Tarea_Seleccionada))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_Calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblidEstudiante)
                                    .addComponent(lblidActividad_Estudiante))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    int id = -1;
    String ruta_archivo = "";
    private void tb_ActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ActividadesMouseClicked
        int column = tb_Actividades.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tb_Actividades.getRowHeight();

        if (row < tb_Actividades.getRowCount() && row >= 0 && column < tb_Actividades.getColumnCount() && column >= 0) {

            id = Integer.parseInt(String.valueOf(tb_Actividades.getValueAt(row, 0)));
            System.out.println("> ID PDF: " + id);
            Object value = tb_Actividades.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton button = (JButton) value;

                if (button.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "¡No hay ningún archivo!");
                } else {
                    CLSActividades_Alumno clsAct = new CLSActividades_Alumno();
                    clsAct.Ejecutar_PDF(id);

                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception e) {
                    }
                }
            } else {

                String idEstudiante = String.valueOf(tb_Actividades.getValueAt(row, 1));
                String correo = String.valueOf(tb_Actividades.getValueAt(row, 2));
                String tarea = String.valueOf(tb_Actividades.getValueAt(row, 3));
                String porcentaje = String.valueOf(tb_Actividades.getValueAt(row, 5));
                String nota = String.valueOf(tb_Actividades.getValueAt(row, 6));

                lblidActividad_Estudiante.setText(String.valueOf(id));
                lblidEstudiante.setText(idEstudiante);
                lblCorreo_Electronico.setText(correo);
                lbl_Tarea_Seleccionada.setText(tarea);
                lbl_Porcentaje.setText(porcentaje);
                lbl_Calificacion.setText(nota);
            }
        }
    }//GEN-LAST:event_tb_ActividadesMouseClicked

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        try {
            Date date = new Date();
            //Extraemos todos los datos de la tabla
            Double porcent = Double.parseDouble(lbl_Porcentaje.getText());
            Double nota = Double.parseDouble(lbl_Calificacion.getText());
            Double Total = (nota * porcent);
            System.out.println("> Nota obtenida: " + Total);

            if (cb_Actividades.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "¡No se permiten cambios vacíos!");
            } else if (lblCorreo_Electronico.getText().equals("") || lbl_Tarea_Seleccionada.getText().equals("")
                    || lbl_Porcentaje.getText().equals("0.00") || lbl_Calificacion.getText().equals("")
                    || lblidActividad_Estudiante.getText().equals("") || lblidEstudiante.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "¡No se permiten cambios vacíos!");
            } else {
                //Creamos un objeto de tipo DAO ActivEstud.
                CLSActividades_Alumno clsActividad = new CLSActividades_Alumno();
                //Creamos un objeto de tipo Entidad ActivEstud.
                Actividades_Estudiantes actEst = new Actividades_Estudiantes();
                //Seteamos los parametros de la tabla.
                actEst.setIdActividadEstudiante(Integer.parseInt(lblidActividad_Estudiante.getText()));
                actEst.setIdEstudiante(Integer.parseInt(lblidEstudiante.getText()));
                actEst.setNota_Obtenida(Total);
                actEst.setUltima_Modificacion(date);
                //Transferimos los datos hacia el metodo de actualizar.
                clsActividad.Actualizar_Actividad(actEst);

                MostrarActividades_Alumnos();
                //Con este metodo limpiamos los controles.
                Limpiar();
            }

        } catch (Exception e) {
            System.out.println("> Ha ocurrido un error en: " + e);
        }
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void cbMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMateriaItemStateChanged

        int combo = Integer.parseInt(valueMember[cbMateria.getSelectedIndex()]);
        if (evt.getStateChange() == evt.SELECTED) {

            cb_Actividades.removeAllItems();
            valueMember1 = null;
            contador1 = 1;
            MostrarActividades(combo);
        }
    }//GEN-LAST:event_cbMateriaItemStateChanged

    public Image getImage(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }

        return null;
    }

    public void MostrarActividades_Alumnos() {

        tb_Actividades.setDefaultRenderer(Object.class, new ImagenTabla());

        combo = Integer.parseInt(valueMember[cbMateria.getSelectedIndex()]);
        combo2 = Integer.parseInt(valueMember1[cb_Actividades.getSelectedIndex()]);

        String TITULOS[] = {"CODIGO", "", "CORREO ELECTRONICO", "ACTIVIDAD", "ARCHIVO", "PORCENTAJE", "NOTA", "ESTADO"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ImageIcon icon = null;
        if (getImage("/Images/file.png") != null) {
            icon = new ImageIcon(getImage("/Images/file.png"));
        }

        CLSActividades_Alumno clsActs = new CLSActividades_Alumno();
        Actividades_Estudiantes act = new Actividades_Estudiantes();
        act.setIdMateria(combo);
        act.setIdActividad(combo2);
        ArrayList<Actividades_Estudiantes> Listar = clsActs.Mostrar_Acts_Alumnos(act);

        if (Listar.size() > 0) {

            for (int i = 0; i < Listar.size(); i++) {

                Object Filas[] = new Object[9];
                act = Listar.get(i);
                Filas[0] = act.getIdActividadEstudiante();
                Filas[1] = act.getIdEstudiante();
                Filas[2] = act.getCorreo_Electronico();
                Filas[3] = act.getNombre_Actividad();

                if (act.getArchivo() != null) {
                    Filas[4] = new JButton(icon);
                } else {
                    Filas[4] = new JButton("Vacio");
                }
                //Filas[4] = String.valueOf(iterar.getArchivo());
                Filas[5] = act.getPorcentaje();
                Filas[6] = act.getNota_Obtenida();
                Filas[7] = act.getEstado_Actividad();

                ModeloTabla.addRow(Filas);
            }

            tb_Actividades.setModel(ModeloTabla);
            tb_Actividades.setRowHeight(40);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(55);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(55);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setMinWidth(55);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(0);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setPreferredWidth(85);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(85);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setMinWidth(85);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setPreferredWidth(85);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(85);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setMinWidth(85);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(6).setPreferredWidth(60);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(60);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(6).setMinWidth(60);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(7).setPreferredWidth(85);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(85);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(7).setMinWidth(85);
        }
    }

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked

        int combo = Integer.parseInt(valueMember[cbMateria.getSelectedIndex()]);
        int combo2 = Integer.parseInt(valueMember1[cb_Actividades.getSelectedIndex()]);

        System.out.println("> Materia: " + combo + ", Actividad: " + combo2);
        MostrarActividades_Alumnos();
    }//GEN-LAST:event_lblActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.unab.edu.Otros.Boton btnEntregar;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JComboBox<String> cb_Actividades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblCorreo_Electronico;
    private javax.swing.JTextField lbl_Calificacion;
    private javax.swing.JLabel lbl_Porcentaje;
    private javax.swing.JLabel lbl_Tarea_Seleccionada;
    private javax.swing.JLabel lblidActividad_Estudiante;
    private javax.swing.JLabel lblidEstudiante;
    private javax.swing.JTable tb_Actividades;
    // End of variables declaration//GEN-END:variables
}
