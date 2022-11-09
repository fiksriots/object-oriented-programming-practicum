
package npm06991_praktikumm2d;

import java.util.Scanner;


public class array {
    node [] mhs = new node[100];
    int data = 0;
  
    void menu(){
        System.out.println("-------Menu-------");
        System.out.println("1. Tambah pekrjaan");
        System.out.println("2. Ubah pekerjaan");
        System.out.println("3. Hapus Pekerjaan");
        System.out.println("4. Lihat pekerjaan");
        System.out.println("5. Exit program");
        System.out.println("------------------");
    }
    void Create(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Pekerjaan : ");
        String nama = input.nextLine();
        System.out.print("Masukan Deskripsi : ");
        String desk  = input.nextLine();
        System.out.print("Masukan Status : ");
        String status  = input.nextLine();
        mhs[data] = new node(nama,desk,status);
        data = data+1;
    }
     
    void Update(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan pekerjaan yang mau diedit : ");
        String search = input.nextLine();
        int cek = 0;
        do{
            if(cek == data){
                System.out.println("Tida ada data");
                break;
            }else if(search.equals(mhs[cek].nama)){
                System.out.print("Ubah Pekerjaan :");
                mhs[cek].nama= input.next();
                System.out.print("Ubah Deskripsi : ");
                mhs[cek].desk = input.next();
                System.out.print("Ubah Status : ");
                mhs[cek].status = input.next();
                
                break;
            }
            else{
                cek = cek+1;
            }
        }while(true);
    }
    void Delete(){
        Scanner input = new Scanner(System.in);
        System.out.print("cari pekerjaan yang akan dihapus :");
        String searchh =input.next();
        int cek = 0;
        do{
            if(cek == data){
                System.out.println("Tidak Ada Data!");
                break;
            }else if(searchh.equals(mhs[cek].nama)){
                if(cek == data-1){
                    data = data-1;
                }else{
                    for(int i = cek;i<data;i++){
                        mhs[i] = mhs[i+1];
                    }
                    data = data-1;
                }
                break;
            }else{
                cek = cek+1;
            }
        }while(true);
    }
    
    /*void Read(){
        for(int i = 0;i < data;i++)
        { 
            System.out.println("Pekerjaan    = "+mhs[i].nama);
            System.out.println("Deskripsi    = "+mhs[i].desk);
            System.out.println("Status       = "+mhs[i].status);    
        }
        
    }*/
    
    
    public int jumlahData(){
        return data;
    }
    
    public String [] getNama(){
        String [] ambilNama = new String[100];
        for(int i = 0 ; i<data ; i++){
            ambilNama[i] = mhs[i].nama;
        }
        
        return ambilNama;
    }
    
     public String [] getDesk(){
        String [] ambilDesk = new String[100];
        for(int i = 0 ; i<data ; i++){
            ambilDesk[i] = mhs[i].desk;
        }
        
        return ambilDesk;
    }
    
      public String [] getStatus(){
        String [] ambilStat = new String[100];
        for(int i = 0 ; i<data ; i++){
            ambilStat[i] = mhs[i].status;
        }
        
        return ambilStat;
    }
    
}
