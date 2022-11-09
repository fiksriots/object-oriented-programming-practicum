
package Ta.model;

public class Kendaraan extends induk
{
    
    
    public int index = 0;
    public Kendaraan[] Modelkendaraan = new Kendaraan[10];
    
    

    public Kendaraan() {

    }

    public Kendaraan(int nomor, String plat,String jenis, String stnk, String jam) {
       // this.kasir = AllObject.kasir1.cariObjek(AllObject.nama);
        this.nomor = nomor;
        this.plat = plat;
        this.jenis = jenis;
        this.stnk = stnk;
        this.jam = jam;
    }

    @Override
    public int getNomor() {
        return nomor;
    }

    @Override
    public String getPlat() {
        return plat;
    }
    @Override
    public String getJenis() {
        return jenis;
    }

    @Override
    public String getStnk() {
        return stnk;
    }

    @Override
    public String getJam() {
        return jam;
    }
}
