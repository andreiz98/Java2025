package session_10_OOP;

public class Main {
//    public static void main(String[] args) {
//
//        Person person = new Person("max", 38);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//
//        person.setName("geanny");
//        person.setAge(55);
//
//        person.getDetails();
//    }

    public static void main(String[] args) {
        ContBancar contBancar = new ContBancar("max",1000);
        ContBancar contBancar1 = new ContBancar("Ana",5000);

        contBancar.depunere(500);
        contBancar1.retragere(500);

        contBancar.getDetails();
        contBancar1.getDetails();

        ContBancar.setDobanda(0.1);
        contBancar.getDetails();
    }
}
