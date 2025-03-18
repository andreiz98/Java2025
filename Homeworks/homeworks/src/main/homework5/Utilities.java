package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Utilities {
    public static Scanner inputs() {
        return new Scanner(System.in);
    }

    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String message, int shiftKey) {
        message = message.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < message.length(); i++) {
            int charPosition = alpha.indexOf(message.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static String decrypt(String text, int shiftKey) {
        return encrypt(text, 26 - (shiftKey % 26)); // Decryption is just shifting backwards
    }

    public static String convertToSnakeCase(String camelCase) {
        StringBuilder snakeCase = new StringBuilder();

        for (char character : camelCase.toCharArray()) {
            int number = Character.isUpperCase(character) ? 0 : 1;
            switch (number) {
                case 0 -> {
                    if (snakeCase.length() > 0) {
                        snakeCase.append('_'); // Add underscore before uppercase letters (except first)
                    }
                    snakeCase.append(Character.toLowerCase(character));
                }
                case 1 -> snakeCase.append(character);
            }
        }

        return snakeCase.toString();
    }

    public static String expand(String compressed) {
        StringBuilder expanded = new StringBuilder();
        int length = compressed.length();
        for (int i = 0; i < length; i++) {
            char currentChar = compressed.charAt(i);

            if (Character.isLetter(currentChar)) {
                int count = 0;

                while (i + 1 < length && Character.isDigit(compressed.charAt(i + 1))) {
                    count = count * 10 + (compressed.charAt(i + 1) - '0'); // Handle multi-digit numbers
                    i++;
                }

                for (int j = 0; j < count; j++) {
                    expanded.append(currentChar);
                }
            }
        }
        return expanded.toString();
    }

    public static String removeComments(String code) {
        StringBuilder result = new StringBuilder();
        boolean insideSingleLineComment = false;
        boolean insideMultiLineComment = false;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            // Detect single-line comment (//)
            if (!insideMultiLineComment && i < code.length() - 1 && c == '/' && code.charAt(i + 1) == '/') {
                insideSingleLineComment = true;
                i++; // Skip next '/'
            }
            // Detect multi-line comment (/*)
            else if (!insideSingleLineComment && i < code.length() - 1 && c == '/' && code.charAt(i + 1) == '*') {
                insideMultiLineComment = true;
                i++; // Skip next '*'
            }
            // Detect end of multi-line comment (*/)
            else if (insideMultiLineComment && i < code.length() - 1 && c == '*' && code.charAt(i + 1) == '/') {
                insideMultiLineComment = false;
                i++; // Skip next '/'
            }
            // Detect end of single-line comment (newline)
            else if (insideSingleLineComment && c == '\n') {
                insideSingleLineComment = false;
                result.append(c); // Keep newline
            }
            // Add valid characters
            else if (!insideSingleLineComment && !insideMultiLineComment) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean Anagrams() {
        System.out.println("\nEnter first string: ");
        String str1 = inputs().next();
        System.out.println("\nEnter second string: ");
        String str2 = inputs().next();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        char[] charArray1 = sb1.toString().toCharArray();
        char[] charArray2 = sb2.toString().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            // Check if character is uppercase, then convert to lowercase
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            }
            // Check if character is lowercase, then convert to uppercase
            else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            }
            // If it's not a letter, keep it the same
            else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static String intToRoman(int value) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= values.length; i++) {
            while (value >= values[i]) {
                result.append(symbols[i]);
                value -= values[i];
            }
        }
        return result.toString();
    }
}
