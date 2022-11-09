/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.allObject;

public class rt extends manusia{
    private int noRt = 1;
    private int indexRT = 0;
    //public modelWarga dataWarga = new modelWarga();
    private rw rw;
    

    public rt() {
        }
    
    public void insertRt(int noRw,int noRt,String namaa, String telp, String almt){
    this.noRt=noRt;
    this.nama = namaa;
    this.telpon = telp;
    this.alamat = almt;
    rw = allObject.dataRw.cariRW(noRw);
    }
    public int getNoRt(){
        return noRt;
    }
    public String getNama(){
        return nama;
    }
    public String getTelp(){
        return telpon;
    }
    public String getAlamat(){
        return alamat;
    }
    public int getNoRW() {
        return rw.getNoRw();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public int getIndexRT() {
        return indexRT;
    }

    public void setIndexRT(int indexRT) {
        this.indexRT = indexRT;
    }

    
}
