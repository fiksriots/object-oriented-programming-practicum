
package UTSPBO06994;
/**
 *
 * @author acer
 */
public class Matkul06994 
{
    private String kode;
    private String nama;
    private int sks;
    
    public Matkul06994(String id,String nama,int sks)
    {
        this.kode = id;
        this.nama = nama;
        this.sks = sks;
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public int getSks(){
        return sks;
    }
}
