package Assignment1;

import java.util.Scanner;

public class ProgTwentyDFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char u=sc.next().charAt(0);
        if(u>=65&&u<=90){
            System.out.println("The given is a Character");
        }
        else if(u>=97&&u<=122){
            System.out.println("The given is a Character");
        }
        else{
            System.out.println("The give is not a character");
        }
    }
}
