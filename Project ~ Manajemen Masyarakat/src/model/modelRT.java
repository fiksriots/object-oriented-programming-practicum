/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.rt;
import controller.rw;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author unknown
 */
public class modelRT {
    public rt[] rt = new rt[100];
    private int index=1;
    private int[] indexRt = new int[100];
    //private int Rw;
    
    public void insert(int noRw,int noRt,String nama, String telp, String alamat){
        boolean cek = false;
        for(int i=1;i<index;i++){
        if(rt[i].getNoRW()==noRw && rt[i].getNoRt()==noRt){
             cek = true;
         }}
        if(cek==false){
            rw temp;
            temp = allObject.dataRw.cariRW(noRw);
                if(temp!=null){
                    rt RT = new rt();
                    RT.insertRt(noRw,noRt, nama, telp, alamat);
                    rt[index] = RT;
                    index++;
                }else{
                    JOptionPane.showMessageDialog(null, " RW tidak di temukan");
                }
        }else{
            JOptionPane.showMessageDialog(null, " data sudah ada");
        }
    }
    public void update(int noRw,int noRt,String nama,String alamat,String telp){
        boolean cek = false;
        for(int i=1;i<index;i++){
            if(rt[i].getNoRW()==noRw && rt[i].getNoRt()==noRt){
            rt[i].setNama(nama);
            rt[i].setAlamat(alamat);
            rt[i].setTelpon(telp);
            cek = true;
        }}
        if(cek == false){
            JOptionPane.showMessageDialog(null, "RW / RT tidak di temukan");
        }
    }
    public int getindex(){
        return index;
    }
    public DefaultTableModel viewTableRt(){
        DefaultTableModel modelRT = new DefaultTableModel();
        modelRT.addColumn(" RW");
        modelRT.addColumn(" RT");
        modelRT.addColumn(" Ketua RT");
        modelRT.addColumn(" No Hp");
        modelRT.addColumn(" Alamat");
        for(int i = 1;i<index;i++){
            Object dataRt[] = new Object[5];
            dataRt[0] = rt[i].getNoRW();
            dataRt[1] = rt[i].getNoRt();
            dataRt[2] = rt[i].getNama();
            dataRt[3] = rt[i].getTelp();
            dataRt[4] = rt[i].getAlamat();
            modelRT.addRow(dataRt);
        }
        return modelRT;
    }
     
    public void sort(){
        rt temp;
        for(int i=1;i<index;i++){
            for(int j=i;j<index;j++){
            if(rt[i].getNoRW()>=rt[j].getNoRW()&&rt[i].getNoRt()>rt[j].getNoRt()){
                temp = rt[i];
                rt[i] = rt[j];
                rt[j] = temp;
            }
            }
        }
    }    

    public rt cariRt(int Rw, int Rt){
        rt temp = null;
        for(int i=1;i<index;i++){
            if(rt[i].getNoRW()==Rw && rt[i].getNoRt()==Rt){
                temp = rt[i];
            }
        }
        return temp;
    }
    
    }
    

