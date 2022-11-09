/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import java.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author unknown
 */
public class mainFrame extends JFrame {
    public mainFrame(){
    JFrame main = new JFrame();
    main.setSize(250, 180);
    main.setVisible(true);
    main.setLocationRelativeTo(null);
    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    main.setTitle(".......");
    main.setLayout(null);
    
    JButton rw = new JButton("RW");
    rw.setFont(new Font("Consolas",Font.BOLD,17));
    rw.setBounds(10, 10, 210, 30);
    rw.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            rwFrame rw = new rwFrame();
            main.dispose();
        }
    });
    main.add(rw);
    JButton rt = new JButton("RT");
    rt.setFont(new Font("Consolas",Font.BOLD,17));
    rt.setBounds(10, 50, 210, 30);
    rt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            rtFrame rt = new rtFrame();
            main.dispose();
        }
    });
    main.add(rt);
    JButton warga = new JButton("warga");
    warga.setFont(new Font("Consolas",Font.BOLD,17));
    warga.setBounds(10, 90, 210, 30);
    warga.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            wargaFrame warga = new wargaFrame();
            main.dispose();
        }
    });
    main.add(warga);
}
    
}
