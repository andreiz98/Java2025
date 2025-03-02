package homework2;

import java.util.Scanner;

public class JavaOperators {
    public static void main(String[] args) {

        //1
        int num1, num2, sum, dif, multi, div, mod;
        Scanner enternum = new Scanner(System.in);
        System.out.println("\nEnter num1: ");
        num1 = enternum.nextInt();
        System.out.println("Enter num2: ");
        num2 = enternum.nextInt();

        //sum
        sum = num1 + num2;
        System.out.println("sum is: " + sum);

        //dif
        dif = num1 - num2;
        System.out.println("dif is: " + dif);

        //multi
        multi = num1 * num2;
        System.out.println("multipliication is: " + multi);

        //div
        div = num1 / num2;
        System.out.println("division is: " + div);

        //mod
        mod = num1 % num2;
        System.out.println("mod is: " + mod);

        //2
        num1++;
        System.out.println("\nnum1 after increment: " + num1);

        num1--;
        System.out.println("num1 after decrement: " + num1);

        //3
        if (num1 > 0) {
            System.out.println("\nnum1 in positive");
        } else{
            System.out.println("\nnum1 in negative");
        }

        //4
        for (int i = 1; i <= 10; i++) {
            System.out.println("i is:" + i);
        }
        for (int j = 10; j >= 1; j--) {
            System.out.println("j is:" + j);
        }

        //5
        num1 += num2;
        System.out.println("\nnum1 is:" + num1);

        //6
        if (num1 > num2) {
            System.out.println("\nnum1 is greater than num2");
        } else if (num1 < num2) {
            System.out.println("\nnum1 is less than num2");
        } else {
            System.out.println("\nnum1 is equal with num2");
        }

        //7
        int a = 7;
        double b = 5.0d;
        System.out.println("\na+b: " + (a += b)); //rez is int

        //8
        byte c = 3, d = 4, sumbyte = (byte) (c + d);
        System.out.println("\nsumbyte is: " + sumbyte);

        //9
        double length, breadth, area;
        System.out.println("\nEnter length: ");
        length = enternum.nextDouble();
        System.out.println("Enter breadth: ");
        breadth = enternum.nextDouble();
        area = length * breadth;
        System.out.println("area is:" + area);

        //10
        int negnum1;
        negnum1 = -num1;
        System.out.println("\nreverse num1 is:" + negnum1);

        //11
        boolean bool1, bool2;
        System.out.println("\nEnter bool1: ");
        bool1 = enternum.nextBoolean();
        System.out.println("Enter bool2: ");
        bool2 = enternum.nextBoolean();
        System.out.println("bool1 is:" + !bool1);
        System.out.println("bool2 is:" + !bool2);

        //12
        num1+=1;
        System.out.println("\nnum1 is:" + num1);
        num1-=1;
        System.out.println("num1 is:" + num1);

        //13
        double price,discount;
        System.out.println("\nprice is:");
        price = enternum.nextDouble();
        System.out.println("discount is:");
        discount = enternum.nextDouble();
        price*=(1 - discount/100); // 1 represents 100% of the original price
        System.out.println("new price after discount is:" + price);

        //14
        if (num1 > 1 && num1 <=100){
            System.out.println("\nnum1 is in range");
        }else {
            System.out.println("\nnum1 is not in range");
        }

    }
}
