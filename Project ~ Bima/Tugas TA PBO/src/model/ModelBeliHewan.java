
package model;

import javax.swing.table.*;

public class ModelBeliHewan {
    private Hewan[] data_pembelian = new Hewan[100];
    private int index = 0;
    
    public void insert(String id, String nama, String umur, int harga_beli, String tgl_beli){
        data_pembelian[index] = new Hewan(id,nama,umur,harga_beli,tgl_beli);
        index++;
    }
    
    public DefaultTableModel viewTabel(){
        DefaultTableModel model_beli_hewan = new DefaultTableModel();
        model_beli_hewan.addColumn("ID Hewan");
        model_beli_hewan.addColumn("Nama Hewan");
        model_beli_hewan.addColumn("Umur Hewan");
        model_beli_hewan.addColumn("Harga Beli");
        model_beli_hewan.addColumn("Tanggal Beli");
        
        for(int i=0; i<index; i++){
            Object[] temp = new Object[5];
            temp[0] = data_pembelian[i].getId();
            temp[1] = data_pembelian[i].getNama();
            temp[2] = data_pembelian[i].getUmur();
            temp[3] = data_pembelian[i].getHargaBeli();
            temp[4] = data_pembelian[i].getTanggalBeli();
            model_beli_hewan.addRow(temp);
        }
        return model_beli_hewan;
    }
    
    public Hewan searchObjek(String nomor){
        Hewan pk = null;
        for(int i=0; i<index; i++){
            if(nomor.equals(data_pembelian[i].getId())){
                pk = data_pembelian[i];
            }
        }
        return pk;
    }
    
    
}
