/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.rt;
import controller.warga;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author unknown
 */
public class modelWarga {
    warga[] warga = new warga[100];
    private int index = 1;
        
    public void insert(int noRw,int noRt, String nama, String telp, String alamat){
        rt temp;
        temp = allObject.dataRt.cariRt(noRw, noRt);
        if(temp!=null){
        warga[index] = new warga(noRw,noRt,nama, telp, alamat);
        index++;
     }else{
            JOptionPane.showMessageDialog(null, " RW / RT Tidak ditemukan");
        }
    } 
    public void delete(int rw, int rt, String cari){
        for(int i = 1; i<index;i++){
            if (warga[i].getNoRw()==rw && warga[i].getNoRt()==rt && warga[i].getNama().equals(cari)){
                if(i<=index-2){
                for(int j=i;j<index;j++){
                    warga[j].setNama(warga[j+1].getNama());
                    warga[j].setAlamat(warga[j+1].getAlamat());
                    warga[j].setTelpon(warga[j+1].getTelp());
                }}
                else{
                for(int j=i;j<index;j++){
                    warga[j].setNama(null);
                    warga[j].setAlamat(null);
                    warga[j].setTelpon(null);
                }    
                }
                index--;
            }
        }
    }
    public DefaultTableModel viewTableWarga(){
    DefaultTableModel modelRT = new DefaultTableModel();
    modelRT.addColumn(" RW");
    modelRT.addColumn(" RT");
    modelRT.addColumn(" Nama");
    modelRT.addColumn(" No Hp");
    modelRT.addColumn(" Alamat");
    for(int i = 1;i<index;i++){
    Object dataWarga[] = new Object[5];
    dataWarga[0] = warga[i].getNoRw();
    dataWarga[1] = warga[i].getNoRt();
    dataWarga[2] = warga[i].getNama();
    dataWarga[3] = warga[i].getTelpon();
    dataWarga[4] = warga[i].getAlamat();
    modelRT.addRow(dataWarga);
    }
    return modelRT;
    }
    
    public void sort(){
        warga temp;
        for(int i=1;i<index;i++){
            for(int j=i;j<index;j++){
            if(warga[i].getNoRw()>=warga[j].getNoRw() && warga[i].getNoRt()>warga[j].getNoRt()){
                temp = warga[i];
                warga[i] = warga[j];
                warga[j] = temp;
            }
            }
        }
    }
    
}
