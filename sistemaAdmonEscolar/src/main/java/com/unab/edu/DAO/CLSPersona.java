/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Persona;
import java.sql.*;
import java.sql.SQLException;
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
              persona.setUltimaModificacion(resultadoConsulta.getDate("UltimaModificacion"));
              
              Personas.add(persona);
          }
            conectar.close();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return Personas;
    }
     
     public void BorrarPersona(Persona per){
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_D_Persona(?)");
        
           Statement.setInt("PIdPersona", per.getIdPersona());
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Persona eliminada");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void ActualizarPersona(Persona per) {
         try {
           CallableStatement Statement = conectar.prepareCall("call SP_U_Persona(?,?,?,?,?,)");
        
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Persona actualizada");
           
           conectar.close();
           
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void AgregarPersona(Persona per){
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_I_Persona(?,?,?,?,?)");
             
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Persona guardada");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }

}
