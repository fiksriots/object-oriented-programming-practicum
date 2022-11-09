package modul4prakti;

/**
 *
 * @author fikri
 */
public class Singa extends Animal
{
    int kecepatan;
    int hasil;
  
    @Override
    public void input(int kecepatan){
        this.kecepatan = kecepatan;
    }

    
    @Override
    public void hasil(){
        hasil = 10 / this.kecepatan;
        System.out.println("Waktu tempuh Kelinci : "+hasil+" detik");
    }

}
