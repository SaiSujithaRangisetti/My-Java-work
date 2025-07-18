package Assignment1;

import java.util.Scanner;

public class Prog1One {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
