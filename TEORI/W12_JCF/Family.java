package TEORI.W12_JCF;

import java.util.Comparator;
import java.util.Map;
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
        System.out.println("\nTList Niece:");
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
}
