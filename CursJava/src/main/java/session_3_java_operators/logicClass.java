package session_3_java_operators;

public class logicClass {
    public static void main(String[] args) {

        int student = 100;
        int rooms = 0;

        if (rooms !=0 && student !=0 || (student/rooms)<=3){
            System.out.println("avem sali");
        }else {
            System.out.println("nu avem sali");
        }
    }
}
