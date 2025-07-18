package Collections.Set.copyOnWrite;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class AS1 {
    public static void main(String[] args) {
        Set<String> s1 = new CopyOnWriteArraySet<>(Arrays.asList("Chalapathi", "Lam", "Mothadaka"));
        Iterator<String> iterator = s1.iterator();
        System.out.println("Using Iterator");
        while(iterator.hasNext()) {
            s1.add("CIET");
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("Enhanced For loop");
        for(String s : s1)
            System.out.print(s+" ");
        String[] arr = s1.toArray(new String[0]);
        System.out.println();
        System.out.println("Regular loop");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
