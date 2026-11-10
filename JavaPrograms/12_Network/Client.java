import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connected to server. Type 'bye' to exit.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Client: ");
                String message = keyboard.readLine();
                if (message == null) {
                    break;
                }
                out.println(message);
                String reply = in.readLine();
                if (reply == null || reply.equalsIgnoreCase("bye")) {
                    break;
                }
                System.out.println("Server: " + reply);
            }
            System.out.println("Disconnected from server.");
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
