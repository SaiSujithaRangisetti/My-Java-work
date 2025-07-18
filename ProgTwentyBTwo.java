package Assignment1;

import java.util.Scanner;

public class ProgTwentyBTwo {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        char d=c.next().charAt(0);
        if(d>=97&&d<=122){
            System.out.println("Lower Case Letter "+d);
        }
        else{
            System.out.println("Not lower case");
        }
    }
}
