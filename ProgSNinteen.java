package Assignment1;

import java.util.Scanner;

public class ProgSNinteen {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char e=s.next().charAt(0);
        if(e>=65||e<=90){
            char lower=(char)(e+32);
            System.out.println("Lower: "+lower);
//            System.out.println(2**4);
        }
    }
}
