package Ta.GUI;
import Ta.model.AllObject;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Ta.controller.*;
import Ta.model.AllObject;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class No1code extends JFrame
{
      
    public No1code( JFrame Beranda)
    {        
       
    //dklarasi
      
      
    JFrame mainFrame=new JFrame();
    mainFrame.setSize(900,450);
    mainFrame.getContentPane().setBackground(Color.ORANGE);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("Manage Harga Kendaraan");
    mainFrame.setLayout(null);
    JLabel judul =new JLabel("Manage Harga");
    judul.setBounds(340, 30, 600, 70);
    judul.setFont(new Font("Arial",Font.BOLD,36));
    mainFrame.add(judul);
    JLabel mobil =new JLabel("Mobil");
    mobil.setBounds(300, 120, 600, 70);
    mobil.setFont(new Font("Arial",Font.BOLD,16));
    mainFrame.add(mobil);
    JLabel motor =new JLabel("Motor");
    motor.setBounds(600, 120, 600, 70);
    motor.setFont(new Font("Arial",Font.BOLD,16));
    mainFrame.add(motor);

    //Label
    JLabel HargaA = new JLabel("Harga Awal Masuk");
    JLabel KPerJam = new JLabel("Kelebihan per-jam");
    JLabel Dstnk = new JLabel("Denda tidak ada STNK");
    JTextField HargaA1 = new JTextField();
    JTextField KPerJam1 = new JTextField();
    JTextField Dstnk1 = new JTextField();
    JTextField HargaA2 = new JTextField();
    JTextField KPerJam2 = new JTextField();
    JTextField Dstnk2 = new JTextField();
    HargaA.setBounds(30, 170, 160, 30);
    HargaA.setFont(new Font("Arial",Font.BOLD,14));
    HargaA1.setBounds(200, 170, 250, 30);
    HargaA1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null,"Inputan hanya menerima angka");
                }
            }
        });
    HargaA1.setFont(new Font("Arial",Font.BOLD,14));
    HargaA2.setBounds(500, 170, 250, 30);
    HargaA2.setFont(new Font("Arial",Font.BOLD,14));
    HargaA2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null,"Inputan hanya menerima angka");
                }
            }
        });
    KPerJam.setBounds(30, 220, 160, 30);
    KPerJam.setFont(new Font("Arial",Font.BOLD,14));
    KPerJam1.setBounds(200, 220, 250, 30);
    KPerJam1.setFont(new Font("Arial",Font.BOLD,14));
    KPerJam1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null,"Inputan hanya menerima angka");
                }
            }
        });
    KPerJam2.setBounds(500, 220, 250, 30);
    KPerJam2.setFont(new Font("Arial",Font.BOLD,14));
    KPerJam2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null,"Inputan hanya menerima angka");
                }
            }
        });
    Dstnk.setBounds(30, 270, 160, 30);
    Dstnk.setFont(new Font("Arial",Font.BOLD,14));
    Dstnk1.setBounds(200, 270, 250, 30);
    Dstnk1.setFont(new Font("Arial",Font.BOLD,14));
    Dstnk1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null,"Inputan hanya menerima angka");
                }
            }
        });
    Dstnk2.setBounds(500, 270, 250, 30);
    Dstnk2.setFont(new Font("Arial",Font.BOLD,14));
    Dstnk2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(Character.isAlphabetic(ke.getKeyChar())){
                    ke.consume();
                    JOptionPane.showMessageDialog(null,"Inputan hanya menerima angka");
                }
            }
        });
    mainFrame.add(HargaA);
    mainFrame.add(KPerJam);
    mainFrame.add(Dstnk);
    mainFrame.add(HargaA1);
    mainFrame.add(HargaA2);
    mainFrame.add(KPerJam1);
    mainFrame.add(KPerJam2);
    mainFrame.add(Dstnk1);
    mainFrame.add(Dstnk2);
    
  
    
    
    JButton Input1 = new JButton("Insert");
    JButton View1 = new JButton("View");
    JButton Update1 = new JButton("Update");
    JButton Back1 = new JButton("Back");
    Input1.setBounds(50, 350, 100, 30);
    Input1.setFont(new Font("Consolas",Font.BOLD,14));
    Input1.setForeground(Color.white);
    Input1.setBackground(Color.black);
    Input1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                 String getHmobil=HargaA1.getText();
                 String getHmotor=HargaA2.getText();
                 String getKmobil=KPerJam1.getText();
                 String getKmotor=KPerJam2.getText();
                 String getDmobil=Dstnk1.getText();
                 String getDmotor=Dstnk2.getText();
                 
                 
                 if(HargaA1.getText().equals("")||HargaA2.getText().equals("")||KPerJam1.getText().equals("")||KPerJam2.getText().equalsIgnoreCase("")||Dstnk1.getText().equals("")||Dstnk2.getText().equalsIgnoreCase("") ){
                    JOptionPane.showMessageDialog(null, "Data yang di-inputkan ada yang kosong");
                }
                else{
                  AllObject.harga.insert(getHmobil, getHmotor, getKmobil, getKmotor, getDmobil,getDmotor);
                    JOptionPane.showMessageDialog(null, "Data Harga Berhasil Diinputkan");
                }
                HargaA1.setText("");
                 HargaA2.setText("");
                 KPerJam1.setText("");
                 KPerJam2.setText("");
                 Dstnk1.setText("");
                 Dstnk2.setText("");
            }
        });
    mainFrame.add(Input1);
    View1.setBounds(200, 350, 100, 30);
    View1.setFont(new Font("Consolas",Font.BOLD,14));
    View1.setForeground(Color.white);
    View1.setBackground(Color.black);
    View1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try{
                CetakHarga panggil4 = new CetakHarga(); 
                }catch(Exception a)
                {
                    JOptionPane.showMessageDialog(null,a+ "Data Masih Kosong");
                }
            }
        });
    
    mainFrame.add(View1);
   Update1.setBounds(350, 350, 100, 30);
   Update1.setFont(new Font("Consolas",Font.BOLD,14));
   Update1.setForeground(Color.white);
   Update1.setBackground(Color.black);
   Update1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           String getHmobil=HargaA1.getText();
                 String getHmotor=HargaA2.getText();
                 String getKmobil=KPerJam1.getText();
                 String getKmotor=KPerJam2.getText();
                 String getDmobil=Dstnk1.getText();
                 String getDmotor=Dstnk2.getText();
                 
                 
                 if(HargaA1.getText().equals("")||HargaA2.getText().equals("")||KPerJam1.getText().equals("")||KPerJam2.getText().equalsIgnoreCase("")||Dstnk1.getText().equals("")||Dstnk2.getText().equalsIgnoreCase("") ){
                    JOptionPane.showMessageDialog(null, "Data yang di-inputkan ada yang kosong");
                }
                else{
                  AllObject.harga.insert(getHmobil, getHmotor, getKmobil, getKmotor, getDmobil,getDmotor);
                    JOptionPane.showMessageDialog(null, "Data Harga Berhasil Di-Update");
                }
                HargaA1.setText("");
                 HargaA2.setText("");
                 KPerJam1.setText("");
                 KPerJam2.setText("");
                 Dstnk1.setText("");
                 Dstnk2.setText("");
        }
    });
    mainFrame.add(Update1);
    Back1.setBounds(500, 350, 100, 30);
    Back1.setFont(new Font("Consolas",Font.BOLD,14));
    Back1.setForeground(Color.white);
    Back1.setBackground(Color.black);
    Back1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           //Beranda beranda =new Beranda();
           mainFrame.dispose();
           Beranda.setVisible(true);
        }
    });
    mainFrame.add(Back1);
    
    
  
 
    
    mainFrame.setVisible(true);
    
    
}
    
}
