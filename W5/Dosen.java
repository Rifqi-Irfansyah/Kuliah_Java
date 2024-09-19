package W5;

public class Dosen extends Person{
    private String gelar;
    public Dosen(String nama, String gelar) {
        super(nama);
        this.gelar = gelar;
    }

    public int getId() {
        return super.getId();
    }

    public String getNama() {
        return super.getNama();
    }

    public String getGelar() {
        return gelar;
    }
}
