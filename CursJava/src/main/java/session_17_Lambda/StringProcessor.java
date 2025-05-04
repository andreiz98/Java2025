package session_17_Lambda;

@FunctionalInterface
public interface StringProcessor {
    String processor(String input);

    default StringProcessor andThen(StringProcessor after){
        return intput -> after.processor(this.processor(intput));
    }
}
