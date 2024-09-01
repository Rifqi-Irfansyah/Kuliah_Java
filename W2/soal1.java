/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args){
        String input;     
        Scanner scan = new Scanner(System.in);
        
        for (int i=1; i<=6; i++){
            System.out.print("\nMasukkan Angka   = ");
            input = scan.nextLine();
            try {
                long number = Long.parseLong(input);

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println(input + " can be fitted in: \n byte\n short\n int\n long");
                }

                else if(number >= Short.MIN_VALUE && number <= Short.MAX_VALUE){
                    System.out.println(input + " can be fitted in: \n short\n int\n long");
                }

                else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println(input + " can be fitted in: \n int\n long");
                }

                else if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println(input + " can be fitted in: \n long");
                }
            } catch (NumberFormatException e) {
                System.out.println("can't be fitted anywhere");
            }
        }
        scan.close();
    }
}
