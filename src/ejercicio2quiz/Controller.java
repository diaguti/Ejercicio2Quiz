/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2quiz;

import java.awt.event.*;
import javax.swing.JButton;

/**
 *
 * @author intel
 */
public class Controller implements ActionListener{
    private Model model;
    private View view;    
    private String clave, opcClave;
    private JButton button;
    public Controller(Model model, View view) {        
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.getButton1()) {
            button = this.view.getButton1();
            clave = this.view.getField1().getText();
            this.model.setOpenClose(button, clave);
            this.view.ChangeColor(this.model.getOpenClose());
        }else if(e.getSource() == this.view.getButton2()){
            opcClave = this.view.getField1().getText();
            this.model.setCombination(button, opcClave);
            clave = this.model.getCombination();
        }
        
    }  
    
    public void StartApplication(){
        this.view.setVisible(true);
    }
    
}
