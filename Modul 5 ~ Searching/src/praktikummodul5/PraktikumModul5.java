
package praktikummodul5;

import java.util.Scanner;
/**
 *
 * @author fikri
 */
public class PraktikumModul5 
{

    public static void main(String[] args) 
    {
        
        Scanner scan=new Scanner(System.in);
        int menu;String barang = null;
        do
        {
            System.out.println("1. Masukkan Barang");
            System.out.println("2. Cari Barang");
            System.out.print("Pilih :");
            menu =scan.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.println("1.Masukkan Barang :");
                    barang =scan.next();
                    break;
                case 2:
                    System.out.println("2.Cari Barang :");
                    String Cari =scan.next();
                    if(Cari==barang)
                    {
                        System.out.println(Cari);
                    }else
                    {
                        System.out.println("Barang tidak ditemukan");
                    }
                    break;
            }
        
        
        
    }while(menu!=0);
        
        }
    
}
