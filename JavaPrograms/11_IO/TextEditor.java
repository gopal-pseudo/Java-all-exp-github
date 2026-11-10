import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {
        String fileName = "notes.txt";
        String content = "Welcome to the Text Editor.\nThis content is written using FileWriter.\nIt is read back using FileReader.\n";

        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(content);
            System.out.println("Content written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try (FileReader fr = new FileReader(fileName)) {
            System.out.println("\nReading content from " + fileName + ":");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
