package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coll3 {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        l1.add("Sujitha");
        l1.add("Rangisetti");
        l1.add("CSIT");
        List<String>l2= Collections.unmodifiableList(l1);
        l2.add("CIET");
        System.out.println(l2);
    }
}
