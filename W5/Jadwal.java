package W5;

public class Jadwal{
    private String hari;
    private Ruangan ruangan;
    private Dosen dosen;
    private Matkul matkul;

    public Jadwal(String hari, Ruangan ruangan, Matkul matkul, Dosen dosen){
        this.hari = hari;
        this.ruangan = ruangan;
        this.dosen = dosen;
        this.matkul = matkul;
    }

    public String getJadwal(){
        return ("Hari:\t" + this.hari + "\nRuang:\t" + this.ruangan.getNama_ruangan() + "\nMatkul:\t" + this.matkul.getnama_mk() + "\nDosen:\t" + this.dosen.getNama()); 
    }
}
