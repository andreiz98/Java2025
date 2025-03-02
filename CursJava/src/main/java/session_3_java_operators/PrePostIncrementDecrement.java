package session_3_java_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {

        //post increment decrement operator
        int x = 5;
        int y = x++;
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 5

        int z = 4;
        int w = z--;
        System.out.println("z = " + z); // 3
        System.out.println("w = " + w); // 4

        //pre increment decrement operator
        int a = 5;
        int b = ++a;
        System.out.println("a = " + a); // 6
        System.out.println("b = " + b); // 6

        int c = 5;
        int d = --c;
        System.out.println("a = " + c); // 4
        System.out.println("b = " + d); // 4
    }
}
