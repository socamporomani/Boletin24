/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
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
        this.setSize(530, 700);
        panel1.setSize(540,300);
        panel2.setLayout(null);
        panel2.setBounds(0, 330, 577, 280);
        panel3.setSize(540,300);
        panel1.setBackground(Color.white);
        panel2.setBackground(Color.white);
        panel1.add(nome);
        panel1.add(pass);
        panel1.add(textboxN);
        panel1.add(textboxP);
        panel3.setBackground(Color.lightGray);
        panel1.add(btnP);
        panel1.add(btnL);
        panel2.add(lista);
        panel2.add(btn0);
        panel2.add(area);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
        panel3.add(panel1);
        panel3.add(panel2);
        this.add(panel1);            
        this.add(panel2);
        this.add(panel3);
        

    }   
    public void carga(){
        compInicial();
        nome.setBounds(190 ,50 ,100,20);
        textboxP.setBounds(300,100,150,50);
        textboxN.setBounds(300,40,150,50);
        pass.setBounds(190,117,100,20);
        btnP.setBounds(120, 200, 150, 50);
        btnL.setBounds(300, 200, 150, 50);
        btn0.setBounds(230, 100, 100, 50);
        btn0.setText("BOTON");
       
        lista.setBounds(23,29,180,200);
        Object[] listData={"ElementoLista1","ElementoLista2","ElementoLista3"};
        lista.setListData(listData);
        lista.setBorder(BorderFactory.createLineBorder(Color.black));
        area.setBorder(BorderFactory.createLineBorder(Color.black));
        area.setBounds(353,43,143,163);
        area.setText("Area de Texto");
        btnL.addActionListener(this);
        btn0.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texto = "";
if (e.getSource()==btnL){
    textboxN.setText("");
    textboxP.setText("");
}
else if (e.getSource()==btn0){
            area.setText("");
texto=textboxN.getText()+"\n"+lista.getSelectedValue()+"\n"+texto;
        area.setText(texto);
    }
}
}