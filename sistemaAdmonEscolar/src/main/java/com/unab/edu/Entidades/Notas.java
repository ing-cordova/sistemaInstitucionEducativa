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
    private int idDocente;
    private int idMateria;
    private double Lab1;
    private double Examen1;
    private double Lab2;
    private double Examen2;
    private double Lab3;        
    private double Examen3;
    private double NotaFinal;
    protected Date Ultima_Modificacion;
    protected int Estado;
}
