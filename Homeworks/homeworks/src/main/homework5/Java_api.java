package homework5;

public class Java_api {
    public static void main(String[] args) {
        Utilities utilities = new Utilities();
        //ex1
        System.out.println("Enter string: ");
        String originalText = utilities.inputs().next();
        System.out.println("Enter shift: ");
        int shift = utilities.inputs().nextInt();

        String encryptedText = utilities.encrypt(originalText, shift);
        System.out.println("Encrypted: " + encryptedText);

        String decryptedText = utilities.decrypt(encryptedText, shift);
        System.out.println("Decrypted: " + decryptedText);
        System.out.println();

        //ex2
        System.out.println("Enter camel string: ");
        String camelCase = utilities.inputs().next();
        String snakeCase = utilities.convertToSnakeCase(camelCase);
        System.out.println("\nSnake Case: " + snakeCase);

        //ex3
        System.out.println("\nEnter compressed string: ");
        String compressed = utilities.inputs().next();
        String expanded = utilities.expand(compressed);
        System.out.println("Expanded: " + expanded);

        //ex4
        System.out.println("\nEnter your code: ");
        String code = utilities.inputs().next();
        System.out.println(utilities.removeComments(code));

        //ex5
        if (utilities.Anagrams()) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        //ex6
        System.out.println("Enter string: ");
        String input = utilities.inputs().next();
        String toggled = utilities.toggleCase(input);
        System.out.println("Toggled Case: " + toggled);

        //extra
        System.out.println("Enter your number: ");
        int number = utilities.inputs().nextInt();
        System.out.println("Roman Numeral: " + utilities.intToRoman(number));

        utilities.inputs().close();
    }
}
