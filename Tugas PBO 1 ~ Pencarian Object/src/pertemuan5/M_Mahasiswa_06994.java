
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author Fikri
 */
public class M_Mahasiswa_06994 {

    Mahasiswa_06994[] mhs = new Mahasiswa_06994[100];
    Matkul_06994[] matkul = new Matkul_06994[100];
    Scanner input = new Scanner(System.in);
    int index = 0;
    String cari;
    String kode;

    void insertMHS(String npm, String nama, String alamat, String telepon, String nip) {
        mhs[index] = new Mahasiswa_06994(npm, nama, alamat, telepon);
        System.out.print("Masukkan NPM : ");
        npm = input.next();
        System.out.print("Masukkan Nama : ");
        nama = input.next();
        System.out.print("Masukkan Alamat : ");
        alamat = input.next();
        System.out.print("Masukkan Telepon : ");
        telepon = input.next();
        System.out.print("Masukkan Kode Matkul : ");
        kode = input.next();
        System.out.print("Masukkan NIP Dosen : ");
        nip = input.next();
        mhs[index].npm_06994 = npm;
        mhs[index].nama_06994 = nama;
        mhs[index].alamat_06994 = alamat;
        mhs[index].telepon_06994 = telepon;
        mhs[index].kode_06994 = kode;
        mhs[index].id_dosen_06994 = nip;

    }

    public void updateMHS(String npm, String nama, String alamat, String telepon, String nip) {
        int i = 0;
        System.out.print("Input NPM Mahasiswa yang akan di update : ");
        cari = input.next();
        while (mhs[i].npm_06994 != cari) {
            if (mhs[i].npm_06994 == cari) {
                System.out.print("Masukkan NPM : ");
                npm = input.next();
                System.out.print("Masukkan Nama : ");
                nama = input.next();
                System.out.print("Masukkan Alamat : ");
                alamat = input.next();
                System.out.print("Masukkan Telepon : ");
                telepon = input.next();
                System.out.print("Masukkan NIP Dosen : ");
                nip = input.next();
                mhs[index].npm_06994 = npm;
                mhs[index].nama_06994 = nama;
                mhs[index].alamat_06994 = alamat;
                mhs[index].telepon_06994 = telepon;
                mhs[index].id_dosen_06994 = nip;
            }
            i++;
        }
    }

    public void deleteMHS(String kode) {
        int i = 0;
        System.out.print("Input NPM Mahasiswa yang akan di hapus : ");
        cari = input.next();
        while (mhs[i].npm_06994 != cari) {
            if (mhs[i].npm_06994 == cari) {
                do {
                    mhs[i].npm_06994 = mhs[i + 1].npm_06994;
                    mhs[i].nama_06994 = mhs[i + 1].nama_06994;
                    mhs[i].alamat_06994 = mhs[i + 1].alamat_06994;
                    mhs[i].telepon_06994 = mhs[i + 1].telepon_06994;
                    mhs[i].kode_06994 = mhs[i + 1].kode_06994;
                    mhs[i].id_dosen_06994 = mhs[i + 1].id_dosen_06994;
                } while (i != index);
                index = index - 1;
                break;
            }
            i++;
        }
    }

    String ambilObject() {
        M_Matkul_06994 mk = new M_Matkul_06994();
        mk.cariObject(kode);
        String temp = mk.mk[index].nama;
        return temp;
    }

    public void viewMHS() {
        for (int i = 0; i <= index; i++) {
            System.out.println("NPM : " + mhs[i].npm_06994);
            System.out.println("Nama : " + mhs[i].nama_06994);
            System.out.println("Alamat : " + mhs[i].alamat_06994);
            System.out.println("Telepon : " + mhs[i].telepon_06994);
            System.out.println("Matkul : " + ambilObject());
            System.out.println("Dosen Wali : " + mhs[i].id_dosen_06994);
        }
    }

}
