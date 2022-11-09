package npm06972_praktikummod4;
import java.util.Scanner;

public class NPM06972_PraktikumMod4 {

    public static void main(String[] args) {
        
        Pembayaran p1[]= new Pembayaran[100];
        int index=0;
        Scanner in = new Scanner(System.in);
        int pil;
        int denda=100000;
        do{
            System.out.println("1. Input");
            System.out.println("2. Cetak Pembayaran");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pil =  in.nextInt();
            switch(pil){
                case 1 :
            System.out.print("Tanggal Masuk Parkir : ");
            String tanggal = in.next();
            System.out.print("Waktu Masuk : ");
            int waktu = in.nextInt();
            System.out.print("Plat Motor : ");
            String plat = in.next();
            System.out.print("STNK(ada/tidak) : ");
            String stnk = in.next();
            System.out.print("Biaya Parkir Perjam : ");
            int biaya = in.nextInt();
            p1[index]= new Pembayaran(tanggal,waktu,plat,stnk,biaya);
            index++;
            break;
            
                case 2 :
                //Pembayaran p = null;
            for(int i=0; i<index; i++){
                System.out.println("\n\nTanggal Parkir : "+p1[i].getTanggal());
                System.out.println("Waktu masuk : "+p1[i].getWaktu());
                System.out.println("Plat Motor : "+p1[i].getPlat());
                System.out.println("STNK : "+p1[i].getStnk());
                if(p1[i].stnk.equals("ada")){
                    System.out.println("Total Bayar : "+p1[i].getBiaya());
                } else {
                    System.out.println("Total Bayar : "+p1[i].getBiaya(denda));
                }
                }
                    System.out.println("=====================");
                break;
            }
        }while(pil!=0);
    }
    
}
