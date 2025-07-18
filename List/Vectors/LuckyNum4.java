package Collections.List.Vectors;
import java.util.*;
public class LuckyNum4 {
    public static void main(String[] args) {
        List<Integer> l1=new Vector<>(Arrays.asList(3,13,23,33,43,53));
        l1.remove(Integer.valueOf(53));
        System.out.println(l1);
//        for(Integer g:l1){
//            System.out.print(g);
//        }
//        System.out.println();
//        for(int i=0;i<l1.size();i++){
//            System.out.print(l1.get(i));
//        }
//        Iterator<Integer> iterator=l1.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//            l1.remove(iterator.next());
////            System.out.println(iterator.hasNext());
//        }
    }
}
