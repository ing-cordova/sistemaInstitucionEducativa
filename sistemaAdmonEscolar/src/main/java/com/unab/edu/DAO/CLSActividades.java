/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Actividades;
import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresC
 */
public class CLSActividades {
    
    ConexionBD claseConectar = new ConexionBD();
    Connection conectar = claseConectar.RetornarConexion();
    
    public void AgregarActividad(Actividades act){
        
        try {
            CallableStatement statement = conectar.prepareCall("call SP_I_ACTIVIDAD(?,?,?,?,?,?,?)");
            statement.setInt("PidDocente", act.getIdDocente());
            statement.setInt("PidMateria", act.getIdMateria());
            statement.setString("PNombre_Actividad", act.getNombre_Actividad());
            statement.setDouble("PPorcentaje", act.getPorcentaje());
            statement.setDate("PFecha_Entrega", new java.sql.Date(act.getFecha_Entrega().getTime()));
            statement.setDate("PUltima_Modificacion", new java.sql.Date(act.getUltima_Modificacion().getTime()));
            statement.setInt("PEstado", act.getEstado());
            
            statement.execute();
            JOptionPane.showMessageDialog(null, "ACTIVIDAD GUARDADA CON EXITO");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
