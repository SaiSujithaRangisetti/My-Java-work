package Collections.maP.linkedHashma;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(100, "Lilly");
        map.put(8, "Sujitha");
        System.out.println(map);
        System.out.println(map.getOrDefault(23,"Sai"));
        System.out.println(map);
    }
}
