package session_4_java_op_and_statements;

import java.util.Objects;

public class Memory {
    public static void main(String[] args) {

        // Declare and initialize string variables
        String hello1 = "hello";                        // Creates a string literal "hello"
        String hello2 = "Hello";                        // Creates a string literal "Hello" (note the different case)
        String hello3 = new String("Hello");     // Creates a new String object with content "Hello"

        // Compare string references using the '==' operator (checks if both references point to the same object)
        System.out.println(hello1 == hello2);
        // Compare string content using the 'equals' method (checks if the characters in the strings are the same)
        System.out.println(hello1.equals(hello2));
        // Compare references for hello2 and hello3 (they are different objects despite having similar content)
        System.out.println(hello2 == hello3);
        // Compare content of hello2 and hello3 using the 'equals' method
        System.out.println(hello2.equals(hello3));

        // Create two User objects with the same first name "Rolland"
        User user1 = new User("Rolland");
        User user2 = new User("Rolland");

        // Compare User objects using '==' operator (checks if both references point to the same instance)
        System.out.println(user1 == user2);
        // Compare User objects using the overridden 'equals' method (checks if their content is equal)
        System.out.println(user1.equals(user2));


        // Create an object of the Exercitiul1_2_3Tema class to use its methods
        // This demonstrates that to run a single class, we can call methods from different classes in our main method using objects
        Exercitiul_1_2_3_Tema tema = new Exercitiul_1_2_3_Tema();

        // Call exercitiul1 method from the Exercitiul1_2_3Tema class and store its return value
        int diferenta = tema.exercitiul1();
        // Print the result of exercitiul1
        System.out.println("exercitiul 1 din tema:  " + diferenta);

        // Call exercitiul2 method from the Exercitiul1_2_3Tema class and store its return value
        int adunare = tema.exercitiul2();
        // Print the result of exercitiul2
        System.out.println("exercitiul 2 din tema:  " + adunare);

        // Call exercitiul3 method from the Exercitiul1_2_3Tema class and store its return value
        int inmultire = tema.exercitiul3();
        // Print the result of exercitiul3
        System.out.println("exercitiul 3 din tema:  " + inmultire);
    }
}

// Definition of the User class
class User {

    String firstName; // Attribute to hold the user's first name

    // Constructor to initialize a new User object with a given first name
    public User(String firstName) {
        this.firstName = firstName;
    }

    // Override the equals method to compare User objects based on their firstName values
    @Override
    public boolean equals(Object o) {
        // Check if both objects refer to the same memory location
        if (this == o) {
            return true;
        }
        // If the other object is null or not of the same class, return false
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        // Cast the object to User and compare their firstName attributes for equality
        User user = (User) o;
        return Objects.equals(firstName, user.firstName);
    }
}