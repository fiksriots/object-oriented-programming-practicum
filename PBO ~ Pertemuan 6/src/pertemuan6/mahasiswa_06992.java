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
public class mahasiswa_06994 extends manusia_06994{
    String npm_06994;
    String idDosenwali_06994;
    matakuliah_06994 mk_06994;
    
    public mahasiswa_06994(String npm,String nama,String alamat){
        this.npm_06994=npm;
        super.nama_06994=nama;
        super.alamat_06994=alamat;
    }
    void regdosen_06994(String id)
    {
        this.idDosenwali_06994=id;
    }
}
