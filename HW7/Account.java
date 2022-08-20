class Client extends Bank {
    String name;
    int age;
    public Client(String name, int age) {
        this.name = name;
        this.age = age;

    }
    @Override
    public String toString() {
        return name;
    }
}

public class Account extends Bank {
    int accountNumber;
    double goldBalance;
    public Account(int accountNumber, double goldBalance) {
        this.accountNumber = accountNumber;
        this.goldBalance = goldBalance;
    }

    @Override
    public String toString() {
        return String.valueOf(accountNumber);
    }
}
     /*    List<Account> listOfAccount = new ArrayList<>();
        static Account clientAccount1 = new Account(12345678, 5.4);
        static Account clientAccount2 = new Account(22345678, 5.0);
        static Account clientAccount3 = new Account(32345678, 5.5);
        static Account clientAccount4 = new Account(42345678, 5.3);
        static Account clientAccount5 = new Account(52345678, 6.3);
        static Account clientAccount6 = new Account(62345678, 6.1);
        static Account clientAccount7 = new Account(72345678, 5.0);*/
     /*   List<Account> listOfAccount = Arrays.asList(clientAccount1, clientAccount2, clientAccount3, clientAccount4,
                clientAccount5, clientAccount6, clientAccount7);*/
