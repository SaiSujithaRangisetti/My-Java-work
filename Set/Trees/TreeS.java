package Collections.Set.Trees;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeS {
    public static void main(String[] args) {
        Set<Integer> s1=new TreeSet<>(Arrays.asList(2,9,0,1,5,2,1,-1,null));
        System.out.println(s1);
        Set<Object> s2=new TreeSet<>(Arrays.asList("Sujitha","Vikky","Mumma","Pappa"));
        System.out.println(s2);
    }
}

