package Collections.List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linked2 {
    public static void main(String[] args) {
        List<String> l1=new LinkedList<>();
        l1.add("Sai Sujitha");
        l1.add("Rangisetti");
        l1.add("Java Developer");
        List<String> l2=Collections.unmodifiableList(l1);
        System.out.println(l2);
        l1.add("Suji");
    }
}
