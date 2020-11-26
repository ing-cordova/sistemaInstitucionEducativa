/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Estudiante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CruzCalles
 */
public class CLSstartEstudiantePersona {
    
    ConexionBD claseConectar = new ConexionBD();
    Connection conectar = claseConectar.RetornarConexion();
    
    public int RetornoIdEstudiante(String correo, String pass) {

        int ID = 0;

        try {

            CallableStatement consulta = conectar.prepareCall("call SP_S_APELLIDOSNOMBRES_E(?,?)");
            consulta.setString("PCorreo", correo);
            consulta.setString("Ppass", pass);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                ID = resultado.getInt("idEstudiante");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en: \n" + e);
        }

        return ID;
    }
    
    public ArrayList<Estudiante> MostrarJoinEstudiantePersona(){
        
    ArrayList <Estudiante> lista =  new ArrayList();
        try {
            CallableStatement st = conectar.prepareCall("Call SP_S_JOINESTUDIATEPERSONA");
            
            ResultSet rs = st.executeQuery();
            while (rs.next ()){
                Estudiante es = new Estudiante();
                es.setNombre(rs.getString("Nombre"));
                es.setApellido(rs.getString("Apellido"));
                es.setCorreo_Electronico(rs.getString("Correo_Electronico"));
                es.setPass(rs.getString("Pass"));
                
                
                lista.add(es);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, lista);
        } 
        return lista;
    }
    
}
