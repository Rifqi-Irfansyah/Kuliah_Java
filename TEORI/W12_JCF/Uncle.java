package TEORI.W12_JCF;
import java.util.Map;
import java.util.TreeMap;

public class Uncle{
    private String name;
    private Map<String, Niece> presents = new TreeMap<>();

    public Uncle(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece niece, String description){
        try {
            this.presents.put(description, niece);
            niece.setListPresents(description, this);
    
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Map<String, Niece> getListPresent(){
        return presents;
    }
}