package ConitionalStatements;

import java.util.Scanner;

public class NegPos {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int a=c.nextInt();
        if(a>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
