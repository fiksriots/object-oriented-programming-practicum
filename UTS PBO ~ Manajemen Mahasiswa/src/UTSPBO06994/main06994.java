
package UTSPBO06994;
/**
 *
 * @author acer
 */
import java.util.Scanner;

public class main06994 
{
    public void menu(){

}
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ModelDosen06994 modelDosen = new ModelDosen06994() {};
        ModelMatkul06994 modelmatkul = new ModelMatkul06994() {};
        ModelMahasiswa06994 modelMahasiswa = new ModelMahasiswa06994() {};
        int menu_awal, menu = 0;
        
        do
        {
            System.out.println("===========================");
            System.out.println("Menu : 1. Dosen");
            System.out.println("       2. Mata Kuliah");
            System.out.println("       3. Mahasiswa");
            System.out.println("       4. Exit Program");
            System.out.print("Pilih : ");
            menu_awal = input.nextInt();
            switch(menu_awal)
            {
                case 1:
                    String ulang_modelDosen;
                    do
                    {
                        ulang_modelDosen = "y";
                        System.out.println("==========================================");
                        System.out.println("Menu : 1. Masukkan Data Dosen");
                        System.out.println("       2. Lihat Data Dosen");
                        System.out.println("       3. Perbarui Data Dosen");
                        System.out.println("       4. Hapus Data Dosen");
                        System.out.println("       5. Kembali ke Menu Awal");
                        System.out.println("       6. Exit Program");
                        System.out.print("Pilih : ");
                        menu = input.nextInt();
                        switch(menu)
                        {
                            case 1 :
                                while(ulang_modelDosen.equalsIgnoreCase("y"))
                                {
                                    System.out.print("Nip Dosen : ");
                                    String nip = input.next();
                                    System.out.print("Nama Dosen : ");
                                    String b = input.next();
                                    System.out.print("Alamat Dosen : ");
                                    String c = input.next();
                                    System.out.print("No Telepon Dosen : ");
                                    String d = input.next();
                                    modelDosen.insertDosen(nip,b,c,d);
                                    System.out.print("Ulang Input (y) / Kembali ke menu Dosen (n) ? ");
                                    ulang_modelDosen = input.next();
                                }
                                break;
                            case 2 :
                                modelDosen.cetak();
                                ulang_modelDosen = "n";
                                break;
                            case 3 : 
                                while(ulang_modelDosen.equalsIgnoreCase("y"))
                                {
                                    System.out.println("=================Memperbarui Data Dosen==============");
                                    System.out.print("ID modelDosen yang akan diupdate : ");
                                    String cari_id = input.next();
                                    Dosen06994 modelDosen_update = modelDosen.cariObjek(cari_id);
                                    if(modelDosen_update==null)
                                    {
                                        System.err.println("Data tidak ditemukan");
                                    }
                                    else
                                    {
                                        System.out.println("Nama modelDosen : "+modelDosen_update.getNama());
                                        System.out.println("=============Diperbarui Menjadi=============");
                                        System.out.print("Nip Dosen : ");
                                        String id = input.next();
                                        System.out.print("Nama Dosen : ");
                                        String nama = input.next();
                                        System.out.print("Alamat Dosen : ");
                                        String c = input.next();
                                        System.out.print("No Telepon Dosen : ");
                                        String d = input.next();
                                        modelDosen.updateDosen(id,nama,c,d,cari_id);
                                        System.out.println("Data berhasil diperbarui");
                                    }
                                    System.out.print("Ulang Update (y) / Kembali ke menu dosen (n) ? ");
                                    ulang_modelDosen = input.next();
                                }
                                break;
                            case 4 :
                                while(ulang_modelDosen.equalsIgnoreCase("y"))
                                {
                                    System.out.print("ID Dosen yang akan dihapus : ");
                                    String cari_id = input.next();
                                    Dosen06994 hapus_dosen = modelDosen.cariObjek(cari_id);
                                    if(hapus_dosen==null)
                                    {
                                        System.out.println("Data tidak ditemukan");
                                    }
                                    else
                                    {
                                        modelDosen.deleteDosen(cari_id);
                                        System.out.println("Data telah dihapus");
                                    }
                                    System.out.print("Ulang Hapus(y) / Kembali ke menu Dosen (n) ? ");
                                    ulang_modelDosen = input.next();
                                }
                                break;
                        }
                    }
                    while(ulang_modelDosen.equalsIgnoreCase("n"));
                    break;
                    
                case 2:
                    String ulang_Matkul;
                    do
                    {
                        ulang_Matkul = "y";
                        System.out.println("==========================================");
                        System.out.println("Menu : 1. Masukkan Data Mata Kuliah");
                        System.out.println("       2. Lihat Data Mata Kuliah");
                        System.out.println("       3. Perbarui Data Mata Kuliah");
                        System.out.println("       4. Hapus Data Mata Kuliah");
                        System.out.println("       5. Kembali ke Menu Awal");
                        System.out.println("       6. Exit Program");
                        System.out.print("Pilih Nomor : ");
                        menu = input.nextInt();
                        switch(menu)
                        {
                            case 1 :
                                while(ulang_Matkul.equalsIgnoreCase("y"))
                                {
                                    System.out.print("Kode Mata Kuliah : ");
                                    String id = input.next();
                                    System.out.print("Nama Mata Kuliah : ");
                                    String nama = input.next();
                                    System.out.print("SKS Mata Kuliah : ");
                                    int SKS = input.nextInt();
                                    modelmatkul.insertMatkul(id,nama,SKS);
                                    System.out.print("Ulang Input (y) / Kembali ke menu Mata Kuliah (n) ? ");
                                    ulang_Matkul = input.next();
                                }
                                break;
                            case 2 :
                                modelmatkul.cetak();
                                ulang_Matkul = "n";
                                break;
                            case 3 :
                                while(ulang_Matkul.equalsIgnoreCase("y"))
                                {
                                    System.out.println("=================Update Data Mata Kuliah==============");
                                    System.out.print("Kode Mata Kuliah yang akan diupdate : ");
                                    String cari_id = input.next();
                                    Matkul06994 matkul_update = modelmatkul.cariObjek(cari_id);
                                    if(matkul_update==null)
                                    {
                                        System.err.println("Data tidak ditemukan");
                                    }
                                    else
                                    {
                                        
                                        System.out.println("Kode Mata Kuliah : "+matkul_update.getKode());
                                        System.out.println("Nama Mata Kuliah : "+matkul_update.getNama());
                                        System.out.println("SKS Mata Kuliah : "+matkul_update.getSks());
                                        System.out.println("=============Diperbarui Menjadi=============");
                                        System.out.print("Kode Mata Kuliah : ");
                                        String id = input.next();
                                        System.out.print("Nama Mata Kuliah : ");
                                        String nama = input.next();
                                        System.out.print("SKS Mata Kuliah : ");
                                        int harga = input.nextInt();
                                        modelmatkul.updateMatkul(id,nama,harga,cari_id);
                                        System.out.println("Data berhasil diperbarui");
                                    }
                                    System.out.print("Ulang Update (y) / Kembali ke menu Mata Kuliah (n) ? ");
                                    ulang_Matkul = input.next();
                                }
                                break;
                            case 4 :
                                while(ulang_Matkul.equalsIgnoreCase("y"))
                                {
                                    System.out.print("Kode Mata Kuliah yang akan dihapus : ");
                                    String cari_id = input.next();
                                    Matkul06994 hapus_matkul = modelmatkul.cariObjek(cari_id);
                                    if(hapus_matkul==null)
                                    {
                                        System.out.println("Data tidak ditemukan");
                                    }
                                    else
                                    {
                                        modelmatkul.deleteMatkul(cari_id);
                                        System.out.println("Data telah dihapus");
                                    }
                                    System.out.print("Ulang Delete (y) / Kembali ke menu matkul (n) ? ");
                                    ulang_Matkul = input.next();
                                }
                                break;
                        }
                    }
                    while(ulang_Matkul.equalsIgnoreCase("n"));
                    break;
                    
                case 3:
                    String ulang_modelMahasiswa;
                    do
                    {
                        ulang_modelMahasiswa = "y";
                        System.out.println("==========================================");
                        System.out.println("Menu : 1. Masukkan Data Mahasiswa");
                        System.out.println("       2. Lihat Data Mahasiswa");
                        System.out.println("       3. Perbarui Data Mahasiswa");
                        System.out.println("       4. Hapus Data Mahasiswa");
                        System.out.println("       5. Kembali ke Mahasiswa");
                        System.out.println("       6. Exit Program");
                        System.out.print("Pilih Nomor : ");
                        menu = input.nextInt();
                        switch(menu)
                        {
                            case 1 :
                                while(ulang_modelMahasiswa.equalsIgnoreCase("y"))
                                {
                                    System.out.print("NPM Mahasiswa : ");
                                    String npm = input.next();
                                    System.out.print("Nama Mahasiswa : ");
                                    String nama = input.next();
                                    System.out.print("Alamat Mahasiswa : ");
                                    String alamat = input.next();
                                    System.out.print("No Telepon Mahasiswa : ");
                                    String notelp = input.next();
                                    //modelMahasiswa.insertData(npm, nama, alamat,notelp);
                                    //ambildosenwali
                                    Dosen06994 modelDosen_modelMahasiswa ;
                                    String id_modelDosen;
                                    do
                                    {
                                        System.out.print("NIP Dosen Wali: ");
                                        id_modelDosen = input.next();
                                        modelDosen_modelMahasiswa = modelDosen.cariObjek(id_modelDosen);
                                        if(modelDosen_modelMahasiswa==null)
                                        {
                                            System.err.println("NIP Dosen Wali tidak ditemukan, silahkan "
                                                    + "masukkan NIP yang benar ! ");
                                        }
                                    }
                                    while(modelDosen_modelMahasiswa==null);

                                    Matkul06994 matkul_modelMahasiswa[]=new Matkul06994[100];
                                    String id_matkul;
                                    
                                    System.out.println("Set Banyak Matkul : ");
                                        int nMK = input.nextInt();
                                    
                                   for(int i=0;i<nMK;i++){                                     
                                        System.out.print("Kode mata kuliah : ");
                                        id_matkul= input.next();
                                        do
                                        {   
                                        
                                        matkul_modelMahasiswa[i] = modelmatkul.cariObjek(id_matkul);
                                        if(matkul_modelMahasiswa==null)
                                        {
                                            System.err.println("Kode Mata Kuliah tidak terdaftar, silahkan "
                                                    + "masukkan Kode yang benar ! " );
                                        }
                                        
                                    }while(matkul_modelMahasiswa==null);
                                    }
                                    
                                    System.out.print("Ulang Input (y) / Kembali ke menu Mahasiswa (n) ? ");
                                    ulang_modelMahasiswa = input.next();
                                    modelMahasiswa.insertMahasiswa(npm, nama, alamat, notelp, matkul_modelMahasiswa, modelDosen_modelMahasiswa, nMK);
                                }
                                break;
                            case 2 :
                                modelMahasiswa.cetak();
                                ulang_modelMahasiswa = "n";
                                break;
                            case 3 : 
                                while(ulang_modelMahasiswa.equalsIgnoreCase("y"))
                                {
                                    System.out.println("=================Perbarui Data Mahasiswa==============");
                                    System.out.print("NPM Mahasiswa yang akan diperbarui : ");
                                    String cari_id = input.next();
                                    Mahasiswa06994 modelMahasiswa_update = modelMahasiswa.cariObjek(cari_id);
                                    if(modelMahasiswa_update==null)
                                    {
                                        System.err.println("Data tidak ditemukan");
                                    }
                                    else
                                    {
                                        System.out.println("Npm Mahasiswa : "+modelMahasiswa_update.getNpm());
                                        System.out.println("Nama Mahasiswa : "+modelMahasiswa_update.getNama());
                                        System.out.println("Alamat Mahasiswa : "+modelMahasiswa_update.getAlamat());
                                        System.out.println("No Telepon Mahasiswa : "+modelMahasiswa_update.getTlp());
                                        modelMahasiswa_update.cetakdsn();
                                        modelMahasiswa_update.cetakMK();
                                        
                                        System.out.println("=============Diperbarui Menjadi=============");
                                        System.out.print("NPM Mahasiswa : ");
                                        String npm = input.next();
                                        System.out.print("Nama Mahasiswa : ");
                                        String nama = input.next();
                                        System.out.print("Alamat Mahasiswa : ");
                                        String alamat = input.next();
                                        System.out.print("No Telepon Mahasiswa : ");
                                        String notelp = input.next();
                                        
                                        Dosen06994 Dosen_modelMahasiswa;
                                        String id_modelDosen;
                                        do
                                        {
                                            System.out.print("NIP Dosen : ");
                                            id_modelDosen = input.next();
                                            Dosen_modelMahasiswa = modelDosen.cariObjek(id_modelDosen);
                                            if(Dosen_modelMahasiswa==null)
                                            {
                                                System.err.println("ID modelDosen tidak terdaftar, silahkan "
                                                        + "masukkan ID yang benar ! ");
                                            }
                                        }
                                        while(Dosen_modelMahasiswa==null);
                                        
                                        Matkul06994 matkul_modelMahasiswa[]=new Matkul06994[100];
                                        String id_matkul;
                                        System.out.println("Set Banyak Matkul : ");
                                        int nMK = input.nextInt();
                                        for(int i=0;i<nMK;i++){                                     
                                        System.out.print("Kode mata kuliah : ");
                                        id_matkul= input.next();
                                        do
                                        {   
                                        
                                        matkul_modelMahasiswa[i] = modelmatkul.cariObjek(id_matkul);
                                        if(matkul_modelMahasiswa==null)
                                        {
                                            System.err.println("Kode Mata Kuliah tidak terdaftar, silahkan "
                                                    + "masukkan Kode yang benar ! " );
                                        }
                                        
                                        }while(matkul_modelMahasiswa==null);
                                        }
                                        modelMahasiswa.updateMahasiswa(npm, nama, alamat, notelp, cari_id, Dosen_modelMahasiswa, matkul_modelMahasiswa);
                                        System.out.println("Data berhasil diupdate");
                                    }
                                    System.out.print("Ulang Update (y) / Kembali ke menu Mahasiswa (n) ? ");
                                    ulang_modelMahasiswa = input.next();
                                }
                                break;
                            case 4 :
                                while(ulang_modelMahasiswa.equalsIgnoreCase("y"))
                                {
                                    System.out.print("NPM Mahasiswa yang akan dihapus : ");
                                    String cari_id = input.next();
                                    Mahasiswa06994 hapus_modelMahasiswa = modelMahasiswa.cariObjek(cari_id);
                                    if(hapus_modelMahasiswa==null)
                                    {
                                        System.err.println("Data tidak ditemukan");
                                    }
                                    else
                                    {
                                        modelMahasiswa.deleteMahasiswa(cari_id);
                                        System.out.println("Data telah dihapus");
                                    }
                                    System.out.print("Ulang Delete (y) / Kembali ke menu Mahasiswa (n) ? ");
                                    ulang_modelMahasiswa = input.next();
                                }
                                break;
                        }
                    }
                    while(ulang_modelMahasiswa.equalsIgnoreCase("n"));
                    break;
                    
                case 4 :
                    menu_awal = 0;
                    break;
            }
        }while(menu==5);
    }
}

