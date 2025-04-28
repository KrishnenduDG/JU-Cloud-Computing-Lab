package IPC.RMI_Based;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImpl extends UnicastRemoteObject implements AddIntf {
    public AddImpl() throws RemoteException {
    }

    public int add(int i, int j) throws RemoteException {
        return i + j;
    }
}