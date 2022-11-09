package thread.hitungluaspersegi;
import java.util.Scanner;
/**
 *
 * @author fikri
 */
public class ThreadHitungluaspersegi {
 public static void main (String [] args) {
    Scanner input =new Scanner(System.in);
        System.out.print("masukkan sisi dari persegi : ");
        int sisi=input.nextInt();
    Persegi luasPersegi = new Persegi(sisi);
    luasPersegi.run(); }}