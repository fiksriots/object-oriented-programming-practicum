package thread.dataktp;
import java.util.Scanner;
/**
 *
 * @author fikri
 */
public class ThreadDataktp {
     public static void main (String [] args) {
    Scanner input =new Scanner(System.in);
        System.out.println("----- Masukkan DATA KTP 1 -----");
        System.out.print("masukkan nama : ");
        String nama=input.nextLine();
        System.out.print("masukkan tempat lahir : ");
        String ttl=input.nextLine();
        System.out.print("masukkan nomer hape : ");
        String noHp=input.nextLine();
        System.out.print("masukkan alamat : ");
        String alamat=input.nextLine();
    ktp KTP = new ktp(nama,ttl,noHp,alamat);
        System.out.println("----- Masukkan DATA KTP 2 -----");
        System.out.print("masukkan nama : ");
        String nama2=input.nextLine();
        System.out.print("masukkan tempat lahir : ");
        String ttl2=input.nextLine();
        System.out.print("masukkan nomer hape : ");
        String noHp2=input.nextLine();
        System.out.print("masukkan alamat : ");
        String alamat2=input.nextLine();
    ktp2 KTP2 = new ktp2(nama2,ttl2,alamat2);
    KTP.run();
    KTP2.start();}}
