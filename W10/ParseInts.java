package W10;

import java.util.Scanner;
public class ParseInts{
    public static void main(String[] args){
        int val, sum=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a line of text : ");
        Scanner scanLine = new Scanner(scan.nextLine());

        while (scanLine.hasNext()){
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (Exception error) {
            }
        }
        
        System.out.println("The sum of the integers on this line is " + sum);
    }
}