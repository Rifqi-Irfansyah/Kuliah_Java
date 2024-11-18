package TEORI.W14_CleanCode;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String nama;
        double nilaiTugas, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        char indeksNilai;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Nama Anda: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan Nilai Tugas: ");
            nilaiTugas = scanner.nextDouble();
            System.out.print("Masukkan Nilai UTS: ");
            nilaiUTS = scanner.nextDouble();
            System.out.print("Masukkan Nilai UAS: ");
            nilaiUAS = scanner.nextDouble();
        }

        nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS);

        indeksNilai = tentukanindeksNilai(nilaiAkhir);

        tampilkanHasil(nama, nilaiAkhir, indeksNilai);
    }

    private static double hitungNilaiAkhir(double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        return (0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);
    }

    private static char tentukanindeksNilai(double nilaiAkhir) {
        if (nilaiAkhir >= 85) return 'A';
        if (nilaiAkhir >= 75) return 'B';
        if (nilaiAkhir >= 65) return 'C';
        if (nilaiAkhir >= 49) return 'D';
        return 'E';
    }

    private static void tampilkanHasil(String nama, double nilaiAkhir, char indeksNilai) {
        System.out.println("\nHallo " + nama + ", Nilai indeksNilai Anda: " + indeksNilai);
        System.out.println("Dengan Nilai Akhir: " + nilaiAkhir);
    }
}
