package thread.dataktp;
/**
 *
 * @author fikri
 */
public class ktp implements Runnable{
        String nama;
        String alamat;
        String noHp;
        String ttl;
        public ktp (String nama,String ttl,String noHp,String alamat){
        this.nama=nama;
        this.ttl=ttl;
        this.noHp=noHp;
        this.alamat=alamat;}
        @Override
        public void run() {
            for (int i=1;i <=5;i++){
            try{
            System.out.println("-----------------------");
            System.out.println("Nama : "+nama);
            System.out.println("tempat lahir :"+ttl);
            System.out.println("noHp : "+noHp);
            System.out.println("alamat : "+alamat);
            System.out.println("-----------------------");
            Thread.sleep(2000);}
            catch (InterruptedException e) {
                System.err.println("selesai");}}}}
