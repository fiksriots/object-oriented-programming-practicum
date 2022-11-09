

package Frame;
import Frame.mainFrame;
import java.util.Scanner;
/**
 *
 * @author unknown
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainFrame g = new mainFrame();
        /*Scanner input = new Scanner(System.in);
        modelRW mRW = new modelRW();
        modelRT mRT = new modelRT();
        modelWarga mWarga = new modelWarga();
        int menu_awal, menu = 0;
        
        do{
        System.out.println("=======PROGRAM PENDATAAN DI DESA ======");
        System.out.println("menu : 1. RW");
        System.out.println("       2. RT");
        System.out.println("       3. Warga");
        System.out.println("       4. EXIT");
        System.out.print("pilih menu : ");
        menu_awal = input.nextInt();
        switch(menu_awal){
        case 1:
        String ulang_mRw;
        do{
        ulang_mRw = "y";
        System.out.println("=========== RW ===========");
        System.out.println("menu : 1. tambah rw");
        System.out.println("       2. update rw");
        System.out.println("       3. cetak");
        System.out.println("       4. kembali ke menu utama");
        System.out.println("       5. exit");
        System.out.print("pilih menu : ");
        menu = input.nextInt();
        switch(menu){
        case 1:
        while (ulang_mRw.equalsIgnoreCase("y"))
        {
        System.out.print("nama ketua rw : ");
        String nama = input.next();
        System.out.print("alamat : ");
        String alamat = input.next();
        System.out.print("no telp :");
        String notlp = input.next();
        mRW.insert(nama, notlp, alamat);
        System.out.print("Ulang insert/kembali ke menu Dosen (y/n) ? ");
        ulang_mRw = input.next();
        }
        break;
        case 2:
        while(ulang_modelDosen.equalsIgnoreCase("y"))
        {
        System.out.println("=================Memperbarui Data RW==============");
        System.out.print("RW yang akan di update : ");
        int cari = input.next();
        
        rw modelDosen_update = modelDosen.cariObjek(cari);
        if(modelDosen_update==null)
        {
        System.err.println("Data tidak ditemukan");
        }
        else
        {
        System.out.println("Nama modelDosen : "+modelDosen_update.getNama());
        System.out.println("=============Diperbarui Menjadi=============");
        System.out.print("Nip Dosen : ");
        String id = input.next();
        System.out.print("Nama Dosen : ");
        String nama = input.next();
        System.out.print("Alamat Dosen : ");
        String alamat = input.next();
        System.out.print("No Telepon Dosen : ");
        String notelp = input.next();
        mRW.update(cari, nama, alamat, notelp);
        //modelDosen.update(id,nama,c,d,cari_id);
        System.out.println("Data berhasil diperbarui");
        }
        System.out.print("Ulang update/kembali ke menu dosen (y/n) ? ");
        ulang_mRw = input.next();
        }
        break;
        }
        }
        }
        }while(menu_awal!=4);*/
        // TODO code application logic here
    }
    
}
