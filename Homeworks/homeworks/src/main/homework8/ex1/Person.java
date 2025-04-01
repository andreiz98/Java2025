package homework8.ex1;

import java.time.LocalDate;

public class Person {
    private String firstName, lastName;
    private String address;
    private char sex;
    private int age;
    private long CNP;
    private LocalDate dateBirth;

    public Person(String firstName, String lastName, char sex, int age, long cnp, LocalDate birthDate, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.CNP = cnp;
        this.dateBirth = birthDate;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public long getCNP() {
        return CNP;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public static boolean ageCheck(int age) {
        return age >= 18;
    }

    public void getDetails() {
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0 -> System.out.println(getFirstName());
                case 1 -> System.out.println(getLastName());
                case 2 -> System.out.println(getCNP());
                case 3 -> System.out.println(getDateBirth());
                case 4 -> System.out.println(getAge());
                case 5 -> System.out.println(getSex());
                case 6 -> System.out.println(getAddress());
            }
        }
    }

    public static boolean genderCheck(char gender) {
        return gender == 'M' || gender == 'F';
    }

    public static boolean cnpCheck(long cnp) {
        if (cnp != 13) {
            return false;
        } else {
            char firstDigit = Long.toString(cnp).charAt(0);
            final boolean cond = !(Character.getNumericValue(firstDigit) == 1 || Character.getNumericValue(firstDigit) == 2);
            if (cond) {
                do {
                    System.out.println("first digit should be 1 or 2");
                } while (true);
            }
            return true;
        }
    }
}

class Students extends Person {
    public Students(String firstName, String lastName, char sex, int age, long cnp, LocalDate birthDate, String address) {
        super(firstName, lastName, sex, age, cnp, birthDate, address);
    }
}

class Professors extends Person {
    public Professors(String firstName, String lastName, char sex, int age, long cnp, LocalDate birthDate, String address) {
        super(firstName, lastName, sex, age, cnp, birthDate, address);
    }
}

