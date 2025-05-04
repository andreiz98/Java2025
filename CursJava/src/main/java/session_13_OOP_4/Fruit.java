package session_13_OOP_4;

public class Fruit {
    public String taste() {
        return "fruit has taste";
    }

    public String colour() {
        return "fruit has colour";
    }
}

class Apple extends Fruit{
    @Override
    public String taste(){
        return  "Apple is sweet";
    }

    @Override
    public String colour(){
        return "Apple is red";
    }
}

class Orange extends Fruit{
    @Override
    public String taste(){
        return "Orange is sour";
    }

    @Override
    public String colour(){
        return "Orage is orange";
    }
}

class FruitTest{

    public static void main(String[] args) {
        printFruit(new Apple());
        printFruit(new Orange());

        Apple apple = new Apple();
        System.out.println(apple.taste());
        System.out.println(apple.colour());

        Fruit fruit = new Apple();
        System.out.println(apple.taste());
        System.out.println(apple.colour());
    }

    public static void printFruit(Fruit fruit){ // Fruit fruit = new Apple()
        System.out.println("Taste: " + fruit.taste());
        System.out.println("Colour: " + fruit.colour());
    }
}