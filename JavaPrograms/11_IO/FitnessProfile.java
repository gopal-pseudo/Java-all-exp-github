import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FitnessProfile {
    public static void main(String[] args) {
        String fileName = "profile.txt";
        String data = "Name: Ravi Kumar\nAge: 25\nHeight: 175 cm\nWeight: 70 kg\nDaily Step Goal: 10000\n";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            System.out.println("User profile written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("\nReading user profile:");
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
