/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_uts;
import java.util.Scanner;
public class proses {
    
    Scanner in=new Scanner(System.in);
    data [] dataa=new data[10000];
    int indeks=0;
    void input(int nomor,int nomor2,String nama){
        dataa[indeks]=new data(nomor,nomor2,nama);
        indeks=indeks+1;
    }
    void detak(){
        for (int i=0;i<indeks;i++){
       System.out.println(dataa[i].kodepos+" "+dataa[i].nomor+" "+dataa[i].nama_distrik);
        }
    }
    void search(){
        System.out.print("masukkan nama distrik = ");
        String cari=in.nextLine();
        for (int i=0;i<indeks;i++){
        if (cari.equals(dataa[i].nama_distrik)){
            System.out.println("nama distrik = "+dataa[i].nama_distrik);
            System.out.println("kode pos = "+dataa[i].kodepos);
            System.out.println("nomor = "+dataa[i].nomor);
        }
    }
    }
    
    
}
