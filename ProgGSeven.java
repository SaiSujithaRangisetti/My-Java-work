package Assignment1;

import java.util.Scanner;

public class ProgGSeven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        System.out.println("Enter b number:");
        int b=s.nextInt();
        if(a>b){
            System.out.println(a+" is greatest");
        }
        else{
            System.out.println(b+ " is greatest");
        }
    }
}
