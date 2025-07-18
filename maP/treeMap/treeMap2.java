package Collections.maP.treeMap;
import java.util.Map;
import java.util.TreeMap;

public class treeMap2 {
    public static void main(String[] args) {
        Map<Integer,String>map =new TreeMap<>();
        map.put(1,"Sai");
        map.put(2,"Sai");
        map.put(3,null);
        map.put(2,null);
        System.out.println(map);
    }
}
