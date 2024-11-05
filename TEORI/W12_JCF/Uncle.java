package TEORI.W12_JCF;
import java.util.Map;
import java.util.TreeMap;

public class Uncle{
    private String name;
    // private Map<String, Integer> recipient = new TreeMap<>();
    private Map<String, Niece> presents = new TreeMap<>();
    // private Map<String, String> uncle_presents = new TreeMap<>();
    // private Map<String, Map<Niece, String>> uncleToPresents = new HashMap<>();

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

    public Map<String, Niece> listPresents(){
        return this.presents;
    } 
}