/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2quiz;

import java.awt.Color;
import javax.swing.JButton;



/**
 *
 * @author intel
 */
public class Model{   
    private JButton button;
    private String lock = "1234";    
    public void setOpenClose(JButton button, String clave){
        if (button.getBackground() == Color.RED) {
            if(clave.equals(lock)){
                button.setBackground(Color.green);
                this.button = button;
                System.out.println(lock);
            }
        }else if(button.getBackground() == Color.GREEN){
            button.setBackground(Color.red);
            this.button = button;
        }
    }    
    public JButton getOpenClose(){
        return button;
    }    
    public void setCombination(JButton button, String opcClave){
        if(button.getBackground() == Color.GREEN){
            lock = opcClave;
            System.out.println(lock);
        }
    } 
    
    public String getCombination(){
        return  lock;
    }
}
