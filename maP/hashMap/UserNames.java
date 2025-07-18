package Collections.maP.hashMap;

import java.util.HashMap;
import java.util.Map;

public class UserNames {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        System.out.println(map.keySet());
        map.put("Email","saisujithar058@gmail.com");
        map.put("Insta","Sujitha_murali545");
        map.put("FB","Sai Sujitha Rangisetti");
        map.put("Phone","Lilly");
        map.put("HackerRank","SujithaCIET063");
        map.putIfAbsent("Whatsapp","Lilly");
        System.out.println(map.get(5));
        System.out.println(map.values());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Sujitha_murali545"));
        System.out.println(map.remove("Phone"));
        System.out.println(map.remove("FB","Sai Sujitha Rangisetti"));
        System.out.println(map);
    }
}
