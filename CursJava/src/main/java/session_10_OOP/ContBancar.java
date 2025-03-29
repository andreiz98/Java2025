package session_10_OOP;

public class ContBancar {

    private String titular;
    private int sold;

    private static double dobanda = 0.08;

    public ContBancar(String titular, int soldInitial) {
        this.titular = titular;
        this.sold = soldInitial;
    }

    public void depunere(int suma) {
        if (suma > 0) {
            sold += suma;
        } else {
            System.out.println("invalid sold");
        }
    }

    public void retragere(int suma) {
        if (suma > 0 && suma <= sold) {
            sold -= suma;
        } else {
            System.out.println("you are broke");
        }
    }

    public static void setDobanda(double dobanda1) {
        if (dobanda1 >= 0) {
            dobanda = dobanda1;
        } else {
            System.out.println("error");
        }
    }

    public void getDetails() {
        System.out.println("titular: " + titular);
        System.out.println("sold: " + sold);
        System.out.println("dobanda: " + dobanda);
    }
}
