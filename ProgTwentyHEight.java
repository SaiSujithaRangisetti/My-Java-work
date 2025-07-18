package Assignment1;

import java.util.Scanner;

public class ProgTwentyHEight {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter your Character");
        int d = c.next().charAt(0);
        if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' ||
                d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U') {
            System.out.println("The given character is a Vowel");
        }
        else if ((d >= 97 && d <= 122) || (d >= 65 && d <= 90)) {
            System.out.println("The given character is a consonant");
        }
        else {
            System.out.println("The character is Invalid");
        }
    }
}
