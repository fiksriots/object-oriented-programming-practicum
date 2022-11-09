/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.allObject;

/**
 *
 * @author unknown
 */
public class warga extends manusia {
    private rt rt;
    
    public warga( int noRw, int noRt,String nama, String telp, String alamat){

        this.nama = nama;
        this.telpon = telp;
        this.alamat = alamat;
        this.rt = allObject.dataRt.cariRt(noRw, noRt);
    }
    
    public warga( ){

        this.nama = " ";
        this.telpon = " ";
        this.alamat = " ";
        
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

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNoRw() {
        return rt.getNoRW();
    }

    public int getNoRt() {
        return rt.getNoRt();
    }

    
}
