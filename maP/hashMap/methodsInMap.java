package Collections.maP.hashMap;

import java.util.*;

public class methodsInMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Nagaeswara Rao");
        map.put(2,"Durgamma");
        map.put(3,"Murali Krishna");
        map.put(4,"Lakshmi Rajyam");
        map.put(6,"Some xyz");
        map.put(8,"zyx");
        System.out.println(map.get(5));
        System.out.println(map.values());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Durgamma"));
        System.out.println(map.remove(6));
        System.out.println(map.remove(8,"zyx"));
        System.out.println(map);
    }
}
