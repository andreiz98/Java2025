package homework8.ex3;

public class Main {
    public static void main(String[] args) {
        BankAPK account = new BankAPK("andrei", "zaharia", 1,50000);

        account.deposit(200.00);
        account.withdraw(100.00);
        account.soldCont();
        account.getDetails();
    }
}
