/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Docente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class CLSDocente {
    
    ConexionBD claseConectar = new ConexionBD();
        Connection conectar = claseConectar.RetornarConexion();
        
    public  ArrayList<Docente> MostrarDocente(){
    ArrayList<Docente> Docentes = new ArrayList<> ();

    try{
        CallableStatement Statement = conectar.prepareCall("call SP_S_Docente()");
          ResultSet resultadoConsulta = Statement.executeQuery();
          
          while(resultadoConsulta.next()){
              Docente prof = new Docente();
              prof.setIdPersona(resultadoConsulta.getInt("idPersona"));
              prof.setCorreoElectronico(resultadoConsulta.getString("CorreoElectronico"));
              prof.setPass(resultadoConsulta.getString("Pass"));
              prof.setEspecialidad(resultadoConsulta.getString("Especialidad"));
              prof.setIdMateria(resultadoConsulta.getInt("idMateria"));
              prof.setUltimaModificacion(resultadoConsulta.getDate("Fecha"));
              
              Docentes.add(prof);
          }
            conectar.close();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return Docentes;
    }
    
    public void AgregarDocente(Docente profe){
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_I_Docente(?,?,?,?,?)");
//           Statement.setString("PNombre", profe.getNombre());
//           Statement.setString("PApellido", profe.getApellido());
//           Statement.setInt("PEdad", profe.getEdad());
//           Statement.setString("Psexo", profe.getSexo());
//           Statement.setDate("PFecha", new java.sql.Date(profe.getFecha().getTime()));
                   
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Docente guardado");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void BorrarDocente(Docente profe){
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_D_Docente(?)");
        
           Statement.setInt("PIdPersona", profe.getIdDocente());
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Docente eliminado");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ActualizarDocente(Docente profe) {
         try {
           CallableStatement Statement = conectar.prepareCall("call SP_U_Docente(?,?,?,?,?,)");
//           Statement.setInt("PIdPersona", profe.getIdPersona());
//           Statement.setString("PNombre", profe.getNombre());
//           Statement.setString("PApellido", profe.getApellido());
//           Statement.setInt("PEdad", profe.getEdad());
//           Statement.setString("Psexo", profe.getSexo());
        
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Docente actualizado");
           
           conectar.close();
           
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
}
