package npm06994soalpendahuluan1_3;
import java.util.Scanner;

public class NPM06994soalPendahuluan1_3 
{
    public static void main(String[] args) 
    {
     Scanner input=new Scanner(System.in);
        System.out.print("Diameter :");
        double Diameter =input.nextDouble();
        System.out.print("Tinggi :");
        double Tinggi =input.nextDouble();
        
        double pi=3.14;
        double rata=Diameter/2;
        double luas=pi*rata*rata;
        double volumeTabung=luas*Tinggi;
        System.out.println("Volume Tabung :"+volumeTabung);
        
        
    }
    
}
