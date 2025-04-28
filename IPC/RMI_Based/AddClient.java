package IPC.RMI_Based;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * RMI Client that connects to the remote addition service
 */
public class AddClient {
    public static void main(String[] args) throws Exception {
        // Get reference to RMI registry running on localhost at port 1099
        Registry ns = LocateRegistry.getRegistry("localhost", 1099);

        // Look up the remote object by its bound name "add"
        AddIntf obref = (AddIntf) ns.lookup("add");

        // Invoke the remote method and store result
        int k = obref.add(30, 50);

        // Display the result of remote addition
        System.out.println("30+50=" + k);
    }
}
