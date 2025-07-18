package Assignment1;

import java.util.Scanner;

public class ProgNFourteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        float a=sc.nextFloat();
        if(a>=36.0){
            System.out.println("Pass");
        }
        else if(a<36.0){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
