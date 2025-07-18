package Assignment1;

import java.util.Scanner;

public class ProgHEight {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        System.out.println("Enter b number:");
        int b=s.nextInt();
        System.out.println("Enter c number:");
        int c=s.nextInt();
        if((a>b)&&(a>c)){
            System.out.println(a+" is Greatest");
        }
        else if(b>c){
            System.out.println(b+" is Greatest");
        }
        else{
            System.out.println(c+" is Greatest");
        }
    }
}
