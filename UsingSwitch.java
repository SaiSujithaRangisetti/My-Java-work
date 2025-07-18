package EnUm;

import java.util.Scanner;

import static EnUm.dayS.THURSDAY;

public enum UsingSwitch {
    MONDAY,TUESDAY,WEDNESDAY,THURDAY,FRIDAY,SATURDAY,SUNDAY;

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
        UsingSwitch day=MONDAY;
        switch (day){
            case MONDAY:
                System.out.println("Week Day 1");
                break;
            case TUESDAY:
                System.out.println("Week Day 2");
                break;
            case WEDNESDAY:
                System.out.println("Week Day 3");
                break;
            case THURDAY:
                System.out.println("Week Day 4");
                break;
            case FRIDAY:
                System.out.println("Week Day 5");
                break;
            case SATURDAY:
                System.out.println("WeekEnd1");
                break;
            case SUNDAY:
                System.out.println("WeekEnd2");
        }
    }
}
