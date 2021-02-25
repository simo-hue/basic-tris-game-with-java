/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class tris implements ActionListener{
    
    Random ranodm = new Random();
    JFrame frame = new JFrame();
    JPanel titolo = new JPanel();
    JPanel bottone = new JPanel();
    JLabel testo = new JLabel();
    JButton[] bottoni = new JButton[9];
    boolean p1Girata;
    
    public tris() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        testo.setBackground(Color.red);
        testo.setForeground(Color.green);
        testo.setFont(new Font("Ink Free",Font.BOLD,75));
        testo.setHorizontalAlignment(JLabel.CENTER);
        testo.setText("TRIS");
        testo.setOpaque(true);
        
        titolo.setLayout(new BorderLayout());
        titolo.setBounds(0,0,800,100);
        titolo.add(testo);
        frame.add(titolo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void primaMossa() {}
    
    public void controlla() {}
    
    public void xvittoria(int a, int b, int c) {}
     public void ovittoria(int a, int b, int c) {}
    
    

    
    
}
