package Basics;
import java.util.*;
public class Reading {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println(((a>b)&&(a>c))?a:(b>c)?b:c);
    }
}
