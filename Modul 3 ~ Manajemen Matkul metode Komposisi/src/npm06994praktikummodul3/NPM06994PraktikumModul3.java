/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06994praktikummodul3;
import java.util.Scanner;
/**
 *
 * @author fikri
 */
public class NPM06994PraktikumModul3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        input in=new input();
        Scanner cin=new Scanner(System.in);
        int pil,pil1,pil2,pil3;
        do{
        System.out.println("1. masukkan tugas");
        System.out.println("2. masukkan UTS");
        System.out.println("3. masukkan UAS");
        System.out.println("4. Lihat Semua");
        System.out.println("5. exit");
        System.out.print("pilih = ");
        pil=cin.nextInt();
        switch(pil){
            case 1:
                System.out.println("1. input tugas");
                System.out.println("2. view tugas");
                System.out.print("pilih = ");
                pil1=cin.nextInt();
                if(pil1==1){
                    in.inserttgs();
                }else if(pil1==2){
                    in.outputtugas();
                }
                break;
            case 2:
                System.out.println("1. input UTS");
                System.out.println("2. view UTS");
                System.out.print("pilih = ");
                pil2=cin.nextInt();
                if(pil2==1){
                    in.insertuts();
                }else if(pil2==2){
                    in.outpututs();
                }
                break;
            case 3:
                System.out.println("1. input UAS");
                System.out.println("2. view UAS");
                System.out.print("pilih = ");
                pil3=cin.nextInt();
                if(pil3==1){
                    in.insertuas();
                }else if(pil3==2){
                    in.outputuas();
                }
                break;
            case 4:
                in.outputtugas();
                in.outpututs();
                in.outputuas();
                break;
        }
        }while(pil!=5);
    }
}
