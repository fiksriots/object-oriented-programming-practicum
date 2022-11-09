/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ta.GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ZEIDAR
 */
public class Beranda extends JFrame{

public Beranda(){
        //Frame
     
    JFrame mainFrame=new JFrame();
    mainFrame.setSize(700,450);
    mainFrame.getContentPane().setBackground(Color.ORANGE);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("Beranda");
    mainFrame.setLayout(null);
    JLabel judul =new JLabel("PENITIPAN KENDARAAN");
    judul.setBounds(130, 30, 600, 70);
    judul.setFont(new Font("Arial",Font.BOLD,36));
    JLabel judul1 =new JLabel("Ahmad Dzakiyul fikri");
    judul1.setBounds(250, 100, 600, 20);
    judul1.setFont(new Font("Arial",Font.BOLD,18));
    //1.manage jenis kendaraan
    JButton buttonNo1=new JButton("Manage Harga Kendaraan");
    buttonNo1.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
    buttonNo1.setBackground(Color.black);
    buttonNo1.setForeground(Color.white);
    buttonNo1.setBounds(30,150 , 300, 50);
    buttonNo1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           No1code no1 =new No1code(mainFrame);
           mainFrame.setVisible(false);
           no1.setVisible(true);
        }
    });
    mainFrame.add(buttonNo1);
    mainFrame.add(judul);
    mainFrame.add(judul1);
    
    //2.Kendaraan Masuk
    JButton buttonNo2=new JButton("Kendaraan Masuk");
    buttonNo2.setFont(new Font("Arial",Font.BOLD,14));
    buttonNo2.setBackground(Color.black);
    buttonNo2.setForeground(Color.white);
    buttonNo2.setBounds(30, 230, 300,50);
    buttonNo2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
             No2code no2 =new No2code();
             no2.setVisible(true);
            mainFrame.dispose();
        }
    });
    mainFrame.add(buttonNo2);
    
    //3.Kendaraan Keluar
    JButton buttonNo3=new JButton("Kendaraan Keluar");
    buttonNo3.setFont(new Font("Arial",Font.BOLD,14));
    buttonNo3.setBackground(Color.black);
    buttonNo3.setForeground(Color.white);
    buttonNo3.setBounds(30, 310, 300,50);
    buttonNo3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            No3code no3 =new No3code();
            no3.setVisible(true);
            mainFrame.dispose();
        }
    });
    mainFrame.add(buttonNo3);
    
    mainFrame.setVisible(true);
    
    
}
}
