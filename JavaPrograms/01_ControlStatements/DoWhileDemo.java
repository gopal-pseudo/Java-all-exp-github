import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Say Hello");
            System.out.println("2. Show Square of a Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Hello, welcome to Java!");
            } else if (choice == 2) {
                System.out.print("Enter a number: ");
                int x = sc.nextInt();
                System.out.println("Square = " + (x * x));
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }
        } while (choice != 3);
        sc.close();
    }
}
