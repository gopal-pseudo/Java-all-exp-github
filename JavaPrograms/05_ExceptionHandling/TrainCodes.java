import java.util.Scanner;

public class TrainCodes {
    public static void main(String[] args) {
        String[] trainCodes = {"12627", "12723", "17229", "12785", "22691"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Available train codes: " + trainCodes.length);
        System.out.print("Enter index of train to view: ");
        int index = sc.nextInt();
        try {
            System.out.println("Train code at index " + index + " is " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Invalid index: " + e.getMessage());
            System.out.println("Please enter an index between 0 and " + (trainCodes.length - 1));
        } finally {
            System.out.println("Train lookup completed.");
        }
        sc.close();
    }
}
