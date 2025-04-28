import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * A simple TCP Client implementation that sends a message to a server and
 * receives a response
 */
public class TCPClient {
    public static void main(String[] args) throws Exception {
        // Variables to store messages
        String sendMsg, receivedMsg;

        // Create scanner to read user input from console
        Scanner inFromUser = new Scanner(System.in);
        sendMsg = inFromUser.nextLine();

        // Create a socket connection to localhost on port 8080
        Socket clientSocket = new Socket("localhost", 8080);
        System.out.println("Socket connection succeeded!");

        // Get output stream to send data to server
        OutputStream outToServer = clientSocket.getOutputStream();
        // Convert string to bytes and send to server (append newline)
        outToServer.write((sendMsg + '\n').getBytes());

        // Create scanner to read server's response
        Scanner inFromServer = new Scanner(clientSocket.getInputStream());
        receivedMsg = inFromServer.nextLine();

        // Print server's response
        System.out.println("FROM SERVER: " + receivedMsg);
        // Close the socket connection
        clientSocket.close();
    }
}