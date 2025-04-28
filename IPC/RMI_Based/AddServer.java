package IPC.RMI_Based;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AddServer {
    public static void main(String[] args) throws RemoteException {
        AddImpl obj = new AddImpl();

        Registry ns = LocateRegistry.createRegistry(1099);
        ns.rebind("add", obj);

        System.out.println("Server Ready");
    }
}
