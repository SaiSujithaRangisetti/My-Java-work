package Loops;

import java.util.Scanner;

public class primeusingMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=0;
        for(int i=1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                fact++;
            }
        }
        if(fact==0)
            System.out.println("Prime");
        else
            System.out.println("Not a prime");
    }
}
