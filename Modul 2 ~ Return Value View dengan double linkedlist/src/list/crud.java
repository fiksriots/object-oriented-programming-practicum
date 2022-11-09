
package list;
import java.util.Scanner;
public class crud {
    doublelinklist list=new doublelinklist();
    Scanner in=new Scanner(System.in);
    void menu(){
        System.out.println("-------------MENU--------------");
        System.out.println("1. tambah pekerjaan baru");
        System.out.println("2. Ubah pekerjaan");
        System.out.println("3. Hapus Pekerjaan");
        System.out.println("4. Lihat pekerjaan");
        System.out.println("5. Exit program");
        System.out.println("-------------------------------");
    }
    void Create(){
        System.out.print("nama pekerjaan = ");
        String nama=in.nextLine();
        System.out.print("deskripsi = ");
        String des=in.nextLine();
        System.out.print("status = ");
        String Stat=in.nextLine();
        list.insert(nama, des, Stat);
}
    void Update(){
        System.out.print("cari = ");
        String cari=in.nextLine();
        System.out.print("nama pekerjaan = ");
        String nama1=in.nextLine();
        System.out.print("deskripsi = ");
        String des1=in.nextLine();
        System.out.print("status = ");
        String Stat1=in.nextLine();
        list.sisip(cari,nama1,des1,Stat1);
        list.delete(cari);
}
  void Delete(){
      System.out.print("hapus = ");
      String hapus=in.nextLine();
      list.delete(hapus);
  }
  
  /*void cls(){
      for(int clear = 0; clear < 1000; clear++)
  {
     System.out.println("\b") ;
  }
  }*/
}
