package session_3_java_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isPresent = true;
        boolean isRegistered = false;

        System.out.println("isPresent = " + isPresent);
        System.out.println("isRegistered = " + isRegistered);
        System.out.println("!isPresent = " + !isPresent);
        System.out.println("!isRegistered = " + !isRegistered);

        int a = 10, b = 20;

        System.out.println(a == b); //false - equal operator
        System.out.println(a != b); //true
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Compare two integer values using if-else statements
        int valA = 3;
        int valB = 3;

        if (valA < valB) {
            System.out.println("First number is less than second one");
            valB++; // Increment valB if the condition is true
        } else if (valB < valA) {
            System.out.println("Second number is less than first one");
        } else {
            System.out.println("Numbers are equals!");
        }

        // Ternary operator: condition ? value if true : value if false
        a = !(3 < 5) ? 4 : 5; // a will be 5 because 3 is less than 5
        System.out.println("a = " + a);
    }
}
