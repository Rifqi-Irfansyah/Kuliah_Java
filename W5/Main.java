package W5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mahasiswa> mhs = new ArrayList<>();
        mhs.add(new Mahasiswa("Rifqi","2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));
        mhs.add(new Mahasiswa("Irfansyah", "2C"));

        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa a : mhs) {
            System.out.println("id: " + a.getId() + "\tnama: " + a.getNama());
        }

        List<Dosen> dn = new ArrayList<>();
        dn.add(new Dosen("Yadhi Aditya P.", "S.t. M.Kom"));
        dn.add(new Dosen("Zulkifli Arsyad", "S.T"));
        dn.add(new Dosen("Ade Hodijah", "S.T"));
        dn.add(new Dosen("Trisna Gelar A", "S.T"));
        dn.add(new Dosen("Santi Sundari", "S.T"));
        dn.add(new Dosen("Muhammad Rizqi S", "S.T"));
        dn.add(new Dosen("Ade Chandra Nugraha", "S.T"));
        dn.add(new Dosen("Suprihanto", "S.T"));
        dn.add(new Dosen("Zulkifli Arsyad", "S.T"));
        dn.add(new Dosen("Zulkifli Arsyad", "S.T"));

        System.out.println("\nData Dosen:");
        for (Dosen dsn : dn) {
            System.out.println("id: " + dsn.getId() + "\tnama: " + dsn.getNama());
        }

        Matkul pbo = new Matkul("01", "Pemrograman Berbasis Objek");
        Ruangan A1 = new Ruangan("A1", "Multimedia 1");
        Jadwal jdl = new Jadwal("Senin", A1, pbo, dn.get(1));

        System.out.println("\nJadwal Kuliah");
        System.out.println(jdl.getJadwal());
    }
}