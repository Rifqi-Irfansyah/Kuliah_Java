package W4;

public class Inventori {
    Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")\n");
    }

    void pengadaan() {
        initBarang();
        System.out.println("Stok awal");

        showBarang();
        barangs[0].setstok(20);
        System.out.println("Setelah dilakukan penambahan");
        showBarang();
    }


    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}

class Barang {
    String kode_barang;
    private String nama_barang;
    private int stok;

    public void setstok(int stok){
        this.stok += stok;
    }

    public int getStok(){
        return this.stok;
    }

    public String getNamaBarang(){
        return this.nama_barang;
    }

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
