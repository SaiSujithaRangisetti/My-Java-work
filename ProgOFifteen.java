package Assignment1;

import java.util.Scanner;

public class ProgOFifteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temp=sc.nextInt();
        if(temp<0){
            System.out.println("Freezing Weather");
        }
        else if(temp<10){
            System.out.println("Very Cold Weather");
        }
        else if(temp<20){
            System.out.println("Cold Weather");
        }
        else if (temp<30) {
            System.out.println("Normal Weather");
        }
        else if(temp<40){
            System.out.println("Hot Weather");
        }
        else{
            System.out.println("Very Hot Weather");
        }
    }
}
