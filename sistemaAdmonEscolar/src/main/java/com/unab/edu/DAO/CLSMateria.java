/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Materia;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class CLSMateria {
    ConexionBD claseConectar = new ConexionBD();
        Connection conectar = claseConectar.RetornarConexion();
        
    public  ArrayList<Materia> MostrarMateria(){
    ArrayList<Materia> Materias = new ArrayList<> ();
    
    try{
        CallableStatement Statement = conectar.prepareCall("call SP_S_Materia()");
          ResultSet resultadoConsulta = Statement.executeQuery();  
          
          while(resultadoConsulta.next()){
              Materia mat = new Materia();
              mat.setIdMateria(resultadoConsulta.getInt("idMateria"));
              mat.setNombreMateria(resultadoConsulta.getString("NombreMateria"));
              mat.setUltimaModificacion(resultadoConsulta.getDate("Fecha"));
              
              Materias.add(mat);
          }
            conectar.close();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return Materias;
    }   
    
    public void BorrarMateria(Materia mate){
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_D_Materia(?)");
        
           Statement.setInt("PIdMateria", mate.getIdMateria());
           
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Materia eliminada");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void ActualizarMateria(Materia mate) {
         try {
           CallableStatement Statement = conectar.prepareCall("call SP_U_Materia(?,?,?,?,?,)");
        
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Materia actualizada");
           
           conectar.close();
           
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void AgregarMateria(Materia mate){
        try {
           CallableStatement Statement = conectar.prepareCall("call SP_I_Materia(?,?,?,?,?)");
             
           Statement.execute();
           JOptionPane.showMessageDialog(null, "Materia guardada");
           
           conectar.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }
}
