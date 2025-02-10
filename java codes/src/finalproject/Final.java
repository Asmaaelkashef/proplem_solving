package finalproject;

import java.util.Scanner;

public class Final {
    
public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);

  int [] [] pairs = new int[4][2];

  System.out.println("hello , i am your intelligent calculater <3 \nI can calculate area and perimeter for square and rectangular !");
  //get x , y 
  for (int i = 0 ; i < 4 ; i++)
  {
      System.out.println("please enter x for point " + (i+1) + " : ");
      pairs[i][0]= reader.nextInt();
      System.out.println("please enter y for point " + (i+1) + " : ");
      pairs[i][1]= reader.nextInt();

  } 
  //calculate length & width
  double length = Math.abs((pairs[0][0] - pairs[1][0]));
  double width = Math.abs((pairs[0][1] - pairs[3][1]));

  //calculate area & parimeter
  if (length == width) 
  {
    System.out.println("shape you entered is square !");
    System.out.println("area of your square : " + length*length);
    System.out.println("parimeter of your square : " + length*4);
  }
  else 
  {
    System.out.println("shape you entered is rectangular !");
    System.out.println("area of your rectangular : " + (length*width));
    System.out.println("parimeter of your rectangular : " + ((width+length)*2));
  }
}
}
