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
    
    Random random = new Random();
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
        
        bottone.setLayout(new GridLayout(3, 3));
        bottone.setBackground(Color.blue);
        
        for(int i = 0; i<9; i++){
            
            bottoni[i] = new JButton();
            bottone.add(bottoni[i]);
            bottoni[i].setFont(new Font("MV Boli",Font.BOLD,120));
            bottoni[i].setFocusable(false);
            bottoni[i].addActionListener(this);
        }
        
        titolo.add(testo);
        frame.add(titolo,BorderLayout.NORTH);
        frame.add(bottone);
        
        primaMossa();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        for(int i = 0; i < 9; i++) {
            if(e.getSource()==bottoni[i]){
                if(p1Girata){
                    if (bottoni[i].getText() == "") {
                        bottoni[i].setForeground(Color.GRAY);
                        bottoni[i].setText("X");
                        p1Girata = false;
                        testo.setText("0 gira");
                        
                    }
                }
                else{
                    if (bottoni[i].getText() == "") {
                        bottoni[i].setForeground(Color.yellow);
                        bottoni[i].setText("0");
                        p1Girata = false;
                        testo.setText("X gira");
                        
                    }
                }
            }
        }
    }
    
    public void primaMossa() {
    
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        if(random.nextInt(2) == 0){
            p1Girata = true;
            testo.setText("x gira");
        } 
        else{
            p1Girata = false;
            testo.setText("0 gira");
        }
    }
    
    public void controlla() {}
    
    public void xvittoria(int a, int b, int c) {}
     public void ovittoria(int a, int b, int c) {}
    
    

    
    
}
