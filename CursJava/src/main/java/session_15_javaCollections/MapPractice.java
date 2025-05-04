package session_15_javaCollections;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> students = initializeMap();
        System.out.println(students);
        updateMap(students, "Mera", 12);
        System.out.println(students);
        System.out.println("varsta Marcelei este : " + getAge(students, "Marcela"));

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("student's name is: " + entry.getKey());
            System.out.println("student's age is: " + entry.getValue());
        }
    }

    public static int getAge(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    public static void updateMap(Map<String, Integer> map, String nume, int value) {
        map.put(nume, value);
    }

    public static Map<String, Integer> initializeMap() {
        Map<String, Integer> students = new HashMap<>();
        students.put("Marcel", 38);
        students.put("Marcela", 45);
        students.put("Vio", 19);
        return students;
    }
}
