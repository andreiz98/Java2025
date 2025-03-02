package homework1;

import java.util.Scanner;

public class Variables {
        public static void main(String[] args) {
            // ex1
            int age = 26;
            String firstname = "Andrei", lastname = "Zaharia", name = firstname + " " + lastname;
            String favcolor = "black";

            System.out.println("\n1\nmy name:" + name + "\nmy age:" + age + "\nfav color: " + favcolor);

            //ex2
            double weight = 90.35d;
            char mychar = 'A';
            // folosesc string si int de mai sus

            System.out.println("\n2\nmy name:" + name + "\nmy age:" + age + "\nweight: " + weight);
            System.out.println("my char: " + mychar);

            //ex3
            int a = 5, b = 3, sum = a + b, dif = a - b, multp = a * b, div = a / b, mod = a % b;
            System.out.println("suma: " + sum + "\ndiferenta: " + dif + "\nmultiplication: " + multp);
            System.out.println("division: " + div + "\nmodulus: " + mod);

            //extra
            double num1, num2, sum1;
            Scanner enternum = new Scanner(System.in);
            System.out.println("\nEnter num1: ");
            num1 = enternum.nextDouble();
            System.out.println("Enter num2: ");
            num2 = enternum.nextDouble();

            sum1 = num1 + num2;
            System.out.println("sum1 is: " + sum1);

            enternum.close();
        }
}
