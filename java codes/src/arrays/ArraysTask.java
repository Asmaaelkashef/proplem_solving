package arrays;

public class ArraysTask {
  public static void main(String[] args) {
    int array1[][] = {
        { 5, 10, 2 },
        { 10, 20, 30 }
    };
    int array2[][] = {
        { 2, 15, 9 },
        { 14, 10, 55 }
    };

    System.out.println("array 1 is ");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(array1[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("---------");

    System.out.println("array 2 is ");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(array2[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("---------");

    int[][] totalarray = new int[2][3];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        totalarray[i][j] = array1[i][j] + array2[i][j];
      }
    }

    System.out.println("---------");

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(array1[i][j] + " + " + array2[i][j] + " = " + totalarray[i][j] + " ");
      }
    }

    System.out.println(" \ntotal array is : ");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(totalarray[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("---------");

      int largest = totalarray[0][0];
      int smallest = totalarray[0][0];

      
      for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
          if (totalarray[i][j] > largest)
          {
            largest = totalarray[i][j];
          }
          if (totalarray[i][j] < smallest)
          {
            smallest = totalarray[i][j];
          }
        }
      }

        System.out.println("largest number is " + largest + " smallest number is " + smallest);

        System.out.println("---------");

        int [] [] transposeArr = new int[3][2];
        
        for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 3; j++) {
            transposeArr[j][i] = totalarray[i][j];
          }
        }
        System.out.println("transpose of total matrix is ");
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 2; j++) {
            System.out.print(transposeArr[i][j] + " ");
          }
          System.out.println();
        }


      }
    }
  
