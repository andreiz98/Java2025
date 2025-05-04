package session_17_Lambda;

import java.util.function.Consumer;

public class SumPractice {
    public static void main(String[] args) {
//        IntSum result = (a, b) -> a + b;
//
//        System.out.println(result.sum(1, 2));
//
//        IntMultiple result1 = (a, b) -> a * b;
//
//        System.out.println(result1.multi(2, 3));
//
//        Calculator sum = (a, b) -> a + b;
//        Calculator multy = (a, b) -> a * b;
//        Calculator sub = (a, b) -> a / b;
//
//        System.out.println(sum.compute(2,3));
//        System.out.println(multy.compute(2,3));
//        System.out.println(sub.compute(4,2));

        Runnable noPar = () -> System.out.println("run");
        noPar.run();

        Consumer<String> oneParam = msg -> System.out.println("message " + msg);
        oneParam.accept("yes");
    }
}
