
package Ta.controller;
import Ta.model.*;
import Ta.controller.*;
import static Ta.controller.Kendaraancontroller.index;
import javax.swing.JOptionPane;
/**
 *
 * @author fikriots
 */
public class Paycontroller 
{
    
    int denda=0,kelebihan=0,indextemu=0;
    Kendaraancontroller modelKendaraan;
    int index2 =AllObject.kendaraan.index;
    boolean ketemu = false;
    Pay pay[] = new Pay[100];
   
    public void insertMatkul(String id, Kendaraancontroller modelKendaraan)
    {
        
    Kendaraan kendaraan = modelKendaraan.cariObjek(id);
    pay[index].kendaraan1 = kendaraan;
    
                 
    }
    
    
    public void pay(String cari)
    {
                int indextemu=0;     
            for (int i = 0; i < AllObject.kendaraan.index; i++) 
            {
                if (cari.equals(AllObject.kendaraan.dataKendaraan[i].getPlat())) 
                {
                    ketemu = true;
                    indextemu=i;
                }
                
            }
            
            if (ketemu == true) {
                
                    //hitung denda kendaraan
                if(AllObject.kendaraan.dataKendaraan[indextemu].getStnk()=="Ada" && (AllObject.kendaraan.dataKendaraan[indextemu].getJenis()=="Mobil" || AllObject.kendaraan.dataKendaraan[indextemu].getJenis()=="Motor"))
                {
                    denda=0;
                }else if(AllObject.kendaraan.dataKendaraan[indextemu].getStnk()=="Tidak ada" && AllObject.kendaraan.dataKendaraan[indextemu].getJenis()=="Mobil")
                {
                    denda=Integer.parseInt(AllObject.harga.dataHarga[0].getDmobil());
                }
                else if(AllObject.kendaraan.dataKendaraan[indextemu].getStnk()=="Tidak ada" && AllObject.kendaraan.dataKendaraan[indextemu].getJenis()=="Motor")
                {
                    denda=Integer.parseInt(AllObject.harga.dataHarga[0].getDmotor());
                }
                //hitung kelebihan jam
                //harga mobil
                if(Integer.parseInt(AllObject.kendaraan.dataKendaraan[indextemu].getJam())<=1 && AllObject.kendaraan.dataKendaraan[indextemu].getJenis()=="Mobil")
                {
                    kelebihan = Integer.parseInt(AllObject.harga.dataHarga[0].getHmobil());
                }
                //harga motor
                else if(Integer.parseInt(AllObject.kendaraan.dataKendaraan[indextemu].getJam())<=1 && AllObject.kendaraan.dataKendaraan[indextemu].getJenis()=="Motor")
                {
                    kelebihan = Integer.parseInt(AllObject.harga.dataHarga[0].getHmotor());
                }
                //kelebihan Mobil
                else if(Integer.parseInt(AllObject.kendaraan.dataKendaraan[indextemu].getJam())>1 && AllObject.kendaraan.dataKendaraan[indextemu].getJenis()=="Mobil")
                {
                    kelebihan = Integer.parseInt(AllObject.harga.dataHarga[0].getHmobil()) + (Integer.parseInt(AllObject.harga.dataHarga[0].getKmobil()) * (Integer.parseInt(AllObject.kendaraan.dataKendaraan[indextemu].getJam())-1));
                }
                //kelebihan Motor
                else if(Integer.parseInt(AllObject.kendaraan.dataKendaraan[indextemu].getJam())>1 && AllObject.kendaraan.dataKendaraan[indextemu].getJenis()=="Motor")
                {
                    kelebihan = Integer.parseInt(AllObject.harga.dataHarga[0].getHmotor()) + (Integer.parseInt(AllObject.harga.dataHarga[0].getKmotor()) * (Integer.parseInt(AllObject.kendaraan.dataKendaraan[indextemu].getJam())-1));
                }
                JOptionPane.showMessageDialog(null,"Nomor Parkir: "+AllObject.kendaraan.dataKendaraan[indextemu].getNomor()+
                "\nPlat Nomor: "+AllObject.kendaraan.dataKendaraan[indextemu].getPlat()+
                "\nJenis Kendaraan: "+AllObject.kendaraan.dataKendaraan[indextemu].getJenis()+
                "\nSTNK: "+AllObject.kendaraan.dataKendaraan[indextemu].getStnk()+
                "\nLama Penitipan: "+AllObject.kendaraan.dataKendaraan[indextemu].getJam()+
                "\nTotal Biaya : "+(denda+kelebihan));
                 
                int hapus = AllObject.kendaraan.dataKendaraan[indextemu].getNomor();
                int index_ketemu = AllObject.kendaraan.cariIndexData(hapus);
                int getNocekin = AllObject.kendaraan.dataKendaraan[indextemu].getNomor();
                for (int i = index_ketemu; i < AllObject.kendaraan.index; i++) 
                {
                    if (getNocekin == AllObject.kendaraan.dataKendaraan[i].nomor) 
                    {
                        ketemu = true;
                        for (int j = i; j < AllObject.kendaraan.index; j++) 
                        {
                            if (j != AllObject.kendaraan.index - 1) 
                            {
                                AllObject.kendaraan.dataKendaraan[j].nomor= AllObject.kendaraan.dataKendaraan[j + 1].nomor;
                                AllObject.kendaraan.dataKendaraan[j].plat = AllObject.kendaraan.dataKendaraan[j + 1].plat;
                                AllObject.kendaraan.dataKendaraan[j].jenis = AllObject.kendaraan.dataKendaraan[j + 1].jenis;
                                AllObject.kendaraan.dataKendaraan[j].stnk = AllObject.kendaraan.dataKendaraan[j + 1].stnk;
                                AllObject.kendaraan.dataKendaraan[j].jam = AllObject.kendaraan.dataKendaraan[j + 1].jam;
                                
                            }
                        }
                        AllObject.kendaraan.index--;
                        //tabel_checkout.setModel(NPM07028_AllObject.datacheckout.viewTabel());
                    }
                }}
                else if(!ketemu){
                    JOptionPane.showMessageDialog(null, "Plat nomor tidak ketemu");
                }
    }}
    

    
