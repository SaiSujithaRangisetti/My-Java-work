package Methods;

import java.util.Arrays;

public class NonPrimi {
    public static char[] a(String s){
        return s.toCharArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(a("Hello")));
    }
}
