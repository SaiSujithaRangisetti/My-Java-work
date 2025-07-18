package Assignment1;

import java.util.Scanner;

public class ProgTwentyFSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char d = sc.next().charAt(0);

        if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' ||
                d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U') {
            System.out.println("The given character is a Vowel");
        } else {
            System.out.println("The given character is not a Vowel");
        }
    }
}
