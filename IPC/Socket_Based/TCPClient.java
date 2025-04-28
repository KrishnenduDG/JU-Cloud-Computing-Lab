import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        String sendMsg, receivedMsg;
        Scanner inFromUser = new Scanner(System.in);
        sendMsg = inFromUser.nextLine();

        Socket clientSocket = new Socket("localhost", 8080);
        System.out.println("Socket connection succeeded!");

        OutputStream outToServer = clientSocket.getOutputStream();
        outToServer.write((sendMsg + '\n').getBytes());

        Scanner inFromServer = new Scanner(clientSocket.getInputStream());
        receivedMsg = inFromServer.nextLine();

        System.out.println("FROM SERVER: " + receivedMsg);
        clientSocket.close();

    }
}