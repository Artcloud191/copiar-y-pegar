package com.mycompany.copiarypegar1;
import javax.swing.*;
import java.awt.FlowLayout;

public class Copiarypegar1 extends JFrame {
    public Copiarypegar1 (){
    setTitle("copiar y pegar");    
    setSize(777,666);    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    }

    public static void main(String[] args) {
        Copiarypegar1 ventana = new Copiarypegar1 ();
        ventana.setVisible(true);
       
    }
}
