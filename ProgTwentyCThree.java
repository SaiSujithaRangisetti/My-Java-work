package Assignment1;

import java.util.Scanner;

public class ProgTwentyCThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char d=sc.next().charAt(0);
        if(d>=65&&d<=90){
            System.out.println("Upper Case letter: "+d);
        }
        else {
            System.out.println("Not Upper Case");
        }
    }
}
