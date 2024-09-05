package W3;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata;
        
        System.out.print("Masukkan Kalimat = ");
        kata = sc.nextLine();

        String s[] = kata.split("[ ,',.,@,!']");
        System.out.println(s.length);
        for (String str : s) {
            System.out.println(str);
        }
        sc.close();
    }   
}
