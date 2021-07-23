package com.ProjectCoca;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class termScreenw extends JFrame implements ActionListener {
    JButton okbutton, nobutton;
    JCheckBox okcheck;
    JLabel oklabel, logolabel;
    JTextArea termarea;

    public termScreenw(){
        setLayout(null);
        setTitle("Terms and conditions");
        setIconImage(new ImageIcon(getClass().getResource("../../img/icon.png")).getImage());

        termarea = new JTextArea("terms...");
        termarea.setBounds(25, 25, 500, 180);
        add(termarea);

        okcheck = new JCheckBox();
        okcheck.setBounds(25, 210, 30, 30);
        add(okcheck);

        oklabel = new JLabel("I Accept");
        oklabel.setBounds(57, 210, 100, 30);
        add(oklabel);

        ImageIcon logo2 = new ImageIcon(getClass().getResource("../../img/coca-cola.png"));
        logolabel = new JLabel(logo2);
        logolabel.setBounds(200, 210, 250, 100);
        add(logolabel);
    }

    public void itemStateChange (ItemEvent e){
        if (e.getItemSelectable() == okcheck) {
            
        }
    }
    public void actionPerformed(ActionEvent e){
        
    }
   
    public static void main(String[] args) {
        termScreenw wtscreen = new termScreenw();
        wtscreen.setBounds(0, 0, 600, 450);
        wtscreen.setVisible(true);
        wtscreen.setResizable(false);
        wtscreen.setLocationRelativeTo(null);
        
    }
}
