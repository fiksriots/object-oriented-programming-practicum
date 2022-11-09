
package npm06994modul2linklist;

class pegawai
{   //pembuatan struct
    private static class node
    {
        int nip;
        String nama;
        String jabatan;
        node next;
        node prev;
        //pembuatan atribut
        node (int a,String b ,String c)
        {
            this.nip=a;
            this.nama=b;
            this.jabatan=c;
            this.next=null;
            this.prev=null;
        }
    }
    //pembuatan object head dan tail linklist
        node head;
        node tail;
        void tambah(pegawai list,int a,String nama,String jabatan)
        {
            //pembuatan node baru
            node data_pegawai=new node(a,nama,jabatan);
            if (list.head==null)
            {
                list.head=data_pegawai;
                list.tail=data_pegawai;          
            }
            //jika tidak kosong maka data akan disisipkan setelah data yang ada
            else
            {
                data_pegawai.next=list.tail;
                data_pegawai.prev=null;
                list.tail.prev=data_pegawai;
                list.tail=data_pegawai;
            }
        }
        void lihat(pegawai list)
        {
            node view=list.tail;
            System.out.println("----DATA PEGAWAI----");
            //pencarian data
            while(view!=null)
            {
                System.out.println(view.nama+"->"+view.jabatan);
                view=view.next;
            }
            System.out.println("---------------------");
        }
}
public class Npm06994Modul2LinkList 
{
    public static void main(String[] args) {
     pegawai peg=new pegawai();
     peg.tambah(peg,1,"andi","programer");
     peg.tambah(peg,2,"budi","designer");
     peg.tambah(peg,3,"cici","pm");
     peg.tambah(peg,4,"didi","programer");
     peg.lihat(peg);
    }   
}
