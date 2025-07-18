package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Coll4 {
    public static void main(String[] args) {
        List s1 = new ArrayList();
        s1.add(63);
        s1.add("Sai Sujitha");
        s1.add(49);
        s1.add("Poojitha");
        s1.add(4);
        s1.add("Devi Sri");
        System.out.println(s1);
        Object[] obj = s1.toArray();
        for (Object temp : obj) {
            System.out.print(temp+" ");
        }
    }
}