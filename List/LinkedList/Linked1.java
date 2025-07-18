package Collections.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Linked1 {
    public static void main(String[] args) {
        List l1=new LinkedList();
        l1.add("Apple");
        l1.add("Bat");
        l1.add(63);
        l1.add(null);
        l1.add("Apple");
        System.out.println(l1.get(3));
    }
}
