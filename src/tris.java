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
                        testo.setText("0 turno");
                        controlla();
                    }
                }
                else{
                    if (bottoni[i].getText() == "") {
                        bottoni[i].setForeground(Color.yellow);
                        bottoni[i].setText("0");
                        p1Girata = true;
                        testo.setText("X turno");
                        controlla();
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
            testo.setText("x turno");
        } 
        else{
            p1Girata = false;
            testo.setText("0 turno");
        }
    }
    
    public void controlla() {
    
        if((bottoni[0].getText() == "X") && (bottoni[1].getText() == "X") && (bottoni[2].getText() == "X")){
            xvittoria(0, 1, 2);
        }
        if((bottoni[3].getText() == "X") && (bottoni[4].getText() == "X") && (bottoni[5].getText() == "X")){
            xvittoria(3, 4, 5);
        }
        if((bottoni[6].getText() == "X") && (bottoni[7].getText() == "X") && (bottoni[8].getText() == "X")){
            xvittoria(6, 7, 8);
        }
        if((bottoni[0].getText() == "X") && (bottoni[3].getText() == "X") && (bottoni[6].getText() == "X")){
            xvittoria(0, 3, 6);
        }
        if((bottoni[1].getText() == "X") && (bottoni[4].getText() == "X") && (bottoni[7].getText() == "X")){
            xvittoria(1, 4, 7);
        }
        if((bottoni[2].getText() == "X") && (bottoni[5].getText() == "X") && (bottoni[8].getText() == "X")){
            xvittoria(2, 5, 8);
        }
        if((bottoni[0].getText() == "X") && (bottoni[4].getText() == "X") && (bottoni[8].getText() == "X")){
            xvittoria(0, 4, 8);
        }
        if((bottoni[2].getText() == "X") && (bottoni[4].getText() == "X") && (bottoni[6].getText() == "X")){
            xvittoria(2, 4, 6);
        }
        //sd
        if((bottoni[0].getText() == "0") && (bottoni[1].getText() == "0") && (bottoni[2].getText() == "0")){
            ovittoria(0, 1, 2);
        }
        if((bottoni[3].getText() == "0") && (bottoni[4].getText() == "0") && (bottoni[5].getText() == "0")){
            ovittoria(3, 4, 5);
        }
        if((bottoni[6].getText() == "0") && (bottoni[7].getText() == "0") && (bottoni[8].getText() == "0")){
            ovittoria(6, 7, 8);
        }
        if((bottoni[0].getText() == "0") && (bottoni[3].getText() == "0") && (bottoni[6].getText() == "0")){
            ovittoria(0, 3, 6);
        }
        if((bottoni[1].getText() == "0") && (bottoni[4].getText() == "0") && (bottoni[7].getText() == "0")){
            ovittoria(1, 4, 7);
        }
        if((bottoni[2].getText() == "0") && (bottoni[5].getText() == "0") && (bottoni[8].getText() == "0")){
            ovittoria(2, 5, 8);
        }
        if((bottoni[0].getText() == "0") && (bottoni[4].getText() == "0") && (bottoni[8].getText() == "0")){
            ovittoria(0, 4, 8);
        }
        if((bottoni[2].getText() == "0") && (bottoni[4].getText() == "0") && (bottoni[6].getText() == "0")){
            ovittoria(2, 4, 6);
        }
    }
    
    public void xvittoria(int a, int b, int c) {
    
        bottoni[a].setBackground(Color.green);
        bottoni[b].setBackground(Color.green);
        bottoni[c].setBackground(Color.green);
        
        for(int i = 0; i < 9; i++){
            bottoni[i].setEnabled(false);
        }
        testo.setText("X ha vinto, 0 sparati");
        
        
        
    }
     public void ovittoria(int a, int b, int c) {
     
        bottoni[a].setBackground(Color.green);
        bottoni[b].setBackground(Color.green);
        bottoni[c].setBackground(Color.green);
        
        for(int i = 0; i < 9; i++){
            bottoni[i].setEnabled(false);
        }
        
        testo.setText("0 ha vinto, X sparati");
        
     }
    
    

    
    
}
