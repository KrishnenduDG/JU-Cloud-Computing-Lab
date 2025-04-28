package IPC.RMI_Based;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddIntf extends Remote {
    public int add(int i, int j) throws RemoteException;

}