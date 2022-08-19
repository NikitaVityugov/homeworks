import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Client client1 = new Client("Nikita", 29);
        Client client2 = new Client("Alexander", 55);
        Client client3 = new Client("Irina", 54);
        Client client4 = new Client("Anastasia", 30);
        bank.listOfClient.addAll(Arrays.asList(client1, client2, client3, client4));
        bank.hash.put(client1, List.of(new Account(1234, 5.4)));
        bank.hash.put(client2, Arrays.asList(new Account(1235, 5.0),
                new Account(1236, 5.3)));
        bank.hash.put(client3, Arrays.asList(new Account(1237, 5.1),
                new Account(1238, 5.2)));
        bank.hash.put(client4, Arrays.asList(new Account(1239, 5.2),
                new Account(1240, 5.5)));

        System.out.println(bank.hash.get(client2));
    }
    HashMap<Client, List<Account>> hash = new HashMap<>();
    List<Client> listOfClient = new ArrayList<>();
}