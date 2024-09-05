package W3;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Masukkan Operasi Hitungan = ");
        str = sc.nextLine();
        sc.close();

        String s[] = str.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);
        if (a < 1 || a > 1000 || b <1 || b > 1000)
            System.out.println("Operand tidak memenuhi");
        else{
            if(s[1].equals("+"))
                System.out.println("Hasil = "+ (a+b));
            else if(s[1].equals("-"))
                System.out.println("Hasil = "+ (a-b));
            else if(s[1].equals("*"))
                System.out.println("Hasil = "+ (a*b));
            else if(s[1].equals("/"))
                if (a%b != 0)
                    System.out.println("Tidak habis dibagi");
                else
                    System.out.println("Hasil = "+ (a/b));
            else if(s[1].equals("%"))
                System.out.println("Hasil = "+ (a%b));
            else
                System.out.println("Operator tidak terdefinisi");
        }
    }
}
