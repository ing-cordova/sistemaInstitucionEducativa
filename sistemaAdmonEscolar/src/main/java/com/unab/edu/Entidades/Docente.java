/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Entidades;

import java.util.Date;
import lombok.*;

/**
 *
 * @author BetoCalderon
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class Docente extends Persona{
    private int idDocente;
    private int idPersona;
    private String Correo_Electronico;
    private String Pass;
    private String Especialidad;
    protected Date Ultima_Modificacion;
    protected int Estado;
    
}
