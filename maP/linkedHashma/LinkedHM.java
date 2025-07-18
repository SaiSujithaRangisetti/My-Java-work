package Collections.maP.linkedHashma;

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHM {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Sai");
        map.put(2, "Sai");
        map.put(null, null);
        map.put(null, "3");
        System.out.println(map);
    }

}
