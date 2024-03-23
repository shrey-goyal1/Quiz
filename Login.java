package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Algerian", Font.BOLD, 18));
        name.setForeground(new Color(80,00,80));
        add(name);
        //
        JLabel name2 = new JLabel("CLICK RULES TO PROCEED");
        name2.setBounds(780, 300, 320, 30);
        name2.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        name2.setForeground(new Color(255,00,00));
        add(name2);
        
        JLabel name3 = new JLabel("Made By:-");
        name3.setBounds(900, 350, 320, 30);
        name3.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        name3.setForeground(new Color(00,00,00));
        add(name3);
        
        JLabel name4 = new JLabel("Manushri");
        name4.setBounds(960, 370, 320, 30);
        name4.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        name4.setForeground(new Color(30, 144, 254));
        add(name4);
        
        JLabel name5 = new JLabel("Siddharth Maru");
        name5.setBounds(960, 390, 320, 30);
        name5.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        name5.setForeground(new Color(30, 144, 254));
        add(name5);
        
        JLabel name6 = new JLabel("Omkar Rasal");
        name6.setBounds(960, 410, 320, 30);
        name6.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        name6.setForeground(new Color(30, 144, 254));
        add(name6);
        
        JLabel name7 = new JLabel("Shrey Goyal");
        name7.setBounds(960, 430, 320, 30);
        name7.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        name7.setForeground(new Color(30, 144, 254));
        add(name7);
        
        //
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
