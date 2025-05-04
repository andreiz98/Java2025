package session_15_javaCollections;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    enum ZiuaSaptamanii { LUNI, MARTI, MIERCURI, JOI, VINERI}

    public static void main(String[] args) {
        EnumSet<ZiuaSaptamanii> zileleSaptamanii = EnumSet.range(ZiuaSaptamanii.LUNI, ZiuaSaptamanii.MIERCURI);
        System.out.println(zileleSaptamanii);
        zileleSaptamanii.add(ZiuaSaptamanii.VINERI);
        zileleSaptamanii.add(ZiuaSaptamanii.VINERI);
        System.out.println(zileleSaptamanii);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Element A");
        hashSet.add("Element B");
        hashSet.add("Element C");
        System.out.println(hashSet);
        hashSet.add("Element A");
        hashSet.add("Element D");
        hashSet.add("Element E");
        System.out.println(hashSet);
    }

}
