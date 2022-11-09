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
public class modelMatakuliah_06994 {
    matakuliah_06994 [] dataMK_06994=new matakuliah_06994[100];
    int index=0;
    
    void insert_06994(String kode,String nama, int sks)
    {
        dataMK_06994[index]=new matakuliah_06994(kode,nama,sks);
        index=index+1;
    }
    public void update_06994(String cari_kode,String kode,String nama,int sks){
        int cari=0;
        if(cari==index){
            System.out.println("data kosong");
        }else if(cari_kode.equals(dataMK_06994[cari].kode_06994)){
            dataMK_06994[cari].kode_06994=kode;
            dataMK_06994[cari].nama_06994=nama;
            dataMK_06994[cari].sks_06994=sks;
        }else{
            cari++;
        }
    }
    public void delete_06994(String kod){
        int cari=0;
        do{
            if(cari == index){
                System.err.println("Tidak Ada Data!");
                break;
            }else if(kod.equals(dataMK_06994[cari].kode_06994)){
                if(cari == index-1){
                    index = index-1;
                }else{
                    for(int i = cari;i<index;i++){
                        dataMK_06994[i] = dataMK_06994[i+1];
                    }
                    index = index-1;
                }
                break;
            }else{
                cari = cari+1;
            }
        }while(true);
    }
    
    public matakuliah_06994 cariObjMK_06994(String idMK)
    {
        //matakuliah tempMK=new matakuliah(" "," ",0);
        matakuliah_06994 tempMK=null;
        for (int i=0;i<index;i++)
        {
            if (idMK.equals(dataMK_06994[i].kode_06994))
            {
                //tempMK=dataMK[i];
                String a=dataMK_06994[i].kode_06994;
                String b=dataMK_06994[i].nama_06994;
                int c=dataMK_06994[i].sks_06994;
                tempMK=new matakuliah_06994(a,b,c);
            }
        }
        
        return tempMK;
    }
    
    public void cetak()
    {
        for (int i=0;i<index;i++)
        {
            System.out.println("kode matakuliah :"+dataMK_06994[i].kode_06994);
             System.out.println("nama matakuliah :"+dataMK_06994[i].nama_06994);
        }
    }
    
}
