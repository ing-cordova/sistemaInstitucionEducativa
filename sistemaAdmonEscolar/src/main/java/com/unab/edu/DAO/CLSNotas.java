/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Notas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
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
              
              nota.setIdEstudiante(resultadoConsulta.getInt("idEstudiante"));
              nota.setIdDocente(resultadoConsulta.getInt("idDocente"));
              nota.setIdMateria(resultadoConsulta.getInt("idMateria"));
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
}
