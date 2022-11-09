
package Ta.controller;

import javax.swing.table.DefaultTableModel;
import Ta.model.*;
import javax.swing.JOptionPane;
public class Kendaraancontroller 
{
   public Kendaraan[] dataKendaraan = new Kendaraan[100];
   
    //public Kasir kasir;
    public static int index = 0;
    
    public void insert(int nomor, String plat,String jenis, String stnk, String jam) {
        
        
        dataKendaraan[index] = new Kendaraan( nomor, plat,jenis, stnk, jam);
        index++;
        
    }
    
    public DefaultTableModel viewTable1(){
        DefaultTableModel tabelvoucher=new DefaultTableModel();
        tabelvoucher.addColumn("Nomor Parkir ");
        tabelvoucher.addColumn("Plat Nomor");
        tabelvoucher.addColumn("Jenis Kendaraan");
        tabelvoucher.addColumn("STNK");
        tabelvoucher.addColumn("Lama Penitipan");
        
        for(int i=0; i<index; i++){
            Object[] temp1=new Object[5];
            temp1[0]=dataKendaraan[i].getNomor();
            temp1[1]=dataKendaraan[i].getPlat();
            temp1[2]=dataKendaraan[i].getJenis();
            temp1[3]=dataKendaraan[i].getStnk();
            temp1[4]=dataKendaraan[i].getJam();
            tabelvoucher.addRow(temp1);
        }
        return tabelvoucher;
    } 
    public Kendaraan cariObjek(String cari)
    {
        Kendaraan temp=null;
        for(int i =0;i<index;i++)
        {
            if(cari == dataKendaraan[i].plat)
                {
                    temp = dataKendaraan[i];
                }
    }
    return temp;
    }
    public int cariIndexData(int cari)
    {
        boolean ketemu = false;
        int index = 0;
        for(int i = 0; i<index; i++){
            if(cari == dataKendaraan[i].nomor){
                ketemu = true;
                index = i;
            }
            else if(ketemu == false && i == this.index - 1){
                index = -1;
            }
        }
        return index;
    }
    
    }
