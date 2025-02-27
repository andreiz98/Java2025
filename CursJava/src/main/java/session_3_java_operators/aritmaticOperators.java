package session_3_java_operators;

public class aritmaticOperators {
    public static void main(String[] args) {

        int valA = 22;
        int valB = 2;
        int valC = 4;
        int valD = 5;

        int rez1 = valA - valB / valC;
        System.out.println("rez:" + rez1);

        int rez2 = (valA - valB) / valC;
        System.out.println("rez1:" + rez2);

        int rez3 = valA / valC * valD + valB;
        System.out.println("rez2:" + rez3);

        int rez4 = valA/(valC*(valD+valB));
        System.out.println("rez3:" + rez4);

        System.out.println("a = " + (valA+=valB));



    }
}
