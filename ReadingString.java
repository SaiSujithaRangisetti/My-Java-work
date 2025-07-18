package Basics;
import java.util.*;
public class ReadingString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String q=s.next();
        String w=s.next();
        System.out.println(q+" "+w);
        s.nextLine();//to consume the empty space and move to next line it is known as Hack or work around
        String e=s.nextLine();
        String r=s.nextLine();
        System.out.println(e+" "+r);
    }
}
