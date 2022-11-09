package view;

import model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class ProsesKomponen extends SetKomponen {

    boolean is_frame_pegawai_aktif = false;
    boolean is_frame_pemilik_aktif = false;
    String id, nama, umur, tanggal_beli, tanggal_jual;
    int harga_beli, harga_jual;
    
    public ProsesKomponen() {
        // proses komponen
        menu_item_pemilik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_frame_pemilik_aktif = true;
                if (is_frame_pegawai_aktif == true) {
                    in_frame_pegawai.setVisible(false);
                    in_frame_pemilik.setVisible(true);
                } else {
                    in_frame_pemilik.setVisible(true);
                }
            }
        });

        menu_item_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_frame_pegawai_aktif = true;
                if (is_frame_pemilik_aktif == true) {
                    in_frame_pemilik.setVisible(false);
                    in_frame_pegawai.setVisible(true);
                } else {
                    in_frame_pegawai.setVisible(true);
                }
            }
        });

        menu_item_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        button_tambah_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                getId = text_id_kiri.getText();
//                getNama = text_nama_kiri.getText();
//                getUmur = text_umur_kiri.getText();
//                getHargaBeli = text_harga_beli_kiri.getText();
//                getTanggalBeli = text_tanggal_beli_kiri.getText();
//                DefaultTableModel data_beli = (DefaultTableModel) tabel_beli.getModel();
//                ArrayList list_beli = new ArrayList<>();
//                tabel_beli.setAutoCreateColumnsFromModel(true);
//                list_beli.add(getId);
//                list_beli.add(getNama);
//                list_beli.add(getUmur);
//                list_beli.add(getHargaBeli);
//                list_beli.add(getTanggalBeli);
//                data_beli.addRow(list_beli.toArray());
//                text_id_kiri.setText("");
//                text_nama_kiri.setText("");
//                text_umur_kiri.setText("");
//                text_harga_beli_kiri.setText("");
//                text_tanggal_beli_kiri.setText("");
//                DefaultTableModel data_beli2 = (DefaultTableModel) tabel_beli2.getModel();
//                ArrayList list_beli2 = new ArrayList<>();
//                tabel_beli2.setAutoCreateColumnsFromModel(true);
//                list_beli2.add(getId);
//                list_beli2.add(getNama);
//                list_beli2.add(getUmur);
//                list_beli2.add(getHargaBeli);
//                list_beli2.add(getTanggalBeli);
//                data_beli2.addRow(list_beli2.toArray());
                id = text_id_kiri.getText();
                nama = text_nama_kiri.getText();
                umur = text_umur_kiri.getText();
                harga_beli = Integer.parseInt(text_harga_beli_kiri.getText());
                tanggal_beli = text_tanggal_beli_kiri.getText();
                AllObject.data_beli.insert(id, nama, umur, harga_beli,tanggal_beli);
                tabel_beli.setModel(AllObject.data_beli.viewTabel());
                JOptionPane.showMessageDialog(null, "Data berhasiil diinsert");
            }
        });

        button_jual_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total_untung = 0;
                if (tabel_beli.getRowCount() > 0) {
                    DefaultTableModel data_jual = (DefaultTableModel) tabel_jual.getModel();

                    tabel_jual.setAutoCreateColumnsFromModel(true);

                    DefaultTableModel data_beli = (DefaultTableModel) tabel_beli.getModel();
                    for (int i = 0; i < tabel_beli.getRowCount(); i++) {
                        if (text_id_kanan.getText().equals(tabel_beli.getValueAt(i, 0).toString())) {
                            ArrayList list_jual = new ArrayList<>();
                            list_jual.add(text_nama_kanan.getText());
                            list_jual.add(text_harga_beli_kanan.getText());
                            list_jual.add(text_tanggal_beli_kanan.getText());
                            list_jual.add(text_harga_jual_kanan.getText());
                            list_jual.add(text_tanggal_jual_kanan.getText());
                            data_beli.removeRow(i);
                            int untung = Integer.parseInt(text_harga_jual_kanan.getText())
                                    - Integer.parseInt(text_harga_beli_kanan.getText());
                            list_jual.add(untung);
                            data_jual.addRow(list_jual.toArray());
                            total_untung = Integer.parseInt(text_total_untung_pegawai.getText()) + untung;
                            text_total_untung_pegawai.setText("" + total_untung);
                        }
                    }
                }
            }
        });

        button_refresh_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_id_kiri.setText("");
                text_nama_kiri.setText("");
                text_umur_kiri.setText("");
                text_harga_beli_kiri.setText("");
                text_tanggal_beli_kiri.setText("");
            }
        });

        button_refresh2_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_id_kanan.setText("");
                text_nama_kanan.setText("");
                text_nama_kanan.setEnabled(false);
                text_harga_beli_kanan.setText("");
                text_harga_beli_kanan.setEnabled(false);
                text_tanggal_beli_kanan.setText("");
                text_tanggal_beli_kanan.setEnabled(false);
                text_harga_jual_kanan.setText("");
                text_tanggal_jual_kanan.setText("");
            }
        });

        button_tutup_in_frame_pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_frame_pegawai_aktif = false;
                in_frame_pegawai.setVisible(false);
            }
        });

        button_tutup_in_frame_pemilik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_frame_pemilik_aktif = false;
                in_frame_pemilik.setVisible(false);
            }
        });
    }
}
