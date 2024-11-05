package TEORI.W12_JCF;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Family {
    private final String nameFamily;
    private TreeSet<Niece> nieces = new TreeSet<>(Comparator.comparing(Niece::getBirth));
    private TreeSet<Uncle> uncles = new TreeSet<>(Comparator.comparing(Uncle::getName));

    public Family(String name){
        this.nameFamily = name;
    }

    public boolean addNiece(Niece niece) {
        try {
            nieces.add(niece);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean addUncle(Uncle uncle) {
        try {
            uncles.add(uncle);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void ListNieces(){
        System.out.println("\nList Niece:");
        for (Niece nc : nieces) {
            System.out.println("Nama = " + nc.getName() + "\nUmur = (" + nc.getBirth() + ")");
            System.out.println();
        }
    }

    public void ListUncles(){
        System.out.println("\nList Uncle:");
        for (Uncle uc : uncles) {
            System.out.println("Nama = " + uc.getName());
        }
    }

    public void ListNiecePresents(Niece niece){
        Map<String, Uncle> Listpresents = niece.getListPresent(); 
        System.out.println("\nList Niece " + niece.getName() + " Presents:");
        for (Map.Entry<String, Uncle> ps : Listpresents.entrySet()) {
            System.out.println("Presents = " + ps.getKey() + "\tGiver = " + ps.getValue().getName());
        }

        Set<Uncle> unclesInPs = new HashSet<>(Listpresents.values());
        System.out.println("\nList Uncle Didn't Choose Present For " + niece.getName() + " :");
        for (Uncle uncle : uncles) {
            if (!unclesInPs.contains(uncle)) {
                System.out.println(uncle.getName());
            }
        }

    }

    public void ListUnclePresents(Uncle uncle){
        Map<String, Niece> Listpresents = uncle.getListPresent(); 
        System.out.println("\nList Uncle " + uncle.getName() + " Presents:");
        for (Map.Entry<String, Niece> ps : Listpresents.entrySet()) {
            System.out.println("Presents = " + ps.getKey() + "\tReceiver = " + ps.getValue().getName());
        }
        
        Set<Niece> nieceInps = new HashSet<>(Listpresents.values());
        System.out.println("\nList Niece Not Selected for Gift" + uncle.getName() + " Presents:");
        for (Niece niece : nieces) {
            if (!nieceInps.contains(niece)) {
                System.out.println(niece.getName());
            }
        }

    }
}
