package npm06994pendahuluanmodul4;
public class Pelanggan extends Manusia{
    private int id;
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    @Override
    public void print(){
        System.out.println("Id Pegawai : "+this.getId());
        System.out.println("Nama : "+this.getNama());
        System.out.println("No Hp : "+this.getNoHp());
    }
}
