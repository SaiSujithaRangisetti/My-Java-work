package ConitionalStatements.swItch;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int hour1 = 1;
        switch(hour1){
            case 1:
                if(hour >= 1 && hour <= 11){
                    System.out.println("Good Morning");
                }
                else if(hour >= 12 && hour <= 15){
                    System.out.println("Good Afternoon");
                }
                else if(hour >= 16 && hour <= 19){
                    System.out.println("Good Evening");
                }
                else if(hour >= 20 && hour <= 24){
                    System.out.println("Good Night");
                }
                else{
                    System.out.println("Give the correct time");
                }
        }
    }
}
