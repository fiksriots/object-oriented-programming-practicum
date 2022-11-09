/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.rw;
import controller.abstrackModelRW;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author unknown
 */
public class modelRW extends abstrackModelRW{
    public rw[] rw = new rw[100];
    //int indexRt =0;
    int indexRw = 1;
    int angka =1;
    
    
   
    
    
    @Override
    public void insertRW(String nama, String telp, String alamat){
        rw RW = new rw();
        RW.insertRw(indexRw, nama, telp, alamat);
        rw[indexRw] = RW;
        indexRw++;
        rw[1].setIndexRw(indexRw);
    }
    
    @Override
    public rw cariRW(int cari){
        rw temp = rw[cari];
        return temp;
    }
    
    @Override
    public void update(int cari,String nama,String alamat,String telp){
            rw[cari].setNama(nama);
            rw[cari].setAlamat(alamat);
            rw[cari].setTelpon(telp);
    }
    
    @Override
    public DefaultTableModel viewTabel(){
        DefaultTableModel modelRW = new DefaultTableModel();
        modelRW.addColumn(" RW");
        modelRW.addColumn(" Ketua RW");
        modelRW.addColumn(" No Hp");
        modelRW.addColumn(" Alamat");
        
        for(int i=1 ;i<indexRw;i++){
            Object data[] = new Object[4];
            data[0] = rw[i].getNoRw();
            data[1] = rw[i].getNama();
            data[2] = rw[i].getTelpon();
            data[3] = rw[i].getAlamat();
            modelRW.addRow(data);
        }
        return modelRW;
    }
    
    }

