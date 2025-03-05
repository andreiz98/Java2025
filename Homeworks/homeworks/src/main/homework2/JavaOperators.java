package homework2;

import java.util.Scanner;

public class JavaOperators {
    public static void main(String[] args) {
        Operation homework = new Operation();
        //1

        //sum
        int sum = homework.getSum();
        System.out.println("sum is: " + sum);

        //dif
        int dif = homework.getDif();
        System.out.println("dif is: " + dif);

        //multi
        int multi = homework.getMulti();
        System.out.println("multipliication is: " + multi);

        //div
        int div = homework.getDiv();
        System.out.println("division is: " + div);

        //mod
        int mod = homework.getMod();
        System.out.println("mod is: " + mod);

        //2
        homework.num1++;
        System.out.println("\nnum1 after increment: " + homework.num1);

        homework.num1--;
        System.out.println("num1 after decrement: " + homework.num1);

        //3
        if (homework.num1 > 0) {
            System.out.println("\nnum1 in positive");
        } else{
            System.out.println("\nnum1 in negative");
        }

        //4
        homework.showLoop();

        //5
        homework.num1 += homework.num2;
        System.out.println("\nnum1 is:" + homework.num1);

        //6
        homework.greaterNumber();

        //7
        int a = 7;
        double b = 5.0d;
        System.out.println("\na+b: " + (a += b)); //rez is int

        //8
        byte c = 3, d = 4, sumbyte = (byte) (c + d);
        System.out.println("\nsumbyte is: " + sumbyte);

        //9
        double area = homework.Area();
        System.out.println("area is:" + area);

        //10
        int negnum1;
        negnum1 = -homework.num1;
        System.out.println("\nreverse num1 is:" + negnum1);

        //11
        boolean bool1, bool2;
        System.out.println("\nEnter bool1: ");
        bool1 = homework.enternum.nextBoolean();
        System.out.println("Enter bool2: ");
        bool2 = homework.enternum.nextBoolean();
        System.out.println("bool1 is:" + !bool1);
        System.out.println("bool2 is:" + !bool2);

        //12
        homework.num1+=1;
        System.out.println("\nnum1 is:" + homework.num1);
        homework.num1-=1;
        System.out.println("num1 is:" + homework.num1);

        //13
        double price = homework.getDiscount();
        System.out.println("new price after discount is:" + price);

        //14
        homework.rangeCheck();

    }
}
