package TEORI.W12_JCF;

import java.util.Map;
import java.util.TreeMap;

public class Niece {
    private String name;
    private int day;
    private int month;
    private Map<String, Uncle> ListPresents = new TreeMap<>();

    public Niece(String name, int day, int month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public String getBirth(){
        return "date: " + day + " month :" + month;
    }

    public void setListPresents(String present, Uncle uncle) {
        ListPresents.put(present, uncle);
    }

    public int clearPresents(){
        int i = 0;
        for (Map.Entry<String, Uncle> entry : this.ListPresents.entrySet()) {
            ListPresents.remove(entry.getKey());
            i ++;
        }
        return i;
    }

    public Map<String, Uncle> getListPresents() {
        return ListPresents;
    }
}
