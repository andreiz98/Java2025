package session_4_java_op_and_statements;

public class ForStatemants {
    public static void main(String[] args) {

        // Loop from 0 to 10 using a standard for-loop
        // 'i++' increases the value of i by 1 after each iteration
        for (int i = 0; i < 11; i++) {
            System.out.println(" valoarea lui i este: " + i);
        }

        // Loop from 0 to 10 with an increment of 2
        // This loop prints only the even values of i
        for (int i = 0; i < 11; i = i + 2) {
            System.out.println(" valoarea para a lui i este: " + i);
        }

        // Create an array containing the numbers 1 to 5
        int[] array = {1, 2, 3, 4, 5};
        // Enhanced for-loop to iterate through each element in the array
        for (int number : array) {
            // Print each number from the array to the console
            System.out.println("numarul din lista este: " + number);
        }
    }
}