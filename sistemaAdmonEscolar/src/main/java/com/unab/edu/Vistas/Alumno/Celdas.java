/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Vistas.Alumno;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author dayan
 */
    public class Celdas extends DefaultTableCellRenderer{
        
    private Component componente;
   
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, 
           boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        if( value instanceof Integer )
        {
            Integer amount = (Integer) value;
            if( amount.intValue() <6)
            {
                componente.setBackground(Color.RED);
                componente.setForeground(Color.WHITE);
            }
            else
            {
             if(amount.intValue()>6){
              componente.setBackground(Color.GREEN);
              componente.setForeground(Color.WHITE);
            }
             else{
              componente.setBackground(Color.WHITE);
              componente.setForeground(Color.BLACK);
            }
        }
    }
        return componente;
    }
}
