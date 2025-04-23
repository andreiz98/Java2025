package homework10;

public abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    @Override
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    @Override
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    @Override
    int getBalance() {
        return 200;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Bank A Balance: $" + bankA.getBalance());
        System.out.println("Bank B Balance: $" + bankB.getBalance());
        System.out.println("Bank C Balance: $" + bankC.getBalance());
    }
}
