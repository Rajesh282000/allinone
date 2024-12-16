//Advance java
package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loginform extends JFrame implements ActionListener {

    JLabel l1, l2, l;
    JButton jb;
    JTextField jt;
    JPasswordField jp;

    Loginform() {
        l1 = new JLabel("User Id");
        l1. setBounds(50, 50, 50, 50);

        l2 =new JLabel("User Password");
        l2. setBounds(50, 90, 100, 50);

        jt = new JTextField();
        jt.setBounds(170,50,150,30);
        jt. setFont(new Font ("Arial",Font.PLAIN,20));

        jp = new JPasswordField();
        jp. setBounds(170,90,150,30);
        jp.setFont(new Font ("Arial",Font.ITALIC,20));

        jb= new JButton("Submit");
        jb.setBounds(150 ,150,80,30);

        l= new JLabel();
        l.setBounds(90,150,200,200);

        jb.addActionListener(this);
        add(l1); add(l2); add(l);
        add(jt);
        add(jp);
        add(jb);



        setTitle("login Form");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent e){
        l.setText("Submit Successfully");


    }


    public static void main(String[] args) {
        Loginform j = new  Loginform();

    }
}

