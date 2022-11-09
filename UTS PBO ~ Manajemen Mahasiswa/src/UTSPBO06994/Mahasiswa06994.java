
package UTSPBO06994;
/**
 *
 * @author acer
 */
public class Mahasiswa06994 extends Manusia06994
{
    
    private String npm_06994;
    private Matkul06994[] mk;
    private Dosen06994 dsn;
    private int index = 0;
    
    public Mahasiswa06994()
    {
        
    }
        public void insertDataDiri(String npm, String nama, String alamat,String notelp)
    {
        this.npm_06994 = npm;
        setNama(nama);
        setAlamat(alamat);
        setTlp(notelp);
    }
    
    public int getIndexMK(){
        return this.index;
    }
    public String getNpm(){
        return this.npm_06994;
    } 
    public void setIndexMK(int index){
        this.index=index;
    }
    public void insertDosen(Dosen06994 dosen)
    {
        this.dsn = dosen;
    }
    public Dosen06994 cetakdsn(){
        System.out.println("nama dosen : "+dsn.getNama());
        System.out.println("nip dosen : "+dsn.getNip());
        return dsn;
    }
    public void insertMatkul(Matkul06994[] mmatkul)
    {
        this.mk = mmatkul;
    }
    public void cetakMK(){
        for (int i = 0 ;i<index;i++){
            System.out.println("kode mata kuliah : "+mk[i].getKode());
            System.out.println("nama mata kuliah : "+mk[i].getNama());
            System.out.println("sks mata kuliah  : "+mk[i].getSks());
        }
    }

    @Override
    public void setNama(String nama) {
        this.nama_06994=nama;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat_06994=alamat;
    }

    @Override
    public void setTlp(String tlp) {
        this.telepon_06994=tlp;
    }

    @Override
    public String getNama() {
        return this.nama_06994;
    }

    @Override
    public String getAlamat() {
        return this.alamat_06994;
    }

    @Override
    public String getTlp() {
        return this.telepon_06994;
    }
}
