package W3;

import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a, b, hasiltambah, hasilkali;
        System.out.print("Masukkan a = ");
        a = sc.nextBigInteger();
        System.out.print("Masukkan b = ");
        b = sc.nextBigInteger();
        sc.close();

        hasiltambah = a.add(b);
        hasilkali = a.multiply(b);
        System.out.println(a + " + " + b +" = " + hasiltambah);
        System.out.println(a + " * " + b +" = " + hasilkali);
        
    }
}
