
package list;
import java.util.Scanner;
public class List {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int pil;
        
        crud crd=new crud();
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
                crd.Read();
                break;
        }
    }while(pil!=5);
    }
    
}
