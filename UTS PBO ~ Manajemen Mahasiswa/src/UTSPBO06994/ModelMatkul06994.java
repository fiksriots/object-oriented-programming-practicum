
package UTSPBO06994;
/**
 *
 * @author acer
 */
public class ModelMatkul06994 implements manage
{
    Matkul06994[] matkul = new Matkul06994[100];
    int index = 0;
    @Override
    public void insertMatkul(String id,String nama,int sks)
    {
        matkul[index] = new Matkul06994(id,nama,sks) {};
        index++;
    }
    @Override
    public void cetak()
    {
        if(this.index==0)
        {
            System.err.println("Mata Kuliah masih kosong");
        }
        else
        {
            System.out.println("============Daftar Mata Kuliah==============");
            for(int i=0; i<index; i++)
            {
                System.out.println("Kode Mata Kuliah : "+matkul[i].getKode());
                System.out.println("Nama Mata Kuliah : "+matkul[i].getNama());
                System.out.println("SKS Mata Kuliah : "+matkul[i].getSks());
                System.out.println("==========================================");
            }
        }
    }
    @Override
    public void updateMatkul(String id, String nama, int sks, String cari)
    {
        for(int i=0; i<index; i++)
        {
            if(cari.equals(matkul[i].getKode()))
            {
                matkul[i] = new Matkul06994(id,nama,sks);
            }
        }
    }
    @Override
    public void deleteMatkul(String cari)
    {
        for(int i=0; i<index; i++)
        {
            if(cari.equals(matkul[i].getKode()))
            {
                for(int j=i; j<index; j++)
                {
                    if(j!=index-1)
                    {
                        matkul[j] = matkul[j+1];
                    }
                }
                index--;
            }
        }
    }
    
    public Matkul06994 cariObjek(String kode)
    {
        Matkul06994 temp = null;
        for(int i=0; i<index; i++)
        {
            if(kode.equals(matkul[i].getKode()))
            {
                temp = matkul[i];
            }
        }
        return temp;
    }

    @Override
    public void insertDosen(String nip, String b, String c, String d) {}
    @Override
    public void insertMahasiswa(String npm, String nama, String alamat, String notelp, Matkul06994[] mk, Dosen06994 dsn, int indexMK) {}
    @Override
    public void updateDosen(String nip, String b, String c, String d, String cari_id) {}
    @Override
    public void updateMahasiswa(String npm, String nama, String alamat, String notelp, String cari_id, Dosen06994 Dsn, Matkul06994[] matkul) {}
    @Override
    public void deleteDosen(String cari_id) {}
    @Override
    public void deleteMahasiswa(String cari_id) {}
    
}
