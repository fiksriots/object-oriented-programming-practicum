
package pertemuan6;

public class ModelPegawai07053 {
    Pegawai07053[] data_pegawai = new Pegawai07053[100];
    int index = 0;
    
    public void insertData(String id, String nama, String alamat){
        data_pegawai[index] = new Pegawai07053(id,nama,alamat);
    }
    
    public void insertDepartemen(String id, ModelDepartemen07053 model_departemen){
        Departemen07053 departemen = model_departemen.cariObjek(id);
        data_pegawai[index].departemen = departemen;
    }
    
    public void insertPekerjaan(String id, ModelPekerjaan07053 model_pekerjaan){
        Pekerjaan07053 pekerjaan = model_pekerjaan.cariObjek(id);
        data_pegawai[index].gaji = pekerjaan.harga;
        data_pegawai[index].tugas = pekerjaan;
        index++;
    }
    
    public void cetak(){
        if(this.index==0){
            System.err.println("Data masih kosong");
        }
        else{
            System.out.println("===============Data Pegawai===============");
            for(int i=0; i<index; i++){
                System.out.println("ID pegawai : "+data_pegawai[i].id);
                System.out.println("Nama pegawai : "+data_pegawai[i].nama);
                System.out.println("Alamat pegawai : "+data_pegawai[i].alamat);
                System.out.println("Departemen : "+data_pegawai[i].departemen.nama);
                System.out.println("Pekerjaan : "+data_pegawai[i].tugas.nama);
                System.out.println("Gaji : "+data_pegawai[i].gaji);
                System.out.println("==========================================");
            }
        }
    }
    
    public void update(String id, String nama, String alamat, String cari_id,String id_dept,String id_pek,
            ModelDepartemen07053 model_departemen, ModelPekerjaan07053 model_pekerjaan){
        Departemen07053 departemen = model_departemen.cariObjek(id_dept);
        Pekerjaan07053 pekerjaan = model_pekerjaan.cariObjek(id_pek);
        for(int i=0; i<index; i++){
            if(cari_id.equals(data_pegawai[i].id)){
                data_pegawai[i] = new Pegawai07053(id,nama,alamat);
                data_pegawai[i].departemen = departemen;
                data_pegawai[i].gaji = pekerjaan.harga;
                data_pegawai[i].tugas = pekerjaan;
            }
        }
    }
    
    public void updateDepartemen(String id, String cari_id, ModelDepartemen07053 model_departemen){
        Departemen07053 departemen = model_departemen.cariObjek(id);
        for(int i=0; i<index; i++){
            if(cari_id.equals(data_pegawai[i].id)){
                data_pegawai[i].departemen = departemen;
            }
        }
    }
    
    public void updatePekerjaan(String id, String cari_id, ModelPekerjaan07053 model_pekerjaan){
        Pekerjaan07053 pekerjaan = model_pekerjaan.cariObjek(id);
        for(int i=0; i<index; i++){
            if(cari_id.equals(data_pegawai[i].id)){
                data_pegawai[i].gaji = pekerjaan.harga;
                data_pegawai[i].tugas = pekerjaan;
            }
        }
    }
    
    public void delete(String cari_id){
        for(int i=0; i<index; i++){
            if(cari_id.equals(data_pegawai[i].id)){
                for(int j=i; j<index; j++){
                    if(j!=index-1){
                        data_pegawai[j] = data_pegawai[j+1];
                    }
                }
                index--;
            }
        }
    }
    
    public Pegawai07053 cariObjek(String id){
        Pegawai07053 temp = null;
        for(int i=0; i<index; i++){
            if(id.equals(data_pegawai[i].id)){
                temp = data_pegawai[i];
            }
        }
        return temp;
    }
    
}
