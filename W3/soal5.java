package W3;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan 4 plat dengan 4 nomor = ");
        a = sc.nextLine();
        String plat = a.replaceAll(" ", "");
        long platmerge = Long.parseLong(plat);
        int cekPlat = (int) ((platmerge-999999) % 5);
        if(cekPlat != 0)
            System.out.println("Berhenti");
        else
            System.out.println("Jalan");
        sc.close();
    }
}
