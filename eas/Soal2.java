package eas;
import java.util.HashMap;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // declare hashmap
        HashMap<String, Double> productCatalog = new HashMap<>();
        // memasukkan data produk
        productCatalog.put("Buku", 70000.0);
        productCatalog.put("Pulpen", 5000.0);
        productCatalog.put("Penghapus", 2000.0);
        productCatalog.put("Penggaris", 8000.0);

        System.out.println("Katalog Produk:");
        for (HashMap.Entry<String, Double> atk : productCatalog.entrySet()) {
            System.out.println("Nama  = " + atk.getKey() + "\nHarga = " + atk.getValue() + "\n");
        }

        //Mencari harga produk berdasarkan nama
        Scanner scan = new Scanner(System.in);
        System.out.println("\nMasukkan nama produk yang ingin dicari: ");
        String productName = scan.nextLine();

        //lengkapi
        Double value = productCatalog.get(productName);
        if(value != null){
            System.out.println("Harga " + productName + " = " +value);
        }
        else{
            System.out.println(productName + " tidak ditemukan");
        }
    }
}
