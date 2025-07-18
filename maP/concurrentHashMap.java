package Collections.maP;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class concurrentHashMap {
    public static void main(String[] args) {
        Map<Integer,String> m1=new ConcurrentHashMap<>();
        m1.put(1,"Sai");
        m1.put(2,"Sai Sujitha");
        m1.put(3,"Rangisetti");
        m1.put(4,"Java");
        m1.put(1,"SSR");
        System.out.println(m1);
        for (Map.Entry<Integer, String> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
