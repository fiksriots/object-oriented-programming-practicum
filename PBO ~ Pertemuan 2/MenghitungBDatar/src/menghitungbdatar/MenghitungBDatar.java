package menghitungbdatar;
import java.util.Scanner;//=include


public class MenghitungBDatar{
  static class bangunDatar{
    int alas;
    double tinggi;
    double rata2;
    public bangunDatar(int a,double b)
    {
    	a=5;
    	b=2.0;
    	this.alas=a;
    	this.tinggi=b;
    }
    void LuasSegitiga()
    {
        double LuasSegitiga=0.5*alas*tinggi;
        System.out.println("Luas Segitiga :" +LuasSegitiga);
    }
    void LuasPersegi()
    { 
        double LuasPersegi=alas*tinggi;
        System.out.println("Luas persegi :" +LuasPersegi);
    }  
    void KelilingPersegi()
    { 
        double KelilingPersegi=2*(alas+tinggi);
        System.out.println("Keliling persegi :" +KelilingPersegi);
    }
    void LuasLingkaran()
    { 
        double LuasLingkaran=3.14*rata2*rata2;
        System.out.println("Luas lingkaran :" +LuasLingkaran);
    }
  }  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("alas :");
        int a=input.nextInt();
        System.out.print("tinggi :");
        double b=input.nextDouble();
        
        bangunDatar persegiPanjang=new bangunDatar(a,b);
        bangunDatar segitiga=new bangunDatar(a,b);//konstuktor=untuk memasukkan nilai pada suatu variabel
        // persegiPanjang.input(2,5.5);
        //segitiga.input(5,4);
        persegiPanjang.LuasPersegi();
        persegiPanjang.KelilingPersegi();
        segitiga.LuasSegitiga();
    }
    
}
