import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkedException {
    public static void main(String[] args) {
        try {
            // Mencoba membuka file yang tidak ada
            File file = new File("non_existent_file.txt");
            Scanner scan = new Scanner(file);
            scan.close();
        } catch (FileNotFoundException e) {
            // Menangani pengecualian ketika file tidak ditemukan
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
