package npm06994soalpendahuluan1_8;
class lingkaran
{
    double diameter;
    double pi=3.14;
    void setDiameter(double dm){
        this.diameter=dm;
    }
    void keliling(){
        double kll=diameter*pi;
        System.out.println("keliling Lingkaran adalah "+kll);
    }
    double luas(){
        double luas=pi*(diameter/2)*(diameter/2);
        return luas;
    }
}
public class NPM06994soalPendahuluan1_8 {

    public static void main(String[] args) {
        
        lingkaran bulet=new lingkaran();
        double diameter=10;
        bulet.setDiameter(diameter);
        bulet.keliling();
        double LUAS=bulet.luas();
        System.out.println("luas lingkaran adalah "+LUAS);
    }
    
}