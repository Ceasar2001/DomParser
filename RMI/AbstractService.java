package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public abstract class AbstractService extends UnicastRemoteObject {
    public AbstractService() throws RemoteException {
        super();
    }

    public abstract void performAction() throws RemoteException;
}

