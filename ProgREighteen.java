import java.util.Scanner;

public class ProgREighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase character: ");
        char e = sc.next().charAt(0);

        if (e >= 97 && e <= 122) {
            char upper = (char)(e - 32);
            System.out.println("Uppercase: " + upper);
        } else {
            System.out.println("Not a lowercase character.");
        }
    }
}

