package W3;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        String word[] = new String[3];
        int number [] = new int[3];
        String kata;
        int angka;
        
        for (i=0; i<3; i++){
            System.out.print("Masukkan kata      = ");
            kata = sc.next();
            System.out.print("\nMasukkan Angka   = ");
            angka = sc.nextInt();
            word[i] = kata;
            number[i] = angka;
        }
        sc.close();

        for(i=0; i<3; i++){
            System.out.printf("%-15s%03d%n", word[i], number[i]);
        }
    }
}
