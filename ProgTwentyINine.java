package Assignment1;

import java.util.Scanner;

public class ProgTwentyINine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char d=sc.next().charAt(0);
        if((d>=65&&d<=90)||(d>=97&&d<=122)){
            System.out.println("The given Character is an alphabet: "+d);
        }
        else if(d>=48&&d<=57){
            System.out.println("The given Character is a digit: "+d);
        }
        else{
            System.out.println("The given character is a special character: "+d);
        }
    }
}
