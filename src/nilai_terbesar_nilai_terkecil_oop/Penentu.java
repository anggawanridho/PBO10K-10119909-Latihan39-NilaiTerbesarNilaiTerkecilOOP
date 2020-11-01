package nilai_terbesar_nilai_terkecil_oop;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Penentu {
    Scanner scanner = new Scanner(System.in);
    private int i, banyak_mahasiswa, terbesar, terkecil;
    String petugas;


    public String namaPetugas() {
        System.out.print("Masukkan Nama Petugas\t\t\t\t= ");
        return petugas = scanner.next();
    }

    public int getBanyak_mahasiswa() {
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa\t= ");
        return banyak_mahasiswa = scanner.nextInt();
    }

    public int nilaiTerkecil(int [] nilai) {
        terkecil = nilai[0];
        for (i = 0; i < banyak_mahasiswa; i++) {
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }
        return terkecil;
    }

    public int nilaiTerbesar(int [] nilai) {
        for (i = 0; i < banyak_mahasiswa; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
        }
        return terbesar;
    }

}
