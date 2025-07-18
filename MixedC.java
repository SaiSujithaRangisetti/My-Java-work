package Collections;

import java.util.*;

public class MixedC {
    public static int freq(int i, List<Integer>list){
        int count=0;
        for(int ele:list){
            if(i==ele) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer[] a=new Integer[]{1,2,3,4,5,6,7,8,9,1,1,1};
        List<Integer> li=new ArrayList<>(Arrays.asList(a));
        Map<Integer, Integer> m1=new LinkedHashMap<>();
//        for(Integer i:li) {
//            m1.put(i, freq(i, li));
//        }
//        System.out.println(m1);
        for(Integer ele:li){
            m1.put(ele,m1.getOrDefault(ele,0)+1);
        }
        System.out.println(m1);
    }
}
