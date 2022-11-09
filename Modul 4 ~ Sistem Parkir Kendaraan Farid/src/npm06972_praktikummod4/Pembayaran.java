/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06972_praktikummod4;


public  class Pembayaran extends Parkir {
    private int biaya;
    private int karcishilang;
    //public int 

    public Pembayaran(String tanggal,int waktu,String plat,String stnk,int biaya) {
        this.biaya = biaya;
        //this.karcishilang = karcishilang;
        super.plat=plat;
        super.stnk=stnk;
        super.tanggal=tanggal;
        super.waktu=waktu;
    }



    public  int getKarcishilang() {
        return karcishilang;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public int getBiaya() {
    biaya=5000*getWaktu();
        return biaya;
    }
    
    public int getBiaya(int denda){
        biaya+=denda;
        return biaya;
    }

    public int getWaktu() {
        return waktu;
    }

    public String getPlat() {
        return plat;
    }

    public String getStnk() {
        return stnk;
    }
    

}
