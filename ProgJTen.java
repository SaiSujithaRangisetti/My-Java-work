package Assignment1;

import java.util.Scanner;

public class ProgJTen {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check fizz or buzz");
        int a=s.nextInt();
        if((a%3==0)&&(a%5!=0)){
            System.out.println("FIzz");
        }
        else if(a%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("None");
        }
    }
}
