/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4prakti;
import java.util.Scanner;
/**
 *
 * @author fikri
 */
public class Modul4Prakti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Kelinci kelinci =new Kelinci();
        Kura kura = new Kura();
        Singa singa = new Singa();
        int masuk=0;
        int lomba=0;
        int kecepatan;
        Scanner input=new Scanner (System.in);
        int menu;
       
        do
        {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("----------------Selamat Datang di Game Zoo Racer--------------------------");
        System.out.println("Di game ini terdapat 3 pemain : Kelinci,Kura-kura,Singa ");
        System.out.println("Suatu hari ,3 hewan tersebut melakukan pertandingan lari dengan jarak 10KM");
        System.out.println("untuk membuktikan siapa tercepat.");
        System.out.println("Aturlah jalan cerita melalui menu dibawah ini!");
        System.out.println("1. Masukkan Nilai Kecepatan (1-10)");
        System.out.println("2. Mulai Lomba");
        System.out.println("3. Lihat Pemenang");
        System.out.println("4. Keluar");
        System.out.println("--------------------------------------------------------------------------");
        
        System.out.print("Masukkan nomor menu : ");
        menu =input.nextInt();
        switch(menu)
        {
            case 1:
                    System.out.print("Masukkan Kecepatan Kelinci (KM/Jam): ");
                    kelinci.input(input.nextInt());
                    System.out.print("Masukkan Kecepatan Kura-Kura (KM/Jam): ");
                    kura.input(input.nextInt());
                    System.out.print("Masukkan Kecepatan Singa (KM/Jam): ");
                    singa.input(input.nextInt());
                   masuk = 1;
                    break;
                case 2:
                    System.out.println("LOMBA SUDAH DIMULAI...");
                    lomba = 1;
                    break;
                case 3:
                    if(masuk!=0)
                    {
                            if(lomba!=0)
                            {
                                kelinci.hasil();
                                kura.hasil();
                                singa.hasil();
                        //masuk = 0;
                        //lomba = 0;
                        break;
                            }
                            else
                            {
                        System.err.println("Mulai Lomba dulu dong :v");
                            }
                    }
                    else
                    {
                        System.err.println(" Input Kecepatan Hewan Dulu dong !!! ");
                    }
                }
        }while(menu!=4);
        
    }
    
}
