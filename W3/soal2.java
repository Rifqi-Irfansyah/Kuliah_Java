package W3;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        String word[] = new String[3];
        int number [] = new int[3];
        String kata;
        
        for (i=0; i<3; i++){
            int y = 0;
            System.out.print("Masukkan kata & angka = ");
            kata = sc.nextLine();
            String pemisah[] = kata.split(" ");

            word[i] = pemisah[y];
            number[i] = Integer.parseInt(pemisah[y+1]);
        }
        sc.close();

        for(i=0; i<3; i++){
            System.out.printf("%-15s%03d%n", word[i], number[i]);
        }
    }
}
