
package UTSPBO06994;
/**
 *
 * @author acer
 */
public class Dosen06994 extends Manusia06994
{
    private String nip_06994;
    
    public Dosen06994(String a, String b, String c, String d)
    {
        setNama(b);
        this.nip_06994 = a;
        setAlamat(c);
        setTlp(d);
    }
    
    public String getNip(){
        return this.nip_06994;
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
