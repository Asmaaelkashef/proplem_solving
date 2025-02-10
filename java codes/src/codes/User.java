package codes;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        int result=0;
        Scanner plan = new Scanner(System.in);
        System.out.println("Enter 1 for Golden user.\n2 for Bronze user\n3 for Normal user");
        int userType = plan.nextInt();
        switch (userType) {
            case 1:
                System.out.println("You're a Golden user");
                break;

            case 2:
                System.out.println("You're a Bronze user");
                break;

            case 3:
                System.out.println("You're a Normal user");
                break;

            default:
                System.out.println("Invalid input");
        }
        for (int i=1; i<11; i++) {

            Scanner asmaaa = new Scanner(System.in);
            int diposit = asmaaa.nextInt();
            System.out.println("Enter diposit number "+i);
            if (diposit < 3000 && diposit > 0) {
                System.out.println(diposit);
                result+=diposit;
            }
        System.out.println(result);
        }
        }

    }

