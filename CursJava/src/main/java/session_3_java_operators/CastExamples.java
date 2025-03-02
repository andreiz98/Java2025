package session_3_java_operators;

public class CastExamples {

    public static void main(String[] args) {

        // Declare variables of different numeric types
        float floatVal = 1.0f; // Single-precision floating-point number
        double doubleVal = 4.0d; // Double-precision floating-point number
        byte byteVal = 7; // 8-bit integer
        short shortVal = 7; // 16-bit integer
        int intVal = 10; // 32-bit integer
        long longVal = 5; // 64-bit integer
        long longVal2 = 513157145134615L; // Large 64-bit integer

        //Implicit conversion:byte to short
        short rez1 = byteVal; // Allowed because byte is smaller than short

        // Explicit conversion: long to short (potential data loss)
        short rez2 = (short) longVal; // Cast long to short, might lose precision
        short rez3 = (short) longVal2; // Cast large long to short, significant data loss
        System.out.println("rez3 = " + rez3); // Print the result of the cast

        int rez4 = (int) 1.0f;
        System.out.println("rez4 = " + rez4);

        // Mixed-type arithmetic: long to float (implicit conversion)
        float rez5 = longVal - floatVal; // Subtract float from long, result is float
        System.out.println("rez5 = " + rez5); // Print the result of the calculation

        intVal = Integer.MIN_VALUE;
        System.out.println("valoare minima int " + intVal);
        intVal = Integer.MAX_VALUE;
        System.out.println("valoare maxima int " + intVal);

        longVal = Long.MIN_VALUE;
        System.out.println("valoare minima long " + longVal);
        longVal = Long.MAX_VALUE;
        System.out.println("valoare maxima long " + longVal);
    }
}
