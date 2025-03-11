package session_5_java_flow_control;

public class FlowControl {
    public static void main(String[] args) {
        printNumberWhileDo(5);
        printNumberDoWhile(1);
        printNumbersFor(10);
        int[] arrray = {1, 2, 3, 4, 5};
        printNumbersForEach(arrray);
        int[][] complexArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //                       0,1,2   0,1,2   0,1,2\
        printListOfList(complexArray);
        printNumbersUsingBreak(2, 5);
    }

    public static void printNumberWhileDo(int number) {
        while (number <= 10) {
            System.out.println("number is :" + number);
            number++;
        }
    }

    public static void printNumberDoWhile(int number) {
        do {
            System.out.println("number is :" + number);
            number++;
        } while (number <= 10);
    }

    public static void printNumbersFor(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println("number is: " + i);
        }
    }

    public static void printNumbersForEach(int[] array) {
        for (int number : array) {
            System.out.println("number from array is: " + number);
        }
    }

    public static void printListOfList(int[][] complexArray) {
        for (int[] simpleArray : complexArray) {
            for (int i = 0; i < simpleArray.length; i++) {
                System.out.print(simpleArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void printNumbersUsingBreak(int number1, int number2) {
        int i = 0;
        while (i <= 10) {
            if (i == number1) {
                i = i + 1;
                continue;
            }
            if (i == number2) {
                break;
            }
            System.out.println("number is: " + i++);
        }
    }
}
