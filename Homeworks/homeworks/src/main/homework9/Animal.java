package homework9;

//ex 1-5

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("animal makes sounds");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }
}

class Wolf extends Animal {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("how");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("max");
        Cat cat = new Cat("deni");
        Wolf wolf = new Wolf("chuck");

        dog.sound();
        cat.sound();
        wolf.sound();

    }
}