package session_3_java_operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // Declare and initialize integer variables
        int valA = 21; // First value
        int valB = 6; // Second value
        int valC = 3; // Third value
        int valD = 1; // Fourth value

        // Calculate the first result: Division occurs before subtraction due to operator precedence
        int rez1 = valA - valB / valC;
        System.out.println("Rez1 = " + rez1);

        // Calculate the second result: Parentheses force subtraction before division
        int rez2 = (valA - valB) / valC;
        System.out.println("Rez2 = " + rez2);

        // Calculate the third result: Division and multiplication have equal precedence, evaluated from left to right
        int rez3 = valA / valC * valD + valB;
        System.out.println("Rez3 = " + rez3);

        // Calculate the fourth result: Parentheses control the order of operations
        int rez4 = valA / (valC * (valD + valB));
        System.out.println("Rez4 = " + rez4);

        int a = 2;
        int b = 3;
        int c = 4;

        // Compound assignment operators
        // a += b; // a = a + b
        // a += b + 12; //a = a + (b + 12)
        // System.out.println("a = " + a);
        // Compound assignment operator with multiplication
        // a *= c * 2 + 2; // Equivalent to a = a * (c * 2 + 2);
        // System.out.println("a = " + a);

        // Compound assignment operator with increment/decrement
        b *= a-- + ++c * 2;
        // b = b * (a-- + ++c * 2)
        // b = b * (a-- + 5 * 2)
        // b = b * (2-- + 10)
        // b = b * 12     a = 1
        System.out.println("B =  " + b);
    }
}
