package homework8.ex3;

import java.util.ArrayList;
import java.util.List;

public class BankAPK {
    private String firstName, lastName;
    private int id;
    private double balance;
    List<String> transactions;

    public BankAPK(String firstName, String lastName, int id, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.balance = initialDeposit;
        this.transactions = new ArrayList<>();
        transactions.add("Initial deposit: " + initialDeposit);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
            transactions.add("sum added: " + value);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double value) {
        if (value % 10 == 0 && value > 0 && value <= balance) {
            balance -= value;
            transactions.add("sum withdraw: " + value);
            System.out.println("New balance: " + balance);
        }
    }

    public void soldCont() {
        System.out.println("Your balance is: " + balance);
    }

    public void getDetails() {
        System.out.println("Transaction History for " + getFirstName() + " " + getLastName().substring(0, 3) + " (Account: " + id + "):");
        transactions.forEach(System.out::println);
    }
}
