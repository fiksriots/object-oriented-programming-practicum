package GUI;

import Model.NPM07028_ModelCheckin;
import Model.NPM07028_AllObject;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class NPM07028_Checkin extends JFrame {

    NPM07028_ModelCheckin modelcheckin = new NPM07028_ModelCheckin();

    public NPM07028_Checkin() {
        setSize(700, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JFrame frame_checkin = new JFrame();
        getContentPane().setBackground(Color.PINK);
        JButton button_insert = new JButton("Check in");
        JButton button_back = new JButton("Back");
        JLabel label_nocekin = new JLabel("No.Check In");
        JLabel label_id = new JLabel("Id Pelanggan");
        JLabel label_tipe = new JLabel("Tipe Kamar");
        JLabel label_tanggal = new JLabel("Tanggal Check In");
        JTextField text_nocekin = new JTextField();
        JTextField text_id = new JTextField();
        JTextField text_tipe = new JTextField();
        JTextField text_tanggal = new JTextField();
        TableColumn tc1 = new TableColumn();
        TableColumn tc2 = new TableColumn();
        TableColumn tc3 = new TableColumn();
        TableColumn tc4 = new TableColumn();
        TableColumn tc5 = new TableColumn();

        String[] field = {"No.Check In", "Id Pelanggan", "Tipe Kamar", "Tanggal", "Biaya Kamar"};
        DefaultTableModel model = new DefaultTableModel(field, 0);
        JTable tabel_checkin = new JTable(model);
        tc1 = tabel_checkin.getColumnModel().getColumn(0);
        tc2 = tabel_checkin.getColumnModel().getColumn(1);
        tc3 = tabel_checkin.getColumnModel().getColumn(2);
        tc4 = tabel_checkin.getColumnModel().getColumn(3);
        tc5 = tabel_checkin.getColumnModel().getColumn(4);
        tc1.setPreferredWidth(50);
        tc2.setPreferredWidth(50);
        tc3.setPreferredWidth(50);
        tc4.setPreferredWidth(50);
        tc5.setPreferredWidth(50);
        JScrollPane scroll_pane = new JScrollPane(tabel_checkin);
        scroll_pane.setBounds(150, 100, 480, 180);

        button_insert.setBounds(25, 100, 100, 30);
        button_insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ketemu = false;
                int nocekin = Integer.parseInt(text_nocekin.getText());
                int biaya = 0;
                String id = text_id.getText();
                String tipe = text_tipe.getText();
                String tanggal = text_tanggal.getText();
                for (int i = 0; i < NPM07028_AllObject.datakamar.index; i++) {
                    if (tipe.equals(NPM07028_AllObject.datakamar.datakamar[i].tipekamar)) {
                        ketemu = true;
                        biaya = NPM07028_AllObject.datakamar.datakamar[i].hargakamar;
                    }
                }
                NPM07028_AllObject.datacheckin.insert(nocekin, id, tipe, biaya, tanggal);
                tabel_checkin.setModel(NPM07028_AllObject.datacheckin.viewTabel());
            }
        });

        tabel_checkin.setModel(NPM07028_AllObject.datacheckin.viewTabel());

        button_back.setBounds(25, 150, 100, 30);
        button_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NPM07028_Admin frame_admin = new NPM07028_Admin();
            }
        });

        text_nocekin.setBounds(150, 50, 100, 30);
        text_id.setBounds(275, 50, 100, 30);
        text_tipe.setBounds(400, 50, 100, 30);
        text_tanggal.setBounds(525, 50, 100, 30);

        label_nocekin.setFont(new Font("Consolas", Font.BOLD, 12));
        label_nocekin.setBounds(150, 15, 100, 30);
        label_id.setFont(new Font("Consolas", Font.BOLD, 12));
        label_id.setBounds(275, 15, 100, 30);
        label_tipe.setFont(new Font("Consolas", Font.BOLD, 12));
        label_tipe.setBounds(400, 15, 100, 30);
        label_tanggal.setFont(new Font("Consolas", Font.BOLD, 12));
        label_tanggal.setBounds(515, 15, 150, 30);

        add(label_nocekin);
        add(label_id);
        add(label_tipe);
        add(label_tanggal);
        add(button_insert);
        add(button_back);
        add(text_nocekin);
        add(text_id);
        add(text_tipe);
        add(text_tanggal);
        add(scroll_pane);
        setVisible(true);
    }
}
