
package pertemuan6;

public class ModelDepartemen07053 {
    Departemen07053[] data_departemen = new Departemen07053[10];
    int index = 0;
    
    public void insert(String id, String nama){
        data_departemen[index] = new Departemen07053(id,nama);
        index++;
    }
    
    public void cetak(){
        if(this.index==0){
            System.err.println("Data masih kosong");
        }
        else{
            System.out.println("=============Daftar Departemen============");
            for(int i=0; i<index; i++){
                System.out.println("ID departemen : "+data_departemen[i].id);
                System.out.println("Nama departemen : "+data_departemen[i].nama);
                System.out.println("==========================================");
            }
        }
    }
    
    public void update(String id, String nama, String cari_id){
        for(int i=0; i<index; i++){
            if(cari_id.equals(data_departemen[i].id)){
                data_departemen[i] = new Departemen07053(id,nama);
            }
        }
    }
    
    public void delete(String cari_id){
        for(int i=0; i<index; i++){
            if(cari_id.equals(data_departemen[i].id)){
                for(int j=i; j<index; j++){
                    if(j!=index-1){
                        data_departemen[j] = data_departemen[j+1];
                    }
                }
                index--;
            }
        }
    }
    
    public Departemen07053 cariObjek(String id){
        Departemen07053 temp = null;
        for(int i=0; i<index; i++){
            if(id.equals(data_departemen[i].id)){
                temp = data_departemen[i];
            }
        }
        return temp;
    }
}
