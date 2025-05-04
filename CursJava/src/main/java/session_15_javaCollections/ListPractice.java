package session_15_javaCollections;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        System.out.println(myList);
        List<Integer> myListUpdated = updateList(myList, 5, 500);
        System.out.println(myListUpdated);
        System.out.println("Exista 500 in myListUpdated? " + isElementPresent(myListUpdated, 500));
    }

    public static boolean isElementPresent(List<Integer> list, int value){
        return list.contains(value);
    }

    public static List<Integer> updateList(List<Integer> list, int index, int value){
        if (index < 0 || index > list.size()){
            System.out.println("invalid index");
            return list;
        }
        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        return result;
    }

    public static List<Integer> initializeList(){
        List<Integer> list = new ArrayList<>();
        for ( int index = 0; index < 10; index ++){
            list.add(index);
        }
        return list;
    }

}
