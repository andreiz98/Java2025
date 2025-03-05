package homework3;

public class Java_Operators_decision {
    public static void main(String[] args) {
        Utilities homework = new Utilities();
        Opreations opreations = new Opreations();
        int age = homework.setAge(26);

        //ex1
        homework.GetString();

        //ex2
        homework.CompareNumber(24,43);
        homework.CompareString();

        //ex3
        if (age > 18) {
            System.out.println("\nI am adult");
        } else {
            System.out.println("\nI am not an adult");
        }

        //ex4
        int maxHeight = homework.SetHeight(180,200);
        System.out.println("\nmaxHeight is: " + maxHeight);

        //ex5
        homework.PrintLoop();

        //ex6
        homework.CheckTemperature(24.5);

        //ex7
        homework.CheckType(4,5,6);

        //8
        homework.Factorial();

        //ex9
        homework.CheckCountry("USA","USA");

        //ex10
        homework.arrayList();

        //ex11
        opreations.AddMulti();

        //ex12
        int val = 25, negativeNumber;
        negativeNumber = -val;
        System.out.println("\nnegativeNumber is: " + negativeNumber);

        //ex13
        boolean isRaining = true, isSunny = false;
        System.out.println("\nisRaining " + !isRaining);
        System.out.println("isSunny " + !isSunny);

        //ex14
        int counter = 0;
        System.out.println("\nvalue of counter after increment " + ++counter);
        System.out.println("value of counter after decrement " + --counter);

        //ex15
        opreations.Compound(24);

        //ex16
        opreations.Transform(10);

        //ex17
        homework.Authentificator(true,true);

        //ex18
        homework.arrayModify();

        //ex19
        if (age < 13) {
            System.out.println("\nChild");
        } else if (age < 18) {
            System.out.println("\nTeenager");
        } else if (age < 65) {
            System.out.println("\nAdult");
        } else {
            System.out.println("\nSenior");
        }

        //20
        long largesteNum = homework.checkNumber(23,345,35345);
        System.out.println("\nthe largest number: " + largesteNum);

        //ex21
        String myGrade = homework.checkGraded();
        System.out.println("my grade is: " + myGrade);
    }
}
