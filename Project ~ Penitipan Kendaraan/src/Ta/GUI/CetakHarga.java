
package Ta.GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*;
import Ta.model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CetakHarga extends JFrame
{
    
    public CetakHarga()
    {
       
    JFrame mainFrame=new JFrame();
    mainFrame.setSize(500,430);
    mainFrame.getContentPane().setBackground(Color.ORANGE);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("Harga Penitipan Kendaraan");
    mainFrame.setLayout(null);
    JLabel judul =new JLabel("Harga Penitipan Kendaraan");
    judul.setBounds(70, 30, 600, 70);
    judul.setFont(new Font("Arial",Font.BOLD,26));
    mainFrame.add(judul);
    JTextArea view = new JTextArea();
    view.setBounds(0, 100, 500, 200);
    view.setFont(new Font("Arial",Font.ITALIC,16));
    view.setText
        (
                
                "\n"+
                "   Harga Awal Masuk Mobil         : "+AllObject.harga.dataHarga[0].getHmobil()+"\n"+
                "   Harga Awal Masuk Motor         : "+AllObject.harga.dataHarga[0].getHmotor()+"\n"+
                "   Harga Kelebihan Per-jam Mobil  : "+AllObject.harga.dataHarga[0].getKmobil()+"\n"+
                "   Harga Kelebihan Per-jam Motor  : "+AllObject.harga.dataHarga[0].getKmotor()+"\n"+
                "   Harga Denda STNK Mobil         : "+AllObject.harga.dataHarga[0].getDmobil()+"\n"+
                "   Harga Denda STNK Motor         : "+AllObject.harga.dataHarga[0].getDmotor()+"\n"+
                "\n"
                
        );
        
        JButton kembali = new JButton("Back");
        kembali.setBounds(230,330,100,30);
        kembali.setBackground(Color.BLACK);
        kembali.setForeground(Color.WHITE);
        kembali.addActionListener(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e)
            {
            mainFrame.dispose();
            }
            });
        mainFrame.add(kembali);
    mainFrame.add(view);
    
    mainFrame.setVisible(true);
    }
}
