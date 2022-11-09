package thread.hitungluaspersegi;
/**
 *
 * @author fikri
 */
public class Persegi extends Thread{
        int sisi;
        public Persegi (int s) {
            this.sisi=s;}
        @Override
        public void run() {
            int luas =sisi*sisi;
            System.out.println("luas persegi tersebut adalah "+luas);}}