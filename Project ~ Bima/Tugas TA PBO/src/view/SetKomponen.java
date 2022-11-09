package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class SetKomponen extends KomponenGUI {

    String getId, getNama, getUmur, getHargaBeli, getTanggalBeli;

    public SetKomponen() {

        setSize(1200, 700);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set komponen umum
        desktop_pane.setBounds(0, 0, 1200, 700);
        desktop_pane.setBackground(Color.gray);
        in_frame_pegawai.setBackground(Color.gray);
        in_frame_pegawai.setLayout(null);
        in_frame_pegawai.setBounds(0, 0, 1150, 640);
        in_frame_pemilik.setLayout(null);
        in_frame_pemilik.setBounds(0, 0, 1150, 640);

        // set komponen sisi kiri pegawai
        label_id_kiri.setBounds(10, 10, 100, 30);
        label_nama_kiri.setBounds(10, 50, 100, 30);
        label_umur_kiri.setBounds(10, 90, 100, 30);
        label_harga_beli_kiri.setBounds(10, 130, 100, 30);
        label_tanggal_beli_kiri.setBounds(10, 170, 100, 30);
        text_id_kiri.setBounds(120, 10, 200, 30);
        text_nama_kiri.setBounds(120, 50, 200, 30);
        text_umur_kiri.setBounds(120, 90, 200, 30);
        text_harga_beli_kiri.setBounds(120, 130, 200, 30);
        text_tanggal_beli_kiri.setBounds(120, 170, 200, 30);
        button_tambah_in_frame_pegawai.setBounds(10, 220, 150, 30);
        button_refresh_in_frame_pegawai.setBounds(170, 220, 150, 30);
        tc1_kiri = tabel_beli.getColumnModel().getColumn(0);
        tc2_kiri = tabel_beli.getColumnModel().getColumn(1);
        tc3_kiri = tabel_beli.getColumnModel().getColumn(2);
        tc4_kiri = tabel_beli.getColumnModel().getColumn(3);
        tc5_kiri = tabel_beli.getColumnModel().getColumn(4);
        tc1_kiri.setPreferredWidth(80);
        tc2_kiri.setPreferredWidth(96);
        tc3_kiri.setPreferredWidth(96);
        tc4_kiri.setPreferredWidth(96);
        tc5_kiri.setPreferredWidth(96);
        scroll_pane_kiri.setBounds(10, 300, 480, 300);

        // set komponen sisi kanan pegawai
        label_id_kanan.setBounds(520, 10, 100, 30);
        label_nama_kanan.setBounds(520, 50, 100, 30);
        label_harga_beli_kanan.setBounds(520, 90, 100, 30);
        label_tanggal_beli_kanan.setBounds(520, 130, 100, 30);
        label_harga_jual_kanan.setBounds(520, 170, 100, 30);
        label_tanggal_jual_kanan.setBounds(520, 210, 100, 30);
        text_id_kanan.setBounds(630, 10, 200, 30);
        text_nama_kanan.setBounds(630, 50, 200, 30);
        text_harga_beli_kanan.setBounds(630, 90, 200, 30);
        text_tanggal_beli_kanan.setBounds(630, 130, 200, 30);
        text_harga_jual_kanan.setBounds(630, 170, 200, 30);
        text_tanggal_jual_kanan.setBounds(630, 210, 200, 30);
        button_jual_in_frame_pegawai.setBounds(520, 260, 150, 30);
        button_refresh2_in_frame_pegawai.setBounds(680, 260, 150, 30);
        tc1_kanan = tabel_jual.getColumnModel().getColumn(0);
        tc2_kanan = tabel_jual.getColumnModel().getColumn(1);
        tc3_kanan = tabel_jual.getColumnModel().getColumn(2);
        tc4_kanan = tabel_jual.getColumnModel().getColumn(3);
        tc5_kanan = tabel_jual.getColumnModel().getColumn(4);
        tc6_kanan = tabel_jual.getColumnModel().getColumn(5);
        tc1_kanan.setPreferredWidth(80);
        tc2_kanan.setPreferredWidth(80);
        tc3_kanan.setPreferredWidth(80);
        tc4_kanan.setPreferredWidth(80);
        tc5_kanan.setPreferredWidth(80);
        tc6_kanan.setPreferredWidth(80);
        scroll_pane_kanan.setBounds(520, 300, 480, 300);
        label_total_untung_pegawai.setBounds(930, 130,200,30);
        text_total_untung_pegawai.setBounds(930, 170, 200, 30);
        in_frame_pegawai.add(scroll_pane_kanan);

        button_tutup_in_frame_pegawai.setBounds(1035, 570, 100, 30);

        // set komponen sisi kiri pemilik
        tc1_kiri2 = tabel_beli2.getColumnModel().getColumn(0);
        tc2_kiri2 = tabel_beli2.getColumnModel().getColumn(1);
        tc3_kiri2 = tabel_beli2.getColumnModel().getColumn(2);
        tc4_kiri2 = tabel_beli2.getColumnModel().getColumn(3);
        tc5_kiri2 = tabel_beli2.getColumnModel().getColumn(4);
        tc1_kiri2.setPreferredWidth(80);
        tc2_kiri2.setPreferredWidth(96);
        tc3_kiri2.setPreferredWidth(96);
        tc4_kiri2.setPreferredWidth(96);
        tc5_kiri2.setPreferredWidth(96);
        scroll_pane_kiri2.setBounds(10, 300, 480, 300);

        // set komponen sisi kanan pemilik
        tc1_kanan2 = tabel_jual2.getColumnModel().getColumn(0);
        tc2_kanan2 = tabel_jual2.getColumnModel().getColumn(1);
        tc3_kanan2 = tabel_jual2.getColumnModel().getColumn(2);
        tc4_kanan2 = tabel_jual2.getColumnModel().getColumn(3);
        tc5_kanan2 = tabel_jual2.getColumnModel().getColumn(4);
        tc6_kanan2 = tabel_jual2.getColumnModel().getColumn(5);
        tc1_kanan2.setPreferredWidth(80);
        tc2_kanan2.setPreferredWidth(80);
        tc3_kanan2.setPreferredWidth(80);
        tc4_kanan2.setPreferredWidth(80);
        tc5_kanan2.setPreferredWidth(80);
        tc6_kanan2.setPreferredWidth(80);
        scroll_pane_kanan2.setBounds(520, 300, 480, 300);
        in_frame_pemilik.add(scroll_pane_kanan2);

        button_tutup_in_frame_pemilik.setBounds(1035, 570, 100, 30);

        // add semua komponen
        menu_file.add(menu_item_pemilik);
        menu_file.add(menu_item_pegawai);
        menu_file.add(menu_item_exit);
        menu_bar.add(menu_file);
        setJMenuBar(menu_bar);
        desktop_pane.add(in_frame_pegawai);
        desktop_pane.add(in_frame_pemilik);
        in_frame_pegawai.add(label_id_kiri);
        in_frame_pegawai.add(label_nama_kiri);
        in_frame_pegawai.add(label_umur_kiri);
        in_frame_pegawai.add(label_harga_beli_kiri);
        in_frame_pegawai.add(label_tanggal_beli_kiri);
        in_frame_pegawai.add(text_id_kiri);
        in_frame_pegawai.add(text_nama_kiri);
        in_frame_pegawai.add(text_umur_kiri);
        in_frame_pegawai.add(text_harga_beli_kiri);
        in_frame_pegawai.add(text_tanggal_beli_kiri);
        in_frame_pegawai.add(button_tambah_in_frame_pegawai);
        in_frame_pegawai.add(button_refresh_in_frame_pegawai);
        in_frame_pegawai.add(scroll_pane_kiri);
        in_frame_pegawai.add(label_id_kanan);
        in_frame_pegawai.add(label_nama_kanan);
        in_frame_pegawai.add(label_harga_beli_kanan);
        in_frame_pegawai.add(label_tanggal_beli_kanan);
        in_frame_pegawai.add(label_harga_jual_kanan);
        in_frame_pegawai.add(label_tanggal_jual_kanan);
        in_frame_pegawai.add(text_id_kanan);
        in_frame_pegawai.add(text_nama_kanan);
        in_frame_pegawai.add(text_harga_beli_kanan);
        in_frame_pegawai.add(text_tanggal_beli_kanan);
        in_frame_pegawai.add(text_harga_jual_kanan);
        in_frame_pegawai.add(text_tanggal_jual_kanan);
        in_frame_pegawai.add(button_jual_in_frame_pegawai);
        in_frame_pegawai.add(button_refresh2_in_frame_pegawai);
        in_frame_pegawai.add(scroll_pane_kanan);
        in_frame_pegawai.add(label_total_untung_pegawai);
        in_frame_pegawai.add(text_total_untung_pegawai);
        in_frame_pegawai.add(button_tutup_in_frame_pegawai);
        in_frame_pemilik.add(scroll_pane_kiri2);
        in_frame_pemilik.add(scroll_pane_kanan2);
        in_frame_pemilik.add(button_tutup_in_frame_pemilik);
        add(desktop_pane);

        

        setVisible(true);
    }
}
