package Loops;
import java.util.*;
public class Primefor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int fact=0;
        int a=s.nextInt();
        System.out.println(a);
        for(int i=2;i<a/2;i++) {
            if (a % i == 0) {
                fact++;
            }
        }
        if(fact==0)
            System.out.println("Prime");
        else
            System.out.println("Not a prime");
    }
}
