package W5;

public class Ruangan {
    private String kode_ruangan;
    private String nama_ruangan;
    public Ruangan(String kode_ruangan, String nama_ruangan) {
        this.kode_ruangan = kode_ruangan;
        this.nama_ruangan = nama_ruangan;
    }

    public String getKode_ruangan() {
        return kode_ruangan;
    }

    public String getNama_ruangan() {
        return nama_ruangan;
    }
}
