/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author patty
 */
public class ConexionBD {
    
    private Connection coon;
    
    public ConexionBD()
    {
    try{
        coon = DriverManager.getConnection("jdbc:mysql://localhost/administracionescolar","root","root");
        System.out.println("Conectado a la Base de Datos");
        
    }catch (Exception e)
    {
        System.out.println("Error de Conexion "+ e);
    }
    }
    public Connection RetornarConexion(){   
    return coon;   
    }
    
}
