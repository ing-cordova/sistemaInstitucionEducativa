/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Notas;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class CLSNotas {
    ConexionBD claseConectar = new ConexionBD();
        Connection conectar = claseConectar.RetornarConexion();
        
    public  ArrayList<Notas> MostrarNota(){
    ArrayList<Notas> Nota = new ArrayList<> ();

    try{
        CallableStatement Statement = conectar.prepareCall("call SP_S_Notas()");
          ResultSet resultadoConsulta = Statement.executeQuery();  
          
          while(resultadoConsulta.next()){
              Notas nota = new Notas();
              
              nota.setIdNotas(resultadoConsulta.getInt("idNota"));
              nota.setIdEstudiante(resultadoConsulta.getInt("idEstudiante"));
              nota.setIdDocente(resultadoConsulta.getInt("idDocente"));
              nota.setIdMateria(resultadoConsulta.getInt("idMateria"));
              nota.setLab1(resultadoConsulta.getDouble("Lab1"));
              nota.setExamen1(resultadoConsulta.getDouble("Examen1"));
              nota.setLab2(resultadoConsulta.getDouble("Lab2"));
              nota.setExamen2(resultadoConsulta.getDouble("Examen2"));
              nota.setLab3(resultadoConsulta.getDouble("Lab3"));
              nota.setExamen3(resultadoConsulta.getDouble("Examen3"));
              nota.setNotaFinal(resultadoConsulta.getDouble("NotaFinal"));
              nota.setUltimaModificacion(resultadoConsulta.getDate("Fecha"));
              
              Nota.add(nota);
          }
            conectar.close();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return Nota;
    }
    
    public void BorrarNotas(Notas not){
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_D_Notas(?)");
        
           Statement.setInt("PIdNotas", not.getIdNotas());
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Notas eliminadas");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ActualizarNotas(Notas not) {
         try {
           CallableStatement Statement = conectar.prepareCall("call SP_U_Notas(?,?,?,?,?,)");
           
           Statement.setInt("PidNota",not.getIdNotas());
           Statement.setInt("PidEstudiante", not.getIdEstudiante());
           Statement.setInt("PidDocente", not.getIdDocente());
           Statement.setInt("pidMateria", not.getIdMateria());
           Statement.setDouble("pLab1", not.getLab1());
           Statement.setDouble("pExamen1", not.getExamen1());
           Statement.setDouble("pLab2", not.getLab2());
           Statement.setDouble("pExamen2", not.getExamen2());
           Statement.setDouble("pLab3", not.getLab3());
           Statement.setDouble("pExamen3", not.getExamen3());
           Statement.setDouble("pNotaFinal", not.getNotaFinal());
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Notas actualizada");
           
           conectar.close();
           
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void AgregarNotas(Notas not){
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_I_Notas(?,?,?,?,?)");
           Statement.setInt("PidNota",not.getIdNotas());
           Statement.setInt("PidEstudiante", not.getIdEstudiante());
           Statement.setInt("PidDocente", not.getIdDocente());
           Statement.setInt("pidMateria", not.getIdMateria());
           Statement.setDouble("pLab1", not.getLab1());
           Statement.setDouble("pExamen1", not.getExamen1());
           Statement.setDouble("pLab2", not.getLab2());
           Statement.setDouble("pExamen2", not.getExamen2());
           Statement.setDouble("pLab3", not.getLab3());
           Statement.setDouble("pExamen3", not.getExamen3());
           Statement.setDouble("pNotaFinal", not.getNotaFinal());
           Statement.setDate("PUltimaModificacion", new java.sql.Date(not.getUltimaModificacion().getTime()));
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Notas guardada");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
}
