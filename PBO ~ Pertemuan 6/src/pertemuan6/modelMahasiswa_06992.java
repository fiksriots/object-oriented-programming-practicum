/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author mboen
 */
public class modelMahasiswa_06992 {
    int index=0;
    mahasiswa_06992[] dataMahasiswa_06992=new mahasiswa_06992[100];
    
    public void insertData_06992(String npm,String nama,String alamat)
    {
        dataMahasiswa_06992[index]=new mahasiswa_06992(npm,nama,alamat);
        index++;
    }
    public void update(String cari_npm,String npm,String nama,String alamat){
        int cari=0;
        if(cari==index){
            System.out.println("data tidak ada");
        }else if(cari_npm.equals(dataMahasiswa_06992[cari].npm_06992)){
            dataMahasiswa_06992[cari].npm_06992=npm;
            dataMahasiswa_06992[cari].nama_06992=nama;
            dataMahasiswa_06992[cari].alamat_06992=alamat;
        }else{
            cari++;
        }
    }
    public void delete_06992(String npm){
        int cari=0;
        do{
            if(cari == index){
                System.err.println("Tidak Ada Data!");
                break;
            }else if(npm.equals(dataMahasiswa_06992[cari].npm_06992)){
                if(cari == index-1){
                    index = index-1;
                }else{
                    for(int i = cari;i<index;i++){
                        dataMahasiswa_06992[i] = dataMahasiswa_06992[i+1];
                    }
                    index = index-1;
                }
                break;
            }else{
                cari = cari+1;
            }
        }while(true);
    }
    public void insertMK_06992(String kode,modelMatakuliah_06992 modelMK_06992)
    {
        matakuliah_06992 mk=modelMK_06992.cariObjMK_06992(kode);
        dataMahasiswa_06992[index-1].mk_06992=mk;
    }
    
    public void cetak_06992()
    {
        for (int i=0;i<index;i++)
        {
            System.out.println("nama mahasiswa :"+dataMahasiswa_06992[i].nama_06992);
            System.out.println("nama matakuliah :"+dataMahasiswa_06992[i].npm_06992);
            System.out.println("nama matakuliah :"+dataMahasiswa_06992[i].alamat_06992);
        }
    }
    public void menu_06992(){
        System.out.println("1. insert");
        System.out.println("2. update");
        System.out.println("3. delete");
        System.out.println("4. view");
        System.out.println("5. search");
    }
}
