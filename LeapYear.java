package ConitionalStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        if((y%100==0)&&(y%400==0)||(y%4==0)&&(y%100!=0)) {
            System.out.println("Leap");
        }
        else{
            System.out.println("Not Leap");
        }
    }
}
