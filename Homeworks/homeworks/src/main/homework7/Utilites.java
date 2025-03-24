package homework7;

import java.util.*;
import java.util.Arrays;

public class Utilites {

    public static void shoppingList(String item) {

        String[] list = new String[10];
        int count = 0;
        while (count < list.length) {
            if (item.equalsIgnoreCase("done")) {
                break;
            }
            list[count] = item;
            count++;
        }

        System.out.println("Your shopping list: " + Arrays.toString(Arrays.copyOf(list, count)));

    }

    public static void christmasList(String item) {
        ArrayList<String> list = new ArrayList<>();
        while (!item.equalsIgnoreCase("done")) {
            list.add(item);
        }

        System.out.println("Your shopping list: " + list);
    }

    public static void graduateList() {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack"};

        for (String name : names) {
            studentList.add(name);
        }
        graduateStudentList.add(String.valueOf(studentList.subList(0, studentList.size())));

        graduateStudentList.forEach(System.out::println);
    }

    public static void checkNumb() {
        int arraysize = 10, rangemin = -100, rangemax = 100;
        int[] list = new int[arraysize];
        Random random = new Random();
        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(rangemax - rangemin + 1) + rangemin;
        }

        for (int num : list) {
            if (num % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        System.out.println("even counter: " + evenCounter);
        System.out.println("odd counter: " + oddCounter);
    }

    public static void cityCheck(String newCity) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("iasi", "cluj", "buc", "bacau", "brasov"));

        if (cities.contains(newCity)) {
            System.out.println("it's a duplicate");
        } else {
            cities.add(newCity);
        }
    }

    public static void nameCheck() {
        LinkedList<String> students = new LinkedList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack"));

        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).equalsIgnoreCase("bob")) {
                students.remove(i);
            }
        }
        System.out.println(students);
    }

    public static void sortList() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("mere", "gutui", "cirese", "pere", "visine", "afine", "capsuni"));

        fruits.sort((fruit1, fruit2) -> {
            int length = Integer.compare(fruit2.length(), fruit1.length());
            if (length == 0) {
                return fruit1.compareToIgnoreCase(fruit2);
            }
            return length;
        });

        System.out.println("list sorted: " + fruits);
    }

    public static int movieFinder(String searchMovie) {
        String[] movies = {
                "Inception", "Titanic", "Avatar", "The Dark Knight",
                "Interstellar", "Joker", "Gladiator", "The Matrix"
        };

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(searchMovie)) {
                return i;
            }
        }
        return -1;
    }

    public static int binaryToInt(String number) {
        return Integer.parseInt(number, 2);
    }

    public static class diary {
        static ArrayList<String> diary = new ArrayList<>();

        static void addEntry(Scanner input) {
            System.out.print("Date (YYYY-MM-DD): ");
            String date = input.next();
            input.nextLine();
            for (String entry : diary)
                if (entry.startsWith(date)) {
                    System.out.println("Entry exists!");
                    return;
                }
            System.out.print("Entry: ");
            diary.add(0, date + ": " + input.nextLine());
            System.out.println("Added!");
        }

        static void editEntry(Scanner input) {
            System.out.print("Date to edit: ");
            String date = input.next();
            input.nextLine();
            for (int i = 0; i < diary.size(); i++)
                if (diary.get(i).startsWith(date)) {
                    System.out.print("New Entry: ");
                    diary.set(i, date + ": " + input.nextLine());
                    return;
                }
            System.out.println("Entry not found!");
        }

        static void deleteEntry(Scanner input) {
            System.out.print("Date to delete: ");
            String date = input.next();
            diary.removeIf(entry -> entry.startsWith(date));
            System.out.println("Deleted!");
        }

        static void viewEntries() {
            if (diary.isEmpty()) {
                System.out.println("No entries.");
            } else {
                diary.forEach(System.out::println);
            }
        }
    }

    public static int numberOfCoins(int value) {
        int[] coins = {1, 5, 10, 25};
        int result = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (value > coins[i]) {
                result += value / coins[i];
                value %= coins[i];
            }
        }
        return result;
    }

}
