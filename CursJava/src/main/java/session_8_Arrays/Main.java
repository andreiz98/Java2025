package session_8_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        arrayExample();
        arrayExample2();
        arrayExample3();
        arrayListExample();
        linkedListExample();
        multidimentionalExample();
        performance();

    }

    public static void arrayExample() {
        String[] friends = {"Ion", "Bob", "Dan", "Mioara"};
        System.out.println("one friend: " + friends[2]);
        System.out.println("dimensiunea lui friends: " + friends.length);
        friends[1] = "Marcel";
        System.out.println("friends pe pozitia 1 " + friends[1]);
        System.out.println("all my friends: " + Arrays.toString(friends));
    }

    public static void arrayExample2() {
        int[] numbers = {15, 24, 7, 4, 90};
        System.out.println("all numbers : " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("all numbers sorted: " + Arrays.toString(numbers));
        int target = 7;
        int index = Arrays.binarySearch(numbers, target);
        System.out.println("pozitia unde a gasit target este: " + index);
        System.out.println("valoarea de pe pozitie este: " + numbers[index]);
    }

    public static void arrayExample3() {
        String[] cities = {"Iasi", "Bucuresti", "Cluj"};
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));
        int index = Arrays.binarySearch(cities, "Iasi");
        System.out.println(index);
        System.out.println(cities[index]);
    }

    public static void arrayListExample() {
        List<String> friends = new ArrayList<>(Arrays.asList("Ion", "Bob", "Dan", "Mioara"));
        System.out.println("friend de pe pozitia 2: " + friends.get(2));
        System.out.println("dimensiunea lui friends: " + friends.size());
        friends.add("Marcel");
        System.out.println("friends: " + friends);
        friends.remove("Bob");
        System.out.println("friends fara Bob: " + friends);
        System.out.println("este oare Bob in friends? " + friends.contains("Bob"));
        System.out.println("este oare Marcel in friends? " + friends.contains("Marcel"));
        friends.remove(1);
        System.out.println(friends);
        friends.set(1, "BOB");
        friends.add(2, "Mioara");
        System.out.println(friends);
        friends.clear();
        System.out.println(friends);
    }

    public static void linkedListExample() {
        List<String> list = new LinkedList<>();
        list.add("Ion");
        list.add("Bob");
        list.add("Dan");
        System.out.println("linkeList [1] : " + list.get(1));
        list.add(1, "Marcel");
        System.out.println("linkeList [1] : " + list.get(1));
        System.out.println(list);
        list.remove("Marcel");
        System.out.println(list);

        LinkedList<String> stack = new LinkedList<>();
        stack.push("Ion");
        System.out.println("stack: " + stack);
        stack.push("Bob");
        System.out.println("stack: " + stack);
        stack.push("Dan");
        System.out.println("stack: " + stack);
        stack.pop();
        System.out.println("stack: " + stack);
        System.out.println(stack.get(1));
    }

    public static void multidimentionalExample() {
        String[][] names = {
                {"Ms", "Mrs", "Mr"},
                {"Ion", "Marcel", "Mioara"}
        };

        System.out.println(names[0][0] + " " + names[1][2]);
        System.out.println(names[0][2] + " " + names[1][1]);

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j] + " ");
            }
            System.out.println();
        }

        for (String name : names[0]) {
            for (String name2 : names[1]) {
                System.out.println(name + " " + name2);
            }
            System.out.println();
        }
    }

    public static void performance() {
        final int size = 500000;
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            String value = String.valueOf(i);
            arrayList.add(value);
            linkedList.add(value);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(size / 2);
        }
        long stopTimeArrayList = System.currentTimeMillis() - start;

        long startLinked = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(size / 2);
        }
        long stopTimeLinkedList = System.currentTimeMillis() - startLinked;

        System.out.println("access arrayList: " + stopTimeArrayList);
        System.out.println("access linkedList: " + stopTimeLinkedList);

        long startAddedArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, "X");
        }
        long stopAddedArray = System.currentTimeMillis() - startAddedArray;

        long startAddedLinked = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, "X");
        }
        long stopAddedlinked = System.currentTimeMillis() - startAddedLinked;

        System.out.println("insert arrayList: " + stopAddedArray);
        System.out.println("insert linkedList: " + stopAddedlinked);
    }

}