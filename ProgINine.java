package Assignment1;

import java.util.Scanner;

public class ProgINine {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter year to check Leap or not: ");
        int a=c.nextInt();
        if((a%100==0)&&(a%400==0)||(a%4==0)&&(a%100!=0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap year");
        }
    }
}
