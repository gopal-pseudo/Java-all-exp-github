import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " is a positive number");
        }
        if (n < 0) {
            System.out.println(n + " is a negative number");
        }
        if (n == 0) {
            System.out.println("The number is zero");
        }
        sc.close();
    }
}
