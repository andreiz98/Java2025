package session_4_java_op_and_statements;

public class JavaStatements {
    public static void main(String[] args) {

        int currentYear = 2025;
        int birthYear = 1995;

        int diffYears = currentYear - birthYear;

        // Check if the person is a minor (age less than 18)
        if (diffYears < 18) {
            System.out.println("sunt minor");
        }
        // Check if the person is older than 70
        else if (diffYears > 70) {
            System.out.println("opa the winter is comming");
        }
        // Check if the person is older than 65 (this condition is checked after > 70)
        else if (diffYears > 65) {
            System.out.println("am prins pensia");
        }
        // If none of the above conditions are met, the person is an adult
        else {
            System.out.println("sunt doar major");
        }
    }
}