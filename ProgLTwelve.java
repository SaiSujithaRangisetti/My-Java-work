package Assignment1;

import java.util.Scanner;

public class ProgLTwelve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of day in the week");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("It is a Sunday");
        }
        else if(a==2){
            System.out.println("It is a Monday");
        }
        else if(a==3){
            System.out.println("It is a Tuesday");
        }
        else if(a==4){
            System.out.println("It is a Wednesday");
        }
        else if (a==5){
            System.out.println("It is a Thursday");
        }
        else if(a==6){
            System.out.println("It is a Friday");
        }
        else if(a==7){
            System.out.println("It is a Saturday");
        }
        else{
            System.out.println("Invalid date");
        }
    }
}
