package Assignment1;

import java.util.Scanner;

public class ProgTTwenty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a coeff: ");
        double a=sc.nextDouble();
        System.out.print("Enter b coeff: ");
        double b=sc.nextDouble();
        System.out.print("Enter c coeff: ");
        double c=sc.nextDouble();
        double d=(b*b)-(4*a*c);
        if (d > 0) {
            double SqrtV=Math.pow(d,0.5);
            double root1 = (-b + SqrtV) / (2 * a);
            double root2 = (-b - SqrtV) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root = " + root);
        } else {
            double SqrtV=Math.pow(d,0.5);//d is base 0.5 is power
            double realPart = -b / (2 * a);
            double imagPart = SqrtV/ (2 * a);
            System.out.println("Roots are imaginary.");
            System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
        }
    }
}
