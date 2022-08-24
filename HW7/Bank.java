import java.util.*;

public class Bank {
    public static void main(String[] args) {
        int idNumber;
        Bank bank = new Bank();

        Client client1 = new Client("Nikita", 29, 10);
        Client client2 = new Client("Alexander", 55, 11);
        Client client3 = new Client("Irina", 54, 12);
        Client client4 = new Client("Anastasia", 30, 13);
        bank.listOfClient.addAll(Arrays.asList(client1, client2, client3, client4));

        Account clientAccount1 = new Account(1234, 5.4, 10);
        Account clientAccount2 = new Account(1235, 5.0, 11);
        Account clientAccount3 = new Account(1236, 5.3, 11);
        Account clientAccount4 = new Account(1237, 5.1, 12);
        Account clientAccount5 = new Account(1238, 5.2, 12);
        Account clientAccount6 = new Account(1239, 5.2, 13);
        Account clientAccount7 = new Account(1240, 5.5, 13);
        bank.listOfAccount.addAll(Arrays.asList(clientAccount1, clientAccount2, clientAccount3, clientAccount4,
                clientAccount5, clientAccount6, clientAccount7));

        bank.hash.put(client1, List.of(clientAccount1));
        bank.hash.put(client2, List.of(clientAccount2, clientAccount3));
        bank.hash.put(client3, List.of(clientAccount4, clientAccount5));
        bank.hash.put(client4, List.of(clientAccount6, clientAccount7));

        bank.getAccounts(client2);
        client1.findClient(11);
    }
    HashMap<Client, List<Account>> hash = new HashMap<>();
    List<Client> listOfClient = new ArrayList<>();
    List<Account> listOfAccount = new ArrayList<>();

    Client getAccounts(Client client) {
        List<Account> hash1 = hash.get(client);
        System.out.println(hash1);
        return client;
    }
}