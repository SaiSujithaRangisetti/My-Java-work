package Assignment2;

import java.util.Scanner;

public class TennisCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("User Introduction");
        System.out.println("Hey user, Welcome!");
        System.out.println("Enter your name :");
        String name = s.nextLine();
        System.out.println("Enter your age :");
        int age = s.nextInt();
        System.out.println("Bat Selection:");
        System.out.println("list of brands that we have and with prices:");
        System.out.println("TechniFibre/Babolat -> $3000");
        System.out.println("Head/Yonex -> $5000");
        System.out.println("Vector -> $8000");
        System.out.println("Choose your brand:");
        s.nextLine();
        String d=s.nextLine();
        String b = d.toLowerCase();

        int price = 0;
        if (b.equals("technifibre") || b.equals("babolat")) {
            price = 3000;
        }
        else if (b.equals("head") || b.equals("yonex")) {
            price = 5000;
        }
        else if (b.equals("vector")) {
            price = 8000;
        }
        else {
            System.out.println("invalid brand. Please try again.");
        }
        System.out.println("Valid! Thank you for confirming.");
        System.out.print("Enter the convenient date to deliver in (dd/mm/yyyy) format: ");
        String Date = s.nextLine();
        int dd = Integer.parseInt(Date.substring(0, 2));
        int mm = Integer.parseInt(Date.substring(3, 5));
        int yy = Integer.parseInt(Date.substring(6, 10));

        if (yy > 2025 || (yy == 2025 && mm > 6) || (yy == 2025 && mm == 6 && dd >= 9)) {
            System.out.println("Thank you and your order is accepted");
        } else {
            System.out.println("Error !!!");
            System.out.println("You have entered an inappropriate date try again");
            return;
        }
    }
}