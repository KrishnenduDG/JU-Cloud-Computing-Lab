import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * A TCP Server that listens for client connections, receives messages,
 * converts them to uppercase, and sends them back to the client
 */
public class TCPServer {
    public static void main(String[] args) throws Exception {
        // Variables to store received and return messages
        String receivedMsg, returnMsg;

        // Create server socket that listens on port 8080
        ServerSocket welcomeSocket = new ServerSocket(8080);

        // Infinite loop to keep server running and accepting connections
        while (true) {
            System.out.println("System is up and running!");
            // Wait for and accept incoming client connection
            Socket connSocket = welcomeSocket.accept();

            // Create scanner to read data from client
            Scanner inFromClient = new Scanner(connSocket.getInputStream());
            // Get output stream to send data back to client
            OutputStream outToClient = connSocket.getOutputStream();

            // Read message from client
            receivedMsg = inFromClient.nextLine();
            // Convert message to uppercase
            returnMsg = receivedMsg.toUpperCase();
            // Send converted message back to client
            outToClient.write((returnMsg + "\n").getBytes());
            // Close the connection socket (but keep server running)
            connSocket.close();
        }
    }
}