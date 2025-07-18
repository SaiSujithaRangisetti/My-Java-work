import java.util.Scanner;
import java.time.*;
public class ProgMThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime a=LocalTime.now();
        int hour = a.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning! Have a nice day");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon!Hope you are having a great day");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening!Hope you had a great day");
        } else if ((hour >= 21 && hour <= 23) || (hour >= 0 && hour < 5)) {
            System.out.println("Good Night!Take some rest and kick start your day tomorrow");
        }
        System.out.println("The current Time is:"+a);
    }
}
