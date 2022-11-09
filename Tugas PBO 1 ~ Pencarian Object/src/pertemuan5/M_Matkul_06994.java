
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author Fikri
 */
public class M_Matkul_06994 {

    Matkul_06994[] mk = new Matkul_06994[100];
    Scanner input = new Scanner(System.in);
    int index = 0;
    String cari;

    public void insertMatkul(String kode, String nama, int sks) {
        mk[index] = new Matkul_06994(kode, nama, sks);
        System.out.print("Masukkan Kode : ");
        kode = input.next();
        System.out.print("Masukkan Nama : ");
        nama = input.next();
        System.out.print("Masukkan SKS : ");
        sks = input.nextInt();
        mk[index].kode = kode;
        mk[index].nama = nama;
        mk[index].sks = sks;
        index++;
    }

    public void updateMatkul(String kode, String nama, int sks) {
        int i = 0;
        System.out.print("Input Kode matkul yang akan di update : ");
        cari = input.next();
        while (mk[i].kode != cari) {
            if (mk[i].kode.equals(cari)) {
                System.out.print("Masukkan Kode : ");
                kode = input.next();
                System.out.print("Masukkan Nama : ");
                nama = input.next();
                System.out.print("Masukkan SKS : ");
                sks = input.nextInt();
                mk[i].kode = kode;
                mk[i].nama = nama;
                mk[i].sks = sks;
                break;
            }
            i++;
        }
    }

    public void deleteMatkul() {
        int i = 0;
        System.out.print("Input kode matkul yang akan di hapus : ");
        cari = input.next();
        while (mk[i].kode != cari) {
            if (mk[i].kode.equals(cari)) {
                mk[i].kode = null;
                mk[i].nama = null;
                mk[i].sks = 0;
                index = index - 1;
                break;
            }
            i++;
        }
    }

    public void viewMatkul() {
        for (int i = 0; i < index; i++) {
            System.out.println("Kode matkul : " + mk[i].kode);
            System.out.println("Nama matkul : " + mk[i].nama);
            System.out.println("SKS : " + mk[i].sks);
        }
    }

    public Matkul_06994 cariObject(String idMK) {
        Matkul_06994 tempMatkul = null;
        for (int i = 0; i <= index; i++) {
            if (idMK.equals(mk[i].kode)) {
                String a = mk[i].kode;
                String b = mk[i].nama;
                int c = mk[i].sks;
                tempMatkul = new Matkul_06994(a, b, c);
            }
        }
        return tempMatkul;
    }

}
