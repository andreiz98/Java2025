package session_18_Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        System.out.print("1 ->: ");
        demoFilter();

        System.out.print("\n2 ->: ");
        demoMap();

        System.out.print("\n3 ->: ");
        demoDisting();

        System.out.print("\n4 ->: ");
        demoFlatMap();

        System.out.print("\n5 ->: ");
        demoReduce();

        System.out.print("\n6 ->: ");
        demoCount();

        System.out.print("\n7 ->: ");
        demoAny();

        System.out.print("\n8 ->: ");
        demoMr();

        System.out.print("\n9 ->: ");
        demoOptional();

        System.out.print("\n10 ->: ");
        demo();
    }

    private static void demoFilter() {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        number.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
//                .forEach(System.out::print);
    }

    private static void demoMap() {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> strings = number.stream()
                .map(n -> "nr: " + n)
                .collect(Collectors.toList());
        System.out.print(strings);
    }

    private static void demoDisting() {
        List<Integer> number = List.of(1, 3, 2, 6, 1, 9);
        List<Integer> integers = number.stream()
                .distinct()
                .sorted()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.print(integers);
    }

    private static void demoFlatMap() {
        List<List<String>> lists = List.of(
                List.of("a", "b"), List.of("c"), List.of("d", "e"));
        List<String> stringList = lists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.print(stringList);
    }

    private static void demoReduce() {
        List<Integer> number = List.of(1, 2, 3, 4);

        int multy = number.stream()
                .reduce(2, (a, b) -> a * b);
        System.out.print(multy);
    }

    private static void demoCount() {
        List<String> stringList = List.of("ana", "dan", "marcel");
        long counter = stringList.stream()
                .filter(s -> s.length() == 3)
                .count();
        System.out.print(counter);
    }

    private static void demoAny() {
        List<String> stringList = List.of("ana", "dan", "marcel");
        boolean hasAny = stringList.stream()
                .anyMatch(s -> s.length() == 6);
        System.out.print(hasAny);
    }

    private static void demoMr() {
        List<String> stringList = List.of("ana", "dan", "marcel");
        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
    }

    private static void demoOptional() {
        Optional<Integer> optionalInteger = IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .boxed()
                .findFirst();
        System.out.print(optionalInteger);
    }

    private static void demo() {
        List<Employee> employees = List.of(
                new Employee("Ana", "It", 5000),
                new Employee("Dan", "HR", 4500),
                new Employee("Marcel", "It", 6000)
                );

        Map<String, Double> avgSal = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDep,
                        Collectors.averagingDouble(Employee::getSal)
                ));
        avgSal.forEach((dep, sal) -> System.out.print("dep: " + dep + "sal: " + sal));
    }

    static class Employee {
        private String name, dep;
        int sal;

        public Employee(String name, String dep, int sal) {
            this.name = name;
            this.dep = dep;
            this.sal = sal;
        }

        public String getName() {
            return name;
        }

        public String getDep() {
            return dep;
        }

        public int getSal() {
            return sal;
        }
    }

}
