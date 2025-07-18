package Assignment1;

import java.util.Scanner;

public class ProgTwentyEFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your digit: ");
        char c=sc.next().charAt(0);
        if(c>=48&&c<=57)
            System.out.println("The given Character is a digit");
        else
            System.out.println("The given Character is not a digit");
    }
}
