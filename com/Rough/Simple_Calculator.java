package com.Rough;
import java.awt.*;
import java.awt.event.*;

 import javax.swing.*;


    public class Simple_Calculator  extends JFrame implements ActionListener{
        JLabel  fn,sn,result;
        JTextField FN,SN;
        JButton add,sub,mul,div;


        Simple_Calculator(){
            fn =new JLabel("First Number");
            fn.setBounds(10,20,100,30);

            sn =new JLabel("Second Number");
            sn.setBounds(10,55,100,30);

            FN = new JTextField();
            FN.setBounds(130,25,80,20);

            SN = new JTextField();
            SN.setBounds(130,60,80,20);

            add =new JButton("+");
            add.setFont(new Font ("Arial",Font.BOLD,20));
            add.setBounds(30,110,50,30);

            sub =new JButton("-");
            sub.setFont(new Font ("Arial",Font.BOLD,20));
            sub.setBounds(90,110,50,30);

            mul =new JButton("*");
            mul.setFont(new Font ("Arial",Font.BOLD,20));
            mul.setBounds(150,110,50,30);

            div =new JButton("/");
            div.setFont(new Font ("Arial",Font.BOLD,20));
            div.setBounds(210,110,50,30);

            result =new JLabel("Result :-");
            result. setFont(new Font ("Arial",Font.ITALIC,20));
            result. setBounds(0,140,300,50);


            add.addActionListener(this);
            sub.addActionListener(this);
            mul.addActionListener(this);
            div.addActionListener(this);

            add(fn); add(sn); add(result);              //Jlabel objects adding
            add(FN); add(SN);                          //Jtextfield objects adding
            add(add); add(sub); add(mul); add(div);   //Jbutton objects adding


            setTitle("Simple Calculator");
            setSize(400, 400);
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);


        }


        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == add) {
                    int a = Integer.parseInt(FN.getText());
                    int b = Integer.parseInt(SN.getText());
                    int c = a + b;
                    result.setText("Result :" + c);
                }

                if (e.getSource() == sub) {
                    int a = Integer.parseInt(FN.getText());
                    int b = Integer.parseInt(SN.getText());
                    int c = a - b;
                    result.setText("Result :" + c);
                }

                if (e.getSource() == mul) {
                    int a = Integer.parseInt(FN.getText());
                    int b = Integer.parseInt(SN.getText());
                    int c = a * b;
                    result.setText("Result :" + c);
                }

                if (e.getSource() == div) {
                    int a = Integer.parseInt(FN.getText());
                    int b = Integer.parseInt(SN.getText());
                    int c = a / b;
                    result.setText("Result :" + c);
                }
            } catch (NumberFormatException e1) {
                result.setText("plz input integers number");
            } catch (ArithmeticException e2){
                result.setText("cannot divide by zero");



            }

        }



        public static void main(String[] args) {
            Simple_Calculator sc= new Simple_Calculator();
        }
    }


