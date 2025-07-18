package Collections.maP.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hasMap1 {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(10, "Sai");
        m1.put(34, "Sai Sujitha");
        m1.put(35, "Rangisetti");
        m1.put(45, "Java");
        m1.put(10, "SSR");

        System.out.println(m1);

        Set<Integer> s1 = m1.keySet();
        for (Integer temp : s1) {
            System.out.println(temp);
        }
        System.out.println(m1.get(1));
        System.out.println(m1.values());
        System.out.println(m1.containsValue("SSR"));

        for (Map.Entry<Integer, String> entry : m1.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
