package TEORI.W12_JCF;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Niece niece2 = new Niece("Rifqi", 2, 2);
        Niece niece = new Niece("Irfansyah", 1, 3);
        Niece niece3 = new Niece("Abyan", 0, 0);

        Uncle uncle1 = new Uncle("Indra");
        Uncle uncle2 = new Uncle("Syakir");
        Uncle uncle4 = new Uncle("Syakira");
        Uncle uncle3 = new Uncle("Raihan");
        
        Family fm = new Family("Hartono");
        fm.addNiece(niece);
        fm.addNiece(niece2);
        fm.addNiece(niece3);
        fm.addUncle(uncle1);
        fm.addUncle(uncle2);
        fm.addUncle(uncle3);
        fm.addUncle(uncle3);
        fm.addUncle(uncle3);
        fm.addUncle(uncle4);
        fm.ListUncles();
        fm.ListNieces();


        uncle1.addPresent(niece, "Hadiah Balon");
        uncle1.addPresent(niece, "Hadiah Balon");
        uncle1.addPresent(niece, "Hadiah Balon2");
        Map<String, Niece> present = uncle1.listPresents();
        for (Map.Entry<String, Niece> entry : present.entrySet()) {
            System.out.println("Hadiah = "+entry.getKey());
        }
    }
}
