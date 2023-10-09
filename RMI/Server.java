package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            MessageService messageService = new MessageServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("MessageService", messageService);

            AbstractService abstractService = new ExtendedService();
            registry.rebind("AbstractService", abstractService);

            System.out.println("Server started.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

