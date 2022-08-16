import java.util.*;

class Client extends Bank {
    String name;
    int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Client client1 = new Client("Nikita", 29);
    Client client2 = new Client("Alexander", 55);
    Client client3 = new Client("Irina", 54);
    Client client4 = new Client("Anastasia", 30);


    List<Client> listOfClient = Arrays.asList(client1, client2, client3, client4);

}


public class Account extends Bank {

    int accountNumber;
    double goldBalance;

    public Account(int accountNumber, double goldBalance) {
        this.accountNumber = accountNumber;
        this.goldBalance = goldBalance;
    }

        Account clientAccount1 = new Account(12345678, 5.4);
        Account clientAccount2 = new Account(22345678, 5.0);
        Account clientAccount3 = new Account(32345678, 5.5);
        Account clientAccount4 = new Account(42345678, 5.3);
        Account clientAccount5 = new Account(52345678, 6.3);
        Account clientAccount6 = new Account(62345678, 6.1);
        Account clientAccount7 = new Account(72345678, 5.0);

    //    List<Account> listOfAccount = new ArrayList<>();

        List<Account> listOfAccount = Arrays.asList(clientAccount1, clientAccount2, clientAccount3, clientAccount4,
                clientAccount5, clientAccount6, clientAccount7);

}