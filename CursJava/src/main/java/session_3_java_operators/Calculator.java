package session_3_java_operators;

public class Calculator {
    public static void main(String[] args) {

        int valA = 3;
        int valB = 2;
        int rez;
        char op = 'd';

        if (op=='a'){
            rez=valA+valB;
        } else if (op=='s') {
            rez=valA-valB;
        } else if (op=='d') {
            rez=valA/valB;
        } else if (op=='m') {
            rez=valA*valB;
        }else {
            System.out.println("nu e setat op");
            rez=0;
        }
        System.out.println(rez);
    }
}
