package Collections.List.CopyOnWriteAL;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LuckyNum2 {
    public static void main(String[] args) {
        List<Integer> l1=new CopyOnWriteArrayList<>(Arrays.asList(1,11,21,31,41,51));
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
