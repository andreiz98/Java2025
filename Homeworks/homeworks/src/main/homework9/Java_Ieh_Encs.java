package homework9;

public class Java_Ieh_Encs {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myWolf = new Wolf();

        myDog.sound();
        myCat.sound();
        myWolf.sound();
    }
}

class Animal {
    public void sound() {
        System.out.println("animal makes sounds");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

class Wolf extends Animal {
    @Override
    public void sound() {
        System.out.println("how");
    }
}