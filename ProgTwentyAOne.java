package Assignment1;

import java.util.Scanner;

public class ProgTwentyAOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%2==0)&&(a!=2)&&(a>=8)){
            System.out.println("31 days");
        }
        else if(a==2){
            System.out.println("28 or 29 days");
        }
        else if((a%2==0)&&(a<8)&&(a!=2)){
            System.out.println("30 days");
        }
        else if(a==1||a==3||a==5||a==7){
            System.out.println("31 Days");
        }
        else{
            System.out.println("30 Days");
        }
    }
}
