package com.ProjectCoca;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.awt.*;

public class Index extends JFrame implements ActionListener {

    private JMenuBar navbar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem m1i1, m1i2, m2i1, m2i2;
    private JComboBox internDep, seniorityy;
    private JLabel namelabel, lstnamlabel, logolabel, newin, rslabel, internlabel, seniorityylabel, bottomlabel;
    private JTextField nametextfield, lstnamtextfield;
    private JTextArea rstarea;

    private String sdep, syear, lname, usname, uslname;
    private int vacs, cdep, cyear, days, vacations[][] = { { 6, 14, 20 }, { 7, 15, 22 }, { 10, 20, 30 } };

    public Index() {
        setLayout(null);
        Login instance = new Login();
        lname = instance.inputed;
        setTitle("Vacation app - " + lname);
        getContentPane().setBackground(new Color(240, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("../../img/icon.png")).getImage());

        navbar = new JMenuBar();
        navbar.setBackground(new Color(240, 0, 0));
        setJMenuBar(navbar);

        menu1 = new JMenu("Actions");
        menu1.setForeground(new Color(255, 255, 255));
        navbar.add(menu1);

        menu2 = new JMenu("System");
        menu2.setForeground(new Color(250, 250, 250));
        navbar.add(menu2);

        menu3 = new JMenu("Logged");
        menu3.setForeground(new Color(150, 0, 0));
        menu2.add(menu3);

        m1i1 = new JMenuItem("Calculate");
        m1i1.setForeground(new Color(150, 0, 0));
        m1i1.addActionListener(this);
        menu1.add(m1i1);

        m1i2 = new JMenuItem("New Query");
        m1i2.setForeground(new Color(150, 0, 0));
        m1i2.addActionListener(this);
        menu1.add(m1i2);

        m2i1 = new JMenuItem("Logout");
        m2i1.setForeground(new Color(150, 0, 0));
        m2i1.addActionListener(this);
        menu3.add(m2i1);

        m2i2 = new JMenuItem("---------------");
        m2i2.setForeground(new Color(150, 0, 0));
        menu3.add(m2i2);

        newin = new JLabel("Calculate new");
        newin.setForeground(new Color(250, 250, 250));
        newin.setBounds(25, 15, 200, 25);
        newin.setFont(new Font("Andale mono", 1, 20));
        add(newin);

        ImageIcon clogo = new ImageIcon(getClass().getResource("../../img/logo-coca.png"));
        logolabel = new JLabel(clogo);
        logolabel.setBounds(340, 15, 240, 80);
        add(logolabel);

        namelabel = new JLabel("Type name");
        namelabel.setForeground(new Color(250, 250, 250));
        namelabel.setBounds(25, 55, 130, 20);
        add(namelabel);

        nametextfield = new JTextField();
        nametextfield.setBounds(25, 80, 140, 20);
        nametextfield.setForeground(new Color(150, 0, 0));
        add(nametextfield);

        lstnamlabel = new JLabel("Type Lastname");
        lstnamlabel.setForeground(new Color(250, 250, 250));
        lstnamlabel.setBounds(185, 55, 140, 20);
        add(lstnamlabel);

        lstnamtextfield = new JTextField();
        lstnamtextfield.setBounds(185, 80, 130, 20);
        lstnamtextfield.setForeground(new Color(150, 0, 0));
        add(lstnamtextfield);

        internlabel = new JLabel("Select Department");
        internlabel.setForeground(new Color(250, 250, 250));
        internlabel.setBounds(25, 110, 130, 20);
        add(internlabel);

        internDep = new JComboBox();
        internDep.setForeground(new Color(150, 0, 0));
        internDep.addItem("");
        internDep.addItem("Customer Service");
        internDep.addItem("Administrative");
        internDep.addItem("Managment");
        internDep.setBounds(25, 135, 270, 20);
        add(internDep);

        seniorityylabel = new JLabel("Seniority Years");
        seniorityylabel.setForeground(new Color(250, 250, 250));
        seniorityylabel.setBounds(305, 110, 130, 20);
        add(seniorityylabel);

        seniorityy = new JComboBox();
        seniorityy.setForeground(new Color(150, 0, 0));
        seniorityy.addItem("");
        seniorityy.addItem("1 year or less");
        seniorityy.addItem("Since 2 to 6 years");
        seniorityy.addItem("More than 7 years");
        seniorityy.setBounds(305, 135, 170, 20);
        add(seniorityy);

        rslabel = new JLabel("Vacations Calcule");
        rslabel.setForeground(new Color(250, 250, 250));
        rslabel.setBounds(150, 170, 300, 20);
        rslabel.setFont(new Font("Andale mono", 1, 15));
        add(rslabel);

        rstarea = new JTextArea("\n" + "-------------" + "Result" + "-------------" + "\n");
        rstarea.setForeground(new Color(190, 0, 0));
        rstarea.setBackground(new Color(220, 220, 220));
        rstarea.setFont(new Font("Andale mono", 1, 16));
        rstarea.setBounds(32, 200, 520, 180);
        add(rstarea);

        /*
         * right ©. Alt + 0169. Marca registrada ®. Alt + 0174. Marca comercial ™. Alt +
         * 0153.
         */
        bottomlabel = new JLabel(" ® 2017 Coca-Cola Company ");
        bottomlabel.setForeground(new Color(250, 250, 250));
        bottomlabel.setBounds(150, 420, 300, 20);
        add(bottomlabel);
    }

    /*-------------------------------------------------------------------------------------------------------------
    *
    *                                                 EVENTS
    *
    *-------------------------------------------------------------------------------------------------------------*/

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == m1i1) {
            usname = nametextfield.getText().trim();
            uslname = lstnamtextfield.getText().trim();
            sdep = internDep.getSelectedItem().toString();
            syear = seniorityy.getSelectedItem().toString();
            cdep = 0;
            cyear = 0;
            switch (sdep) {
                case "Customer Service":
                    cdep = 1;
                    break;
                case "Administrative":
                    cdep = 2;
                    break;
                case "Managment":
                    cdep = 3;
                    break;
                default:
                    break;
            }
            switch (syear) {
                case "1 year or less":
                    cyear = 1;
                    break;
                case "Since 2 to 6 years":
                    cyear = 2;
                    break;
                case "More than 7 years":
                    cyear = 3;
                    break;
                default:
                    break;
            }
            if (cdep == 1) {
                if (cyear == 1) {
                    days = vacations[0][0];
                } else if (cyear == 2) {
                    days = vacations[0][1];
                } else if (cyear == 3) {
                    days = vacations[0][2];
                }
            } else if (cdep == 2) {
                if (cyear == 1) {
                    days = vacations[1][0];
                } else if (cyear == 2) {
                    days = vacations[1][1];
                } else if (cyear == 3) {
                    days = vacations[1][2];
                }
            } else if (cdep == 3) {
                if (cyear == 1) {
                    days = vacations[2][0];
                } else if (cyear == 2) {
                    days = vacations[2][1];
                } else if (cyear == 3) {
                    days = vacations[2][2];
                }
            }
            if (usname.equals("")) {
                JOptionPane.showMessageDialog(null, "You don't filled the name field");
            } else if (uslname.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the lastname field");
            } else {
                if (cdep != 0 && cyear != 0) {
                    rstarea.setText("\n------------- Result -------------\n" + "\n" + "\n" + "The vacation for "
                            + usname + " " + uslname + ", is " + days + " days");
                } else if (cdep == 0) {
                    JOptionPane.showMessageDialog(null, "Please select an option in deparment field");
                } else if (cyear == 0) {
                    JOptionPane.showMessageDialog(null, "Please select an option in seniority field");
                }
            }
        } else if (ae.getSource() == m1i2) {
            this.setVisible(false);
            Index indexw = new Index();
            indexw.setBounds(0, 0, 600, 500);
            indexw.setResizable(false);
            indexw.setVisible(true);
            indexw.setLocationRelativeTo(null);
        } else if (ae.getSource() == m2i1) {
            this.setVisible(false);
            Login wLogin = new Login();
            wLogin.setBounds(0, 0, 400, 500);
            wLogin.setVisible(true);
            wLogin.setResizable(false);
            wLogin.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "Unexpected error");
        }
    }

    public static void main(String[] args) {
    }
}
