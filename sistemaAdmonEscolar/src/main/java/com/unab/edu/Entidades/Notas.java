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
public class Notas {
    private int idNota;
    private int idEstudiante;
    private int idMateria;
    private double Periodo1;
    private double Periodo2;
    private double Periodo3;  
    private double NotaFinal;
    private double Recuperacion;
    protected Date Ultima_Modificacion;
    protected int Estado;
}
