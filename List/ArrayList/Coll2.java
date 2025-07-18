package Collections.List.ArrayList;
import java.util.*;
public class Coll2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[4];
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextLine();
        }
        List<String> l1 = new ArrayList<>(Arrays.asList(a));
        System.out.println(l1);
        l1.add("Unstoppable");
        System.out.println(l1);
        System.out.println(l1.size());
        List<String> l2 = new ArrayList<>(Arrays.asList("Waka Waka", "Unstoppable", "Night Changes"));
        System.out.println(l2);
        System.out.println(l2.size());
        l1.addAll(l2);
        System.out.println(l1.size());
        System.out.println(l1);
        boolean result = l1.retainAll(l2);
        System.out.println(l1);
    }
}