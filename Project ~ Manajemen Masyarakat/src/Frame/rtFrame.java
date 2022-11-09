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
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import model.allObject;

/**
 *
 * @author unknown
 */
public class rtFrame {
    int angka = 1;
    
     public rtFrame(){
    JFrame GUIrt = new JFrame();
    GUIrt.setSize(800, 900);
    GUIrt.setVisible(true);
    GUIrt.setLocationRelativeTo(null);
    GUIrt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GUIrt.setTitle("RT");
    GUIrt.setLayout(null);
    
        JLabel label = new JLabel("RT");
        label.setBounds(350, 10, 300, 100);
        label.setFont(new Font("Times new roman",Font.BOLD,50));
        GUIrt.add(label);
        
        JLabel nama = new JLabel("nama ketua rt");
        nama.setBounds(10, 120,150,40);
        GUIrt.add(nama);
        
        JTextField nm = new JTextField();
        nm.setBounds(150, 130, 150, 25);
        GUIrt.add(nm);
        
        JLabel noHp = new JLabel("no. hp");
        noHp.setBounds(10, 150, 150, 40);
        GUIrt.add(noHp);
        
        JTextField np = new JTextField();
        np.setBounds(150, 160, 150, 25);
        GUIrt.add(np);
        
        JLabel alamat = new JLabel("alamat");
        alamat.setBounds(10, 180, 150, 40);
        GUIrt.add(alamat);
        
        JTextField almt = new JTextField();
        almt.setBounds(150, 190, 150, 25);
        GUIrt.add(almt);
        
        JLabel rrw = new JLabel("no Rw");
        rrw.setBounds(10, 210, 150, 40);
        //rrw.setEnabled(false);
        GUIrt.add(rrw);
        
        JTextField rw = new JTextField();
        rw.setBounds(150, 220, 150, 25);
        //rw.setEnabled(false);
        GUIrt.add(rw);
        
        JLabel rrt = new JLabel("no Rt");
        rrt.setBounds(10, 240, 150, 40);
        //rrt.setEnabled(false);
        GUIrt.add(rrt);
        
        JTextField rt = new JTextField();
        rt.setBounds(150, 250, 150, 25);
        //rt.setEnabled(false);
        GUIrt.add(rt);
        
        Object[] coloumnName = {
        "RW","RT","Ketua RT","No Hp","Alamat"
        };
        Object[][] data;
        DefaultTableModel model = new DefaultTableModel(coloumnName,0);
    
        JTable tableRT = new JTable(model);
        JScrollPane scroll = new JScrollPane(tableRT);
        scroll.setBounds(350, 100, 400, 500);
        GUIrt.add(scroll);
        tableRT.setModel(allObject.dataRt.viewTableRt());
    
    JButton insert = new JButton("Tambah RT");
    insert.setFont(new Font("Consolas",Font.BOLD,17));
    insert.setBounds(150, 320, 150, 40);
    insert.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        try{
            if(nm.getText().equals("")||np.getText().equals("")||almt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "masukkan data");
            }else{
            allObject.dataRt.insert(Integer.parseInt(rw.getText()),Integer.parseInt(rt.getText()), nm.getText(), np.getText(), almt.getText());
            allObject.dataRt.sort();
            tableRT.setModel(allObject.dataRt.viewTableRt());
            angka++;}
        }catch(Exception a) {
            JOptionPane.showMessageDialog(null, " masukkan data ");
        }}
    });
    insert.setVisible(false);
    GUIrt.add(insert);
    
    JButton update = new JButton("Update RT");
    update.setFont(new Font("Consolas",Font.BOLD,17));
    update.setBounds(150, 320, 150, 40);
    update.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                allObject.dataRt.update(Integer.parseInt(rw.getText()), Integer.parseInt(rt.getText()), nm.getText(), almt.getText(), np.getText());
                tableRT.setModel(allObject.dataRt.viewTableRt() );
            }catch(Exception b){
                JOptionPane.showMessageDialog(null, "RW / RT tidak di temukan");
            }
        }
    });
    update.setVisible(false);
    GUIrt.add(update);
    /*JButton view = new JButton("view");
    view.setFont(new Font("Consolas",Font.BOLD,17));
    view.setBounds(150, 360, 150, 40);
    GUIrt.add(view);*/
    
    JButton back = new JButton("Back");
    back.setBounds(10, 550, 100, 40);
    back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainFrame g = new mainFrame();
            GUIrt.dispose();
        }
    });
    GUIrt.add(back);
    
    JRadioButton insButton = new JRadioButton("Insert");
        insButton.setMnemonic(KeyEvent.VK_B);
        insButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            insert.setVisible(true);
            update.setVisible(false);
            //rrt.setEnabled(false);
            //rt.setEnabled(false);
            /*rw.setEnabled(false);
            rrw.setEnabled(false);*/
        }
    });
        //insButton.setSelected(false);
        insButton.setBounds(150, 90, 90, 40);
        GUIrt.add(insButton);
        
        JRadioButton updButton = new JRadioButton("update");
        updButton.setBounds(240, 90, 90, 40);
        updButton.setMnemonic(KeyEvent.VK_B);
        updButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            update.setVisible(true);
            insert.setVisible(false);
            //rrt.setEnabled(true);
            //rt.setEnabled(true);
            /*rrw.setEnabled(true);
            rw.setEnabled(true);*/
        }
    });
       // updButton.setSelected(false);
        GUIrt.add(updButton);
        ButtonGroup btn = new ButtonGroup();
        btn.add(insButton);
        btn.add(updButton);
     }
    
}
