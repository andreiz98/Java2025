package session_3_java_operators;

public class Cast {
    public static void main(String[] args) {

        byte valA = 4;
        int valB = 2;
        float valC = 1.04f;
        double valD = 13.21d;
        long valE = 3123125345345345L;
        short valF = 2;

        valF = valA;
        System.out.println(valF);

        valC=valE;
        System.out.println(valC);

        valB = Integer.MIN_VALUE;
        System.out.println(valB);
        valB = Integer.MAX_VALUE;
        System.out.println(valB);
    }
}
