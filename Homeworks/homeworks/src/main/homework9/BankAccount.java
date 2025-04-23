package homework9;

public class BankAccount {
    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    private static int nextAccountNumber = 100000;
    
    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = "BA" + nextAccountNumber++;
        if (initialDeposit > 0) {
            this.balance = initialDeposit;
        } else {
            System.out.println("Initial deposit must be positive. Setting balance to 0.");
            this.balance = 0;
        }
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + "$ into " + accountNumber);
        } else {
            System.out.println("amount must be positive.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Available balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + accountNumber);
        }
    }
    
    public double getBalance() {
        return balance;
    }

    public void getAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    
    public void transferFunds(BankAccount targetAccount, double amount) {
        if (targetAccount == null) {
            System.out.println("Invalid target account.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Transfer amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds to complete the transfer.");
        } else {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " to account " + targetAccount.accountNumber);
        }
    }
}

class TestBankAccount {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John Doe", 500);
        BankAccount acc2 = new BankAccount("Jane Smith", 300);

        acc1.getAccountDetails();
        acc2.getAccountDetails();

        acc1.deposit(150);
        acc1.withdraw(100);
        acc1.withdraw(600);

        acc2.deposit(-50);
        
        acc1.transferFunds(acc2, 200);
        acc1.transferFunds(acc2, 1000); 

        System.out.println("\nFinal Account States:");
        acc1.getAccountDetails();
        acc2.getAccountDetails();
    }
}