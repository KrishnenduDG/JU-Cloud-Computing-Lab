package IPC.RMI_Based;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * RMI Server class that creates and publishes the remote addition service
 */
public class AddServer {
    public static void main(String[] args) throws RemoteException {
        // Create an instance of the remote object implementation
        AddImpl obj = new AddImpl();

        // Create RMI registry on port 1099 (default RMI port)
        Registry ns = LocateRegistry.createRegistry(1099);
        // Bind the remote object to the name "add" in the registry
        ns.rebind("add", obj);

        // Indicate server is ready to accept requests
        System.out.println("Server Ready");
    }
}
