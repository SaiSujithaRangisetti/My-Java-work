package ConitionalStatements.swItch;

import java.util.Scanner;

public class FFc {
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("Welcome to FAANG Fried Chicken(FFC)");
        System.out.println("1.Burger.......(₹99)🍗");
        System.out.println("2.Wings.......(₹120)🍗");
        System.out.println("3.Fries........(₹60)🍟");
        System.out.println("4.Combos......(₹180) Includes drinks🥤");
        System.out.println("5.Exit");
    }

    public static void condi(){
        System.out.println("You get to choose your condiments");
        System.out.println("1.Ketchup");
        System.out.println("2.Mayonise");
        System.out.println("3.Cheese Dip");
    }

    public static void main(String[] args) {
        int ch;
        int ch1;
        int cost = 0;
        String order = "";
        do {
            menu();
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            if (ch >= 1 && ch <= 5) {
                break;
            }
            System.out.println("Enter correct choice");
        } while (true);
        switch (ch) {
            case 1:
                System.out.println("You have chosen Burgers");
                cost = 99;
                order = "Burger";
                break;
            case 2:
                System.out.println("You have chosen Wings");
                cost = 120;
                order = "Wings";
                break;
            case 3:
                System.out.println("You have chosen Fries");
                cost = 60;
                order = "Fries";
                break;
            case 4:
                System.out.println("You have chosen Combos");
                cost = 180;
                order = "Combos";
                System.out.println("Since you chose Combos you get free condiments for any extra add in the next step 😉");
                break;
            case 5:
                System.out.println("Exiting...");
                return;
        }

        System.out.println("Net Quantity:");
        int quan = sc.nextInt();

        do {
            condi();
            System.out.println("Enter your choice");
            ch1 = sc.nextInt();
            if (ch1 >= 1 && ch1 <= 3) {
                break;
            }
            System.out.println("Enter correct choice");
        } while (true);

        int bill = 0;
        int num = 0;
        String condim = "";

        switch (ch1) {
            case 1:
                System.out.println("You chose Ketchup (₹10 each)");
                condim = "Ketchup";
                break;
            case 2:
                System.out.println("You chose Mayonise (₹10 each)");
                condim = "Mayonise";
                break;
            case 3:
                System.out.println("You chose Cheese Dip (₹10 each)");
                condim = "Cheese Dip";
                break;
        }

        System.out.println("How many?");
        num = sc.nextInt();

        if (order.equals("Combos")) {
            bill = 0;
            System.out.println("Condiments are free with Combos! 😊");
        } else {
            bill = num * 10;
        }

        int fcost0 = quan * cost;

        System.out.println(order + " " + quan + " -> ₹" + fcost0);
        System.out.println(condim + " " + num + " -> ₹" + bill);

        double gst = 0.05 * (fcost0 + bill);
        System.out.println("GST  ₹" + (int) gst);

        int total = (int) gst + fcost0 + bill;
        System.out.println("Total ₹" + total);
    }
}