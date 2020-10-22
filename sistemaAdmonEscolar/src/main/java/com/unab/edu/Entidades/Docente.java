/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Entidades;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author BetoCalderon
 */
@Data
public class Docente extends Persona{
    private int idDocente;
    private int idPersona;
    private String CorreoElectronico;
    private String Pass;
    private String Especialidad;
    private int idMateria;
    protected Date UltimaModificacion;
    
}
