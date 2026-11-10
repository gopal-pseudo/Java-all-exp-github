import java.util.Scanner;

public class LibraryBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = new String[10];
        System.out.println("Enter titles of 10 books:");
        for (int i = 0; i < books.length; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine().trim();
        }

        System.out.println("\nAll books in library:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.println("\nBooks starting with letter 'A':");
        boolean found = false;
        for (String book : books) {
            if (book.toUpperCase().startsWith("A")) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books start with 'A'");
        }
        sc.close();
    }
}
