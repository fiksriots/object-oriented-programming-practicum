/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author mboen
 */
public class modelDosen_06994 {
    dosen_06994 [] dsn_06994=new dosen_06994[100];
    int index=0;
    
    void insert_06994(String nip,String nama,String alamat)
    {
        dsn_06994[index]=new dosen_06994(nip,nama,alamat);
        index=index+1;
    }
    
    String cariId_06994(String id)
    {
        String idketemu="";
        for (int a=0;a<index;a++)
        {
            if (id.equals(dsn_06994[a].nip_06994))
            {
                idketemu=dsn_06994[a].nip_06994;
            }
        }
        return idketemu;
    }
}
