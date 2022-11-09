/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ta.model;
import Ta.controller.*;
/**
 *
 * @author rifai
 */
public class Pay {
    public Kendaraan kendaraan1;
    public String platNomor;
    public Pay (String plat)
    {
        this.kendaraan1=AllObject.kendaraan.cariObjek(plat);
        this.platNomor =kendaraan1.plat;
    }
    public String getPlat()
    {
        return kendaraan1.plat;
    }
}
