package com.ProjectCoca;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;

public class termScreenw extends JFrame implements ActionListener, ChangeListener {
    JButton okbutton, nobutton;
    JCheckBox okcheck;
    JLabel oklabel, logolabel;
    JTextArea termarea;
    String name = "";

    public termScreenw() {
        setLayout(null);
        setTitle("Terms and conditions");
        setIconImage(new ImageIcon(getClass().getResource("../../img/icon.png")).getImage());
        Login instance = new Login();
        name = instance.inputed;

        termarea = new JTextArea("    terms...");
        termarea.setBounds(25, 25, 530, 200);
        add(termarea);

        okcheck = new JCheckBox();
        okcheck.setBounds(35, 235, 30, 30);
        okcheck.addChangeListener(this);
        add(okcheck);

        oklabel = new JLabel("I " + name + " Accept");
        oklabel.setBounds(67, 235, 100, 30);
        add(oklabel);

        ImageIcon logo2 = new ImageIcon(getClass().getResource("../../img/coca-cola.png"));
        logolabel = new JLabel(logo2);
        logolabel.setBounds(320, 270, 250, 100);
        add(logolabel);

        okbutton = new JButton("Next");
        okbutton.setBounds(190, 310, 110, 40);
        okbutton.setEnabled(false);
        add(okbutton);
        okbutton.addActionListener(this);

        nobutton = new JButton("No accept");
        nobutton.setBounds(25, 310, 105, 40);
        add(nobutton);
        nobutton.addActionListener(this);
    }

    public void stateChanged(ChangeEvent cl) {
        if (okcheck.isSelected() == true) {
            okbutton.setEnabled(true);
            nobutton.setEnabled(false);
        } else {
            nobutton.setEnabled(true);
            okbutton.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent eb) {
        if (eb.getSource() == okbutton) {
            Index indexw = new Index();
            indexw.setBounds(0, 0, 600, 500);
            indexw.setResizable(false);
            indexw.setVisible(true);
            indexw.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (eb.getSource() == nobutton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        termScreenw wtscreen = new termScreenw();
        wtscreen.setBounds(0, 0, 600, 450);
        wtscreen.setVisible(true);
        wtscreen.setResizable(false);
        wtscreen.setLocationRelativeTo(null);

    }

}
