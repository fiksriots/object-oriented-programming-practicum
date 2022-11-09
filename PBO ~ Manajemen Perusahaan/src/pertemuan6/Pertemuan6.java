
package pertemuan6;
import java.util.Scanner;

public class Pertemuan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ModelDepartemen07053 departemen = new ModelDepartemen07053();
        ModelPekerjaan07053 tugas = new ModelPekerjaan07053();
        ModelPegawai07053 pegawai = new ModelPegawai07053();
        int menu_awal, menu = 0;
        
        do{
            System.out.println("==========================================");
            System.out.println("Menu : 1. Departemen");
            System.out.println("       2. Pekerjaan");
            System.out.println("       3. Pegawai");
            System.out.println("       4. Close Program");
            System.out.print("Pilih menu nomor : ");
            menu_awal = input.nextInt();
            switch(menu_awal){
                case 1:
                    String ulang_departemen;
                    do{
                        ulang_departemen = "ulang";
                        System.out.println("==========================================");
                        System.out.println("Menu : 1. Insert Data Departemen");
                        System.out.println("       2. View Data Departemen");
                        System.out.println("       3. Update Data Departemen");
                        System.out.println("       4. Delete Data Departemen");
                        System.out.println("       5. Kembali ke Menu Awal");
                        System.out.println("       6. Close Program");
                        System.out.print("Pilih menu nomor : ");
                        menu = input.nextInt();
                        switch(menu){
                            case 1 :
                                while(ulang_departemen.equalsIgnoreCase("ulang")){
                                    System.out.print("ID departemen : ");
                                    String id = input.next();
                                    System.out.print("Nama departemen : ");
                                    String nama = input.next();
                                    departemen.insert(id,nama);
                                    System.out.print("Ulang insert/kembali ke menu departemen (ulang/kembali) ? ");
                                    ulang_departemen = input.next();
                                }
                                break;
                            case 2 :
                                departemen.cetak();
                                ulang_departemen = "kembali";
                                break;
                            case 3 : 
                                while(ulang_departemen.equalsIgnoreCase("ulang")){
                                    System.out.println("=================Update Data==============");
                                    System.out.print("ID departemen yang akan diupdate : ");
                                    String cari_id = input.next();
                                    Departemen07053 departemen_update = departemen.cariObjek(cari_id);
                                    if(departemen_update==null){
                                        System.err.println("Data tidak ditemukan");
                                    }
                                    else{
                                        System.out.println("Nama departemen : "+departemen_update.nama);
                                        System.out.println("=============Diupdate Menjadi=============");
                                        System.out.print("ID departemen : ");
                                        String id = input.next();
                                        System.out.print("Nama departemen : ");
                                        String nama = input.next();
                                        departemen.update(id,nama,cari_id);
                                        System.out.println("Data berhasil diupdate");
                                    }
                                    System.out.print("Ulang update/kembali ke menu departemen (ulang/kembali) ? ");
                                    ulang_departemen = input.next();
                                }
                                break;
                            case 4 :
                                while(ulang_departemen.equalsIgnoreCase("ulang")){
                                    System.out.print("ID departemen yang akan dihapus : ");
                                    String cari_id = input.next();
                                    Departemen07053 hapus_departemen = departemen.cariObjek(cari_id);
                                    if(hapus_departemen==null){
                                        System.out.println("Data tidak ditemukan");
                                    }
                                    else{
                                        departemen.delete(cari_id);
                                        System.out.println("Data telah dihapus");
                                    }
                                    System.out.print("Ulang delete/kembali ke menu departemen (ulang/kembali) ? ");
                                    ulang_departemen = input.next();
                                }
                                break;
                        }
                    }while(ulang_departemen.equalsIgnoreCase("kembali"));
                    break;
                    
                case 2:
                    String ulang_pekerjaan;
                    do{
                        ulang_pekerjaan = "ulang";
                        System.out.println("==========================================");
                        System.out.println("Menu : 1. Insert Data Pekerjaan");
                        System.out.println("       2. View Data Pekerjaan");
                        System.out.println("       3. Update Data Pekerjaan");
                        System.out.println("       4. Delete Data Pekerjaan");
                        System.out.println("       5. Kembali ke Menu Awal");
                        System.out.println("       6. Close Program");
                        System.out.print("Pilih menu nomor : ");
                        menu = input.nextInt();
                        switch(menu){
                            case 1 :
                                while(ulang_pekerjaan.equalsIgnoreCase("ulang")){
                                    System.out.print("ID pekerjaan : ");
                                    String id = input.next();
                                    System.out.print("Nama pekerjaan : ");
                                    String nama = input.next();
                                    System.out.print("Harga Pekerjaan : ");
                                    int harga = input.nextInt();
                                    tugas.insert(id,nama,harga);
                                    System.out.print("Ulang insert/kembali ke menu pekerjaan (ulang/kembali) ? ");
                                    ulang_pekerjaan = input.next();
                                }
                                break;
                            case 2 :
                                tugas.cetak();
                                ulang_pekerjaan = "kembali";
                                break;
                            case 3 :
                                while(ulang_pekerjaan.equalsIgnoreCase("ulang")){
                                    System.out.println("=================Update Data==============");
                                    System.out.print("ID pekerjaan yang akan diupdate : ");
                                    String cari_id = input.next();
                                    Pekerjaan07053 pekerjaan_update = tugas.cariObjek(cari_id);
                                    if(pekerjaan_update==null){
                                        System.err.println("Data tidak ditemukan");
                                    }
                                    else{
                                        System.out.println("Nama pekerjaan : "+pekerjaan_update.nama);
                                        System.out.println("Harga pekerjaan : "+pekerjaan_update.harga);
                                        System.out.println("=============Diupdate Menjadi=============");
                                        System.out.print("ID pekerjaan : ");
                                        String id = input.next();
                                        System.out.print("Nama pekerjaan : ");
                                        String nama = input.next();
                                        System.out.print("Harga Pekerjaan : ");
                                        int harga = input.nextInt();
                                        tugas.update(id,nama,harga,cari_id);
                                        System.out.println("Data berhasil diupdate");
                                    }
                                    System.out.print("Ulang update/kembali ke menu pekerjaan (ulang/kembali) ? ");
                                    ulang_pekerjaan = input.next();
                                }
                                break;
                            case 4 :
                                while(ulang_pekerjaan.equalsIgnoreCase("ulang")){
                                    System.out.print("ID pekerjaan yang akan dihapus : ");
                                    String cari_id = input.next();
                                    Pekerjaan07053 hapus_pekerjaan = tugas.cariObjek(cari_id);
                                    if(hapus_pekerjaan==null){
                                        System.out.println("Data tidak ditemukan");
                                    }
                                    else{
                                        tugas.delete(cari_id);
                                        System.out.println("Data telah dihapus");
                                    }
                                    System.out.print("Ulang delete/kembali ke menu pekerjaan (ulang/kembali) ? ");
                                    ulang_pekerjaan = input.next();
                                }
                                break;
                        }
                    }while(ulang_pekerjaan.equalsIgnoreCase("kembali"));
                    break;
                    
                case 3:
                    String ulang_pegawai;
                    do{
                        ulang_pegawai = "ulang";
                        System.out.println("==========================================");
                        System.out.println("Menu : 1. Insert Data Pegawai");
                        System.out.println("       2. View Data Pegawai");
                        System.out.println("       3. Update Data Pegawai");
                        System.out.println("       4. Delete Data Pegawai");
                        System.out.print("Pilih menu nomor : ");
                        menu = input.nextInt();
                        switch(menu){
                            case 1 :
                                while(ulang_pegawai.equalsIgnoreCase("ulang")){
                                    System.out.print("ID pegawai : ");
                                    String id_pegawai = input.next();
                                    System.out.print("Nama pegawai : ");
                                    String nama = input.next();
                                    System.out.print("Alamat pegawai : ");
                                    String alamat = input.next();
                                    pegawai.insertData(id_pegawai,nama,alamat);

                                    Departemen07053 departemen_pegawai;
                                    String id_departemen;
                                    do{
                                        System.out.print("ID departemen : ");
                                        id_departemen = input.next();
                                        departemen_pegawai = departemen.cariObjek(id_departemen);
                                        if(departemen_pegawai==null){
                                            System.err.println("ID departemen tidak terdaftar, silahkan "
                                                    + "masukkan ID yang benar ! ");
                                        }
                                    }while(departemen_pegawai==null);
                                    pegawai.insertDepartemen(id_departemen,departemen);

                                    Pekerjaan07053 pekerjaan_pegawai;
                                    String id_pekerjaan;
                                    do{
                                        System.out.print("ID pekerjaan : ");
                                        id_pekerjaan = input.next();
                                        pekerjaan_pegawai = tugas.cariObjek(id_pekerjaan);
                                        if(pekerjaan_pegawai==null){
                                            System.err.println("ID pekerjaan tidak terdaftar, silahkan "
                                                    + "masukkan ID yang benar ! " );
                                        }
                                    }while(pekerjaan_pegawai==null);
                                    pegawai.insertPekerjaan(id_pekerjaan,tugas);
                                    System.out.print("Ulang insert/kembali ke menu pegawai (ulang/kembali) ? ");
                                    ulang_pegawai = input.next();
                                }
                                break;
                            case 2 :
                                pegawai.cetak();
                                ulang_pegawai = "kembali";
                                break;
                            case 3 : 
                                while(ulang_pegawai.equalsIgnoreCase("ulang")){
                                    System.out.println("=================Update Data==============");
                                    System.out.print("ID pegawai yang akan diupdate : ");
                                    String cari_id = input.next();
                                    Pegawai07053 pegawai_update = pegawai.cariObjek(cari_id);
                                    if(pegawai_update==null){
                                        System.err.println("Data tidak ditemukan");
                                    }
                                    else{
                                        System.out.println("Nama pegawai : "+pegawai_update.nama);
                                        System.out.println("Alamat pegawai : "+pegawai_update.alamat);
                                        System.out.println("Departemen : "+pegawai_update.departemen.nama);
                                        System.out.println("Pekerjaan : "+pegawai_update.tugas.nama);
                                        System.out.println("Gaji : "+pegawai_update.gaji);
                                        System.out.println("=============Diupdate Menjadi=============");
                                        System.out.print("ID pegawai : ");
                                        String id_pegawai = input.next();
                                        System.out.print("Nama pegawai : ");
                                        String nama = input.next();
                                        System.out.print("Alamat pegawai : ");
                                        String alamat = input.next();
                                        
                                        Departemen07053 departemen_pegawai;
                                        String id_departemen;
                                        do{
                                            System.out.print("ID departemen : ");
                                            id_departemen = input.next();
                                            departemen_pegawai = departemen.cariObjek(id_departemen);
                                            if(departemen_pegawai==null){
                                                System.err.println("ID departemen tidak terdaftar, silahkan "
                                                        + "masukkan ID yang benar ! ");
                                            }
                                        }while(departemen_pegawai==null);

                                        Pekerjaan07053 pekerjaan_pegawai;
                                        String id_pekerjaan;
                                        do{
                                            System.out.print("ID pekerjaan : ");
                                            id_pekerjaan = input.next();
                                            pekerjaan_pegawai = tugas.cariObjek(id_pekerjaan);
                                            if(pekerjaan_pegawai==null){
                                                System.err.println("ID pekerjaan tidak terdaftar, silahkan "
                                                        + "masukkan ID yang benar ! " );
                                            }
                                        }while(pekerjaan_pegawai==null);
                                        pegawai.update(id_pegawai,nama,alamat,cari_id,id_departemen,id_pekerjaan,departemen,tugas);
                                        System.out.println("Data berhasil diupdate");
                                    }
                                    System.out.print("Ulang update/kembali ke menu pegawai (ulang/kembali) ? ");
                                    ulang_pegawai = input.next();
                                }
                                break;
                            case 4 :
                                while(ulang_pegawai.equalsIgnoreCase("ulang")){
                                    System.out.print("ID pegawai yang akan dihapus : ");
                                    String cari_id = input.next();
                                    Pegawai07053 hapus_pegawai = pegawai.cariObjek(cari_id);
                                    if(hapus_pegawai==null){
                                        System.err.println("Data tidak ditemukan");
                                    }
                                    else{
                                        pegawai.delete(cari_id);
                                        System.out.println("Data telah dihapus");
                                    }
                                    System.out.print("Ulang delete/kembali ke menu pekerjaan (ulang/kembali) ? ");
                                    ulang_pegawai = input.next();
                                }
                                break;
                        }
                    }while(ulang_pegawai.equalsIgnoreCase("kembali"));
                    break;
                    
                case 4 :
                    menu_awal = 0;
                    break;
            }
        }while(menu==5);
    }
}
    
//    menu : 1 Departemen (ada crud);
//            2 Pekerjaan (ada crud);
//            3 Pegawai(ada crud); 
//           ( insert data=nama,id,alamat. 
//            insert dept=id_dept. 
//            insert pekerjaan=id_pekerjaan. );

