package W9.SK3;
import java.util.Scanner;

public class Strings{
    public static void main (String[] args)
    {
        String[] stringsList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        stringsList = new String[size];
        scan.nextLine();

        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            stringsList[i] = scan.nextLine();

        Sorting.insertionSort(stringsList);

        System.out.println ("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(stringsList[i] + " ");
        System.out.println ();
    }
}

