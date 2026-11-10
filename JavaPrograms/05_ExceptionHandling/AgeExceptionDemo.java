import java.util.Scanner;

public class AgeExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter total age of all members in the group: ");
            int totalAge = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter number of members: ");
            int members = Integer.parseInt(sc.nextLine().trim());
            int averageAge = totalAge / members;
            System.out.println("Average age of the group = " + averageAge);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Age must be a valid number. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Number of members cannot be zero. " + e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }
        sc.close();
    }
}
