/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2quiz;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author intel
 */
public class View extends JFrame{
    private JTextField field1;
    private JButton button1, button2;
    private Controller controller;
    
    public View(){
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(new Dimension(500, 400));
        jframe.setTitle("Lock"); 
        jframe.setLayout(new BorderLayout());
        this.button1 = new JButton("Open/Close");
        this.button1.setBackground(Color.GREEN);
        this.field1 = new JTextField("");
        this.button2 = new JButton("Change Combination");
        jframe.add(button1, BorderLayout.NORTH);
        jframe.add(field1, BorderLayout.CENTER);
        jframe.add(button2, BorderLayout.SOUTH);
        jframe.pack();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jframe.setLocation(dim.width/2-jframe.getSize().width/2,dim.height/2-jframe.getSize().height/2); 
        jframe.setVisible(true);
    }
    
    public void ChangeColor(JButton button){
        this.button1 = button;
    }

    public JTextField getField1() {
        return field1;
    }

    public void setField1(JTextField field1) {
        this.field1 = field1;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
        this.button1.addActionListener(this.controller);
        this.button2.addActionListener(this.controller);
    }
    
}
