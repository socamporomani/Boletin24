/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
/**
 *
 * @author socamporomani
 */
public class NewClass extends JFrame implements ActionListener{
    JPanel panel1,panel2,panel3;
    JLabel nome, pass;
    JTextField textboxN;
    JPasswordField textboxP;
    JList lista;
    JTextArea area;
    JButton btn0,btnP,btnL;
    public void compInicial(){
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        nome=new JLabel("NOME");
        pass=new JLabel("PASSWORD");    
        textboxN=new JTextField();
        textboxP=new JPasswordField();
        btnP=new JButton("PREMER");
        btnL=new JButton("LIMPAR");
        lista=new JList();
        area= new JTextArea();
        btn0=new JButton();
        this.setSize(600, 700);
        panel1.setSize(540,300);
        panel2.setLayout(null);
        panel2.setBounds(10, 375, 577, 290);
        panel2.setBackground(Color.red);
        panel1.add(nome);
        panel1.add(pass);
        panel1.add(textboxN);
        panel1.add(textboxP);
        
        this.add(panel1);
        panel1.add(btnP);
        panel1.add(btnL);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        panel1.setLayout(null);
        panel2.setLayout(null);
        

    }   
    public void carga(){
        compInicial();
        nome.setBounds(190 ,50 ,100,20);
        textboxP.setBounds(300,100,150,50);
        textboxN.setBounds(300,40,150,50);
        pass.setBounds(190,117,100,20);
        btnP.setBounds(120, 200, 150, 50);
        btnL.setBounds(300, 200, 150, 50);

        
        btnL.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==btnL){
    textboxN.setText("");
    textboxP.setText("");
}
else if (e.getSource()==btn0){
    
}
        
    }
}
