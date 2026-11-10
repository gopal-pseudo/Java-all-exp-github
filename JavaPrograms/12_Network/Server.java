import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started on port 5000. Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client: " + message);
                if (message.equalsIgnoreCase("bye")) {
                    out.println("bye");
                    break;
                }
                System.out.print("Server: ");
                String reply = keyboard.readLine();
                out.println(reply);
            }
            socket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
