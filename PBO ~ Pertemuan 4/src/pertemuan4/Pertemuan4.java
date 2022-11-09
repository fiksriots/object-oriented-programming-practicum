package pertemuan4;
import java.util.Scanner;

/**
 *
 * @author fikri
 */
public class Pertemuan4 {
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
    static class persegipanjang
    {
        int p;
        int l;
        public persegipanjang(int a,int b)
        
        {
            this.p=a;
            this.l=b;
        }

        
        int keliling()
        {
            int keliling;
            keliling=2*(p+l);
            return keliling;
        }
        int luas()
        {
            int luas;
            luas=p*l;
            return luas;
        } 
    
    }
    static class lingkaran
    {
        int r;
        double phi=3.14;
        public lingkaran(int q)
        {
            this.r=q;
        }
        double keliling()
        {
            double keliling;
            keliling=phi*(r*2);
            return keliling;
        }
       double luas()
        {
            double luas;
            luas=phi*r*r;
            return luas;
        } 
    }
    
    public static void main(String[] args) {
        
        Scanner masuk=new  Scanner(System.in);
        int pilih;
                
        do
        {
            System.out.print("pilih :");
            pilih=masuk.nextInt();
            switch(pilih)
            {
                case 1:
                System.out.print("masukkan panjang persegi :");
                int panjang=masuk.nextInt();
                System.out.print("masukkan lebar persegi :");
                int lebar=masuk.nextInt();
                persegipanjang pp= new persegipanjang (panjang,lebar);
                int kelilingpp=pp.keliling();
                int luaspp=pp.luas();
                System.out.println("keliling : "+kelilingpp);
                System.out.println("luas : "+luaspp);
                break;
                case 2:
                System.out.print("masukkan jari-jari :");
                int jari=masuk.nextInt();
                lingkaran l= new lingkaran (jari);
                double kelilingl=l.keliling();
                double luasl=l.luas();
                System.out.println("keliling : "+kelilingl);
                System.out.println("luas : "+luasl);
                break;
                case 3:
                int jari1=masuk.nextInt();
                lingkaran lk=new lingkaran (jari1);
                
                double[] hasil=fungsilingkaran(jari1);
                System.out.println("Luas lingkaran adalah "+hasil[0]);
                System.out.println("Keliling lingkaran adalah "+hasil[1]);
                break;
                
                case 4:
                lingkaran[] bulet=new lingkaran 
                
            } 
        }while(pilih!=0);
        }
}
