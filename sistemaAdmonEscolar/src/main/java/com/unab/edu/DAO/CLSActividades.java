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
import java.sql.ResultSet;
import java.util.ArrayList;
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
    
    public ArrayList<Actividades> MostrarActividades(){
        
        ArrayList<Actividades> actividades = new ArrayList<>();
        try {
            CallableStatement statement = conectar.prepareCall("call SP_S_MOSTRAR_ACTS()");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                
                Actividades act = new Actividades();
                act.setIdActividad(rs.getInt("idActividad"));
                act.setNombre_Materia(rs.getString("Nombre_Materia"));
                act.setNombre_Actividad(rs.getString("Nombre_Actividad"));
                act.setPorcentaje(rs.getDouble("Porcentaje"));
                act.setFecha_Entrega(rs.getDate("Fecha_Entrega"));
                actividades.add(act);
            }
        } catch (Exception e) {
        }
        return actividades;
    }
}
