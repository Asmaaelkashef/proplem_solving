package arrays;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Print the elements of the 2D array
        for (int i = 0; i < array.length; i++) {           // Iterate through rows
            for (int j = 0; j < array[i].length; j++) {    // Iterate through columns
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing all columns in a row
        }
    }
}
