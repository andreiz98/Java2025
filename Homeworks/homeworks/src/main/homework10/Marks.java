package homework10;

public abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int s, s1, s2;

    public A(int s, int s1, int s2) {
        this.s = s;
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    double getPercentage() {
        return (s + s1 + s2) / 3.0;
    }
}

class B extends Marks {
    int s, s1, s2, s3;

    public B(int s, int s1, int s2, int s3) {
        this.s = s;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double getPercentage() {
        return (s + s1 + s2 + s3) / 4.0;
    }
}

class TestMarks {
    public static void main(String[] args) {
        Marks studentA = new A(85, 90, 95);
        Marks studentB = new B(78, 82, 88, 91);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}