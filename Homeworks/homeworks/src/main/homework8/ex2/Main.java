package homework8.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        Teacher teacher = new Teacher(input.next());

        Students student1 = new Students("alina", 1);
        Students student2 = new Students("denisa", 2);

        teacher.addStudent(student1);
        teacher.addStudent(student2);

        teacher.assignGrade(student1.getStudentId(), 10);
        teacher.assignGrade(student1.getStudentId(), 14);
        teacher.assignGrade(student1.getStudentId(), 22);
        teacher.assignGrade(student2.getStudentId(), 10);
        teacher.assignGrade(student2.getStudentId(), 45);
        teacher.assignGrade(student2.getStudentId(), 55);

        teacher.displayAllStudents();

    }
}

