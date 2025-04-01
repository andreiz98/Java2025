package homework8.ex1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Students> students = new ArrayList<>();
        ArrayList<Professors> professors = new ArrayList<>();
        String[] courses = {"Math", "Computer", "Science", "Physics", "Chemistry", "Biology", "Geography", "English", "History" };

        System.out.print("Enter students number and create them: ");
        int studentNumber = input.nextInt();

        for (int i = 0; i < studentNumber; i++) {
            System.out.print("Enter your first name: ");
            String firstName = input.next();

            System.out.print("Enter your last name: ");
            String lastName = input.next();

            long cnp;
            do {
                System.out.print("Enter your CNP: ");
                cnp = input.nextLong();
            } while (!Students.cnpCheck(cnp));

            System.out.print("Enter your birth date(YYYY-MM-DD): ");
            LocalDate dateBirth = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            System.out.print("Enter your gender(M/F): ");
            char gender = input.next().charAt(0);

            if (!Students.genderCheck(gender)) {
                System.out.println("gender is incorrect");
                break;
            }

            int age = Period.between(dateBirth, LocalDate.now()).getYears();

            System.out.print("Enter your address from the id: ");
            String address = input.nextLine();

            if (!Students.ageCheck(age)) {
                System.out.println("you can't be student(age < 18)");
                break;
            }

            students.add(new Students(firstName, lastName, gender, age, cnp, dateBirth, address));
        }

        students.forEach(Students::getDetails);

        System.out.print("Enter professors number and create them: ");
        int professorsNumber = input.nextInt();

        for (int i = 0; i < professorsNumber; i++) {
            System.out.print("Enter your first name: ");
            String firstName = input.next();

            System.out.print("Enter your last name: ");
            String lastName = input.next();

            long cnp;
            do {
                System.out.print("Enter your CNP: ");
                cnp = input.nextLong();
            } while (!Professors.cnpCheck(cnp));

            System.out.print("Enter your birth date(YYYY-MM-DD): ");
            LocalDate dateBirth = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            System.out.print("Enter your gender(M/F): ");
            char gender = input.next().charAt(0);

            if (!Professors.genderCheck(gender)) {
                System.out.println("gender is incorrect");
                break;
            }

            int age = Period.between(dateBirth, LocalDate.now()).getYears();

            System.out.print("Enter your address from the id: ");
            String address = input.nextLine();

            if (!Professors.ageCheck(age)) {
                System.out.println("you can't be student(age < 18)");
                break;
            }

            professors.add(new Professors(firstName, lastName, gender, age, cnp, dateBirth, address));
        }

        professors.forEach(Professors::getDetails);

        Course math = new Course(courses[0], "Mon-Wed-Fri 10AM-12PM", "3 months", "Basic Mathematics");
        math.setAssignedProfessor(professors.get(1));
        math.displayCourseDetails();
    }
}
