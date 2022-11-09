
package thread.dataktp;
/**
 *
 * @author fikri
 */
public class ktp2 extends Thread{
        String nama;
        String alamat;
        String ttl;
        public ktp2 (String nama,String ttl,String alamat) {
            this.nama=nama;
            this.ttl=ttl;
            this.alamat=alamat;}
        @Override
    public void start(){
            for (int i=1;i <=3;i++){
            try{
            System.out.println("-----------------------");
            System.out.println("Nama : "+nama);
            System.out.println("tempat lahir :"+ttl);
           
            System.out.println("alamat : "+alamat);
            System.out.println("-----------------------");
            Thread.sleep(1000);}
            catch (InterruptedException e) {
                System.err.println("selesai");}}}}
