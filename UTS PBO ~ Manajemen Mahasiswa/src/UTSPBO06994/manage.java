
package UTSPBO06994;

public interface manage 
{
    public void insertDosen(String nip, String b, String c, String d);
    public void insertMatkul(String id,String nama,int sks);
    public void insertMahasiswa(String npm,String nama,String alamat,String notelp,Matkul06994[] mk,Dosen06994 dsn,int indexMK);
    public void cetak();
    public void updateDosen(String nip, String b, String c, String d, String cari_id);
    public void updateMatkul(String id, String nama, int sks, String cari);
    public void updateMahasiswa(String npm, String nama, String alamat,String notelp, String cari_id,Dosen06994 Dsn, Matkul06994[] matkul);
    public void deleteDosen(String cari_id);
    public void deleteMatkul(String cari);
    public void deleteMahasiswa(String cari_id);
}
