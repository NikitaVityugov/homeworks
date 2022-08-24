class Client extends Bank {
    String name;
    int age;
    int idNumber;
    public Client(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }
    @Override
    public String toString() {
        return name;
    }
    public String findClient(int idNumber) {
        System.out.println(name);
        return name;
    }
}

public class Account extends Bank {
    int accountNumber;
    double goldBalance;
    int idNumber;
    public Account(int accountNumber, double goldBalance, int idNumber) {
        this.accountNumber = accountNumber;
        this.goldBalance = goldBalance;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(accountNumber);
    }
}