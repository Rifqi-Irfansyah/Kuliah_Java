
package TEORI;

import java.util.Scanner;

public class W2_NilaiAkhir {
    public static void main(String[] args) {
        double nl_tugas, nl_uts, nl_uas, nl_akhir;
        char indeks;
        String nama;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda   = ");
        nama = scan.nextLine();
        System.out.print("Masukkan Nilai Tugas = ");
        nl_tugas = scan.nextDouble();
        System.out.print("Masukkan Nilai UTS   = ");
        nl_uts = scan.nextDouble();
        System.out.print("Masukkan Nilai UAS   = ");
        nl_uas = scan.nextDouble();
        scan.close();

        nl_akhir = (0.2 * nl_tugas) + (0.35 * nl_uts) + (0.45 * nl_uas);

        if (nl_akhir >= 85)
            indeks = 'A';
        else if (nl_akhir >= 75)
            indeks = 'B';
        else if (nl_akhir >= 65)
            indeks = 'C';
        else if (nl_akhir >= 49)
            indeks = 'D';
        else
            indeks = 'E';

        System.out.println("\nHallo " + nama + " Nilai Indeks Anda = " + indeks);
        System.out.println("Dengan Nilai Akhir = " + nl_akhir);

    }
}