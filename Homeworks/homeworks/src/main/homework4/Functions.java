package homework4;

import java.util.*;

class Functions {
    public static Scanner inputs() {
        return new Scanner(System.in);
    }

    public static void pickEx() {
        System.out.print("if you want to test only one exercise press 1, " +
                "if you want to test more than 1 press 2 or " +
                "3 to test all: ");
        int number = inputs().nextInt();

        switch (number) {
            case 1 -> {
                System.out.print("\nenter number(1-13) to pick what exercise do you want to test: ");
                int number2 = inputs().nextInt();
                switch (number2) {
                    case 1 -> evenOddChecker();
                    case 2 -> mountFinder();
                    case 3 -> checkNumbers();
                    case 4 -> reverseString();
                    case 5 -> fibonacciSeries();
                    case 6 -> sumNumbers();
                    case 7 -> luckyNumber();
                    case 8 -> fibonacci();
                    case 9 -> evenChecker();
                    case 10 -> showMenu();
                    case 11 -> averageSum();
                    case 12 -> sumof10();
                    case 13 -> pathFind();
                    default -> System.out.println("Invalid number");
                }
            }
            case 2 -> {
                ArrayList<Integer> list = new ArrayList<>();
                System.out.print("\nenter the numbers to pick what exercises do you want to test (type . when you finish the list): ");

                while (inputs().hasNextInt()) {
                    list.add(inputs().nextInt());
                }

                for (int num : list) {
                    switch (num) {
                        case 1 -> evenOddChecker();
                        case 2 -> mountFinder();
                        case 3 -> checkNumbers();
                        case 4 -> reverseString();
                        case 5 -> fibonacciSeries();
                        case 6 -> sumNumbers();
                        case 7 -> luckyNumber();
                        case 8 -> fibonacci();
                        case 9 -> evenChecker();
                        case 10 -> showMenu();
                        case 11 -> averageSum();
                        case 12 -> sumof10();
                        case 13 -> pathFind();
                        default -> System.out.println("Invalid number");
                    }
                }
            }
            case 3 -> {
                evenOddChecker();
                mountFinder();
                checkNumbers();
                reverseString();
                fibonacciSeries();
                sumNumbers();
                luckyNumber();
                fibonacci();
                evenChecker();
                showMenu();
                averageSum();
                sumof10();
                pathFind();
            }
            default -> System.out.println("number is not valid");
        }
    }

    //ex 1
    public static void evenOddChecker() {
        System.out.println("ex1");
        System.out.print("enter your number: ");
        int input = inputs().nextInt();
        int numberCheck = (input % 2 == 0) ? 1 : 2;
        switch (numberCheck) {
            case 1 -> System.out.println("Even");
            case 2 -> System.out.println("Odd");
            default -> System.out.println("number is not valid");
        }
        System.out.println();
    }

    //ex2
    public static void mountFinder() {
        System.out.println("ex2");
        System.out.print("enter your number: ");
        int number = inputs().nextInt();
        switch (number) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid Month");
        }
        System.out.println();
    }

    //ex3
    public static void checkNumbers() {
        int arraysize = 10, rangemin = -100, rangemax = 100;
        int[] array = new int[arraysize];
        Random random = new Random();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rangemax - rangemin + 1) + rangemin;
        }
        System.out.println("ex3");
        System.out.println("the list is: " + Arrays.toString(array));

        for (int num : array) {
            if (num < 0) {
                counter++;
            }
        }

        System.out.println("number of negative number is: " + counter);
        System.out.println();
    }

    //ex4
    public static void reverseString() {
        System.out.println("ex4");
        System.out.print("enter your string:");
        String userInput = inputs().nextLine();
        String newInput = String.valueOf(new StringBuilder(userInput).reverse());
        System.out.println("reverse string is: " + newInput);
        System.out.println();
    }

    //ex 5
    public static void fibonacciSeries() {
        System.out.println("ex5");
        System.out.print("enter the number n: ");
        int n = inputs().nextInt();
        int[] array = new int[n];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println("fibonacci series is: " + Arrays.toString(array));
        System.out.println();
    }

    //ex 6
    public static void sumNumbers() {
        int sum = 0;
        System.out.println("ex6");
        while (true) {
            System.out.print("enter your number: ");
            int input = inputs().nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
        }
        System.out.println("sum is: " + sum);
        System.out.println();
    }

    //ex7
    public static void luckyNumber() {
        int luck = 2;
        int number;
        System.out.println("ex7");
        do {
            System.out.print("enter your number: ");
            number = inputs().nextInt();
            int rightNumb = (number > 2) ? 1 : 2;
            switch (rightNumb) {
                case 1 -> System.out.println("too high");
                case 2 -> System.out.println("too low");
            }
        } while (number != luck);
        System.out.println();
    }

    //ex8
    public static void fibonacci() {
        int n = 10;
        int[] array = new int[n];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println("ex8");
        System.out.println("fibonacci series is: " + Arrays.toString(array));
        System.out.println();
    }

    //ex9
    public static void evenChecker() {
        int arraysize = 10, rangemin = 1, rangemax = 100;
        int[] array = new int[arraysize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rangemax - rangemin + 1) + rangemin;
        }
        System.out.println("ex9");
        for (int num : array) {
            int numberCheck = (num % 2 == 0) ? 1 : 2;
            switch (numberCheck) {
                case 1 -> System.out.println(num + " Even");
                case 2 -> System.out.println(num + " Odd");
                default -> System.out.println("number is not valid");
            }
        }
        System.out.println();
    }

    //ex10
    public static void showMenu() {
        System.out.println("ex10");
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print 'Hello World'");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int input = inputs().nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Hello world");
                }
                case 2 -> {
                    System.out.print("Enter your name: ");
                    String userName = inputs().next();
                    System.out.println(userName);
                }
                case 3 -> {
                    System.out.print("Goodbye");
                    return;
                }
                default -> System.out.println("Invalid choice! Please enter 1, 2, or 3.");

            }
        }
    }

    //ex11
    public static void averageSum() {
        int count = 0, sum = 0;
        System.out.println("\nex11");
        while (true) {
            System.out.print("enter your number: ");
            int input = inputs().nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("average is: " + average);
        } else {
            System.out.println("0 was entered");
        }
        System.out.println();
    }

    //ex12
    public static void sumof10() {
        int count = 0, sum = 0;
        System.out.println("ex12");
        while (true) {
            System.out.print("enter your number: ");
            int input = inputs().nextInt();
            if (input <= 5) {
                continue;
            }
            sum += input;
            count++;
            if (count == 10) {
                break;
            }
        }
        System.out.println("sum is: " + sum);
        System.out.println();
    }

    //ex13
    static char[][] maze = {
            {'s', '1', '0', '1'},
            {'0', '1', '0', '1'},
            {'0', '1', '0', '1'},
            {'0', '0', '0', 'e'}};

    static int rows = maze.length;
    static int cols = maze[0].length;
    static boolean pathFound = false;

    public static void pathFind() {
        int startX = -1, startY = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; i < maze[0].length; i++) {
                if (maze[i][j] == 's') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }

        if (startX == -1 || startY == -1) {
            System.out.println("No start position found.");
            return;
        }

        // Solve the maze using DFS
        if (dfs(startX, startY)) {
            System.out.println("Solution found:\n");
            for (char[] array : maze) {
                for (char c : array) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution found.");
        }
    }

    static boolean dfs(int x, int y) {
        // If out of bounds or hitting a wall or already visited, return false
        if (x < 0 || x >= rows || y < 0 || y >= cols || maze[x][y] == '1' || maze[x][y] == '*') {
            return false;
        }

        // If we found the end, return true
        if (maze[x][y] == 'e') {
            pathFound = true;
            return true;
        }

        // Mark the path
        char temp = maze[x][y]; // Save current cell
        maze[x][y] = '*'; // Mark the path

        // Explore in all 4 directions
        if (dfs(x - 1, y) || dfs(x + 1, y) || dfs(x, y - 1) || dfs(x, y + 1)) {
            return true;
        }

        // If no path was found, backtrack
        maze[x][y] = temp; // Restore original cell
        return false;
    }

}
