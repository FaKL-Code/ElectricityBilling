package ElectricityBillingSystem.JavaSource.Electricity;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;


public class About extends JFrame implements ActionListener {
    
    JButton botao1;
    JLabel label1;
    Font f, f1, f2;
    TextArea texto1;
    String string;

    public About(){

        setLayout(null);
        JButton botao1 = new JButton("Exit");
        add(botao1);
        botao1.setBounds(180, 430, 120, 20);
        botao1.addActionListener(this);

        Font f = new Font("Arial", Font.BOLD, 180);
        setFont(f);

        string = "................About the Project................\n"
                +"Electricity Billing System is a software developed for"
                +"study purposes. The software is based on a solution for"
                +"automatically calculating an electrical billing using fixed values \n\n"
                ;
        
        TextArea texto1 = new TextArea(string, 10, 40, Scrollbar.VERTICAL);
        texto1.setEditable(false);
        texto1.setBounds(20,100,450,300);

        add(texto1);

        Font f1 = new Font("Arial", Font.BOLD, 16);
        texto1.setFont(f1);

        Container content = this.getContentPane();
        texto1 = new TextArea();

        JLabel label1 = new JLabel("About The Project");
        add(label1);
        label1.setBounds(170,10,180,80);
        label1.setForeground(Color.black);

        Font f2 = new Font("Arial", Font.BOLD, 20);
        label1.setFont(f2);
        
        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed (ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
