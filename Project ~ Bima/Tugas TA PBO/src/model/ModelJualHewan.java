package model;

import javax.swing.table.*;

public class ModelJualHewan {

    private Hewan[] data_penjualan = new Hewan[100];
    private int index = 0;

    public void insert(String id, String nama, int harga_beli, String tgl_beli,
            int harga_jual, String tgl_jual) {
        data_penjualan[index] = new Hewan(id, nama, harga_beli, tgl_beli, harga_jual, tgl_jual);
        index++;
    }

    public DefaultTableModel viewTabel() {
        DefaultTableModel model_jual_hewan = new DefaultTableModel();
        model_jual_hewan.addColumn("ID Hewan");
        model_jual_hewan.addColumn("Nama Hewan");
        model_jual_hewan.addColumn("Harga Beli");
        model_jual_hewan.addColumn("Tanggal Beli");
        model_jual_hewan.addColumn("Harga Jual");
        model_jual_hewan.addColumn("Tanggal Jual");

        for (int i = 0; i < index; i++) {
            Object[] temp = new Object[6];
            temp[0] = data_penjualan[i].getId();
            temp[1] = data_penjualan[i].getNama();
            temp[2] = data_penjualan[i].getUmur();
            temp[3] = data_penjualan[i].getHargaBeli();
            temp[4] = data_penjualan[i].getTanggalBeli();
            temp[5] = data_penjualan[i].getTanggalBeli();
            model_jual_hewan.addRow(temp);
        }

        return model_jual_hewan;
    }

    public Hewan searchObjek(String nomor) {
        Hewan pk = null;
        for (int i = 0; i < index; i++) {
            if (nomor.equals(data_penjualan[i].getId())) {
                pk = data_penjualan[i];
            }
        }
        return pk;
    }
    
}
