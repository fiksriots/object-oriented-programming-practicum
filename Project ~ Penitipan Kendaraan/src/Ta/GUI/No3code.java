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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import Ta.model.*;
import Ta.controller.*;
public class No3code extends JFrame
{   
    public Paycontroller in = new Paycontroller();
    public No3code()
    {        
 //Frame
    JFrame mainFrame=new JFrame();
    mainFrame.setSize(500,350);
    mainFrame.getContentPane().setBackground(Color.ORANGE);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("Kendaraan Keluar");
    mainFrame.setLayout(null);
    JLabel judul2 =new JLabel("KENDARAAN KELUAR");
    judul2.setBounds(60, 30, 600, 70);
    judul2.setFont(new Font("Arial",Font.BOLD,36));
    mainFrame.add(judul2);
    
    //radio button
    /*JRadioButton mobil3 =new JRadioButton("Mobil");
    JRadioButton motor3 =new JRadioButton("Motor");
    ButtonGroup kendaraan2 =new ButtonGroup();
    kendaraan2.add(mobil3);
    kendaraan2.add(motor3);
    mobil3.setBounds(150,100,60,30);
    motor3.setBounds(250,100,60,30);
    mobil3.setBackground(Color.ORANGE);
    motor3.setBackground(Color.ORANGE);
    mainFrame.add(mobil3);
    mainFrame.add(motor3);*/
    //Label
    JLabel CPlatN = new JLabel("Cari Plat Nomor ");
    JTextField CPlatN1 = new JTextField();
    CPlatN.setBounds(30, 170, 160, 30);
    CPlatN.setFont(new Font("Arial",Font.BOLD,14));
    CPlatN1.setBounds(200, 170, 250, 30);
    CPlatN1.setFont(new Font("Arial",Font.BOLD,14));

    mainFrame.add(CPlatN);
    mainFrame.add(CPlatN1);
    
    
//Button
   
    JButton View3 = new JButton("Cetak Struct");
    JButton Back3 = new JButton("Back");
    View3.setBounds(300, 250, 150, 30);
    View3.setFont(new Font("Consolas",Font.BOLD,14));
    View3.setForeground(Color.white);
    View3.setBackground(Color.black);
    View3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cari = CPlatN1.getText();
                Kendaraan ken ;
                Kendaraancontroller kendar =new Kendaraancontroller();
                String input;
                try{
                ken = AllObject.kendaraan.cariObjek(cari);
                in.pay(cari);
                CPlatN1.setText("");
                }catch(Exception e)
                {
                    
                     JOptionPane.showMessageDialog(null, "Inputkan harga dulu");
                 
                }
            }
        });
    mainFrame.add(View3);
    Back3.setBounds(100, 250, 100, 30);
    Back3.setFont(new Font("Consolas",Font.BOLD,14));
    Back3.setForeground(Color.white);
    Back3.setBackground(Color.black);
    Back3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           Beranda beranda =new Beranda();
           beranda.setVisible(true);
           mainFrame.dispose();
        }
    });
    mainFrame.add(Back3);
    
    
    
  
 
    
    mainFrame.setVisible(true);
    
    
}
}

