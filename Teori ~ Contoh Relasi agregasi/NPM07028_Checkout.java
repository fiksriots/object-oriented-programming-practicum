package GUI;

import Model.NPM07028_AllObject;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class NPM07028_Checkout extends JFrame {

    public NPM07028_Checkout() {
        setSize(700, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JFrame frame_checkout = new JFrame();
        getContentPane().setBackground(Color.PINK);
        JButton button_checkout = new JButton("Check out");
        JButton button_back = new JButton("Back");
        JLabel label_nocekin = new JLabel("No.Check In");
        JLabel label_biaya = new JLabel("Bayar Kamar");
        label_nocekin.setForeground(Color.white);
        label_biaya.setForeground(Color.white);
        JTextField text_nocekin = new JTextField();
        JTextField text_bayar = new JTextField();

        JTable tabel_checkout = new JTable();
        JScrollPane scroll_pane = new JScrollPane(tabel_checkout);
        scroll_pane.setBounds(150, 100, 480, 180);

        button_checkout.setBounds(25, 150, 100, 30);
        button_checkout.setFont(new Font("Consolas", Font.BOLD, 11));
        button_checkout.setBackground(Color.white);
        button_checkout.setForeground(Color.black);
        button_checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ketemu = false;
                int hapus = Integer.parseInt(text_nocekin.getText());
                int index = 0;
                int index_ketemu = NPM07028_AllObject.datacheckout.cariIndexData(hapus);
                int getNocekin = Integer.parseInt(text_nocekin.getText());
                for (int i = index_ketemu; i < NPM07028_AllObject.datacheckout.index; i++) {
                    if (getNocekin == NPM07028_AllObject.datacheckout.datacheckout[i].nocekin) {
                        ketemu = true;
                        for (int j = i; j < NPM07028_AllObject.datacheckout.index; j++) {
                            if (j != NPM07028_AllObject.datacheckin.getIndex() - 1) {
                                NPM07028_AllObject.datacheckout.datacheckout[j].cekin= NPM07028_AllObject.datacheckout.datacheckout[j + 1].cekin;
                                NPM07028_AllObject.datacheckout.datacheckout[j].nocekin = NPM07028_AllObject.datacheckout.datacheckout[j + 1].nocekin;
                                NPM07028_AllObject.datacheckout.datacheckout[j].tanggal = NPM07028_AllObject.datacheckout.datacheckout[j + 1].tanggal;
                            }
                        }
                        NPM07028_AllObject.datacheckout.index--;
                        tabel_checkout.setModel(NPM07028_AllObject.datacheckout.viewTabel());
                    }
                }
                if (!ketemu) {
                    JOptionPane.showMessageDialog(null, "Kamar yang ingin dihapus tidak ditemukan");
                }
                
                int nocekin = Integer.parseInt(text_nocekin.getText());
                int bayar = Integer.parseInt(text_bayar.getText()) - NPM07028_AllObject.datacheckin.datacheckin[index].biayakamar;
                tabel_checkout.setModel(NPM07028_AllObject.datacheckout.viewTabel());
                JOptionPane.showMessageDialog(null, "Terima Kasih Sudah Menggunakan Layanan Kami\nKembalian Anda : " + bayar);
            }
        });

        tabel_checkout.setModel(NPM07028_AllObject.datacheckout.viewTabel());

        JButton button_cari = new JButton("Search");
        button_cari.setBounds(25, 100, 100, 30);
        button_cari.setFont(new Font("Consolas", Font.BOLD, 11));
        button_cari.setBackground(Color.white);
        button_cari.setForeground(Color.black);
        button_cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ketemu = false;
                int index = 0;
                int no = Integer.parseInt(text_nocekin.getText());
                for (int i = 0; i < NPM07028_AllObject.datacheckin.getIndex(); i++) {
                    if (no == NPM07028_AllObject.datacheckin.datacheckin[i].nocekin) {
                        ketemu = true;
                        index = i;
                    }
                }
                if (ketemu) {
                    NPM07028_AllObject.datacheckout.insert(NPM07028_AllObject.datacheckin.datacheckin[index].nocekin,
                            NPM07028_AllObject.datacheckin.datacheckin[index].biayakamar,
                            NPM07028_AllObject.datacheckin.datacheckin[index].idcekin,
                            NPM07028_AllObject.datacheckin.datacheckin[index].tipekamar,
                            NPM07028_AllObject.datacheckin.datacheckin[index].tanggal);

                    tabel_checkout.setModel(NPM07028_AllObject.datacheckout.viewTabel());

                }
            }
        });

        button_back.setBounds(25, 200, 100, 30);
        button_back.setBackground(Color.white);
        button_back.setForeground(Color.black);
        button_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NPM07028_Admin frame_admin = new NPM07028_Admin();
            }
        });

        text_nocekin.setBounds(150, 50, 100, 30);
        text_bayar.setBounds(400, 50, 100, 30);

        label_nocekin.setFont(new Font("Consolas", Font.BOLD, 12));
        label_nocekin.setBounds(150, 15, 100, 30);
        label_biaya.setFont(new Font("Consolas", Font.BOLD, 12));
        label_biaya.setBounds(400, 15, 100, 30);

        add(label_nocekin);
        add(label_biaya);
        add(button_checkout);
        add(button_back);
        add(button_cari);
        add(text_nocekin);
        add(text_bayar);
        add(scroll_pane);
        setVisible(true);
    }
}
