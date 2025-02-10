package arrays;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int [] degrees = new int [10];

        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.println("enter you degree : ");
            int degree = reader.nextInt();
            degrees[i] = degree ;
        }

        System.out.println("your degrees are : ");
        for (int number : degrees)
        System.out.println (number);
    }
}
