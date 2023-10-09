package RMI;

import java.rmi.RemoteException;
// (Inherits from AbstractService):
public class ExtendedService extends AbstractService {
    public ExtendedService() throws RemoteException {
        super();
    }

    @Override
    public void performAction() throws RemoteException {
        System.out.println("Performing extended action...");
    }
}

