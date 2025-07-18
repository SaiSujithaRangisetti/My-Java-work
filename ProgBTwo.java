package Assignment1;

import java.util.Scanner;

public class ProgBTwo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a%b==0){
            System.out.println(a+" is Divisible by:"+b);
        }
        else{
            System.out.println(a+" is not Divisible by:"+b);
        }
    }
}
