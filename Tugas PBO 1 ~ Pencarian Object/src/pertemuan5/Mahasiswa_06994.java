
package pertemuan5;

/**
 *
 * @author Fikri
 */
public class Mahasiswa_06994 extends Manusia_06994 {
    String npm_06994;
    String id_dosen_06994;
    String kode_06994;
    
    public Mahasiswa_06994(String a, String b, String c, String d){
        super.nama_06994 = a;
        this.npm_06994 = b;
        super.alamat_06994 = c;
        super.telepon_06994 = d;
    }
    
    void reg_dosen_06994(String A){
        this.id_dosen_06994 = A;
    }
    
    /*void cetakMHS(){
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Telepon : " + telepon);
        System.out.println("Dosen Wali : " + id_dosen);
    }*/
}
