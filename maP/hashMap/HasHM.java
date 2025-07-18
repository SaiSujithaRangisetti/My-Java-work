package Collections.maP.hashMap;

import java.util.*;

public class HasHM {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(10,"Nagaeswara Rao");
        map.put(20,"Durgamma");
        map.put(30,"Murali Krishna");
        map.put(40,"Lakshmi Rajyam");
        System.out.println(map.get(10));
        System.out.println(map.values());
        System.out.println(map.entrySet());
        Set<Map.Entry<Integer,String>>set=map.entrySet();
        Iterator<Map.Entry<Integer,String>> ite = set.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
            System.out.println(ite.next());
        }
    }
}
