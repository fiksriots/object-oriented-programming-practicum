package Pengguna;
public class Pelanggan extends Manusia{
    private int id, noHp;
    private String nama;
    
    @Override
    public void setNama(String nama){
        this.nama=nama;
    }
    @Override
    public String getNama(){
        return nama;
    }    
    @Override
    public void setNoHp(int noHp){
        this.noHp=noHp;
    }
    @Override
    protected int getNoHp(){
        return noHp;
    }
    @Override
    public void print(){
        for(int i=getId();i<=getId();i++){
            System.out.print(i+".");
        }
        System.out.println("Nama : "+this.getNama());
        System.out.println("No Hp : "+this.getNoHp());
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
