/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ta.model;

/**
 *
 * @author rifai
 */
public class Harga {
    private  String Hmobil;
    private  String Hmotor;
    private  String Kmobil;
    private  String Kmotor;
    private  String Dmobil;
    private  String Dmotor;
    
   
   
    public Harga(String harga, String harga1,String kel,String kel1,String Den,String Den1) {
        this.Hmobil=harga;
        this.Hmotor=harga1;
        this.Kmobil=kel;
        this.Kmotor=kel1;
        this.Dmobil=Den;
        this.Dmotor=Den1;
    }
    public String getHmobil() {
        return Hmobil;
    }

    public String getHmotor() {
        return Hmotor;
    }
    public String getKmobil() {
        return Kmobil;
    }

    public String getKmotor() {
        return Kmotor;
    }

    public String getDmobil() {
        return Dmobil;
    }
    public String getDmotor() {
        return Dmotor;
    }
}
