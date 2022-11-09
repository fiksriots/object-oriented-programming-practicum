package Ta.controller;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Ta.model.Harga;
import javax.swing.table.DefaultTableModel;
public class Hargacontroller implements Hargain{
    public Harga[] dataHarga =new Harga[1];
    int index=0;
    
    @Override
    public void insert(String harga, String harga1,String kel,String kel1,String Den,String Den1){
        dataHarga[0]=new Harga(harga,harga1,kel,kel1,Den,Den1);
    }
    @Override
    public void insert()
    {
        dataHarga[0].getDmobil();
        dataHarga[0].getDmotor();
        dataHarga[0].getHmobil();
        dataHarga[0].getHmotor();
        dataHarga[0].getKmobil();
        dataHarga[0].getKmotor();
    }
    @Override
     public void update(String harga, String harga1,String kel,String kel1,String Den,String Den1){
        dataHarga[0]=new Harga(harga,harga1,kel,kel1,Den,Den1);
    }
    
}
