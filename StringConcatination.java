package Methods;

import java.util.Scanner;

public class StringConcatination {
    public static String conc(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b=sc.nextLine();
        System.out.println(conc(a,b));
    }
}
