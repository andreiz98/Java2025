package homework8.ex4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FitnessTracking tracker = new FitnessTracking();

        while (true) {
            System.out.println("1. Log Workout");
            System.out.println("2. Set Weekly Goal");
            System.out.println("3. Generate Weekly Summary");
            System.out.println("4. Search Workouts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter workout type (Running, Weightlifting, Yoga): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter duration (in minutes): ");
                    int duration = scanner.nextInt();
                    System.out.print("Enter distance (if applicable, else 0): ");
                    double distance = scanner.nextDouble();
                    System.out.print("Enter weight lifted (if applicable, else 0): ");
                    double weightLifted = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    int year = scanner.nextInt();
                    int month = scanner.nextInt();
                    int day = scanner.nextInt();
                    LocalDate date = LocalDate.of(year,month,day);
                    tracker.logWorkout(type, duration, distance, weightLifted, date);
                }
                case 2 -> {
                    System.out.print("Enter workout type: ");
                    String goalType = scanner.nextLine();
                    System.out.print("Enter goal amount: ");
                    double goal = scanner.nextDouble();
                    tracker.setWeeklyGoal(goalType, goal);
                }
                case 3 -> tracker.generateWeeklySummary();
                case 4 -> {
                    System.out.print("Enter workout type to search (or press Enter to skip): ");
                    String searchType = scanner.nextLine();
                    System.out.print("Enter date to search (or press Enter to skip): ");
                    String searchDate = scanner.nextLine();
                    tracker.searchWorkouts(searchType.isEmpty() ? null : searchType, searchDate.isEmpty() ? null : searchDate);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
