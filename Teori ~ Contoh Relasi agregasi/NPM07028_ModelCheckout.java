package Model;

import javax.swing.table.DefaultTableModel;

public class NPM07028_ModelCheckout {
    public Model.NPM07028_Checkout[] datacheckout = new Model.NPM07028_Checkout[100];
    public int index = 0;
    
    public void insert(int nocekin, int biayakamar, String nama, String tipekamar, String tanggal){
        datacheckout[index] = new Model.NPM07028_Checkout(nocekin, biayakamar, nama, tipekamar, tanggal);
        index++;
    }
    
    public DefaultTableModel viewTabel(){
        DefaultTableModel modelCheckout = new DefaultTableModel();
        modelCheckout.addColumn("Nama");
        modelCheckout.addColumn("Tipe Kamar");
        modelCheckout.addColumn("No Check In");        
        modelCheckout.addColumn("Biaya Kamar");
        modelCheckout.addColumn("Tanggal");
        
        
        
        for(int i = 0; i<index; i++){
            Object[] temp = new Object[5];
            temp[0] = datacheckout[i].cekin.idcekin;
            temp[1] = datacheckout[i].cekin.tipekamar;
            temp[2] = datacheckout[i].nocekin;
            temp[3] = datacheckout[i].cekin.biayakamar;
            temp[4] = datacheckout[i].cekin.tanggal;
            modelCheckout.addRow(temp);
        }
        return modelCheckout;
    }
    
    public int cariIndexData(int cari){
        boolean ketemu = false;
        int index = 0;
        for(int i = 0; i<index; i++){
            if(cari == datacheckout[i].nocekin){
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
