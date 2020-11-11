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
public class Estudiante extends Persona {
    protected int idEstudiante;
    protected int idPersona;
    protected String CorreoElectronico;
    protected String Pass;
    protected int idGradoAcademico;
    protected Date UltimaModificacion;
}
