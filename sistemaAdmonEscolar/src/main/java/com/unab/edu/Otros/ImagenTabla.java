/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Otros;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author AndresC
 */
public class ImagenTabla extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable tabla, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (value instanceof JLabel) {
            JLabel lbl = (JLabel) value;
            return lbl;
        }
        
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            
            if(isSelected){
                btn.setForeground(tabla.getSelectionForeground());
                btn.setBackground(tabla.getSelectionBackground());  
            }
            else{
                btn.setForeground(tabla.getForeground());
                btn.setBackground(UIManager.getColor("btn.Background"));
            }
            
            return btn;
        }
        
        return super.getTableCellRendererComponent(tabla, value, isSelected, hasFocus, row, column);
    }
}
