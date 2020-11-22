/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Conexion.ConexionBD;
import com.unab.edu.Entidades.Docente;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class CLSDocente {

    ConexionBD claseConectar = new ConexionBD();
    Connection conectar = claseConectar.RetornarConexion();

    public ArrayList<Docente> MostrarDocente() {
        ArrayList<Docente> Docentes = new ArrayList<>();

        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_Docente()");
            ResultSet resultadoConsulta = Statement.executeQuery();

            while (resultadoConsulta.next()) {
                Docente prof = new Docente();

                prof.setIdDocente(resultadoConsulta.getInt("idDocente"));
                prof.setIdPersona(resultadoConsulta.getInt("idPersona"));
                prof.setCorreo_Electronico(resultadoConsulta.getString("Correo_Electronico"));
                prof.setPass(resultadoConsulta.getString("Pass"));
                prof.setEspecialidad(resultadoConsulta.getString("Especialidad"));
                prof.setUltima_Modificacion(resultadoConsulta.getDate("Fecha"));
                prof.setEstado(resultadoConsulta.getInt("Estado"));

                Docentes.add(prof);
            }
            conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Docentes;
    }

    public void BorrarDocente(Docente profe) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_D_Docente(?)");
            Statement.setInt("PIdDocente", profe.getIdDocente());

            Statement.execute();
            JOptionPane.showMessageDialog(null, "Docente eliminado");

            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ActualizarDocente(Docente profe) {

        try {
            CallableStatement Statement = conectar.prepareCall("call SP_U_Docente(?,?,?,?,?,?,?)");
            Statement.setInt("PIdDocente", profe.getIdDocente());
            Statement.setInt("PIdPersona", profe.getIdPersona());
            Statement.setString("PCorreoElectronico", profe.getCorreo_Electronico());
            Statement.setString("PPass", profe.getPass());
            Statement.setString("PEspecialidad", profe.getEspecialidad());
            Statement.setDate("PUltimaModificacion", new java.sql.Date(profe.getUltima_Modificacion().getTime()));
            Statement.setInt("PEstado", profe.getEstado());

            Statement.execute();
            JOptionPane.showMessageDialog(null, "Docente actualizado");

            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AgregarDocente(Docente profe) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_I_Docente(?,?,?,?,?,?,?)");
            Statement.setInt("PIdDocente", profe.getIdDocente());
            Statement.setInt("PIdPersona", profe.getIdPersona());
            Statement.setString("PCorreoElectronico", profe.getCorreo_Electronico());
            Statement.setString("PPass", profe.getPass());
            Statement.setString("PEspecialidad", profe.getEspecialidad());
            Statement.setDate("PUltimaModificacion", new java.sql.Date(profe.getUltima_Modificacion().getTime()));
            Statement.setInt("PEstado", profe.getEstado());

            Statement.execute();
            JOptionPane.showMessageDialog(null, "Docente guardado");

            conectar.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean LoguinDocente(String correo, String pass) {

        ArrayList<Docente> ListadoCORREOPASS = new ArrayList<>();
        ArrayList<Docente> ListarContra = new ArrayList<>();

        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_LOGUIN_DOCENTES(?,?)");
            Statement.setString("PCorreo_Electronico", correo);
            Statement.setString("PPass", pass);
            ResultSet resultadoConsulta = Statement.executeQuery();
            while (resultadoConsulta.next()) {

                Docente doce = new Docente();
                doce.setCorreo_Electronico(resultadoConsulta.getString("Correo_Electronico"));
                doce.setPass(resultadoConsulta.getString("Pass"));
                ListadoCORREOPASS.add(doce);
            }

            String correoBD = null;
            String passBD = null;
            for (var iterar : ListadoCORREOPASS) {

                correoBD = iterar.getCorreo_Electronico();
                passBD = iterar.getPass();
            }

            CallableStatement st2 = conectar.prepareCall("call SP_S_CRIP(?)");
            st2.setString("PCripPass", pass);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                Docente escrip = new Docente();
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

 public String RetornoFullName(String correo, String pass) {

        String fullName = "";

        try {

            CallableStatement consulta = conectar.prepareCall("call SP_S_APELLIDOSNOMBRES_D(?,?)");
            consulta.setString("PCorreo", correo);
            consulta.setString("Ppass", pass);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                fullName = resultado.getString("Nombres_Completos");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en: \n" + e);
        }

        return fullName;
    }
}
