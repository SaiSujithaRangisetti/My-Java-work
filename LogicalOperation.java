package Basics;

public class LogicalOperation {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        System.out.println("AND Truth Table");
        System.out.println(a&&a);
        System.out.println(a&&b);
        System.out.println(b&&a);
        System.out.println(b&&b);
        System.out.println("OR Truth Table");
        System.out.println(a||a);
        System.out.println(a||b);
        System.out.println(b||a);
        System.out.println(b||b);
    }
}
