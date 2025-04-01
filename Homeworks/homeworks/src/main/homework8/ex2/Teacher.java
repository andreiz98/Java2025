package homework8.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {
    private String name;
    private List<Students> students;

    public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public List<Students> getStudents() {
        return students;
    }

    public void assignGrade(int studentId, int grade) {
        for (Students student : students) {
            if (student.getStudentId() == studentId) {
                student.addGrade(grade);
                return;
            }
        }
        System.out.println("Student ID " + studentId + " not found.");
    }

    public void displayAllStudents() {
        System.out.println("\nStudents in " + name + "'s class:");
        for (Students student : students) {
            student.displayStudentInfo();
        }
    }
}

class Students {
    private String name;
    private int studentId;
    private List<Integer> grades;

    public Students(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void addGrade(int grade) {
        if (grade > 0) {
            grades.add(grade);
        } else {
            System.out.println("invalid grade, add it again");
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public String checkGraded() {
        String grade = "";
        double score = getAverageGrade();
        if (score > 0 && score < 60) {
            grade = "F";
        } else if (score > 59 && score < 70) {
            grade = "D";
        } else if (score > 70 && score < 80) {
            grade = "C";
        } else if (score > 80 && score < 90) {
            grade = "B";
        } else {
            grade = "A";
        }
        return grade;
    }

    public void displayStudentInfo() {
        System.out.println("ID: " + getStudentId() + ", Name: " + getName() + ", Average Grade: " + checkGraded());
    }
}
