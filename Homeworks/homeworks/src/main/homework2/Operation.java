package homework2;


import java.util.Scanner;

public class Operation {
    int num1, num2, sum, dif, multi, div, mod;
    Scanner enternum = new Scanner(System.in);
    public Operation() {
        System.out.println("\nEnter num1: ");
        num1 = enternum.nextInt();
        System.out.println("Enter num2: ");
        num2 = enternum.nextInt();
    }
    public int getSum() {
        sum = num1 + num2;
        return sum;
    }
    public int getDif() {
        dif = num1 - num2;
        return dif;
    }
    public int getMulti() {
        multi = num1 * num2;
        return multi;
    }
    public int getDiv() {
        div = num1 / num2;
        return div;
    }
    public int getMod() {
        mod = num1 % num2;
        return mod;
    }

    public void greaterNumber(){
        if (num1 > num2) {
            System.out.println("\nnum1 is greater than num2");
        } else if (num1 < num2) {
            System.out.println("\nnum1 is less than num2");
        } else {
            System.out.println("\nnum1 is equal with num2");
        }
    }

    public double Area(){
        double length, breadth, area;
        System.out.println("\nEnter length: ");
        length = enternum.nextDouble();
        System.out.println("Enter breadth: ");
        breadth = enternum.nextDouble();
        area = length * breadth;
        return area;
    }

    public void rangeCheck(){
        if (num1 > 1 && num1 <=100){
            System.out.println("\nnum1 is in range");
        }else {
            System.out.println("\nnum1 is not in range");
        }
    }

    public void showLoop(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("i is:" + i);
        }
        for (int j = 10; j >= 1; j--) {
            System.out.println("j is:" + j);
        }
    }

    public double getDiscount() {
        double price,discount;
        System.out.println("\nprice is:");
        price = enternum.nextDouble();
        System.out.println("discount is:");
        discount = enternum.nextDouble();
        price*=(1 - discount/100); // 1 represents 100% of the original price
        return price;
    }

}
