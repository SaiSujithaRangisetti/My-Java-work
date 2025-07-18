package Loops;

public class DigitalRoot {
    public static void main(String[] args) {
        int a = 196;
        int b = 233;
        int c = a % 10;
        int d = b % 10;
        System.out.println(c+d);
        String a1="196";
        String b1="233";
        int c1=Integer.parseInt(b1.substring(2,3));
        int d1=Integer.parseInt(a1.substring(2,3));
        System.out.println(d1+c1);
    }
}
