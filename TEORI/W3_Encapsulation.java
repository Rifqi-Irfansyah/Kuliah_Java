package TEORI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class W3_Encapsulation {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        Barang barang1 = new Barang("Laptop", 3);
        barang1.tampilkanBarang();
        barang1.meminjam();
        barang1.mengembalikan();

        System.out.println("\n");

        Peminjam peminjam1 = new Peminjam();
        peminjam1.setNamaPeminjam("Budi");
        peminjam1.setBarang("Laptop");
        peminjam1.tampilkanPeminjaman();
        LocalTime waktuKembali = peminjam1.getWaktuKembali();
        LocalTime waktuPinjam = peminjam1.getWaktuMeminjam();
        System.out.println("Waktu Meminjam : " + waktuPinjam.format(formatter));
        System.out.println("Waktu Kembali  : " + waktuKembali.format(formatter));
    }
}

class Barang {
    private String nama;
    private int jumlah;

    // Constructor untuk menginisialisasi atribut
    public Barang(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    void meminjam() {
        System.out.println("Barang " + nama + " dipinjam");
    }

    void mengembalikan() {
        System.out.println("Barang " + nama + " dikemnalikan");
    }

    void tampilkanBarang() {
        System.out.println("Nama Barang   = " + nama);
        System.out.println("Jumlah Barang = " + jumlah);
    }
}

class Peminjam {
    private String nama_peminjam;
    private LocalTime waktu_meminjam = LocalTime.now();
    private LocalTime waktu_kembali;
    private String barang;

    // Getter dan Setter untuk nama_peminjam
    public String getNamaPeminjam() {
        return nama_peminjam;
    }

    public void setNamaPeminjam(String nama_peminjam) {
        this.nama_peminjam = nama_peminjam;
    }

    // Getter dan Setter untuk tanggal_meminjam
    public LocalTime getWaktuMeminjam() {
        return waktu_meminjam;
    }

    // Getter dan Setter untuk tanggal_kembali
    public LocalTime getWaktuKembali() {
        waktu_kembali = waktu_meminjam.plusHours(5);
        if (waktu_meminjam.isAfter(LocalTime.of(12, 0))) {
            waktu_kembali = LocalTime.of(17, 0);
        }
        return waktu_kembali;
    }

    // Getter dan Setter untuk barang
    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    void tampilkanPeminjaman() {
        System.out.println(nama_peminjam + " telah meminjam " + barang);
    }
}