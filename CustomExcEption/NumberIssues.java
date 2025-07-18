package ExcEption.CustomExcEption;

import java.util.Scanner;

public class NumberIssues {
    public void checkNumbers(int a, int b) throws IssuesWithNumbers {
        if (a <= 0 || b <= 0) {
            throw new IssuesWithNumbers("Numbers must be positive");
        }
        if (a % b != 0) {
            throw new IssuesWithNumbers(a + " is not divisible by " + b);
        }
        System.out.println("Division result: " + (a / b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberIssues validator = new NumberIssues();

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            validator.checkNumbers(a, b);

        } catch (IssuesWithNumbers e) {
            System.out.println("Custom Exception caught: " + e.getInfo());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed");
        }
    }
}