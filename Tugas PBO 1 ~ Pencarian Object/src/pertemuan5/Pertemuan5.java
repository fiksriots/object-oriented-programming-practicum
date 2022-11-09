
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author Fikri
 */
public class Pertemuan5 
{
    public static void main(String[] args) 
    {
        //Dosen dsn = new Dosen("Kurniawan", "153045", "Surabaya","08");
        //Mahasiswa mhs = new Mahasiswa("Andy", "167000", "Surabaya", "08");
        //mhs.reg_dosen(dsn.nip);
        //mhs.cetakMHS();
        //System.out.println();
        //dsn.cetakDSN();
        Scanner input = new Scanner(System.in);
        int pil_menu;
        M_Mahasiswa_06994 mhs = new M_Mahasiswa_06994();
        M_Dosen_06994 dsn = new M_Dosen_06994();
        M_Matkul_06994 matkul = new M_Matkul_06994();
        char ulang;
        int pil_menuMHS;
        char ulangMHS;
        int pil_menuDSN;
        char ulangDSN;
        int pil_menuMatkul;
        char ulangMatkul;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Dosen");
            System.out.println("3. Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Input Menu : ");
            pil_menu = input.nextInt();
            if (pil_menu == 1) {
                do {
                    System.out.println("=== Menu Mahasiswa ===");
                    System.out.println("1. Tambah Mahasiswa");
                    System.out.println("2. Update Mahasiswa");
                    System.out.println("3. Hapus Mahasiswa");
                    System.out.println("4. Lihat Mahasiswa");
                    System.out.println("5. Keluar");
                    System.out.print("Input Menu : ");
                    pil_menuMHS = input.nextInt();
                    switch (pil_menuMHS) {
                        case 1:
                            mhs.insertMHS(" ", " ", " ", " ", " ");
                            break;
                        case 2:
                            mhs.updateMHS(" ", " ", " ", " ", " ");
                            break;
                        case 3:
                            mhs.deleteMHS(" ");
                            break;
                        case 4:
                            mhs.viewMHS();
                            break;
                    }
                } while (pil_menuMHS != 5);
            } else if (pil_menu == 2) {
                do {
                    System.out.println("=== Menu Dosen ===");
                    System.out.println("1. Tambah Dosen");
                    System.out.println("2. Update Dosen");
                    System.out.println("3. Hapus Dosen");
                    System.out.println("4. Lihat Dosen");
                    System.out.println("5. Keluar");
                    System.out.print("Input Menu : ");
                    pil_menuDSN = input.nextInt();
                    switch (pil_menuDSN) {
                        case 1:
                            dsn.insertDosen(" ", " ", " ", " ");
                            break;
                        case 2:
                            dsn.updateDSN(" ", " ", " ", " ");
                            break;
                        case 3:
                            dsn.deleteDSN();
                            break;
                        case 4:
                            dsn.viewDSN();
                            break;
                    }
                } while (pil_menuDSN != 5);
            } else if (pil_menu == 3) {
                do {
                    System.out.println("=== Menu Mata Kuliah ===");
                    System.out.println("1. Tambah Mata Kuliah");
                    System.out.println("2. Update Mata Kuliah");
                    System.out.println("3. Hapus Mata Kuliah");
                    System.out.println("4. Lihat Mata Kuliah");
                    System.out.println("5. Keluar");
                    System.out.print("Input Menu : ");
                    pil_menuMatkul = input.nextInt();
                    switch (pil_menuMatkul) {
                        case 1:
                            matkul.insertMatkul(" ", " ", 0);
                            break;
                        case 2:
                            matkul.updateMatkul(" ", " ", 0);
                            break;
                        case 3:
                            matkul.deleteMatkul();
                            break;
                        case 4:
                            matkul.viewMatkul();
                            break;
                    }
                } while (pil_menuMatkul != 5);
            }
        } while (pil_menu != 4);
    }
}
