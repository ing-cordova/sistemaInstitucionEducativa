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

/**
 *
 * @author dayan
 */
public class CLSEstudiante {
    ConexionBD claseConectar = new ConexionBD();
        Connection conectar = claseConectar.RetornarConexion();
        
    public  ArrayList<Estudiante> MostrarEstudiante(){
    ArrayList<Estudiante> Estudiantes = new ArrayList<> ();

    try{
        CallableStatement Statement = conectar.prepareCall("call SP_S_Estudiante()");
          ResultSet resultadoConsulta = Statement.executeQuery();   
    
}
