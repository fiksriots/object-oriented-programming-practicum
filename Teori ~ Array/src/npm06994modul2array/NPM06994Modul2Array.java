
package npm06994modul2array;

public class NPM06994Modul2Array {
static class node{
        int nip;
        String nama;
        String jabatan;
        
        public node(int a,String b,String c){
            this.nip=a;
            this.nama=b;
            this.jabatan=c;
        }
}
static class node1{
    node [] nod=new node[100];
    int indeks=0;
    void tambah(int npm,String name,String jab){
        nod[indeks]= new node(npm,name,jab);
        indeks=indeks+1;
    }
    void view(){
        System.out.println("===DATA PEGAWAI===");
        for(int i=0;i<indeks;i++){
            System.out.println(nod[i].nip+". "+nod[i].nama+"->"+nod[i].jabatan);
        }
        System.out.println("=============");
    }
}
    public static void main(String[] args) {
        node1 nodd=new node1();
        nodd.tambah(1, "alan", "programer");
        nodd.tambah(2, "fikri", "deisgner");
        nodd.tambah(3, "farid", "PM");
        nodd.tambah(4, "fery", "programer");
        nodd.view();
    }
    
}
