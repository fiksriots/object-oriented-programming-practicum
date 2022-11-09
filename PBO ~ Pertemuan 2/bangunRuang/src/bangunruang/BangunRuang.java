package bangunruang;
import java.util.Scanner;

public class BangunRuang {
    static class bangunRuang
    {
       int panjang;
       int lebar;
       int tinggi;
       double la;
       double volume;
       public bangunRuang(int a,int b,int c)
       {
         this.panjang=a;
         this.lebar=b;
         this.tinggi=c;
       }
       void LuasAlas()
       {
          double LuasAlas=panjang*lebar;
          this.la=LuasAlas;
       }
       double VolumeBalok()
       {
          double Vbalok=la*tinggi;
           System.out.println("volume balok :" +Vbalok);
           return Vbalok;
       }
       void VolumeLimas()
       {
          double Vlimas=la*tinggi/3;
           System.out.println("volume Limas :" +Vlimas);
       }
    }
        
        public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double[] hasil;
        hasil= new double[100];double total = 0;
        bangunRuang[] volume=new bangunRuang[100];
        
            System.out.println("1.");
            System.out.println("pilih :");
        int pilih=input.nextInt(); 
               switch(pilih){
           case 1:
            System.out.println("jumlah data:");
            int data=input.nextInt();
            for(int i=0;i<=data;i++){
            System.out.print("panjang :");
            int a=input.nextInt();
            System.out.print("Lebar :");
            int b=input.nextInt();
            System.out.print("Tinggi :");
            int c=input.nextInt();
            volume[i]= new bangunRuang(a,b,c);
            volume[i].LuasAlas();
            hasil[i]=volume[i].VolumeBalok();
            total =total+hasil[i];}
           case 2:
            System.out.println("jumlah data:");
            
            for(int i=0;i<=data;i++){
            System.out.print("panjang :");
            int a=input.nextInt();
            System.out.print("Lebar :");
            int b=input.nextInt();
            System.out.print("Tinggi :");
            int c=input.nextInt();
            volume[i]= new bangunRuang(a,b,c);
            volume[i].LuasAlas();
            hasil[i]=volume[i].VolumeBalok();
            total =total+hasil[i];
            System.out.println("total :"+total);}
        }}}

    

