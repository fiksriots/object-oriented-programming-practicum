package model;

public class Hewan {

    private String id, nama, umur, tanggal_beli, tanggal_jual;
    private int harga_beli, harga_jual;

    public Hewan(String id, String nama, String umur, int harga_beli, String tgl_beli) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.harga_beli = harga_beli;
        this.tanggal_beli = tgl_beli;
    }

    public Hewan(String id, String nama, int harga_beli, String tgl_beli,
            int harga_jual, String tgl_jual) {
        this.id = id;
        this.nama = nama;
        this.harga_beli = harga_beli;
        this.tanggal_beli = tgl_beli;
        this.harga_jual = harga_jual;
        this.tanggal_jual = tgl_jual;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public int getHargaBeli() {
        return harga_beli;
    }

    public String getTanggalBeli() {
        return tanggal_beli;
    }

    public int getHargaJual() {
        return harga_jual;
    }

    public String getTanggalJual() {
        return tanggal_jual;
    }
}
