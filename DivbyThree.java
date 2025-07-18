package ConitionalStatements;

import java.util.Scanner;

public class DivbyThree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a%3==0)&&(a%5!=0)){
            System.out.println("FIzz");
        }
        else{
            System.out.println("Buzz");
        }
    }
}
