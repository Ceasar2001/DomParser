package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            MessageService messageService = (MessageService) registry.lookup("MessageService");
            String response = messageService.sendMessage("Hello, Server!");
            System.out.println("Server response: " + response);

            AbstractService abstractService = (AbstractService) registry.lookup("AbstractService");
            abstractService.performAction();

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
