package Collections.Set.Hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class ConertA1S {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=20;
        a[3]=30;
        a[4]=90;
        List l1=new ArrayList(Arrays.asList(a));
        Set<Object> s1=new HashSet<>(l1);
    }
}
