/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Actividades_Estudiantes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresC
 */
public class CLSActividades_Alumno {
    
    ConexionBD claseConectar = new ConexionBD();
    Connection conectar = claseConectar.RetornarConexion();
    
    public void Insertar_Actividad(Actividades_Estudiantes ae){
        
        try {
            CallableStatement statement = conectar.prepareCall("call SP_I_ACTIVIDADES_ESTUDIANTES(?,?,?,?,?,?,?,?)");
            statement.setInt("PidEstudiante", ae.getIdEstudiante());
            statement.setInt("PidActividad", ae.getIdActividad());
            statement.setInt("PidMateria", ae.getIdMateria());
            statement.setDouble("PNota", ae.getNota_Obtenida());
            statement.setBytes("PArchivo", ae.getArchivo());
            statement.setString("PEstado_Act", ae.getEstado_Actividad());
            statement.setDate("PUltima_Modificacion", new java.sql.Date(ae.getUltima_Modificacion().getTime()));
            statement.setInt("PEstado", ae.getEstado());
            statement.execute();
            JOptionPane.showMessageDialog(null, "¡Se envió la tarea con éxito!");
            
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
