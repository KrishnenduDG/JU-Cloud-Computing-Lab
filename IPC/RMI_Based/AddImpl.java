package IPC.RMI_Based;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Implementation of the AddIntf remote interface
 * Extends UnicastRemoteObject to support RMI functionality
 */
public class AddImpl extends UnicastRemoteObject implements AddIntf {
    /**
     * Constructor must declare RemoteException due to UnicastRemoteObject
     */
    public AddImpl() throws RemoteException {
    }

    /**
     * Implementation of the remote add method
     * 
     * @param i first number to add
     * @param j second number to add
     * @return sum of i and j
     * @throws RemoteException if remote communication fails
     */
    public int add(int i, int j) throws RemoteException {
        return i + j;
    }
}