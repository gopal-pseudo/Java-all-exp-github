import java.util.Scanner;

public class FeedbackAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ratings = new int[5];
        int sum = 0;
        System.out.println("Enter 5 feedback ratings (1 to 5):");
        for (int i = 0; i < ratings.length; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            ratings[i] = sc.nextInt();
            while (ratings[i] < 1 || ratings[i] > 5) {
                System.out.print("Invalid! Enter rating between 1 and 5: ");
                ratings[i] = sc.nextInt();
            }
            sum += ratings[i];
        }
        double average = (double) sum / ratings.length;
        System.out.println("\nRatings entered:");
        for (int r : ratings) {
            System.out.print(r + " ");
        }
        System.out.println("\nTotal   : " + sum);
        System.out.printf("Average : %.2f%n", average);
        sc.close();
    }
}
