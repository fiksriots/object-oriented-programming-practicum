package list;
public class node {
    String pekerjaanB;
    String deskripsi;
    String statusP;
    node next;
    node prev;   
    public node(String a,String b,String c)
    {
        this.pekerjaanB=a;
        this.deskripsi=b;
        this.statusP=c;
    }
   public void tampil()
    {
    System.out.println("nama pekerjaan = "+pekerjaanB);
    System.out.println("deskripsi pekerjaan = "+deskripsi);
    System.out.println("status pekerjaan = "+statusP);
    }
}
