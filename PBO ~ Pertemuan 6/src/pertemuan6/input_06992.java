/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;
import java.util.Scanner;
/**
 *
 * @author mboen
 */
public class input_06994 {
    Scanner in=new Scanner(System.in);
    modelMahasiswa_06994 mhs_06994=new modelMahasiswa_06994();
    modelMatakuliah_06994 mtk_06994=new modelMatakuliah_06994();
    modelDosen_06994 dsn_06994=new modelDosen_06994();
    public void menu(){
        mhs_06994.menu_06994();
    }
    public void inputmhs_06994(){
        System.out.print("input npm = ");
        String npm=in.next();
        System.out.print("input nama = ");
        String nama=in.next();
        System.out.print("input alamat = ");
        String alamat=in.next();
        mhs_06994.insertData_06994(npm, nama, alamat);
    }
    public void updatemhs_06994(){
        System.out.print("cari npm = ");
        String cari=in.next();
        System.out.print("input npm = ");
        String npm=in.next();
        System.out.print("input nama = ");
        String nama=in.next();
        System.out.print("input alamat = ");
        String alamat=in.next();
        mhs_06994.update(cari, npm, nama, alamat);
    }
    public void deletemhs(){
        System.out.print("npm mahasiswa yang di delete = ");
        String del=in.next();
        mhs_06994.delete_06994(del);
    }
    public void viewmhs(){
        mhs_06994.cetak_06994();
    }
    public void inputmtk_06994(){
        System.out.print("input kode = ");
        String kode=in.next();
        System.out.print("input nama = ");
        String nama=in.next();
        System.out.print("input sks = ");
        int sks=in.nextInt();
        mtk_06994.insert_06994(kode, nama, sks);
    }
    public void updatemtk_06994(){
        System.out.print("cari kode = ");
        String cari=in.next();
        System.out.print("input kode = ");
        String kode=in.next();
        System.out.print("input nama = ");
        String nama=in.next();
        System.out.print("input alamat = ");
        int sks=in.nextInt();
        mtk_06994.update_06994(cari, kode, nama, sks);
    }
    public void deletemmtk(){
        System.out.print("kode matkul yang di delete = ");
        String del=in.next();
        mtk_06994.delete_06994(del);
    }
    public void viewmtk(){
        mtk_06994.cetak();
    }
    public void inputdsn_06994(){
        System.out.println("input nip = ");
        String nip=in.next();
        System.out.print("input nama = ");
        String nama=in.next();
        System.out.print("input alamat = ");
        String alamat=in.next();
        dsn_06994.insert_06994(nip, nama, alamat);
        
    }
    public void cariId_06994(){
        System.out.print("cari kode = ");
        String cari=in.next();
        dsn_06994.cariId_06994(cari);
    }
}
