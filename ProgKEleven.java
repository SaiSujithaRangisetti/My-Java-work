package Assignment1;

import java.util.Scanner;

public class ProgKEleven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=s.nextInt();
        if(age<=12){
            System.out.println("Kid");
        }
        else if(age<=18){
            System.out.println("Teenage");
        }
        else{
            System.out.println("Adult");
        }
    }
}
