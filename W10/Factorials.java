package W10;

import java.util.Scanner;
    public class Factorials extends RuntimeException{
    public static void main(String[] args){
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")){
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try {
                System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("\nAnother factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}