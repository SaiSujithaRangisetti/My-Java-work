package Assignment1;

import java.util.Scanner;

public class ProgTwentyGSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char d=sc.next().charAt(0);
        if (d != 'a' && d != 'e' && d != 'i' && d != 'o' && d != 'u' &&
                d != 'A' && d != 'E' && d != 'I' && d != 'O' && d != 'U') {
            System.out.println("The given Character is a consonant");
        } else {
            System.out.println("The given Character is not a consonant");
        }


    }
}
