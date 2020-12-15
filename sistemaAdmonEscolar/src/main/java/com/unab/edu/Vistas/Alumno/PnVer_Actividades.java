/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Alumno;

import com.unab.edu.DAO.CLSActividades_Alumno;
import com.unab.edu.Entidades.Actividades_Estudiantes;
import com.unab.edu.Otros.ImagenTabla;
import com.unab.edu.Vistas.FrmLogin;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndresC
 */
public class PnVer_Actividades extends javax.swing.JPanel {

    /**
     * Creates new form PnVer_Actividades
     */
    public PnVer_Actividades() {
        initComponents();
        Limpiar();
        Mostrar_Actividades();

        lblidActividad.setVisible(false);
        lblEstado.setVisible(false);
    }

    public Image getImage(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }

        return null;
    }

    public void Mostrar_Actividades() {

        tb_Actividades.setDefaultRenderer(Object.class, new ImagenTabla());
        String TITULOS[] = {"CODIGO", "MATERIA", "ACTIVIDAD", "(%)", "NOTA", "ESTADO", "ARCHIVO"};
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
        act.setIdEstudiante(FrmLogin.envioIdEstudiante);
        ArrayList<Actividades_Estudiantes> Listar = clsActs.Mostrar_Todas_Actividades(act);

        if (Listar.size() > 0) {

            for (int i = 0; i < Listar.size(); i++) {

                Object Filas[] = new Object[9];
                act = Listar.get(i);
                Filas[0] = act.getIdActividadEstudiante();
                Filas[1] = act.getNombre_Materia();
                Filas[2] = act.getNombre_Actividad();
                Filas[3] = act.getPorcentaje();
                Filas[4] = act.getNota_Obtenida();
                Filas[5] = act.getEstado_Actividad();

                if (act.getArchivo() != null) {
                    Filas[6] = new JButton(icon);
                } else {
                    Filas[6] = new JButton("Vacio");
                }

                ModeloTabla.addRow(Filas);
            }

            tb_Actividades.setModel(ModeloTabla);
            tb_Actividades.setRowHeight(40);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(55);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(55);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(0).setMinWidth(55);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(3).setPreferredWidth(60);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(60);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(3).setMinWidth(60);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setPreferredWidth(60);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(60);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(4).setMinWidth(60);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setPreferredWidth(80);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(80);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setMinWidth(80);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setPreferredWidth(70);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(70);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(5).setMinWidth(70);

            tb_Actividades.getTableHeader().getColumnModel().getColumn(6).setPreferredWidth(65);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(65);
            tb_Actividades.getTableHeader().getColumnModel().getColumn(6).setMinWidth(65);

        }
    }

    String ruta_archivo = "";

    public void SeleccionarPDF() {

        JFileChooser jchooser = new JFileChooser();
        jchooser.setDialogTitle("Buscar PDF");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
        jchooser.setFileFilter(filtro);
        int c = jchooser.showOpenDialog(this);

        if (c == 0) {
            this.btSeleccionar.setText("" + jchooser.getSelectedFile().getName());
            ruta_archivo = jchooser.getSelectedFile().getAbsolutePath();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Actividades = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblActividad = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        btnAnularEnvio = new com.unab.edu.Otros.Boton();
        btnEnviar = new com.unab.edu.Otros.Boton();
        jLabel8 = new javax.swing.JLabel();
        btSeleccionar = new javax.swing.JButton();
        lblidActividad = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(68, 130, 195));

        jLabel1.setBackground(new java.awt.Color(68, 130, 195));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido a tu sección de visualizar tareas!");

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
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de la Actividad:");

        jLabel6.setBackground(new java.awt.Color(68, 130, 195));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Materia:");

        lblActividad.setBackground(new java.awt.Color(68, 130, 195));
        lblActividad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblActividad.setForeground(new java.awt.Color(255, 255, 255));
        lblActividad.setText("-");

        lblMateria.setBackground(new java.awt.Color(68, 130, 195));
        lblMateria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblMateria.setForeground(new java.awt.Color(255, 255, 255));
        lblMateria.setText("-");

        btnAnularEnvio.setText("                ANULAR ENVÍO");
        btnAnularEnvio.setBorderPainted(false);
        btnAnularEnvio.setFocusPainted(false);
        btnAnularEnvio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAnularEnvio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAnularEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularEnvioActionPerformed(evt);
            }
        });

        btnEnviar.setText("              VOLVER A ENVIAR");
        btnEnviar.setBorderPainted(false);
        btnEnviar.setFocusPainted(false);
        btnEnviar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEnviar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(68, 130, 195));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Archivo:");

        btSeleccionar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btSeleccionar.setText("Seleccionar PDF");
        btSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarActionPerformed(evt);
            }
        });

        lblidActividad.setText("jLabel2");

        lblEstado.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnularEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblidActividad)
                                .addGap(85, 85, 85)
                                .addComponent(lblEstado)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(2, 2, 2))))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblActividad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblidActividad)
                            .addComponent(lblEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblMateria))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addGap(25, 25, 25)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnularEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarActionPerformed
        SeleccionarPDF();
    }//GEN-LAST:event_btSeleccionarActionPerformed

    private void btnAnularEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularEnvioActionPerformed

        if (!lblidActividad.getText().equals("0") || !lblEstado.getText().equals("-")) {
            if (lblEstado.getText().equals("Calificada")) {
                JOptionPane.showMessageDialog(this, "¡Ya no puedes anular el envío, ya que ya fué calificada!");
            } else {

                String botones[] = {"Anular", "Cancelar"};
                int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres anular el envio?", "Confirmar", 0, 0, null, botones, this);

                if (opcion == JOptionPane.YES_OPTION) {
                    CLSActividades_Alumno clsActs = new CLSActividades_Alumno();
                    Actividades_Estudiantes acts = new Actividades_Estudiantes();
                    acts.setIdEstudiante(FrmLogin.envioIdEstudiante);
                    acts.setIdActividadEstudiante(Integer.parseInt(lblidActividad.getText()));
                    clsActs.Anular_Envio(acts);
                    Mostrar_Actividades();
                    Limpiar();
                } else if (opcion == JOptionPane.NO_OPTION) {
                    System.out.println("¡Cancelado!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡No hay nada seleccionado!");
        }
    }//GEN-LAST:event_btnAnularEnvioActionPerformed

    public void Limpiar() {
        lblActividad.setText("-");
        lblMateria.setText("-");
        lblEstado.setText("-");
        lblidActividad.setText("0");
        ruta_archivo = "";
        btSeleccionar.setText("Seleccionar PDF");
    }

    int id = -1;
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
                    JOptionPane.showMessageDialog(this, "¡No hay ningún archivo!");
                } else {
                    CLSActividades_Alumno clsAct = new CLSActividades_Alumno();
                    clsAct.Ejecutar_PDF(id);

                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception e) {
                    }
                }
            } else {

                String Actividad = String.valueOf(tb_Actividades.getValueAt(row, 2));
                String Mateia = String.valueOf(tb_Actividades.getValueAt(row, 1));
                String IdActividad = String.valueOf(tb_Actividades.getValueAt(row, 0));
                String Estado = String.valueOf(tb_Actividades.getValueAt(row, 5));

                if (Estado.equals("Pendiente")) {
                    btnAnularEnvio.setEnabled(false);
                } else {
                    btnAnularEnvio.setEnabled(true);
                }
                lblActividad.setText(Actividad);
                lblMateria.setText(Mateia);
                lblidActividad.setText(IdActividad);
                lblEstado.setText(Estado);
            }
        }
    }//GEN-LAST:event_tb_ActividadesMouseClicked

    public void Guardar_Actividad(int idEstudiante, int idActividad, File ruta) {

        byte[] pdf = null;
        Date date = new Date();
        CLSActividades_Alumno clsAct_Almuno = new CLSActividades_Alumno();
        Actividades_Estudiantes act_est = new Actividades_Estudiantes();

        act_est.setIdActividadEstudiante(idActividad);
        act_est.setIdEstudiante(idEstudiante);
        
        try {
            pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);

            act_est.setArchivo(pdf);
        } catch (Exception e) {

            act_est.setArchivo(null);
        }

        act_est.setUltima_Modificacion(date);
        clsAct_Almuno.Reenviar_Actividad(act_est);
    }

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        if (lblidActividad.getText().equals("0") || lblEstado.getText().equals("-")) {
            JOptionPane.showMessageDialog(this, "¡No se permiten envíos vacíos!");
        } else {
            String botones[] = {"Reenviar", "Cancelar"};
            int opcion = JOptionPane.showOptionDialog(this, "¿Estás seguro que quieres reenviar la tarea?", "Confirmar", 0, 0, null, botones, this);

            if (opcion == JOptionPane.YES_OPTION) {
                File ruta = new File(ruta_archivo);
                Guardar_Actividad(FrmLogin.envioIdEstudiante, Integer.parseInt(lblidActividad.getText()), ruta);
                Mostrar_Actividades();
                Limpiar();
            } else if (opcion == JOptionPane.NO_OPTION) {
                System.out.println("¡Cancelado!");
                Mostrar_Actividades();
                Limpiar();
            }
        }
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSeleccionar;
    private com.unab.edu.Otros.Boton btnAnularEnvio;
    private com.unab.edu.Otros.Boton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblidActividad;
    private javax.swing.JTable tb_Actividades;
    // End of variables declaration//GEN-END:variables
}
