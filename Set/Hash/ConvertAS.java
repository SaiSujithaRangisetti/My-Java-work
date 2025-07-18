package Collections.Set.Hash;

import java.util.*;

public class ConvertAS {
    public static void main(String[] args) {
        int temp=0,count=0;
        List<Integer> l1=new ArrayList<>(Arrays.asList(2,12,22,32,42,12,2));
        System.out.println(l1);
        Set<Integer>  s1=new HashSet<>(l1);
        System.out.println(s1);
        for(Integer s2:s1){
            temp+=s2;
            count++;
        }
        System.out.println(temp/count);
        System.out.println(temp);
    }
}
