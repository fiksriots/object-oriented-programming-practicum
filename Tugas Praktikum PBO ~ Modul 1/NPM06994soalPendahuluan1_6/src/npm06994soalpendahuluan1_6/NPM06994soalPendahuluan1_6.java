package npm06994soalpendahuluan1_6;
import java.util.Scanner;
public class NPM06994soalPendahuluan1_6 
{
    static void procedureluaslingkaran(double diameter)
    {
    double jari2=diameter/2;
    double luas =jari2*jari2*3.14;
       System.out.println("luas lingkaran :"+luas);
    }
    
    static double fungsiluaslingkaran(double diameter)
    {
    double jari2=diameter/2;
    double luas =jari2*jari2*3.14;
    return luas;
    }
    
    static double[] fungsilingkaran(double diameter)
    {
    double[] hasil=new double[2];
    double jari2=diameter/2;
    double keliling=jari2*2*3.14;
    double luas=jari2*jari2*3.14;
    hasil[0]=luas;
    hasil[1]=keliling;
    return hasil;
    }
    
    static double fungsitabung(double d,int t)
    {
    double jari2=d/2;
    double luas=jari2*jari2*3.14;
    double volume=luas*t;
    return volume;
    }
    
    


    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan diameter (meter) :");
        double dm=input.nextDouble();
        
        //menu();
        System.out.println(" 1.Luas lingkaran \n 2.Luas Lingkaran(rekursif) \n 3.luas & keliling Lingkaran \n 4.volume tabung");
        System.out.print("masukkan pilih :");
        int pilihan=input.nextInt();
        
        switch(pilihan)
        {
            case 1:
                procedureluaslingkaran(dm);
                break;
            case 2:
                double luas=fungsiluaslingkaran(dm);
                System.out.println("Luas lingkaran :"+luas);
                break;
            case 3:
                double[] hasil=fungsilingkaran(dm);
                System.out.println("Luas lingkaran adalah "+hasil[0]);
                System.out.println("Keliling lingkaran adalah "+hasil[1]);
                break;
            case 4:
                System.out.print("Masukkan tinggi(meter :" );
                int tinggi=input.nextInt();
                double volume=fungsitabung(dm,tinggi);
                double konversi=volume*100;
                System.out.println("Volume tabung adalah :"+konversi+"cm^3");
                break;
                
                
        }
    }
    
}
