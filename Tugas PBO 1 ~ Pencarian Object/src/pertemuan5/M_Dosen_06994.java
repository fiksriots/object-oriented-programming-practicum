
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author Fikri
 */
public class M_Dosen_06994 {

    Scanner input = new Scanner(System.in);
    Dosen_06994[] dsn = new Dosen_06994[100];
    int index = 0;
    String cari;

    void insertDosen(String nip, String nama, String alamat, String telepon) {
        dsn[index] = new Dosen_06994(nip, nama, alamat, telepon);
        System.out.print("Masukkan NIP : ");
        nip = input.next();
        System.out.print("Masukkan Nama : ");
        nama = input.next();
        System.out.print("Masukkan Alamat : ");
        alamat = input.next();
        System.out.print("Masukkan Telepon : ");
        telepon = input.next();
        dsn[index].nip_06994 = nip;
        dsn[index].nama_06994 = nama;
        dsn[index].alamat_06994 = alamat;
        dsn[index].telepon_06994 = telepon;
        index++;
    }

    public void updateDSN(String nip, String nama, String alamat, String telepon) {
        int i = 0;
        System.out.print("Input NIP Dosen yang akan di update : ");
        cari = input.next();
        while (dsn[i].nip_06994 != cari) {
            if (dsn[i].nip_06994.equals(cari)) {
                System.out.print("Masukkan NIP : ");
                nip = input.next();
                System.out.print("Masukkan Nama : ");
                nama = input.next();
                System.out.print("Masukkan Alamat : ");
                alamat = input.next();
                System.out.print("Masukkan Telepon : ");
                telepon = input.next();
                dsn[index].nip_06994 = nip;
                dsn[index].nama_06994 = nama;
                dsn[index].alamat_06994 = alamat;
                dsn[index].telepon_06994 = telepon;
                break;
            }
            i++;
        }
    }

    public void deleteDSN() {
        int i = 0;
        System.out.print("Input NIP Dosen yang akan di hapus : ");
        cari = input.next();
        while (dsn[i].nip_06994 != cari) {
            if (dsn[i].nip_06994.equals(cari)) {
                dsn[i].nip_06994 = null;
                dsn[i].nama_06994 = null;
                dsn[i].alamat_06994 = null;
                dsn[i].telepon_06994 = null;
                index = index - 1;
                break;
            }
            i++;
        }
    }

    public void viewDSN() {
        for (int i = 0; i < index; i++) {
            System.out.println("NIP : " + dsn[i].nip_06994);
            System.out.println("Nama : " + dsn[i].nama_06994);
            System.out.println("Alamat : " + dsn[i].alamat_06994);
            System.out.println("Telepon : " + dsn[i].telepon_06994);
        }
    }
}
