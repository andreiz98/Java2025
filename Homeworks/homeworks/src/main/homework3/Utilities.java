package homework3;

import java.util.ArrayList;
import java.util.Scanner;

class setString {
    String value;

    public setString(String value) {
        this.value = value;
    }
}

class Opreations {
    public void AddMulti() {
        int a = 10, b = 20, c = 30, d = 40;
        int additionResult, multiplicationResult;

        additionResult = a + b;
        multiplicationResult = c * d;

        System.out.println("\nadditionResult is: " + additionResult);
        System.out.println("multiplicationResult is: " + multiplicationResult);
    }

    public void Compound(int val) {
        val -= 20;
        System.out.println("\nvalue is: " + val);
        val *= 2;
        System.out.println("new value is: " + val);
    }

    public void Transform(int val) {
        val = -val;
        System.out.println("\nvalue is: " + val);
        val = Math.abs(val);
        System.out.println("new value after abs is: " + val);
        val++;
        System.out.println("new value after increment is: " + val);
    }
}

class Utilities {

    public void GetString() {
        setString stringOne = new setString("OpenAI");
        setString stringTwo = new setString("OpenAI");
        if (stringOne == stringTwo) {
            System.out.println("stringOne and stringTwo refer to the same object.");
        } else {
            System.out.println("stringOne and stringTwo do NOT refer to the same object.");
        }
    }

    public void CompareNumber(int firstnumber, int secondnumber) {
        if (firstnumber == secondnumber) {
            System.out.println("\nfirstNumber and secondNumber are equal.");
        } else {
            System.out.println("\nfirstNumber and secondNumber are not equal.");
        }
    }

    public void CompareString() {
        setString firstString = new setString("abc");
        setString secondString = new setString("abc");
        if (firstString.equals(secondString)) {
            System.out.println("\nfirstString and secondString have the same value.");
        } else {
            System.out.println("\nfirstString and secondString do NOT have the same value.");
        }
    }

    public int setAge(int age) {
        return age;
    }

    public int SetHeight(int heightOne, int heightTwo) {
        int maxHeight;
        if (heightOne > heightTwo) {
            maxHeight = heightOne;
        } else {
            maxHeight = heightTwo;
        }
        return maxHeight;
    }

    public void PrintLoop() {
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i is: " + i);
        }
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i even is: " + i);
            }
        }
    }

    public void CheckTemperature(double temperature) {
        if (temperature > 30) {
            System.out.println("\nHot");
        } else if (temperature >= 20) {
            System.out.println("\nWarm");
        } else {
            System.out.println("\nCold");
        }
    }

    public void CheckType(int sideOne, int sideTwo, int sideThree) {
        String triangleType;
        if (sideOne == sideTwo && sideTwo == sideThree) {
            triangleType = "Equilateral";
        } else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }
        System.out.println("\nThe triangle is: " + triangleType);
    }

    public void Factorial() {
        long factorialNumber = 1;
        int num = 5;
        for (int i = num; i >= 1; i--) {
            factorialNumber *= i;
        }
        System.out.println("\nThe factorial number is: " + factorialNumber);
    }

    public void CheckCountry(String contryOne, String contryTwo) {
        if (contryOne.equals(contryTwo)) {
            System.out.println("\nthe country are the same");
        } else {
            System.out.println("\nthe country not are the same");
        }
        contryTwo = "UK";
        if (contryOne.equals(contryTwo)) {
            System.out.println("he country are the same");
        } else {
            System.out.println("the country not are the same");
        }
    }

    public void arrayList() {
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOne.add(String.valueOf(i));
        }

        listTwo = listOne;
        listOne.add("8");

        System.out.println("\nlist one is: " + listOne);
        System.out.println("list one is: " + listTwo);
    }

    public void Authentificator(boolean hasUsername, boolean hasPassword) {
        System.out.println();
        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
        if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }
    }

    public void arrayModify() {
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }
        System.out.print("\nArray before decrement: ");
        for (int j : list) {
            System.out.print(j);
            if (j < list.length) {
                System.out.print(", ");
            }
        }
        for (int i = 0; i < list.length; i++) {
            list[i]--;
        }
        System.out.print("\nArray after decrement: ");
        for (int j : list) {
            System.out.print(j);
            if (j < list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public long checkNumber(long a, long b, long c) {
        long largestnumber = 0;
        largestnumber = Math.max(a, Math.max(b, c));
        return largestnumber;
    }

    public String checkGraded() {
        String grade = "";
        double score;
        Scanner inputGrade = new Scanner(System.in);
        System.out.println("\nEnter your score: ");
        score = inputGrade.nextDouble();
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

}
