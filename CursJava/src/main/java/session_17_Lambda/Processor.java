package session_17_Lambda;

public class Processor {
    public static void main(String[] args) {
        StringProcessor removeSpace = str->str.replace(" ","");
        StringProcessor upperCase = str ->str.toUpperCase();

        System.out.println(removeSpace.processor("dasda asdasdas"));

        StringProcessor combine = removeSpace.andThen(upperCase);
        System.out.println(combine.processor("hello me here"));
    }
}
