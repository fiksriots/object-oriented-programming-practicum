
package pertemuan6;

public class ModelPekerjaan07053 {
    Pekerjaan07053[] data_pekerjaan = new Pekerjaan07053[100];
    int index = 0;
    
    public void insert(String id,String nama,int harga){
        data_pekerjaan[index] = new Pekerjaan07053(id,nama,harga);
        index++;
    }
    
    public void cetak(){
        if(this.index==0){
            System.err.println("Data masih kosong");
        }
        else{
            System.out.println("============Daftar Pekerjaan==============");
            for(int i=0; i<index; i++){
                System.out.println("ID pekerjaan : "+data_pekerjaan[i].id);
                System.out.println("Nama pekerjaan : "+data_pekerjaan[i].nama);
                System.out.println("Harga pekerjaan : "+data_pekerjaan[i].harga);
                System.out.println("==========================================");
            }
        }
    }
    
    public void update(String id, String nama, int harga, String cari_id){
        for(int i=0; i<index; i++){
            if(cari_id.equals(data_pekerjaan[i].id)){
                data_pekerjaan[i] = new Pekerjaan07053(id,nama,harga);
            }
        }
    }
    
    public void delete(String cari_id){
        for(int i=0; i<index; i++){
            if(cari_id.equals(data_pekerjaan[i].id)){
                for(int j=i; j<index; j++){
                    if(j!=index-1){
                        data_pekerjaan[j] = data_pekerjaan[j+1];
                    }
                }
                index--;
            }
        }
    }
    
    public Pekerjaan07053 cariObjek(String id){
        Pekerjaan07053 temp = null;
        for(int i=0; i<index; i++){
            if(id.equals(data_pekerjaan[i].id)){
                temp = data_pekerjaan[i];
            }
        }
        return temp;
    }
    
}
