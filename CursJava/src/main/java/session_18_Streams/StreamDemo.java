package session_18_Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {

    public static void main(String[] args) {
        System.out.print("1 -> Filter + ForEach : ");
        demoFilterForEach();
        System.out.println();

        System.out.print("2 -> Map + Collect : ");
        demoMapCollect();

        System.out.print("3 -> Distinct + Sorted + Collect : ");
        demoDistictSorted();

        System.out.print("4 -> FlatMap + Collect : ");
        demoFlatMap();

        System.out.print("5 -> Reduce : ");
        demoReduce();

        System.out.print("6 -> Count : ");
        demoCount();

        System.out.print("7 -> Any : ");
        demoAny();

        System.out.print("8 -> MR : ");
        demoMR();
        System.out.println();

        System.out.print("9 -> Optional : ");
        demoOptional();

        System.out.println("10 -> Complex");
        demoComplex();
        System.out.println();

        System.out.println("11 -> Person 1 ");
        demoGroupByAge();

        System.out.println("12 -> Person 2");
        demoPartitioningBy();
    }

    private static void demoFilterForEach() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        //                .forEach(System.out::print);
    }

    private static void demoMapCollect() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> asStrings = numbers.stream()
                .map(n -> "Nr: " + n)
                .collect(Collectors.toList());
        System.out.println(asStrings);
    }

    private static void demoDistictSorted() {
        List<Integer> numbers = List.of(1, 3, 2, 6, 9, 1);
        List<Integer> distinctSorted = numbers.stream()
                .distinct()
//                .sorted()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(distinctSorted);
    }

    private static void demoFlatMap() {
        List<List<String>> listOfLists = List.of(
                List.of("a", "b"), List.of("c"), List.of("d", "e"));

        List<String> listOfStrings = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(listOfStrings);
    }

    private static void demoReduce() {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        int multy = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(multy);
    }

    private static void demoCount() {
        List<String> listOfStrings = List.of("Ana", "Dan", "Marcel");
        long count = listOfStrings.stream()
                .filter(s -> s.length() == 3)
                .count();
        System.out.println(count);
    }

    private static void demoAny() {
        List<String> listOfStrings = List.of("Ana", "Dan", "Marcel");
        boolean hasAny = listOfStrings.stream()
                .anyMatch(s -> s.length() == 6);
        System.out.println(hasAny);
    }

    private static void demoMR() {
        List<String> listOfStrings = List.of("Ana", "Dan", "Marcel");
        listOfStrings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
    }

    private static void demoOptional() {
        Optional<Integer> listOptional = IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .boxed()
                .findFirst();
        System.out.println(listOptional);
    }

    private static void demoComplex() {
        List<Employee> employees = List.of(
                new Employee("Ana", "IT", 5000),
                new Employee("Dan", "HR", 4500),
                new Employee("Marcel", "IT", 6000)
        );

        Map<String, Double> avgSalDep = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDep,
                        Collectors.averagingDouble(Employee::getSal)
                ));

        avgSalDep.forEach((dep, sal) -> System.out.print(" dep: " + dep + " sal: " + sal)
        );
    }

    private static void demoGroupByAge() {
        // Lista de persoane
        List<Person> people = List.of(
                new Person("Ana", 22),
                new Person("Ion", 30),
                new Person("Maria", 22),
                new Person("George", 30)
        );

        // Grupăm persoanele după vârstă într-un Map
        Map<Integer, List<Person>> byAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        // Afișăm fiecare grup de vârstă și numele persoanelor din acel grup
        byAge.forEach((age, list) -> {
            System.out.println("Age " + age + ": " +
                    list.stream()
                            .map(Person::getName)
                            .collect(Collectors.joining(", "))
            );
        });
    }

    private static void demoPartitioningBy() {
        // Lista de persoane
        List<Person> people = List.of(
                new Person("Ana", 22),
                new Person("Ion", 30),
                new Person("Maria", 20),
                new Person("George", 27)
        );

        // Împărțim persoanele în două categorii: <25 și >=25 ani
        Map<Boolean, List<Person>> partitioned = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() < 25));

        // Afișăm persoanele tineri (<25 ani)
        System.out.println("Tineri (<25): " +
                partitioned.get(true).stream().map(Person::getName).toList());

        // Afișăm persoanele mature (>=25 ani)
        System.out.println("Maturi (>=25): " +
                partitioned.get(false).stream().map(Person::getName).toList());
    }


    static class Employee {
        private String name;
        private String dep;
        private int sal;

        public Employee(String name, String dep, int sal) {
            this.name = name;
            this.dep = dep;
            this.sal = sal;
        }

        public String getDep() {
            return dep;
        }

        public int getSal() {
            return sal;
        }
    }

    // Clasa de model simplu pentru o persoană cu nume și vârstă
    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }


}
