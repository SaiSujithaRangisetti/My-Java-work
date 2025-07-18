package Collections.List.ArrayList;

import java.util.*;

public class LuckyNum1 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(Arrays.asList(4,14,24,34,44));
//        for(Integer g:l1){
//            System.out.print(g+" ");
//        }
//        System.out.println();
//        for(int i=0;i<l1.size();i++){
//            System.out.print(l1.get(i)+" ");
//        }
        Iterator<Integer> iterator=l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.hasNext()+" "+iterator.next());
        }
    }
}
