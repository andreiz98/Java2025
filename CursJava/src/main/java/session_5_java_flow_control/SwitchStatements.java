package session_5_java_flow_control;

import java.util.Locale;
import java.util.Scanner;

public class SwitchStatements {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;

    public static void main(String[] args) {
        printDayOfWeek();
        printDayOfWeekSimpleEdition();
        printGrade();
        printSeason();
    }

    private static void printDayOfWeek(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Insert day of week (1-5) :");
        int day = input.nextInt();

        switch (day){
            case MONDAY:
                System.out.println("today is Monday");
                break;
            case TUESDAY:
                System.out.println("today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("today is Thursday");
                break;
            case FRIDAY:
                System.out.println("today is Friday");
                break;
            default:
                System.out.println("invalid day");
        }
    }

    private static void printDayOfWeekSimpleEdition(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Insert day of week (1-5) :");
        int day = input.nextInt();

        switch (day){
            case MONDAY -> System.out.println("today is Monday");
            case TUESDAY -> System.out.println("today is Tuesday");
            case WEDNESDAY -> System.out.println("today is Wednesday");
            case THURSDAY -> System.out.println("today is Thursday");
            case FRIDAY -> {
                System.out.println("today is Friday");
                System.out.println("it is still Friday");
            }
            default -> System.out.println("invalid day");
        }
    }

    private static void printGrade(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Insert a Grade (A,B,C,D) :");
        String gradeString = input.nextLine().toUpperCase();
        char grade = gradeString.charAt(0);
//        char grade2 = 'A';

        switch (grade){
            case 'A' -> System.out.println("excelent");
            case 'B' -> System.out.println("good");
            case 'C' -> System.out.println("almost good");
            case 'D' -> System.out.println("bad");
            default -> System.out.println("invalid grade");
        }
    }

    private static void printSeason(){
        String season = "summer";

        switch (season){
            case "winter" -> System.out.println("it is cold");
            case "spring" -> System.out.println("flowers bloom");
            case "summer" -> System.out.println("it is hot");
            case "autumn" -> System.out.println("leaves fall");
            default -> System.out.println("invalid season");
        }
    }
}
