package session_17_Lambda;

public class GreetingService {
    public static void main(String[] args) {
        Services lam = msg -> System.out.println(msg + " lambda");

        Services anonym = new Services() {
            @Override
            public void greet(String msg) {
                System.out.println(msg + " anonym");
            }
        };

        lam.greet("hello");
        anonym.greet("hello");
    }
}
