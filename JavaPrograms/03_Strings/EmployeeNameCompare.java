import java.util.Scanner;

public class EmployeeNameCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine().trim();
        System.out.print("Enter first employee department: ");
        String dept1 = sc.nextLine().trim();
        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine().trim();
        System.out.print("Enter second employee department: ");
        String dept2 = sc.nextLine().trim();

        System.out.println("\nName 1 in uppercase   : " + name1.toUpperCase());
        System.out.println("Name 2 in lowercase   : " + name2.toLowerCase());
        System.out.println("Length of name 1      : " + name1.length());
        System.out.println("Length of name 2      : " + name2.length());
        System.out.println("First char of name 1  : " + name1.charAt(0));
        System.out.println("equals()              : " + name1.equals(name2));
        System.out.println("equalsIgnoreCase()    : " + name1.equalsIgnoreCase(name2));
        System.out.println("compareTo()           : " + name1.compareTo(name2));
        System.out.println("Concatenated names    : " + name1.concat(" & ").concat(name2));

        if (dept1.equalsIgnoreCase(dept2)) {
            System.out.println("\n" + name1 + " and " + name2 + " work in the SAME department: " + dept1.toUpperCase());
        } else {
            System.out.println("\n" + name1 + " (" + dept1 + ") and " + name2 + " (" + dept2 + ") work in DIFFERENT departments");
        }
        sc.close();
    }
}
