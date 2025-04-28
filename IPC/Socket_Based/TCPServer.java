import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        String receivedMsg, returnMsg;
        ServerSocket welcomeSocket = new ServerSocket(8080);
        System.out.println("System is up and running!");

        while (true) {
            Socket connSocket = welcomeSocket.accept();
            Scanner inFromClient = new Scanner(connSocket.getInputStream());
            OutputStream outToClient = connSocket.getOutputStream();

            receivedMsg = inFromClient.nextLine();
            returnMsg = receivedMsg.toUpperCase();
            outToClient.write((returnMsg + "\n").getBytes());
            connSocket.close();
        }
    }
}