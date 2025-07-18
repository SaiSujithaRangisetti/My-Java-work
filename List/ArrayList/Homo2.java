package Collections.List.ArrayList;
import java.util.*;
public class Homo2 {
    public static void main(String[] args) {
        List<Integer> l2=new ArrayList<>();
        l2.add(0,4);
        l2.add(1,84);
        l2.add(2,24);
        l2.add(3,34);
        l2.add(4,44);
        l2.add(5,null);
        System.out.println(l2);
        l2.remove(3);
        System.out.println(l2);
        l2.set(4,44);
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println(l2);
    }
}
