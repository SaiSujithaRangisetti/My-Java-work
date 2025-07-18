package Assignment1;

import java.util.Scanner;

public class ProgPSixteen {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of Printed Copies:");
        int d=s.nextInt();
        if(d<=99){
            System.out.println("Price per copy $0.30");
            System.out.println("Your total Price is:"+d*0.30);
        }
        else if(d<=499){
            System.out.println("Price per copy $0.28");
            System.out.println("Your total Price is:"+d*0.28);
        }
        else if(d<=799){
            System.out.println("Price per copy $0.27");
            System.out.println("Your total Price is:"+d*0.27);
        }
        else if(d<=1000){
            System.out.println("Price per copy $0.26");
            System.out.println("Your total Price is:"+d*0.26);
        }
        else {
            System.out.println("Price per copy $0.25");
            System.out.println("Your total Price is:"+d*0.25);
        }
    }
}
