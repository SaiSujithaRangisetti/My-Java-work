package Assignment1;

import java.util.Scanner;

public class ProgCThree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a=s.nextInt();
        if(a>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }
}
