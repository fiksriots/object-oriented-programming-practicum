
package pertemuan6;

public class Pegawai07053 extends Induk07053{
    String nama, alamat;
    //id_departemen;
    int gaji;
    Pekerjaan07053 tugas;
    Departemen07053 departemen;
    
    public Pegawai07053(String id,String nama,String alamat){
        super.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }
}
