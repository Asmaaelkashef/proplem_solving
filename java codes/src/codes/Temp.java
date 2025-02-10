package codes;

import java.util.Scanner;

public class Temp {
      String tempreture() {
      Scanner reader = new Scanner(System.in);
      int temp = 0 ;
      for ( int i = 0 ; i < 8 ; i++)
      {
        System.out.println("enter tempreture : ");
        temp = reader.nextInt();
        System.out.println("tempreture you entered are : \n" + temp);
      }
      return "" ;
      }

      public static void main(String[] args) {
        
        Temp TEMP = new Temp();
        System.out.println(TEMP.tempreture());

      }
}




