package W5;

public class Mahasiswa extends Person{
    private String kelas;
    
    public Mahasiswa(String nama, String kelas) {
        super(nama);
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public int getId() {
        return super.getId();
    }
}
