package course;

import java.util.Scanner;

public class Code1 {
    int x = 0;
    int y = 0;

    public Code1 (int xx , int yy) 
    {
        this.x = xx ;
        this.y = yy ;
    }

    public int calculateArea ()
    {
        return x*y ;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter width : ");
        int x = reader.nextInt();
        System.out.println("enter height : ");
        int y = reader.nextInt();

        Code1 code1 = new Code1(x, y);
        System.out.println("area is " + code1.calculateArea());
        
    }
}
