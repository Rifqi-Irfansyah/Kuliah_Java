package W3;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        double gapok = 500000;
        double hargaitem = 50000;
        double totalBonus;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Total Penjualan = ");
        int total = scan.nextInt();
        scan.close();

        if (total >= 80)
            totalBonus = total * hargaitem * 0.35;
        else if (total >= 40)
            totalBonus = total * hargaitem * 0.25;
        else if (total >= 15)
            totalBonus = total * hargaitem * 0.1;
        else
            totalBonus = (15-total) * hargaitem * -0.15;
        
        System.out.println("Gaji Anda = " + (gapok + totalBonus));
    }
}
