package com.PooCurse.Advanced;
import javax.swing.*;
import java.awt.event.*;



public class PileListView extends JFrame implements ActionListener{

    private JTextField textfield1;
    private JButton button1;

    public PileListView(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textfield1 = new JTextField();
        textfield1.setBounds(25, 25, 200, 20);
        add(textfield1);
        textfield1.setText("{3*(7-6)-(3*7)-[6-3]}");

        button1 = new JButton("Validate");
        button1.setBounds(60, 60, 90, 20);
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (ValidateExp() == true) {
            JOptionPane.showMessageDialog(null, "Formule ok");
        }else{
            JOptionPane.showMessageDialog(null, "Formule ERROR , ERROR, ERROR");
        }
    }

    public static void main(String[] args) {
        PileListView view = new PileListView();
        view.setBounds(0, 0, 280, 150);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
    }

    public boolean ValidateExp(){
        PileList PileCont = new PileList();
        String sstring=textfield1.getText();
        for (int i=0; i < sstring.length();i++){
            if ( sstring.charAt(i) == '(' || sstring.charAt(i) == '{' || sstring.charAt(i) == '[') {
                PileCont.InNode(sstring.charAt(i));
            } else {
                if (sstring.charAt(i) == ')' ) {
                    if (PileCont.GetNode() != '(' ) {
                        return false;
                    }
                } else {
                    if (sstring.charAt(i) == ']') {
                        if (PileCont.GetNode() != '[') {
                            return false;
                        }
                    } else {
                        if (sstring.charAt(i) == '}') {
                            if (PileCont.GetNode() != '{') {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return PileCont.BlankPile();
    }
}
