package codes;
import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        Scanner asmaa = new Scanner(System.in);
           
    System.out.println("enter 2 numbers : ");
    int number1 = asmaa.nextInt();
    int number2 = asmaa.nextInt();
    int total = 0 ;
    System.out.println("enter 1 to plus , enter 2 to minus , enter 3 to multiplication , / to divide ");
    int choise = asmaa.nextInt();
    switch (choise) {
        case 1:
             total = number1 + number2;
            System.out.println("result is :  "+ total);
            break;
        case 2 :
            total = number1 - number2;
            System.out.println("result is :  "+ total);
        case 3 : 
             total = number1 * number2;
            System.out.println("result is : " + total);
        case 4 :
             total = number1 / number2;
            System.out.println("result is : " + total);

        default:
            break;
    }













}
}

