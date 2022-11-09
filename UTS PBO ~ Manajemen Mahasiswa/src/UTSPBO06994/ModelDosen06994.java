
package UTSPBO06994;
/**
 *
 * @author acer
 */
public class ModelDosen06994 implements manage
{
    Dosen06994[] dosen = new Dosen06994[10];
    int index = 0;
    @Override
    public void insertDosen(String nip, String b, String c, String d)
    {
        dosen[index] = new Dosen06994(nip,b,c,d) {};
        index++;
    }
    @Override
    public void cetak()
    {
        if(this.index==0)
        {
            System.err.println("Data masih kosong");
        }
        else
        {
            System.out.println("=============Daftar Dosen============");
            for(int i=0; i<index; i++)
            {
                System.out.println("NIP Dosen : "+dosen[i].getNip());
                System.out.println("Nama Dosen : "+dosen[i].getNama());
                System.out.println("Alamat Dosen : "+dosen[i].getAlamat());
                System.out.println("No Telepon Dosen : "+dosen[i].getTlp());
                System.out.println("==========================================");
            }
        }
    }
    @Override
    public void updateDosen(String nip, String b, String c, String d, String cari_id)
    {
        for(int i=0; i<index; i++)
        {
            if(cari_id.equals(dosen[i].getNip()))
            {
                dosen[i] = new Dosen06994(nip,b,c,d) {};
            }
        }
    }
    @Override
    public void deleteDosen(String cari_id)
    {
        for(int i=0; i<index; i++)
        {
            if(cari_id.equals(dosen[i].getNip()))
            {
                for(int j=i; j<index; j++)
                {
                    if(j!=index-1)
                    {
                        dosen[j] = dosen[j+1];
                    }
                }
                index--;
            }
        }
    }
    
    public Dosen06994 cariObjek(String nip)
    {
        Dosen06994 temp = null;
        for(int i=0; i<index; i++)
        {
            if(nip.equals(dosen[i].getNip()))
            {
                temp = dosen[i];
            }
        }
        return temp;
    }

    @Override
    public void insertMatkul(String id, String nama, int sks) {}
    @Override
    public void insertMahasiswa(String npm, String nama, String alamat, String notelp, Matkul06994[] mk, Dosen06994 dsn, int indexMK){}
    @Override
    public void updateMatkul(String id, String nama, int sks, String cari){}
    @Override
    public void updateMahasiswa(String npm, String nama, String alamat, String notelp, String cari_id, Dosen06994 Dsn, Matkul06994[] matkul) {}
    @Override
    public void deleteMatkul(String cari) {}
    @Override
    public void deleteMahasiswa(String cari_id) {}
}
