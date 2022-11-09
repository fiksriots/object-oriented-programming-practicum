package npm06994soalpendahuluan1_2;
import java.util.Scanner;
public class NPM06994soalPendahuluan1_2 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan input diameter lingkaran :");
        int diameter=input.nextInt();
        double pi=3.14;
        double rata=diameter/2;
        double luas=pi*rata*rata;
        System.out.println("Luas lingkaran : "+luas);
    }   
}
