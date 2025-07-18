package Collections.maP.treeMap;
import java.util.Map;
import java.util.TreeMap;

public class treeMap1 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");
        map.put("100", "Lilly");
        map.put("8", "Sujitha");
        System.out.println(map);
        Map<String, String> map1 = new TreeMap<>();
        map1.put("1","S");
        System.out.println(map1);
        System.out.println(map);
    }
}
