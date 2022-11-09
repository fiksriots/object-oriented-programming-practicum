
package view;

import javax.swing.*;
import javax.swing.table.*;

public class KomponenGUI extends JFrame{
    // deklarasi komponen umum
        JMenuBar menu_bar = new JMenuBar();
        JMenu menu_file = new JMenu("Menu");
        JMenuItem menu_item_pemilik = new JMenuItem("Pemilik");
        JMenuItem menu_item_pegawai = new JMenuItem("Pegawai");
        JMenuItem menu_item_exit = new JMenuItem("Exit");
        JDesktopPane desktop_pane = new JDesktopPane();
        JInternalFrame in_frame_pegawai = new JInternalFrame("Menu Pegawai");
        JInternalFrame in_frame_pemilik = new JInternalFrame("Menu Pemilik");

        // deklarasi komponen sisi kiri pegawai
        JLabel label_id_kiri = new JLabel("ID Hewan");
        JLabel label_nama_kiri = new JLabel("Nama Hewan");
        JLabel label_umur_kiri = new JLabel("Umur Hewan");
        JLabel label_harga_beli_kiri = new JLabel("Harga Beli");
        JLabel label_tanggal_beli_kiri = new JLabel("Tanggal Beli");
        JTextField text_id_kiri = new JTextField();
        JTextField text_nama_kiri = new JTextField();
        JTextField text_umur_kiri = new JTextField();
        JTextField text_harga_beli_kiri = new JTextField();
        JTextField text_tanggal_beli_kiri = new JTextField();
        JButton button_tambah_in_frame_pegawai = new JButton("Tambahkan Data");
        JButton button_refresh_in_frame_pegawai = new JButton("Refresh Kolom Isian");
        String[] field_beli = {"ID Hewan", "Nama Hewan", "Umur Hewan", "Harga Beli", "Tanggal Beli"};
        DefaultTableModel tabel_model_beli = new DefaultTableModel(field_beli, 0);
        JTable tabel_beli = new JTable(tabel_model_beli);
        TableColumn tc1_kiri = new TableColumn(), tc2_kiri = new TableColumn(),
                tc3_kiri = new TableColumn(), tc4_kiri = new TableColumn(),
                tc5_kiri = new TableColumn();
        JScrollPane scroll_pane_kiri = new JScrollPane(tabel_beli);

        // deklarasi komponen sisi kanan pegawai
        JLabel label_id_kanan = new JLabel("ID Hewan");
        JLabel label_nama_kanan = new JLabel("Nama Hewan");
        JLabel label_harga_beli_kanan = new JLabel("Harga Beli");
        JLabel label_tanggal_beli_kanan = new JLabel("Tanggal Beli");
        JLabel label_harga_jual_kanan = new JLabel("Harga Jual");
        JLabel label_tanggal_jual_kanan = new JLabel("Tanggal Jual");
        JTextField text_id_kanan = new JTextField();
        JTextField text_nama_kanan = new JTextField();
        JTextField text_harga_beli_kanan = new JTextField();
        JTextField text_tanggal_beli_kanan = new JTextField();
        JTextField text_harga_jual_kanan = new JTextField();
        JTextField text_tanggal_jual_kanan = new JTextField();
        JButton button_jual_in_frame_pegawai = new JButton("Jual Hewan");
        JButton button_refresh2_in_frame_pegawai = new JButton("Refresh Kolom Isian");
        String[] field_jual = {"Nama Hewan", "Harga Beli", "Tanggal Beli", "Harga Jual",
            "Tanggal Jual", "Keuntungan"};
        DefaultTableModel tabel_model_jual = new DefaultTableModel(field_jual, 0);
        JTable tabel_jual = new JTable(tabel_model_jual);
        TableColumn tc1_kanan = new TableColumn(), tc2_kanan = new TableColumn(),
                tc3_kanan = new TableColumn(), tc4_kanan = new TableColumn(),
                tc5_kanan = new TableColumn(), tc6_kanan = new TableColumn();
        JScrollPane scroll_pane_kanan = new JScrollPane(tabel_jual);
        JLabel label_total_untung_pegawai = new JLabel("Total Keuntungan");
        JTextField text_total_untung_pegawai = new JTextField();
        JButton button_tutup_in_frame_pegawai = new JButton("Tutup");
    
    
    // deklarasi komponen sisi kiri pemilik
        String[] field_beli2 = {"ID Hewan", "Nama Hewan", "Umur Hewan", "Harga Beli", "Tanggal Beli"};
        DefaultTableModel tabel_model_beli2 = new DefaultTableModel(field_beli2, 0);
        JTable tabel_beli2 = new JTable(tabel_model_beli2);
        TableColumn tc1_kiri2 = new TableColumn(), tc2_kiri2 = new TableColumn(),
                tc3_kiri2 = new TableColumn(), tc4_kiri2 = new TableColumn(),
                tc5_kiri2 = new TableColumn();
        JScrollPane scroll_pane_kiri2 = new JScrollPane(tabel_beli2);

        // deklarasi komponen sisi kanan pemilik
        String[] field_jual2 = {"Nama Hewan", "Harga Beli", "Tanggal Beli", "Harga Jual",
            "Tanggal Jual", "Keuntungan"};
        DefaultTableModel tabel_model_jual2 = new DefaultTableModel(field_jual2, 0);
        JTable tabel_jual2 = new JTable(tabel_model_jual2);
        TableColumn tc1_kanan2 = new TableColumn(), tc2_kanan2 = new TableColumn(),
                tc3_kanan2 = new TableColumn(), tc4_kanan2 = new TableColumn(),
                tc5_kanan2 = new TableColumn(), tc6_kanan2 = new TableColumn();
        JScrollPane scroll_pane_kanan2 = new JScrollPane(tabel_jual2);

        JButton button_tutup_in_frame_pemilik = new JButton("Tutup");
}
