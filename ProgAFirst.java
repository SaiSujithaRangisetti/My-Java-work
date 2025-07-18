package Assignment2;
import java.util.Scanner;

public class ProgAFirst {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("User Information");
        System.out.println("Hey user, Welcome!");
        System.out.println("Hope you are having a great day");
        System.out.print("Enter your name:");
        String name = s.nextLine();
        System.out.println("Enter your age:");
        int age = s.nextInt();
        System.out.println("Racket Selection:");
        System.out.println("Here are the list of brands we have and Prices:");
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
        } else if (b.equals("head") || b.equals("yonex")) {
            price = 5000;
        } else if (b.equals("vector")) {
            price = 8000;
        } else {
            System.out.println("You have entered an invalid brand. Please try again.");
            return;
        }
        System.out.println("Valid! Thank you for confirming.");
        System.out.print("Enter net quantity: ");
        int qu = s.nextInt();
        if (qu < 1) {
            System.out.println("You have entered an invalid number. Try again.");
            return;
        } else {
            System.out.println("You have ordered " + qu + " bat(s)of " + b + ". Your total price is: $" + (price * qu));
            System.out.println("Yayyy!! You are half way done.");
        }
        s.nextLine();
        System.out.print("Enter the convenient date to deliver in (dd/mm/yyyy) format: ");
        String daTe = s.nextLine();
        int dd = Integer.parseInt(daTe.substring(0, 2));
        int mm = Integer.parseInt(daTe.substring(3, 5));
        int yy = Integer.parseInt(daTe.substring(6, 10));
        if (yy > 2025 || (yy == 2025 && mm > 6) || (yy == 2025 && mm == 6 && dd >= 9)) {
            System.out.println("Thank you");
            System.out.println("Yayyyy :) !!Your Order is Accepted");
            System.out.println("To check your details enter 1 or 0 to skip");
            int ch=s.nextInt();
            if(ch==1){
                System.out.println("Your name is "+name+" Your age is "+age);
                System.out.println("You have ordered the bat of "+d+" of Net quantity: "+qu);
                System.out.println("Your grand total is: $"+(price*qu));
                System.out.println("Your order will be delivered on :"+daTe);
                System.out.println("Have a great day");
            }
            else if(ch==0){
                System.out.println("Thanks for ordering!!");
                System.out.println("Your grand total is: $"+(price*qu));
                System.out.println("Your order will be delivered on :"+daTe);
                System.out.println("Have a great day");
            }
            else{
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Error :( !!You have entered an inappropriate date try again");
        }
    }
}
