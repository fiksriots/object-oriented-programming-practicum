package npm06994soalpendahuluan1_4;
import java.util.Scanner;
public class NPM06994soalPendahuluan1_4 
{
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {  
        int pilih;
    do{
        Scanner input=new Scanner(System.in);
        System.out.println("pilih: \n 1.Konversi umur \n 0.exit");
        System.out.print("input :");
            pilih=input.nextInt();
       
        if(pilih!=0)
        {
            System.out.print("umur :");
            int umur=input.nextInt();
            if(umur<5){System.out.println("Balita");}
            if(umur>5&&umur<=17){System.out.println("Anak-anak");};
            if(umur>17&&umur<51){System.out.println("Dewasa");};
            if(umur>50){System.out.println("Tua");};
       }System.out.println("---------------------------------------");
      }while(pilih!=0);
    }
    
}
