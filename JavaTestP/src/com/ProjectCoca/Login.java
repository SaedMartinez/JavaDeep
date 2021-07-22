package com.ProjectCoca;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener {

    private JTextField usinput;
    private JLabel uslabel, rglabel, piclabel, lglabel;
    private JButton inbutton;

    public Login() {
        setLayout(null);
        setTitle("Welcome");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("../../img/icon.png")).getImage());
        
        ImageIcon pic = new ImageIcon(getClass().getResource("../../img/logo-coca.png"));
        piclabel = new JLabel(pic);
        piclabel.setBounds(35, 15, 300, 150);
        add(piclabel);

        lglabel = new JLabel("Vacational Control System");
        lglabel.setBounds(50, 180, 320, 30);
        lglabel.setFont(new Font("Andale Mono", 3, 18));
        lglabel.setForeground(new Color(255,255,255));
        add(lglabel);

        uslabel = new JLabel("User:");
        uslabel.setBounds(100, 230, 100, 30);
        uslabel.setFont(new Font("Andale Mono", 3, 15));
        uslabel.setForeground(new Color(255,255,255));
        add(uslabel);

        usinput = new JTextField();
        usinput.setBounds(100, 270, 150, 30);
        usinput.setForeground(new Color(255,0,0));
        usinput.setFont(new Font("Andale Mono", 3, 13));
        add(usinput);

        rglabel = new JLabel("All the rights reserved ©");
        rglabel.setBounds(95, 415, 285, 20);
        rglabel.setFont(new Font("Andale Mono", 3, 15));
        rglabel.setForeground(new Color(255,255,255));
        add(rglabel);

        inbutton = new JButton("CONTINUE");
        inbutton.setBounds(125, 330, 105, 25);
        inbutton.setBackground(new Color(255,255,255));
        inbutton.setForeground(new Color(255,0,0));
        inbutton.setFont(new Font("Calibri", 1, 13));
        add(inbutton);
        inbutton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == inbutton) {
            
        }
    }

    public static void main(String[] args) {
        Login wLogin = new Login();
        wLogin.setBounds(0, 0, 400, 500);
        wLogin.setVisible(true);
        wLogin.setResizable(false);
        wLogin.setLocationRelativeTo(null);
    }
}
