package IPC.RMI_Based;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Remote interface defining the contract for the addition service
 * Extends Remote to enable RMI capability
 */
public interface AddIntf extends Remote {
    /**
     * Remote method to add two integers
     * 
     * @param i first number to add
     * @param j second number to add
     * @return sum of the two numbers
     * @throws RemoteException if remote communication fails
     */
    public int add(int i, int j) throws RemoteException;
}