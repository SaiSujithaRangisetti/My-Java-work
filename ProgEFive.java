package Assignment1;

import java.util.Scanner;

public class ProgEFive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=s.nextInt();
        System.out.println((a%2==0)?"Even":"Odd");
    }
}
