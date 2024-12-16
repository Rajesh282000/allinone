package com.Rough;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login implements ActionListener
{
    static JTextField name;
    static JPasswordField pswd;
    static JButton view;
    static JTextField text;
    //Driver function
    public static void main(String args[])
    {
        //Create a frame
        JFrame frame=new JFrame("Login");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create two labels
        JLabel l_name=new JLabel("Name :");
        JLabel l_pswd=new JLabel("Password :");
        l_name.setBounds(50,50,50,50);
        l_pswd.setBounds(20,100,80,50);
        frame.add(l_name);
        frame.add(l_pswd);
        //Create two text fields for name and password
        name=new JTextField();
        pswd=new JPasswordField();
        name.setBounds(100,50,250,50);
        pswd.setBounds(100,100,250,50);
        frame.add(name);
        frame.add(pswd);
        //Create a button
        view=new JButton("View");
        view.setBounds(150,200,100,50);
        frame.add(view);
        //Create a text field to display the username and password
        text=new JTextField();
        text.setBounds(0,250,400,50);
        frame.add(text);
        //Create an object
        Login obj=new Login();
        //Associate ActionListener with the button
        view.addActionListener(obj);
        //Display the frame
        frame.setVisible(true);
    }
    //function to display the username and password typed
    public void actionPerformed(ActionEvent e)
    {
        String pass=String.valueOf(pswd.getPassword());
        text.setText("Username = "+name.getText() + " Password = "+pass);
      //  text.setText(text.getText()+" Password = "+pass);
    }
}
