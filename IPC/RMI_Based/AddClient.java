package IPC.RMI_Based;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AddClient {
    public static void main(String[] args) throws Exception {
        Registry ns = LocateRegistry.getRegistry("localhost", 1099);
        AddIntf obref = (AddIntf) ns.lookup("add");
        int k = obref.add(30, 50);
        System.out.println("30+50=" + k);
    }
}
