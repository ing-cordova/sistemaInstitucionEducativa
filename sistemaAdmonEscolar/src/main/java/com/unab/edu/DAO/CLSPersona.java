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
              persona.setDUI(resultadoConsulta.getString("DUI"));
              persona.setNIT(resultadoConsulta.getString("NIT"));
              persona.setFecha_Nacimiento(resultadoConsulta.getDate("FechaNacimiento"));
              persona.setUltima_Modificacion(resultadoConsulta.getDate("UltimaModificacion"));
              persona.setEstado(resultadoConsulta.getInt("Estado"));
              
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
           CallableStatement Statement = conectar.prepareCall("call SP_U_Persona(?,?,?,?,?)");
           Statement.setInt("PidPersona",per.getIdPersona());
           Statement.setString("PNombre", per.getNombre());
           Statement.setString("PApellido", per.getApellido());
           Statement.setString("PSexo", per.getSexo());
           Statement.setString("PDui", per.getDUI());
           Statement.setString("PNit", per.getNIT());
           Statement.setDate("PFechaNacimiento",new java.sql.Date(per.getFecha_Nacimiento().getTime()));
           Statement.setDate("PUltimaModificacion", new java.sql.Date(per.getUltima_Modificacion().getTime()));
           Statement.setInt("PEstado", per.getEstado());
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Persona actualizada");
           
           conectar.close();
           
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void AgregarPersona(Persona per){
            
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_I_Persona(?,?,?,?,?,?)");
           Statement.setInt("pidPersona",per.getIdPersona());
           Statement.setString("pNombre", per.getNombre());
           Statement.setString("pApellido", per.getApellido());
           Statement.setString("pSexo", per.getSexo());
           Statement.setString("PDui", per.getDUI());
           Statement.setString("PNit", per.getNIT());
           Statement.setDate("pFechaNacimiento",new java.sql.Date(per.getFecha_Nacimiento().getTime()));
           Statement.setDate("PUltimaModificacion", new java.sql.Date(per.getUltima_Modificacion().getTime())); 
           Statement.setInt("PEstado", per.getEstado());
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Persona guardada");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
}
