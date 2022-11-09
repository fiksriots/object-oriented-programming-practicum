package Model;

import Model.NPM07028_Checkin;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NPM07028_ModelCheckin {
    public NPM07028_Checkin[] datacheckin = new NPM07028_Checkin[100];
    private int index = 0;
    
    public int getIndex(){
        return index;
    }
    
    public void insert(int nocekin, String idcekin, String tipekamar, int biayakamar, String tanggal){
        datacheckin[index] = new NPM07028_Checkin(nocekin, idcekin, tipekamar, biayakamar, tanggal);
        index++;
    }
    
    public DefaultTableModel viewTabel(){
        DefaultTableModel modelCheckin = new DefaultTableModel();
        modelCheckin.addColumn("No Check In");
        modelCheckin.addColumn("Id Pelanggan");
        modelCheckin.addColumn("Tipe Kamar");
        modelCheckin.addColumn("Biaya Kamar");
        modelCheckin.addColumn("Tanggal");
        
        
        for(int i = 0; i<index; i++){
            Object[] temp = new Object[5];
            temp[0] = datacheckin[i].nocekin;
            temp[1] = datacheckin[i].idcekin;
            temp[2] = datacheckin[i].tipekamar;
            temp[3] = datacheckin[i].biayakamar;
            temp[4] = datacheckin[i].tanggal;
            modelCheckin.addRow(temp);
        }
        return modelCheckin;
    }
    
    public NPM07028_Checkin cariObjek(int nocekin){
        NPM07028_Checkin temp = null;
        for(int i = 0; i<index; i++){
            if(nocekin == (datacheckin[i].nocekin)){
                temp = datacheckin[i];
            }
        }
        return temp;
    }
}
