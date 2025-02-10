package functions;
import java.util.Scanner;

public class FunctionsTask {
    public int total(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int total(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public int total(int num1, int num2, int num3, int num4) {
        int sum = num1 * num2 * num3;
        return sum;
    }

    public int total(int num1, int num2, int num3, int num4, int num5) {
        int sum = num1 / num2 / num3 / num4 /num5;
        return sum;
    }

    public int total(String x) {
        Scanner asmaa = new Scanner(System.in);
        System.out.println("enter word : ");
        String word = asmaa.next();
        int length = word.length();
        return length;
    }
}
