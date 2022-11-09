package pkg06994beratbadan;
import java.util.Scanner;
class npm06994berat
    {
        int umur;
        public npm06994berat(int a)
        {
            this.umur=a;
        }
        int laki(int b)
        {
            int bert=b;
            if(bert>=57&&bert<=70){
            System.out.println("berat badan ideal");
            }else{System.out.println("berat badan tidak ideal");}
            return bert;
        }
        int perempuan(int b)
        {
            int bert1=b;
            if(bert1>=52&&bert1<=66){
                System.out.println("berat badan ideal");
            }else{System.out.println("berat badan tidak ideal");}
          
            return bert1;
        }
    
    }
public class Main {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int pilih;
        do{
        System.out.println("--------------------------------------");
        System.out.println("----Mengawasi Berat badan karyawan----");
        System.out.println(" 1.laki-laki \n 2.perempuan \n 3.exit");
        System.out.print("masukkan jenis kelamin :");
        pilih=input.nextInt();
        switch(pilih){
            case 1:
            System.out.print("masukkan umur :");
            int kel=input.nextInt();
            npm06994berat br=new npm06994berat(kel);
            int lk=br.laki(kel);                
            break;
            case 2:
            System.out.print("masukkan umur :");
            int kel1=input.nextInt();
            npm06994berat bro=new npm06994berat(kel1);
            int pr=bro.perempuan(kel1);
            break;
        }}while(pilih!=3);
    }
}
    

