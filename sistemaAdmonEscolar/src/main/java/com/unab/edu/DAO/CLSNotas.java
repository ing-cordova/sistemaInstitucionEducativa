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

              nota.setIdNota(resultadoConsulta.getInt("idNota"));
              nota.setIdEstudiante(resultadoConsulta.getInt("idEstudiante"));
              nota.setIdMateria(resultadoConsulta.getInt("idMateria"));
              nota.setPeriodo1(resultadoConsulta.getDouble("Periodo1"));
              nota.setPeriodo2(resultadoConsulta.getDouble("Periodo2"));
              nota.setPeriodo3(resultadoConsulta.getDouble("Periodo3"));
              nota.setNotaFinal(resultadoConsulta.getDouble("NotaFinal"));
              nota.setRecuperacion(resultadoConsulta.getDouble("Recuperacion"));
              nota.setUltima_Modificacion(resultadoConsulta.getDate("Fecha"));
              nota.setEstado(resultadoConsulta.getInt("Estado"));
              
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
        
           Statement.setInt("PIdNotas", not.getIdNota());
           
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
           
           Statement.setInt("JIdNota",not.getIdNota());
           Statement.setInt("JIdEstudiante", not.getIdEstudiante());
           Statement.setInt("JIdMateria", not.getIdMateria());
           Statement.setDouble("JPeriodo1", not.getPeriodo1());
           Statement.setDouble("JPeriodo2", not.getPeriodo2());
           Statement.setDouble("JPeriodo3", not.getPeriodo3());
           Statement.setDouble("JNotaFinal", not.getNotaFinal());
           Statement.setDouble("JRecuperacion", not.getRecuperacion());
           Statement.setDate("PUltimaModificacion", new java.sql.Date(not.getUltima_Modificacion().getTime()));
           Statement.setInt("JEstado", not.getEstado());
           
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
           
           Statement.setInt("JIdNota",not.getIdNota());
           Statement.setInt("JIdEstudiante", not.getIdEstudiante());
           Statement.setInt("JIdMateria", not.getIdMateria());
           Statement.setDouble("JPeriodo1", not.getPeriodo1());
           Statement.setDouble("JPeriodo2", not.getPeriodo2());
           Statement.setDouble("JPeriodo3", not.getPeriodo3());
           Statement.setDouble("JNotaFinal", not.getNotaFinal());
           Statement.setDouble("JRecuperacion", not.getRecuperacion());
           Statement.setDate("PUltimaModificacion", new java.sql.Date(not.getUltima_Modificacion().getTime()));
           Statement.setInt("JEstado", not.getEstado());
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Notas guardada");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
}
