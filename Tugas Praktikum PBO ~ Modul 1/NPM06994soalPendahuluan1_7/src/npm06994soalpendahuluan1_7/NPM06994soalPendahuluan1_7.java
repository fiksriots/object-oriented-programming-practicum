package npm06994soalpendahuluan1_7;
class lingkaran
    {
    double diameter;//atribut
    double pi=3.14;
    public lingkaran(double dm)
    {
        this.diameter=dm;
        
    }
    void keliling()
    {
        double kil=diameter*pi;
        System.out.println("keliling lingkaran adalah "+kil);    
    }
    double luas()
    {
        double luas=pi*(diameter/2)*(diameter/2);
        return luas;
    }
}
public class NPM06994soalPendahuluan1_7 
{
    public static void main(String[] args) 
    {
        double diameter=10;
        lingkaran bulet=new lingkaran(diameter);
        bulet.keliling();
        double LUAS=bulet.luas();
        System.out.println("Luas lingkaran adalah "+LUAS);
    }
    
}
