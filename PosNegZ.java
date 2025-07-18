package ConitionalStatements;

import java.util.Scanner;

public class PosNegZ {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a==0){
            System.out.println("Zero");
        }
        else if(a>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
