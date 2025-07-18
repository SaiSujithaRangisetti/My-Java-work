package Collections.Set;
import java.util.*;
public class CheckColl {
    public static void main(String[] args) {
        Integer[] a1={4,14,24,34,44,54,64,9999994};
        Set<Integer> s1=new HashSet<>(List.of(a1));
        System.out.println("Minimum value of the given list:"+Collections.min(s1));
        System.out.println("Maximum value of the given list:"+Collections.max(s1));
    }
}
