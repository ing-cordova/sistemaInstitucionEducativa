/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Docente;
import com.unab.edu.Entidades.Estudiante;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class CLSEstudiante {

    ConexionBD claseConectar = new ConexionBD();
    Connection conectar = claseConectar.RetornarConexion();

    public ArrayList<Estudiante> MostrarEstudiante() {
        ArrayList<Estudiante> Estudiantes = new ArrayList<>();

        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_Estudiante()");
            ResultSet resultadoConsulta = Statement.executeQuery();
            while (resultadoConsulta.next()) {
                Estudiante est = new Estudiante();

                est.setIdEstudiante(resultadoConsulta.getInt("idEstudiante"));
                est.setIdPersona(resultadoConsulta.getInt("idPersona"));
                est.setCorreoElectronico(resultadoConsulta.getString("CorreoElectronico"));
                est.setPass(resultadoConsulta.getString("Pass"));
                est.setIdGradoAcademico(resultadoConsulta.getInt("idGradoAcademico"));
                est.setUltimaModificacion(resultadoConsulta.getDate("Fecha"));

                Estudiantes.add(est);
            }
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Estudiantes;
    }

    public void BorrarEstudiante(Estudiante est) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_D_Estudiante(?)");

            Statement.setInt("PIdEstudiante", est.getIdEstudiante());

            Statement.execute();
            JOptionPane.showMessageDialog(null, "Estudiante eliminado");

            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ActualizarEstudiante(Estudiante est) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_U_Estudiante(?,?,?,?,?,?,?)");
            Statement.setInt("PIdEstudiante", est.getIdEstudiante());
            Statement.setInt("PIdPersona", est.getIdPersona());
            Statement.setString("PCorreoElectronico", est.getCorreoElectronico());
            Statement.setString("PPass", est.getPass());
            Statement.setInt("PidGradoAcademico", est.getIdGradoAcademico());
            Statement.setDate("PUltimaModificacion", new java.sql.Date(est.getUltimaModificacion().getTime()));
            Statement.execute();
            JOptionPane.showMessageDialog(null, "Estudiante actualizado");

            conectar.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AgregarEstudiante(Estudiante est) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_I_Estudiante(?,?,?,?,?)");

            Statement.setInt("PIdEstudiante", est.getIdEstudiante());
            Statement.setInt("PIdPersona", est.getIdPersona());
            Statement.setString("PCorreoElectronico", est.getCorreoElectronico());
            Statement.setString("PPass", est.getPass());
            Statement.setInt("PidGradoAcademico", est.getIdGradoAcademico());
            Statement.setDate("PUltimaModificacion", new java.sql.Date(est.getUltimaModificacion().getTime()));

            Statement.execute();
            JOptionPane.showMessageDialog(null, "Estudiante guardado");

            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean LoguinEstudiante(String correo, String pass) {

        ArrayList<Estudiante> ListadoCORREOPASS = new ArrayList<>();
        ArrayList<Estudiante> ListarContra = new ArrayList<>();

        try {
            CallableStatement Statement = conectar.prepareCall("call SP_LOGUIN_ESTUDIANTE (?,?)");
            Statement.setString("PCorreo", correo);
            Statement.setString("Ppass", pass);
            ResultSet resultadoConsulta = Statement.executeQuery();
            while (resultadoConsulta.next()) {

                Estudiante est = new Estudiante();
                est.setCorreoElectronico(resultadoConsulta.getString("CorreoElectronico"));
                est.setPass(resultadoConsulta.getString("Pass"));
                ListadoCORREOPASS.add(est);
            }

            String correoBD = null;
            String passBD = null;
            for (var iterar : ListadoCORREOPASS) {

                correoBD = iterar.getCorreoElectronico();
                passBD = iterar.getPass();
            }

            CallableStatement st2 = conectar.prepareCall("call SP_S_CRIP(?)");
            st2.setString("PCripPass", pass);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                Estudiante escrip = new Estudiante();
                escrip.setPass(rs2.getNString("crip"));
                ListarContra.add(escrip);
            }

            String passcrip = null;
            for (var iterar : ListarContra) {

                passcrip = iterar.getPass();
                pass = passcrip;
            }

            if (correoBD != null && passBD != null) {
                if (correoBD.equals(correo) && passBD.equals(pass)) {
                    return true;
                }
            }
            conectar.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return false;
    }
}
