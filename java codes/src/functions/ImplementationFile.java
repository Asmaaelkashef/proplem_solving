package functions;
import java.util.Scanner;

public class ImplementationFile {
    public static void main(String[] args) {
        FunctionsTask f1 = new FunctionsTask();

            System.out.println("enter 2 numbers :");
            Scanner input = new Scanner(System.in);
            int total = f1.total(input.nextInt(), input.nextInt());
            System.out.println("sum is "+ total );
            
            System.out.println("enter 3 numbers :");
            int result = f1.total(input.nextInt(),input.nextInt(),input.nextInt());
            System.out.println("sum is "+ result);

            System.out.println("enter 4 numbers: ");
            int multi = f1.total(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
            System.out.println("multi is "+ multi);

            System.out.println("enter 5 numbers: ");
            int divide = f1.total(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
            System.out.println("divide is "+ divide);

            System.out.println("enter word : ");
            int length = f1.total(input.nextLine());
            System.out.println("length is "+ length);


    }
}
