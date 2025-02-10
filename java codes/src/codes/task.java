package codes;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner asmaa = new Scanner(System.in);

        System.out.println("hello in our company");

        System.out.println("please enter your id : ");
        String id = asmaa.next();
        System.out.println("are you sure that your id is " + id + " ? enter 1 for approval, or 0 for deny");
        int userResponseValue = asmaa.nextInt();

        if (userResponseValue == 1) {
            System.out.println("You have approved your id. Go to the next step..!");
        } else if (userResponseValue == 0) {
            System.out.println("enter it again please");
        } else {
            System.out.println("error!");
        }

        
        asmaa.nextLine();

        System.out.println("please enter your full name: ");
        String name = asmaa.nextLine();

        System.out.println("hello " + name + ", what is your birth date?");
        String birth = asmaa.nextLine();
        System.out.println("your birthday is " + birth);

        System.out.println("please if you are female enter 1, if male enter 0");
        int gender = asmaa.nextInt();

        if (gender == 1) {
            System.out.println("female");
        } else if (gender == 0) {
            System.out.println("male");
        } else {
            System.out.println("error!");
        }

        // Consume the remaining newline
        asmaa.nextLine();

        System.out.println("enter your address: ");
        String address = asmaa.nextLine();
        System.out.println("your address is " + address);

        System.out.println("what is your recent certification: ");
        String cert = asmaa.nextLine();
        System.out.println("are you sure? enter 1 or 0 for verification.");
        int cc = asmaa.nextInt();
        if (cc == 1) {
            System.out.println("your certification is " + cert);
        } else if (cc == 0) {
            System.out.println("try 0again");
        } else {
            System.out.println("error!");
        }

        System.out.println("are you a student? enter 1, or graduated? enter 0");
        int stu = asmaa.nextInt();

        if (stu == 1) {
            System.out.println("student");
        } else if (stu == 0) {
            System.out.println("graduated");
        } else {
            System.out.println("error, try again");
        }

        // Consume the remaining newline
        asmaa.nextLine();

        System.out.println("where do you work?");
        String work = asmaa.nextLine();
        System.out.println("your workplace is " + work);
    }
}