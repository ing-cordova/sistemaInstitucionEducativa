/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class CLSPersona {
    ConexionBD claseConectar = new ConexionBD();
        Connection conectar = claseConectar.RetornarConexion();
        
     public  ArrayList<Persona> MostrarPersona(){
    ArrayList<Persona> Personas = new ArrayList<> ();

    try{
        CallableStatement Statement = conectar.prepareCall("call SP_S_Persona()");
          ResultSet resultadoConsulta = Statement.executeQuery();
          
          while(resultadoConsulta.next()){
              Persona persona = new Persona();
              persona.setIdPersona(resultadoConsulta.getInt("idPersona"));
              persona.setNombre(resultadoConsulta.getString("Nombre"));
              persona.setApellido(resultadoConsulta.getString("Apellido"));
              persona.setSexo(resultadoConsulta.getString("Sexo"));
              persona.setFechaNacimiento(resultadoConsulta.getDate("FechaNacimiento"));
              
              Personas.add(persona);
          }
            conectar.close();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return Personas;
    }
}
