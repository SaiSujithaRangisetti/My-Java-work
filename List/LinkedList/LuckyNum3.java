package Collections.List.LinkedList;
import java.util.*;
public class LuckyNum3 {
    public static void main(String[] args) {
        List <Integer>l1=new LinkedList<>(Arrays.asList(2,12,22,32,42,52));
//        for(Integer g:l1){
//            System.out.print(g);
//        }
//        System.out.println();
//        for(int i=0;i<l1.size();i++){
//            System.out.print(l1.get(i));
//        }
        Iterator<Integer> iterator=l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.hasNext()+" "+iterator.next());
        }
    }
}
