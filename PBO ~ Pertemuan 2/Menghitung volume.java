/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambahan.modul.pkg1;
import java.util.Scanner;
/**
 *
 * @author unknown
 */
public class TambahanModul1 {
 static void menu(){
        System.out.println("1. volume kubus");
        System.out.println("2. volume balok");
        System.out.println("3. volume tabung");       
    }
    static class bangunruang{
    
     int kubus(int sisi){
        int volkubus = sisi*sisi*sisi;
        return volkubus;
    }
     int balok(int panjang, int lebar, int tinggi){
        int volbalok = panjang * lebar * tinggi;
        return volbalok;
    }
     double tabung(int r,int tinggi){
        double pi = 3.14;
        double voltabung = pi*r*r*tinggi;
        return voltabung;
    }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner inp = new Scanner(System.in);
        menu();
        bangunruang vol = new bangunruang();
        System.out.print("masukkan pilihan : ");
        int pil = inp.nextInt();
        switch(pil){
            case 1:
                System.out.print("sisi : ");
                int ss = inp.nextInt();
                int hasil = vol.kubus(ss);
                System.out.println("volume kubus adalah " +hasil);
                break;
            case 2:
                System.out.print("panjang : ");
                int p = inp.nextInt();
                System.out.print("lebar : ");
                int l = inp.nextInt();
                System.out.print("tinggi : ");
                int t = inp.nextInt();
                int hasil1 = vol.balok(p,l,t);
                System.out.println("volume balok adalah " +hasil1);
                break;
            case 3:
                System.out.print("jari-jari : ");
                int jari = inp.nextInt();
                System.out.print("tinggi: ");
                int ting = inp.nextInt();
                double hasil2 = vol.tabung(jari,ting);
                System.out.println("volume kubus adalah " +hasil2);
                break;
                
                
        }
// TODO code application logic here
    }
    
}
