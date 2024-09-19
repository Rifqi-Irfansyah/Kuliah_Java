package W5;

public class Matkul {
    private String kode_mk;
    private String nama_mk;

    public Matkul(String kode_mk, String nama_mk){
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
    }

    public String getnama_mk(){
        return this.nama_mk;
    }

    public String getkode_mk(){
        return this.kode_mk;
    }
}
