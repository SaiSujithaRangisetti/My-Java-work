package Collections.Set.LinkedHash;

import java.util.*;

public class LinkedHash1 {
    public static void main(String[] args) {
        Set<Object> s1=new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,-1,0,1,null));
        System.out.println(s1);
    }
}
