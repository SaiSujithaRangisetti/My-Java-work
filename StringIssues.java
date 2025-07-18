package Basics;

import java.util.Scanner;

public class StringIssues {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        s.nextLine();//to consume the empty space and move to next line it is known as Hack or work around
        String w=s.nextLine();
        System.out.println(a+" "+w);
    }
}
