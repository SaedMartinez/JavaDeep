package com.FuntionalEstructuralParadigm;

import javax.swing.*;
import java.awt.event.*;

public class FEPSwings extends JFrame implements ActionListener {

    private JLabel label1;
    private JButton button1, button2;
    private JTextField input1;

    public FEPSwings() {
        setLayout(null);
        input1 = new JTextField();
        input1.setBounds(0, 50, 100, 30);
        add(input1);
        label1 = new JLabel("Hola mundo");
        label1.setBounds(10, 20, 200, 300);
        add(label1);
        button1 = new JButton("Cerrar");
        button1.setBounds(265, 405, 100, 30);
        add(button1);
        button2 = new JButton(" ON/OFF ");
        button2.setBounds(105, 405, 100, 30);
        add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    // Method that implements events in interface
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.exit(0);
        }
        if (e.getSource() == button2) {
            label1.setText("on");
        }
    }

    public static void main(String[] args) {
        FEPSwings form1 = new FEPSwings();
        form1.setBounds(0, 0, 400, 500);
        form1.setVisible(true);
        form1.setLocationRelativeTo(null);
        form1.setResizable(false);
    }
}
