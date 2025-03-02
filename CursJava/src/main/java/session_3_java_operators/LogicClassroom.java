package session_3_java_operators;

public class LogicClassroom {
    public static void main(String[] args) {

        int students = 100;
        int rooms = 10;

        if(rooms != 0 && students / rooms <= 30){
            System.out.println( "we have rooms for our students");
        }else {
            System.out.println("Crowded!");
        }
    }
}
