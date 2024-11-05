package TEORI.W12_JCF;

public class Main {
    public static void main(String[] args) {
        Uncle uncle1 = new Uncle("Indra");
        Uncle uncle2 = new Uncle("Syakir");
        Uncle uncle3 = new Uncle("Syakira");

        Niece niece1 = new Niece("Rifqi", 20, 5);
        Niece niece2 = new Niece("Irfansyah", 1, 3);
        Niece niece3 = new Niece("Axrl", 5, 1);
        
        Family fm = new Family("Big Boss");
        fm.addNiece(niece1);
        fm.addNiece(niece2);
        fm.addNiece(niece3);
        fm.addUncle(uncle1);
        fm.addUncle(uncle2);
        fm.addUncle(uncle3);
        fm.addUncle(uncle3);
        fm.addUncle(uncle3);
        // fm.ListNieces();
        fm.ListUncles();

        uncle1.addPresent(niece1, "Laptop");
        uncle1.addPresent(niece2, "Mackbook");
        fm.ListNiecePresents(niece1);
    }
}
