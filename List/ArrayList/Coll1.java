package Collections.List.ArrayList;

import java.util.*;

public class Coll1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] a = new Integer[10];  // Changed to Integer array
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();  // Auto-boxing happens here
        }
        List<Integer> l1 = new ArrayList<>(Arrays.asList(a));
        System.out.println(l1);
        l1.add(11);
        System.out.println(l1);
        System.out.println(l1.size());
        List<Integer>l2=new ArrayList<>(Arrays.asList(600,700,800,900,1000));
        System.out.println(l2);
        System.out.println(l2.size());
        l1.addAll(l2);
        System.out.println(l1.size());
        System.out.println(l1);
    }
}