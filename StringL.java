package Collections;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;

public class StringL {
    public static void main(String[] args) {
        String name = "Hello";
        char[] cha = name.toCharArray();
        List<Character> li = new ArrayList<>();
        for (char c : cha) {
            li.add(c);
        }
        Map<Character, Integer> freq = new TreeMap<>();
        for (Character c : li) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int max=-1,res=0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if(entry.getValue()>max){
                max=entry.getValue();
                res=entry.getKey();
            }
            System.out.println(" " + entry.getKey() + "->" + entry.getValue());
        }
    }
}
