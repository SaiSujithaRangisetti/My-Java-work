package Arrays;

import java.util.*;

public class Array7 {
    public static void main(String...suji) {
        int[] a={10,20,30,40,50};
        String[] s1={"Nageswar Rao","Durgamma","Murali Krishna","Lakshmi Rajyam","Poojitha","Sai SUjitha","Devi Sri"};
        System.out.println(Arrays.toString(a));
        String name=s1[2];
        char[] ch=name.toCharArray();
        for(char c:ch)
            System.out.println(c);
        System.out.print(Arrays.toString(ch)+" ");
        for(int temp:a){
            System.out.println(temp);
        }
        for(String temp1:s1){
            System.out.println("Rangsietti "+temp1);
        }
    }
}
