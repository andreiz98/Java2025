package session_13_OOP_4;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class Geometry {
    public double area(double base, double height) {
        return base * height * 0.5;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(1, 2);
        System.out.println(result1);
        int result2 = calculator.add(1, 2, 3);
        System.out.println(result2);
        double result3 = calculator.add(1.2, 2.5);
        System.out.println(result3);


        Geometry geometry = new Geometry();
        double area1 = geometry.area(2.5, 2.0);
        double area2 = geometry.area(3.0);
        System.out.println(area1);
        System.out.println(area2);
    }
}
