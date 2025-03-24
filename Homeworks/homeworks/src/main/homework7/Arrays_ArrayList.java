package homework7;

import java.util.Scanner;
import static homework7.Utilites.diary.*;

public class Arrays_ArrayList extends Utilites {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number(1-11): ");
        int number = input.nextInt();

        switch (number) {
            case 1 -> {
                System.out.print("Enter you shopping list(type done when you want to exit): ");
                shoppingList(input.next());
            }
            case 2 -> {
                System.out.print("Enter you christmas list(type done when you want to exit): ");
                christmasList(input.next());
            }
            case 3 -> graduateList();
            case 4 -> checkNumb();
            case 5 -> {
                System.out.print("add a new city: ");
                cityCheck(input.next());
            }
            case 6 -> nameCheck();
            case 7 -> sortList();
            case 8 -> {
                System.out.print("Enter the movie title to search: ");
                int position = movieFinder(input.next());

                if (position != -1) {
                    System.out.println("Movie found at position: " + position);
                } else {
                    System.out.println("Movie not found in the list.");
                }
            }
            case 9 -> {
                System.out.print("Enter binary number: ");
                int numberConverted = binaryToInt(input.next());
                System.out.println("interger number: " + numberConverted);
            }
            case 10 -> {
                System.out.println("\n1. Add Entry  2. Edit Entry  3. Delete Entry  4. View Entries  5. Exit");
                while (true) {
                    switch (input.nextInt()) {
                        case 1 -> addEntry(input);
                        case 2 -> editEntry(input);
                        case 3 -> deleteEntry(input);
                        case 4 -> viewEntries();
                        case 5 -> {
                            input.close();
                            return;
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                }
            }
            case 11 -> {
                System.out.print("Enter amount: ");
                int amount = input.nextInt();
                System.out.println("number of coins needed: " + numberOfCoins(amount));
            }
            default -> System.out.println("invalid number");
        }

        input.close();
    }
}
