package homework10;

public abstract class Parent {
    abstract void message();
}

class Subclass1 extends Parent{
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class Subclass2 extends Parent{
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

class TestPerson{
    public static void main(String[] args) {
        Parent obj1 = new Subclass1();
        Parent obj2 = new Subclass2();

        obj1.message();
        obj2.message();
    }
}
