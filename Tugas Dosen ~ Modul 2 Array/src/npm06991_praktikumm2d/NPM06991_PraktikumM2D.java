
package npm06991_praktikumm2d;

import java.util.Scanner;


public class NPM06991_PraktikumM2D {

  
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        int pil;
        array arr = new array();
        do{
           arr.menu();
        System.out.print("pilih : ");
        pil=in.nextInt();
        switch(pil){
            case 1:
                arr.Create();
             break;
            case 2:
                arr.Update();
                break;
            case 3:
                arr.Delete();
                break;
            case 4:
                //arr.Read();
                int totalData = arr.jumlahData();
                String [] hasilNama = arr.getNama();
                String [] hasilDesk = arr.getDesk();
                String [] hasilStat = arr.getStatus();
                
                for(int i = 0 ; i<totalData ; i++){
                    System.out.println("Nama Pekerjaan  : " + hasilNama[i]);
                    System.out.println("Deskripsi       : " + hasilDesk[i]);
                    System.out.println("Status          : " + hasilStat[i]);
                }
                break;
        }
    }while(pil!=5);
    }
    
}
