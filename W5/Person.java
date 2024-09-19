package W5;

public class Person{
    private int id;
    private String nama;
    public static byte current_id=0;

    public Person(String nama){
        nextId();
        this.id = current_id;
        this.nama = nama;
    }

    public static void nextId(){
        current_id++;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }
}

