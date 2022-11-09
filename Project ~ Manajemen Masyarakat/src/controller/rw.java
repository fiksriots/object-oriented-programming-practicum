/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelRT;

/**
 *
 * @author unknown
 */
public class rw extends manusia{
    private int noRw;
    private int indexRw=1;
    public modelRT dataRT = new modelRT();
    public rw(){
        
    }
    public void insertRw(int noRw, String nama, String telp, String alamat){
        this.noRw = noRw;
        this.nama = nama;
        this.telpon = telp;
        this.alamat = alamat;
    }
    public int getNoRw(){
        return noRw;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }

    public void setNoRw(int noRw) {
        this.noRw = noRw;
    }
    public int getIndexRw() {
        return indexRw;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public void setIndexRw(int indexRw) {
        this.indexRw = indexRw;
    }

    
    
}
