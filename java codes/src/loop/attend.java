package loop;
import java.util.Scanner;

public class attend {
    public static void main(String[] args){
        Scanner asmaa = new Scanner(System.in);
        String days = "";
            for (int i = 1 ; i < 6 ; i++)
            {
                System.out.println("enter day " + i + ":");
                days = asmaa.next();
                System.out.println("your preferred days are " + days);
            }  
    }
}
