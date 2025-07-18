package Collections.Set.Hash;

import java.util.*;

public class Hashing1 {
    public static void main(String[] args) {
        Set<Object> s1=new HashSet<>();
        s1.add(20);
        s1.add("Sujitha");
        s1.add("Rangisetti");
        System.out.println(s1);
        s1.remove(20);
        Iterator<Object> iterator=s1.iterator(); {
            while(iterator.hasNext()){
                System.out.println(iterator.hasNext()+" "+iterator.next());
            }
        }
    }
}
