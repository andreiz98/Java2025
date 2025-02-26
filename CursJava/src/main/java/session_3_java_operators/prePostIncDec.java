package session_3_java_operators;

public class prePostIncDec {
    public static void main(String[] args) {

        //post
        int x = 5;
        int y = x++;

        System.out.println("x=" + x);
        System.out.println("y=" + y);

        int z = 4;
        int w = z--;

        System.out.println("z=" + z);
        System.out.println("y=" + w);

        //pre
        int a = 5;
        int b = ++a;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int c = 4;
        int d = --c;

        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }
}
