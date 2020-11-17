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
public class Actividades {
    protected int idActividad;
    protected int idDocente;
    protected int idMateria;
    protected String Nombre_Actividad;
    protected int Porcentaje;
    protected Date Ultima_Modificacion;
    protected int Estado;
}
