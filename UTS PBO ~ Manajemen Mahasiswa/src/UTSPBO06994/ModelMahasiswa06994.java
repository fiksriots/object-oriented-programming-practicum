
package UTSPBO06994;
/**
 *
 * @author acer
 */
public class ModelMahasiswa06994 implements manage
{
    Mahasiswa06994[] mahasiswa = new Mahasiswa06994[100];
    private int index = 0;
@Override    
public void insertMahasiswa(String npm,String nama,String alamat,String notelp,Matkul06994[] mk,Dosen06994 dsn,int indexMK){
        Mahasiswa06994 mhs = new Mahasiswa06994() {};
        mhs.insertDataDiri(npm,nama,alamat,notelp);
        mhs.insertMatkul(mk);
        mhs.insertDosen(dsn);
        mhs.setIndexMK(indexMK);
        mahasiswa[index] = mhs;
        
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
            System.out.println("===============Data Mahasiswa===============");
            for(int i=0; i<index; i++)
            {
                System.out.println("NPM Mahasiswa : "+mahasiswa[i].getNpm());
                System.out.println("Nama Mahasiswa : "+mahasiswa[i].getNama());
                System.out.println("Alamat Mahasiswa : "+mahasiswa[i].getAlamat());
                System.out.println("No Telepon Mahasiswa : "+mahasiswa[i].getTlp());
                System.out.print("Dosen Wali : \n");
                mahasiswa[i].cetakdsn();
                System.out.println("==================================");
                System.out.println("Mata Kuliah : ");
                mahasiswa[i].cetakMK();
                System.out.println("==========================================");
            }
        }
    }
    @Override
    public void updateMahasiswa(String npm, String nama, String alamat,String notelp, String cari_id,Dosen06994 Dsn, Matkul06994[] matkul)
    {
        /*Dosen06994 dosen = modeldosen.cariObjek(idDsn);*/
        for(int i=0; i<index; i++)
        {
            if(cari_id.equals(mahasiswa[i].getNpm()))
            {
                mahasiswa[i] = new Mahasiswa06994() {};
                mahasiswa[i].insertDataDiri(npm, nama, alamat, notelp);
                mahasiswa[i].insertDosen(Dsn);
                mahasiswa[i].insertMatkul(matkul);
            }
        }
    }
    

    @Override
    public void deleteMahasiswa(String cari_id)
    {
        for(int i=0; i<index; i++)
        {
            if(cari_id.equals(mahasiswa[i].getNpm()))
            {
                for(int j=i; j<index; j++)
                {
                    if(j!=index-1)
                    {
                        mahasiswa[j] = mahasiswa[j+1];
                    }
                }
                index--;
            }
        }
    }
    
    public Mahasiswa06994 cariObjek(String id)
    {
        Mahasiswa06994 temp = null;
        for(int i=0; i<index; i++)
        {
            if(id.equals(mahasiswa[i].getNpm()))
            {
                temp = mahasiswa[i];
            }
        }
        return temp;
    }

    @Override
    public void insertDosen(String nip, String b, String c, String d) {}
    @Override
    public void insertMatkul(String id, String nama, int sks) {}
    @Override
    public void updateDosen(String nip, String b, String c, String d, String cari_id) {}
    @Override
    public void updateMatkul(String id, String nama, int sks, String cari) {}
    @Override
    public void deleteDosen(String cari_id) {}
    @Override
    public void deleteMatkul(String cari) {}
    
}
