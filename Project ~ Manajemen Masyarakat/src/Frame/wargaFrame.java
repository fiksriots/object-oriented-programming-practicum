/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.allObject;

/**
 *
 * @author unknown
 */
public class wargaFrame {
    int angka = 1;
    
    
     public wargaFrame(){
    JFrame GUIwarga = new JFrame();
    GUIwarga.setSize(800, 900);
    GUIwarga.setVisible(true);
    GUIwarga.setLocationRelativeTo(null);
    GUIwarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GUIwarga.setTitle("Warga");
    GUIwarga.setLayout(null);
    
        JLabel label = new JLabel("WARGA");
        label.setBounds(350, 10, 300, 100);
        label.setFont(new Font("Times new roman",Font.BOLD,50));
        GUIwarga.add(label);
        
        JLabel nama = new JLabel("nama warga");
        nama.setBounds(10, 120,150,40);
        GUIwarga.add(nama);
        
        JTextField nm = new JTextField();
        nm.setBounds(150, 130, 150, 25);
        GUIwarga.add(nm);
        
        JLabel noHp = new JLabel("no. hp");
        noHp.setBounds(10, 150, 150, 40);
        GUIwarga.add(noHp);
        
        JTextField np = new JTextField();
        np.setBounds(150, 160, 150, 25);
        GUIwarga.add(np);
        
        JLabel alamat = new JLabel("alamat");
        alamat.setBounds(10, 180, 150, 40);
        GUIwarga.add(alamat);
        
        JTextField almt = new JTextField();
        almt.setBounds(150, 190, 150, 25);
        GUIwarga.add(almt);
        
        JLabel rrw = new JLabel("no Rw");
        rrw.setBounds(10, 210, 150, 40);
        //rrw.setEnabled(false);
        GUIwarga.add(rrw);
        
        JTextField rw = new JTextField();
        rw.setBounds(150, 220, 150, 25);
        //rw.setEnabled(false);
        GUIwarga.add(rw);
        
        JLabel rrt = new JLabel("no Rt");
        rrt.setBounds(10, 240, 150, 40);
        //rrt.setEnabled(false);
        GUIwarga.add(rrt);
        
        JTextField rt = new JTextField();
        rt.setBounds(150, 250, 150, 25);
        //rt.setEnabled(false);
        GUIwarga.add(rt);
        
        Object[] coloumnName = {
        "RW","RT","Nama","No Hp","Alamat"
        };
        Object[][] data;
        DefaultTableModel model = new DefaultTableModel(coloumnName,0);
        JTable tableWarga = new JTable(model);
        JScrollPane scroll = new JScrollPane(tableWarga);
        scroll.setBounds(350, 100, 400, 500);
        GUIwarga.add(scroll);
        tableWarga.setModel(allObject.dataWarga.viewTableWarga());
        
    JButton insert = new JButton("Tambah Warga");
    insert.setFont(new Font("Consolas",Font.BOLD,17));
    insert.setBounds(150, 320, 150, 40);
    insert.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            allObject.dataWarga.insert(Integer.parseInt(rw.getText()), Integer.parseInt(rt.getText()), nm.getText(), np.getText() , almt.getText());
            allObject.dataWarga.sort();
            tableWarga.setModel(allObject.dataWarga.viewTableWarga());
            angka++;
        }
    });
    insert.setVisible(false);
    GUIwarga.add(insert);
    JButton delete = new JButton("Delete Warga");
    delete.setFont(new Font("Consolas",Font.BOLD,17));
    delete.setBounds(150, 320, 150, 40);
    delete.setVisible(false);
    delete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //try{
                allObject.dataWarga.delete(Integer.parseInt(rw.getText()), Integer.parseInt(rt.getText()), nm.getText());
                tableWarga.setModel(allObject.dataWarga.viewTableWarga());
                /*}catch(Exception b){
                JOptionPane.showMessageDialog(null, "data tidak di temukan");
                }*/
        }
    });
    GUIwarga.add(delete);

    JButton back = new JButton("Back");
    back.setBounds(10, 550, 100, 40);
    back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainFrame g = new mainFrame();
            GUIwarga.dispose();
        }
    });
    GUIwarga.add(back);
    
    JRadioButton insButton = new JRadioButton("Insert");
        insButton.setMnemonic(KeyEvent.VK_B);
        insButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            insert.setVisible(true);
            delete.setVisible(false);
            //rw.setEnabled(false);
            //rrw.setEnabled(false);
        }
    });
        //insButton.setSelected(false);
        insButton.setBounds(150, 90, 90, 40);
        GUIwarga.add(insButton);
        JRadioButton updButton = new JRadioButton("Delete");
        updButton.setBounds(240, 90, 90, 40);
        updButton.setMnemonic(KeyEvent.VK_B);
        updButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            delete.setVisible(true);
            insert.setVisible(false);
            //rrw.setEnabled(true);
            //rw.setEnabled(true);
        }
    });
       // updButton.setSelected(false);
        GUIwarga.add(updButton);
        ButtonGroup btn = new ButtonGroup();
        btn.add(insButton);
        btn.add(updButton);
     }
    
}
