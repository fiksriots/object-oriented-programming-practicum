/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;
import java.util.Scanner;
/**
 *
 * @author mboen
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        input_06994 in_06994=new input_06994();
        int pil,pil1,pil2,pil3;
        do{
            System.out.println("1. mahasiswa");
            System.out.println("2. mata kuliah");
            System.out.println("3. dosen");
            System.out.println("4. exitt");
            System.out.print("pilih = ");
            pil=in.nextInt();
        switch(pil){
            case 1:
                in_06994.menu();
                System.out.print("pilih = ");
                pil1=in.nextInt();
                if(pil1==1){
                    in_06994.inputmhs_06994();
                }else if(pil1==2){
                    in_06994.updatemhs_06994();
                }else if(pil1==3){
                    in_06994.deletemhs();
                }else{
                    in_06994.viewmhs();
                }
            break;
            case 2:
                in_06994.menu();
                System.out.print("pilih = ");
                pil2=in.nextInt();
                if(pil2==1){
                    in_06994.inputmtk_06994();
                }else if(pil2==2){
                    in_06994.updatemtk_06994();
                }else if(pil2==3){
                    in_06994.deletemmtk();
                }else{
                    in_06994.viewmtk();
                }
            break;
            case 3:
                System.out.println("1. input dosen");
                System.out.println("2. cari id");
                System.out.print("pilih = ");
                pil3=in.nextInt();
                if(pil3==1){
                    in_06994.inputdsn_06994();
                }else if(pil3==2){
                    in_06994.cariId_06994();
                }
                break;
        }
    }while(pil!=4);
    }
    
}
