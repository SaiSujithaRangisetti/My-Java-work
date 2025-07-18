package Arrays;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=104;
        a[1]=14;
        a[2]=24;
        a[3]=34;
        a[4]=44;
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
