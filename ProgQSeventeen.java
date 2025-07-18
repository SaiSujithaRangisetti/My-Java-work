package Assignment1;

import java.util.Scanner;

public class ProgQSeventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 97 && ch <= 122) {
            System.out.println("The letter is a lower case letter");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("The letter is an upper case letter");
        } else {
            System.out.println("The character is invalid");
        }
    }
}
