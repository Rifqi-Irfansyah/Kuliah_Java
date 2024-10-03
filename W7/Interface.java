package W7;
public class Interface {
    public static void main(String[] args) {
        MobilListrik tesla = new MobilListrik("Tesla Model 3", 75);

        // Menampilkan info kendaraan
        tesla.infoKendaraan();

        // Memanggil metode jalan
        tesla.jalan();

        // Mengisi baterai dan menampilkan kapasitas
        tesla.isiBaterai();
        System.out.println("Kapasitas baterai: " + tesla.kapasitasBaterai() + " kWh");
    }
}

// Abstract class Kendaraan
abstract class Kendaraan {
    protected String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    // Abstract method
    public abstract void jalan();

    // Concrete method
    public void infoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
    }
}

// Interface KendaraanListrik
interface KendaraanListrik {
    // Method di dalam interface harus diimplementasikan
    void isiBaterai();
    int kapasitasBaterai();
}

// Class MobilListrik meng-extend Kendaraan dan mengimplementasikan KendaraanListrik
class MobilListrik extends Kendaraan implements KendaraanListrik {
    private final int kapasitas;

    public MobilListrik(String nama, int kapasitas) {
        super(nama);
        this.kapasitas = kapasitas;
    }

    // Implementasi method abstract dari Kendaraan
    @Override
    public void jalan() {
        System.out.println(nama + " sedang berjalan dengan tenaga listrik.");
    }

    // Implementasi method dari interface KendaraanListrik
    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai " + nama);
    }

    @Override
    public int kapasitasBaterai() {
        return kapasitas;
    }
}



