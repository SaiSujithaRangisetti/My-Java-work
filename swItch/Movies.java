package ConitionalStatements.swItch;

import java.util.Scanner;

public class Movies {
    public static void movieS(){
        System.out.println("Currently Showing:");
        System.out.println("1.Bahubali........09:00AM");
        System.out.println("2.Akhanda.........12:00PM");
        System.out.println("3.OG..............04:00PM");
        System.out.println("4.Devara..........09:00PM");
        System.out.print("Enter your movie: ");
    }

    public static void seatS(){
        System.out.println("1.Recliner.......₹500");
        System.out.println("2.Standard.......₹200");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to FAANG cinemas");

        int choice;
        while (true) {
            movieS();
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            }
            System.out.println("Enter the correct number");
        }

        switch(choice){
            case 1:
                System.out.println("You have selected Bahubali");
                break;
            case 2:
                System.out.println("You have selected Akhanda");
                break;
            case 3:
                System.out.println("You have selected OG");
                break;
            case 4:
                System.out.println("You have selected Devara");
                break;
        }

        int ch;
        while (true) {
            System.out.println("Choose your seat type");
            seatS();
            ch = sc.nextInt();
            if (ch == 1 || ch == 2) {
                break;
            }
            System.out.println("Choose between 1 and 2");
        }

        System.out.print("Number of persons: ");
        int per = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("You have chosen Recliner");
                int perS= per * 500;
                System.out.println("Your bill is...₹" + perS);
                double gst=0.18*(per*500);
                System.out.println("GST....(18%)...."+gst);
                System.out.println("Your total bill amount is :"+(gst+perS));
                break;
            case 2:
                System.out.println("You have chosen Standard");
                int perS1= per * 200;
                System.out.println("Your bill is...₹" +perS1);
                double gst1=0.18*(per*200);
                System.out.println("GST....(18%)...."+gst1);
                System.out.println("Your total bill amount is :"+(gst1+perS1));
                break;
        }
        System.out.println("Thanks for choosing FAANG Cinemas;)");
        System.out.println("(:...Have a good time!...:)");
    }
}
