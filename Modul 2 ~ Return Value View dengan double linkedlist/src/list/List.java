
package list;
import java.util.Scanner;
public class List {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int pil;
        
        crud crd=new crud();
        doublelinklist list=new doublelinklist();
        crd.menu();
        do{
        System.out.print("pilih = ");
        pil=in.nextInt();
        switch(pil){
            case 1:
                crd.Create();
             break;
            case 2:
                crd.Update();
                break;
            case 3:
                crd.Delete();
                break;
            case 4:
                int a = list.hitungData(list);
                String[] ambilNama = new String[a];
                
                        System.out.println("Nama : " + ambilNama[a]);
                        /*System.out.println("Deskripsi : " + ambilDeskripsi[i]);
                        if (ambilStatus[i] == 1) {
                        System.out.println("Status : Belum Dikerjakan");
                        } else if (ambilStatus[i] == 2) {
                        System.out.println("Status : Sedang Dikerjakan");
                        } else if (ambilStatus[i] == 3) {
                        System.out.println("Status : Sudah Dikerjakan");
                        }*/
                        System.out.println();
                    
                break;
        }
    }while(pil!=5);
    }
    
}
